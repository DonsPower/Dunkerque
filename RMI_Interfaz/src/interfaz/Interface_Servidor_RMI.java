/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/**
 *
 * @author Dons
 */
public interface Interface_Servidor_RMI extends Remote{
    public void registrar(Interface_Cliente_RMI cliente)throws RemoteException; //Registramos cliente
    public void publicar(String msg)throws RemoteException; //Publicamos el mensaje en el text area.
    public Vector obtenerClientesActivos()throws RemoteException; //Clientes existentes.
}
