package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Exportar {

    public Exportar() {
    }

    public void exportarJISON(String jison) {
        try {
            File fichero;

            JFileChooser seleccionar = new JFileChooser();
            seleccionar.setAcceptAllFileFilterUsed(false);
            seleccionar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleccionar.showOpenDialog(null);
            fichero = seleccionar.getSelectedFile();

            String carpeta = JOptionPane.showInputDialog("Ingresa el nombre de tu proyecto");
            File directorio = new File(fichero.getAbsolutePath() + "/" + carpeta);
            if (directorio.exists()) {
                JOptionPane.showMessageDialog(null, "El directorio ya existe");
            } else {
                directorio.mkdirs();
            }
            String pathDEF = directorio.getAbsolutePath() + "/" + carpeta + ".def";
            String pathJISON = directorio.getAbsolutePath() + "/" + carpeta + ".jison";
            String pathCOPY = directorio.getAbsolutePath() + "/" + carpeta + ".copy";
            File archivoDEF = new File(pathDEF);
            File archivoJISON = new File(pathJISON);
            File archivoCOPY = new File(pathCOPY);
            String textoCOPY = pathDEF + "\n" + pathJISON;
            
            archivoDEF.createNewFile();
            archivoJISON.createNewFile();
            archivoCOPY.createNewFile();
            FileWriter escribirJISON = new FileWriter(archivoJISON, false);
            FileWriter escribirCOPY = new FileWriter(archivoCOPY, false);
            escribirJISON.write(jison);
            escribirJISON.close();
            escribirCOPY.write(textoCOPY);
            escribirCOPY.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear directorio de archivos");
        }
    }

}
