
package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.swing.JOptionPane;


public class DatosSocket {
    /**
     * Constructor de la clase DatosSocket
     */
    public DatosSocket() {
    }
    /**
     * Inicia la conexion con el servidor. Y envia los parametros para que el servidor realice sus acciones.
     * @param path1 La direccion de la carpeta del proyecto 1
     * @param path2 La direccion de la carpeta del proyecto 2
     */
    public void enviarParametros(String path1, String path2){       
        final String HOST = "192.168.1.2";
        final int puerto = 6000;
        DataInputStream in;
        DataOutputStream out;
        try {
            Socket socket = new Socket(HOST, puerto);
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            
            out.writeUTF(path1 + "\n" + path2);
            
            String mensaje = in.readUTF();            
            System.out.println(mensaje);
            socket.close();           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error para realizar la conexion con el servidor");
        }
        
        
        
    }
    
}
