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
 * @author maria
 */
public class ClienteImpl implements ICliente{
    
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
    
     public void login(String nick, String contrasenha){
    
    servidor.login(cliente, nick, contrasenha);
    
    }
     
     public void registro(String nick, String nombre, String apellido,String contraseña){
     
         servidor.registro(cliente, nick, nombre, apellido, nick);
             
             }

    @Override
    public void killMensajeError(String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificaAmistad(ArrayList<String> Amistad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificarListaAmigos(ArrayList<Amigo> amigo) {
       principal.actualizaLista(amigo);
    }

    @Override
    public void notificarNuevoAmigo(Amigo amigo) {
        
        principal.actualizaLista(amigo);
        
       
    }

    @Override
    public void notificarNuevaAmistad(String nombreAmigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarconectado(String nick) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
