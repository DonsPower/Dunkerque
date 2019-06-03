/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Dons
 */

public interface InterfazServidor extends Remote{
    public void registrar(InterfazCliente cliente)throws RemoteException;
    public int verificar2(int id2)throws RemoteException;
    public void publicar(int aux, String arr)throws RemoteException;
    public void ataque(int id, String bomba)throws RemoteException;
    public Vector obtenerClientesActivos()throws RemoteException;
}
