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
public class ClienteImpl extends UnicastRemoteObject implements ICliente,IClienteP2P {
    
     private ventana v;
     private IServidor servidor;
     private ICliente cliente;
     private Login login;
     private Registro registro;
     private PrincipalChat principal;

    

    public ClienteImpl(IServidor serv) throws RemoteException {
        
        super( );

        v = new ventana();
        this.servidor=serv;
        login= new Login(this);
        cliente=(ICliente)this;
        
        
    }
    
    public void setPrincipal(PrincipalChat principal){
    
    this.principal=principal;
    
    }
    
    public void setRegistro(Registro registro){
    
    this.registro=registro;
    
    }
    
     public void login(String nick, String contrasenha) throws RemoteException{
    
      servidor.login(cliente, nick, contrasenha);
      
    
    }
     
     public void solicitarAmistad(String nickCliente,String nick)throws RemoteException{
         System.out.println(nickCliente + " " + nick);
         servidor.solicitarAmistad(nickCliente, nick);
     
     }
     
     public void registro(String nick, String nombre, String apellido,String contraseña) throws RemoteException{
     
         servidor.registro(cliente, nick, nombre, apellido, contraseña);
             
             }
     
     public void buscar(String nick, String nickBuscar) throws RemoteException{
         
         servidor.buscarAmigo(nick,nickBuscar);
         
     
     }
     
     public void aceptarAmistad (String nickCliente, ArrayList<String> amigosAceptados, ArrayList<String> amigosRechazados)throws RemoteException{
     
     servidor.aceptarAmistad(nickCliente, amigosAceptados, amigosRechazados);
     
     }
     
     public void cerrarSesion(String nick) throws RemoteException{
     
         servidor.desconectarse(nick);
     
     }
     
     public void cambiarContrasenha (String nick, String newPass, String oldPass)throws RemoteException{
     
         servidor.cambiarContrasenha(nick, newPass, oldPass);
     
     }

    @Override
    public void mensajeErrorLogin(String error) {
       login.mensajeError(error);
    }

    @Override
    public void mensajeErrorContraseña(String error) throws RemoteException {
       principal.mensajeError(error);
    }

    @Override
    public void mensajeErrorRegistro(String error) throws RemoteException {
        registro.mensajeError(error);
    }
    
    
    

    //metodos de notificar amistad
    
        @Override
        public void notificaAmistad(ArrayList<String> Amistad) {
            if(!Amistad.isEmpty())
            principal.anhadirTabla(Amistad);

        } 

        @Override
        public void notificarNuevaAmistad(String nombreAmigo) {
            System.out.println("Nuevo amigo" + nombreAmigo);
            principal.anhadirTabla(nombreAmigo); //mirar

        }

    //--------//

    //metodos notificar amigos conectados
        
        @Override
        public void notificarListaAmigos(ArrayList<Amigo> amigo) {
            System.out.println("Entra");
            if(!amigo.isEmpty()){
           System.out.println(amigo.get(0).getNick());
           principal.actualizaLista(amigo);}
        }

        @Override
        public void notificarNuevoAmigo(Amigo amigo) {
            System.out.println("Nuevo amigo" + amigo.getNick());
            if(amigo!=null)
            principal.actualizaLista(amigo,false);


        }

   //-------//
    
    
    
    @Override
    public void borrarconectado(String nick) {
        
        Amigo amigo= new Amigo(nick);
 
        
        principal.actualizaLista(amigo,true);
        
    }  
    
    @Override
    public void resultadoBusquedaAmigo(String NombreAmigo) throws RemoteException {
        if(!NombreAmigo.isEmpty())
            principal.resultadoBusqueda(NombreAmigo);
    }

    @Override
    public void envioMensaje(IClienteP2P clientep2p, String mensaje, String emisor) throws RemoteException {
        clientep2p.recepcionMensaje(mensaje, emisor);
    }

    @Override
    public void recepcionMensaje(String mensaje, String emisor) throws RemoteException {
       principal.recibirMensaje(mensaje, emisor);
    }

    public void darBaja(String nick, String contrasenha) throws RemoteException {
       servidor.darBaja(cliente,nick,contrasenha);
    }
    
}
