/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dons
 */
public interface InterfazCliente extends Remote{
    public void enviarMsg(String msg)throws RemoteException;
    public String getNombre()throws RemoteException;
    public int verificar()throws RemoteException;
    
}
