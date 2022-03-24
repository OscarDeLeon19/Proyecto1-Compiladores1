
package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.net.ssl.SSLSocket;


public class DatosSocket {

    public DatosSocket() {
    }
    
    public void enviarParametros(String path1, String path2){
        
        final String HOST = "192.168.1.13";
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
        }
        
        
        
    }
    
}
