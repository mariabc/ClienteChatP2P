/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import Datos.*;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author Estevo
 */
public interface ICliente extends Remote{
    
    
    
public void killMensajeError (String error);

public void notificaAmistad(ArrayList<String> Amistad); 

public void notificarListaAmigos(ArrayList<Amigo> amigo);

public void notificarNuevoAmigo(Amigo amigo); //individual

public void notificarNuevaAmistad(String nombreAmigo);//individual

public void borrarconectado(String nick);
   
    
}
