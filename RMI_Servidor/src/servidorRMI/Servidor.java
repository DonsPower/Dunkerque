/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorRMI;

import interfaz.Interface_Cliente_RMI;
import interfaz.Interface_Servidor_RMI;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Dons
 */
public class Servidor extends UnicastRemoteObject implements Interface_Servidor_RMI{

    private final Vector lista_clientes;
    
    public Servidor()throws RemoteException{
        super();
        lista_clientes= new Vector();
    }

    @Override
    public void registrar(Interface_Cliente_RMI cliente) throws RemoteException {
          if(cliente!=null) lista_clientes.add(cliente);
    }

    @Override
    public void publicar(String msg) throws RemoteException {
        for (int i=0;i<lista_clientes.size();i++) {
            Interface_Cliente_RMI cln=(Interface_Cliente_RMI)lista_clientes.get(i);
            cln.enviarCordenada(msg);
        }
    }

    @Override
    public Vector obtenerClientesActivos() throws RemoteException {
       return lista_clientes;
    }
      public static void main(String args[]){
        try {
            //Creamos el objeto remoto en esta caso sera el servidor
            Servidor serv=new Servidor();
            Registry reg= LocateRegistry.createRegistry(1099);
            //Enlazar el objeto remoto para que sea publico 
            reg.rebind("Servidor", serv);
            System.out.println("Servidor activo...");
            System.out.println("");
        } catch (RemoteException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
