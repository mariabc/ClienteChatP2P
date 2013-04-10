/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Estevo
 */
public interface IClienteP2P extends Remote{
    
    public void escribirPantalla(String mensaje)throws RemoteException;
       
}
