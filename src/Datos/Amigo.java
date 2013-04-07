/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.Serializable;
import p2pchat.*;

/**
 *
 * @author Estevo
 */
public class Amigo implements Serializable{
    
 private String nick;
 private String nombre;
 private IClienteP2P cliente;

    public Amigo(String nick, String nombre, IClienteP2P cliente) {
        this.nick = nick;
        this.nombre = nombre;
        this.cliente = cliente;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IClienteP2P getCliente() {
        return cliente;
    }

    public void setCliente(IClienteP2P cliente) {
        this.cliente = cliente;
    }
            
    
 
 
 
 
 
}
