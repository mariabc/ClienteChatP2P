/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import java.util.ArrayList;
import p2pchat.ICliente;
import p2pchat.IClienteP2P;

/**
 *
 * @author Estevo
 */
public class AmigoTabla extends Amigo implements Serializable {

    ICliente iCliente;

    public AmigoTabla() {
        super();
    }
    

    public AmigoTabla(String nick, String nombre, IClienteP2P cliente) {
        super(nick, nombre, cliente);

       
    }

    public AmigoTabla(String nick) {
        super(nick);

       
    }

    public AmigoTabla(ArrayList<String> ListaAmigos, ArrayList<String> PeticionesAmistad, ICliente iCliente, String nick, String nombre) {

        super(nick, nombre, (IClienteP2P) iCliente); //casteo pensar si no seria mejor no guardar iclientep2p y castear al enviar
       
        this.iCliente = iCliente;
    }

    public ICliente getiCliente() {
        return iCliente;
    }

    public void setiCliente(ICliente iCliente) {
        this.iCliente = iCliente;
    }

  
}
