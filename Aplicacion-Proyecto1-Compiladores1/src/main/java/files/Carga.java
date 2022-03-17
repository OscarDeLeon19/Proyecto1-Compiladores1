package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Carga {

    public Carga() {
    }

    public void cargarArchivo(String path, JTextArea areaTexto) {

        try {
            File fichero = new File(path);
            FileReader Lector = new FileReader(fichero);
            BufferedReader bufer = new BufferedReader(Lector);
            String linea = "";

            while ((linea = bufer.readLine()) != null) {
                areaTexto.append(linea);
                areaTexto.append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }
    }

    public String[] obtenerCOPY() {
        String[] paths = new String[2];
        File fichero;
        JFileChooser seleccionar = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo Copy", "copy");
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.addChoosableFileFilter(filtro);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        try {
            FileReader Lector = new FileReader(fichero);
            BufferedReader bufer = new BufferedReader(Lector);
            String linea = "";
            int i = 0;
            while ((linea = bufer.readLine()) != null) {
                paths[i] = linea;
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }
        return paths;
    }

    public void guardar(String path, String texto) {
        int decision = JOptionPane.showConfirmDialog(null, "¿Estas seguro de guardar el archivo?");
        if (decision == JOptionPane.YES_OPTION) {
            try {
                File file = new File(path);
                FileWriter escribir;
                escribir = new FileWriter(file, false);
                escribir.write(texto);
                escribir.close();
                JOptionPane.showMessageDialog(null, "Se guardo el archivo");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }
        }
    }

}
