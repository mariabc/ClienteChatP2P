/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Estevo
 */
public interface IServidor extends Remote {
    
public void login(ICliente cliente,String nick, String pass) throws RemoteException;

public void darBaja (String nick) throws RemoteException;

public void cambiarContrasenha (String nick, String newPass);

public void registro (ICliente cliente ,String nick, String nombre, String Apellido, String pass) throws RemoteException;; //da

public void aceptarAmistad (String nickCliente, ArrayList<String> amigosAceptados,
                            ArrayList<String> amigosRechazados)throws RemoteException;;

public void buscarAmigo(String nickCliente,String nombre)throws RemoteException;;

public void solicitarAmistad(String nickCliente,String nick)throws RemoteException;;

public void desconectarse(String nickCliente)throws RemoteException;

//public void enviarReferencia(String nickCliente, IClienteP2P refRemota);






}
