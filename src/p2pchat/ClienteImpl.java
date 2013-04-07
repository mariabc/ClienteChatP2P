/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import java.rmi.RemoteException;

/**
 *
 * @author maria
 */
public class ClienteImpl {
    
     private ventana v;
     private IServidor servidor;
     private ICliente cliente;
     private Login chat;

    

    public ClienteImpl(IServidor serv) throws RemoteException {
        
        super( );

        v = new ventana();
        this.servidor=serv;
        chat= new Login(this);
    }
    
     public void login(String nick, String contrasenha){
    
    servidor.login(cliente, nick, contrasenha);
    
    }
     
     public void registro(String nick, String nombre, String contraseña){
     
         servidor.registro(cliente, nick, nombre, nick);
             
             }
    
    
}
