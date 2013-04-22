/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import Datos.Amigo;
import java.rmi.RemoteException;
import java.util.ArrayList;

/** 
 *
 * @author Estevo
 */
public interface ICliente extends IClienteP2P  {
    
public void mensajeErrorContraseña(String error) throws RemoteException;

public void mensajeErrorRegistro(String error) throws RemoteException;
    
public void mensajeErrorLogin (String error)throws RemoteException;

public void notificaAmistad(ArrayList<String> Amistad)throws RemoteException;

public void notificarListaAmigos(ArrayList<Amigo> amigo)throws RemoteException;

public void notificarNuevoAmigo(Amigo amigo)throws RemoteException; //individual

public void notificarNuevaAmistad(String nombreAmigo)throws RemoteException;//individual

public void resultadoBusquedaAmigo(String NombreAmigo)throws RemoteException;
    
public void borrarconectado(String nick)throws RemoteException;

}
