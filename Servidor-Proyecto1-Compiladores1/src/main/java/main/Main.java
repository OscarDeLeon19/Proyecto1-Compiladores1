package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws Exception {
        Analisis analisis = new Analisis();
        /*
        
        
        File fichero1;
        
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        seleccionar.showOpenDialog(null);
        fichero1 = seleccionar.getSelectedFile();
                
        analisis.iniciarAnalisisProyecto1(fichero1);  
        
        File fichero2;
        seleccionar.showOpenDialog(null);
        fichero2 = seleccionar.getSelectedFile();
        
        analisis.iniciarAnalisisProyecto2(fichero2);
        analisis.comparar();
        
         */

        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;
        String mensaje = "";
        int puerto = 6000;
        try {
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("El servidor ha iniciado");
            while (true){
            socket = servidor.accept();            
            System.out.println("Se envio un archivo");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            mensaje = in.readUTF();
            String[] paths = mensaje.split("\n");
            Proceso proceso = new Proceso(paths);
            proceso.start();
            out.writeUTF("Directorios Recibidos");            
            socket.close();
            }
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos");
        }


    }

}
