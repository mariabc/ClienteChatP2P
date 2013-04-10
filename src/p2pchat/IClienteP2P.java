/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import java.rmi.Remote;

/**
 *
 * @author Estevo
 */
public interface IClienteP2P extends Remote{
    
    public void escribirPantalla(String mensaje);
       
}
