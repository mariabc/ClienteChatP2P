/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import java.util.ArrayList;

/**
 *
 * @author Estevo
 */
public interface IServidor {
    
public void login(ICliente cliente,String nick, String pass);

public void registro (ICliente cliente ,String nick, String nombre, String Apellido,String pass); //da

public void aceptarAmistad (String nickCliente, ArrayList<String> amigosAceptados);

public void buscarAmigo(String nickCliente,String nombre);

public void solicitarAmistad(String nickCliente,String nick);

public void desconectarse(String nickCliente);

//public void enviarReferencia(String nickCliente, IClienteP2P refRemota);






}
