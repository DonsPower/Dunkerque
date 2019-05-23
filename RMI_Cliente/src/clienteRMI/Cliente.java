/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteRMI;

import interfaz.Interface_Cliente_RMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dons
 */
public class Cliente extends UnicastRemoteObject implements Interface_Cliente_RMI{
     private String nombre;
   private GUI_Cliente_RMI gui;
   public Cliente(String nombre)throws RemoteException{
       super();
       this.nombre=nombre;
   }
    @Override
    public void enviarCordenada(String msg) throws RemoteException {
         
    }

    @Override
    public String getPais() throws RemoteException {
        return this.nombre;
    }
      public void setGUI(GUI_Cliente_RMI cg){
        this.gui=cg;
    }
}
