/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.rmi.RemoteException;

/**
 *
 * @author Dons
 */
public interface Interface_Cliente_RMI {
    public void enviarCordenada(String msg)throws RemoteException; //Envio de cordenada 
    public String getPais()throws RemoteException; //Nombre del país atacante
}
