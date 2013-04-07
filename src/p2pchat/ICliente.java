/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import Datos.*;
import java.util.ArrayList;

/**
 *
 * @author Estevo
 */
public interface ICliente {
    
    
    
public void killMensajeError (String error);

public void notificaAmistad(ArrayList<String> Amistad); 

public void notificarListaAmigos(ArrayList<Amigo> amigo);

public void notificarNuevoAmigo(Amigo amigo); //individual

public void notificarNuevaAmistad(String nombreAmigo);//individual
    
    
}
