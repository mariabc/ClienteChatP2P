/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import Datos.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Estevo
 */
public interface ICliente extends Remote{
    
    
    
public void killMensajeError (String error) throws RemoteException;

public void notificaAmistad(ArrayList<String> Amistad)throws RemoteException;

public void notificarListaAmigos(ArrayList<Amigo> amigo)throws RemoteException;

public void notificarNuevoAmigo(Amigo amigo)throws RemoteException; //individual

public void notificarNuevaAmistad(String nombreAmigo)throws RemoteException;//individual

public void borrarconectado(String nick)throws RemoteException;
   
    
}
