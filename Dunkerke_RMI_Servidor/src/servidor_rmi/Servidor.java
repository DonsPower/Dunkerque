/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor_rmi;
import Interfaces.InterfazCliente;
import Interfaces.InterfazServidor;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dons
 */
public class Servidor extends UnicastRemoteObject implements InterfazServidor{
    //Objeto remoto
    private Vector lista_clientes;
    private ArrayList<String>cord;
    private ArrayList<String>cln1;
    private ArrayList<String>cln2;
    private int cont=0;
    private int id;
    
    
    
    public Servidor()throws RemoteException{
        super();
        //Inicializacion de arreglos 
        lista_clientes= new Vector();
        cord = new ArrayList<>();
        cln1 = new ArrayList<>();
        cln2 = new ArrayList<>();
    }

    @Override
    public void registrar(InterfazCliente cliente) throws RemoteException {
        if(cliente!=null) lista_clientes.add(cliente);
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

    @Override
    public void publicar(int aux, String arr) throws RemoteException {
                //Separamos las cordenadas
                String[] cordenadas=arr.split(" ");
                //Cliente 1.
                if(aux==1){
                    cln1.add("1");
                    for(int i=0;i<cordenadas.length;i++){
                        cln1.add(cordenadas[i]);
                    }
                    for(int i=0;i<cln1.size();i++){
                        System.out.println(cln1.get(i));
                    }
                }
                //Cliente 2
                if(aux==2){
                    cln2.add("2");
                    for(int i=0;i<cordenadas.length;i++){
                        cln2.add(cordenadas[i]);
                    }
                    for(int i=0;i<cln2.size();i++){
                        System.out.println(cln2.get(i));
                    }
                }
                //Envia el mensaje al total de clinetes que haya.
                for (int i=0;i<lista_clientes.size();i++) {
                InterfazCliente cln=(InterfazCliente)lista_clientes.get(i);
                    cln.enviarMsg(aux+"");
        }
    }

    @Override
    public void ataque(int id, String bomba) throws RemoteException {
        //ID cliente1 = 4
        //Id Cliente2 = 3
        //Separamos el id y el nombre
        boolean band =false;
        if(id==1){
            for(int i=0;i<cln2.size();i++){
                if(cln2.get(i).equals(bomba)){
                    //Envia el mensaje al total de clinetes que haya.
                    band=true;
                }
            }
        }
        if(id==2){
            for(int i=0;i<cln1.size();i++){
                if(cln1.get(i).equals(bomba)){
                    //Envia el mensaje al total de clinetes que haya.
                   band=true;
                }
            }
        }
        if(band){
            //Envia el mensaje al total de clinetes que haya.
            for (int i=0;i<lista_clientes.size();i++) {
                InterfazCliente cln=(InterfazCliente)lista_clientes.get(i);
                    cln.enviarMsg("BOOM!");
            }
        }else{
            for (int i=0;i<lista_clientes.size();i++) {
                InterfazCliente cln=(InterfazCliente)lista_clientes.get(i);
                cln.enviarMsg("No encontrado");
            }
        }
        
    }

    @Override
    public int verificar2(int id2) throws RemoteException {
       cont++;
        if(id2==1){
            System.out.println("entro");
            cont=id2;
        }
        
        System.out.println(cont);
       return cont;
    }

}
