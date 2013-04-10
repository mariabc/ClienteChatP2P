/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2pchat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estevo
 */
public class P2PChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int RMIPort;
            String hostName;
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            ArrayList<String> loc = new ArrayList<String>();


            String registryURL = "rmi://localhost:1099/p2pchat";
            IServidor serv = null;
            try {
                serv = ( IServidor) Naming.lookup(registryURL);
            } catch (NotBoundException ex) {
                Logger.getLogger(P2PChat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(P2PChat.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(P2PChat.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Conexion completada ");
            try {

                ICliente cliente = (ICliente) new ClienteImpl(serv);
              

                System.out.println("Registered for callback.");
            } catch (RemoteException ex) {
                Logger.getLogger(P2PChat.class.getName()).log(Level.SEVERE, null, ex);
            }
     

    }
}
