package server;

import server.backend.manejadores.Connector;

/**
 *
 * @author fabricio
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServidorFrontend sf = new ServidorFrontend();
        sf.setVisible(true);
    }
    
}