/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import Datos.Amigo;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author maria
 */
public class ClienteImpl extends UnicastRemoteObject implements ICliente {
    
     private ventana v;
     private IServidor servidor;
     private ICliente cliente;
     private Login chat;
     private PrincipalChat principal;

    

    public ClienteImpl(IServidor serv) throws RemoteException {
        
        super( );

        v = new ventana();
        this.servidor=serv;
        chat= new Login(this);
        
    }
    
     public void login(String nick, String contrasenha) throws RemoteException{
    
    servidor.login(cliente, nick, contrasenha);
    
    }
     
     public void registro(String nick, String nombre, String apellido,String contraseña) throws RemoteException{
     
         servidor.registro(cliente, nick, nombre, apellido, contraseña);
             
             }

    @Override
    public void killMensajeError(String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificaAmistad(ArrayList<String> Amistad) {
        principal.anhadirTabla(Amistad);
    }

    @Override
    public void notificarListaAmigos(ArrayList<Amigo> amigo) {
       principal.actualizaLista(amigo);
    }

    @Override
    public void notificarNuevoAmigo(Amigo amigo) {
        
        principal.actualizaLista(amigo,false);
        
       
    }

    @Override
    public void notificarNuevaAmistad(String nombreAmigo) {
        principal.anhadirTabla(nombreAmigo); //mirar
        
    }

    @Override
    public void borrarconectado(String nick) {
        
        Amigo amigo= new Amigo(nick);
 
        
        principal.actualizaLista(amigo,true);
        
    }

    
    
    
}
