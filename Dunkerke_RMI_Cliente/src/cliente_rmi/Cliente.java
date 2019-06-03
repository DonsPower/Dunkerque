/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente_rmi;

import Interfaces.InterfazCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dons
 * OBJETO REMOTO
 */
public class Cliente extends UnicastRemoteObject implements InterfazCliente {
   private String nombre;
   private ClienteGUI gui;
   int cont=0;
   int id;

   public Cliente(String nombre)throws RemoteException{
       super();
       this.nombre=nombre;
       
   }

    @Override
    public void enviarMsg(String msg) throws RemoteException {
        
        if(msg.equals("BOOM!")) this.gui.barcosHundidos++; 
        
        gui.actualizarArea(msg);
    }

    @Override
    public String getNombre() throws RemoteException {
        return this.nombre;
    }
    public void setGUI(ClienteGUI cg){
        this.gui=cg;
    }
     @Override
    public int verificar() throws RemoteException {
       cont++;
       id=cont;
        System.out.println(cont);
       return cont;
    }
    
    
    public ClienteGUI getGUI() {
        
        return this.gui; 
        
    }
    
}
