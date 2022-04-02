package main;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;

public class Exportar {

    /**
     * Constructor de la clase exportar
     */
    public Exportar() {
          
    }
    /**
     * Exporta la carpeta del proyecto con el archivo .copy, reportes.def, y el archivo json.
     * @param json El texto donde van incluidas todas las clases, variables, metodos y comentarios repetidos.
     * @param carpeta El nombre de la carpeta donde se guardaran los archivos.
     */
    public void exportarJISON(String json, String carpeta) {
        try {
            File fichero;
            System.out.println("Inicio exportacion");
            JFileChooser seleccionar = new JFileChooser();
            seleccionar.setAcceptAllFileFilterUsed(false);
            seleccionar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleccionar.showOpenDialog(null);
            fichero = seleccionar.getSelectedFile();

            File directorio = new File(fichero.getAbsolutePath() + "/" + carpeta);
            if (directorio.exists()) {
                Alerta alerta = new Alerta("El directorio ya existe");
            } else {
                directorio.mkdirs();
            }
            String pathDEF = directorio.getAbsolutePath() + "/reportes.def";
            String pathJISON = directorio.getAbsolutePath() + "/" + carpeta + ".json";
            String pathCOPY = directorio.getAbsolutePath() + "/" + carpeta + ".copy";
            String pathReporte = directorio.getAbsolutePath() + "/reporte.html";
            File archivoDEF = new File(pathDEF);
            File archivoJISON = new File(pathJISON);
            File archivoCOPY = new File(pathCOPY);
            String textoCOPY = pathDEF + "\n" + pathJISON + "\n" + pathReporte;
            
            archivoDEF.createNewFile();
            archivoJISON.createNewFile();
            archivoCOPY.createNewFile();
            FileWriter escribirJISON = new FileWriter(archivoJISON, false);
            FileWriter escribirCOPY = new FileWriter(archivoCOPY, false);
            escribirJISON.write(json);
            escribirJISON.close();
            escribirCOPY.write(textoCOPY);
            escribirCOPY.close();
            Alerta alerta = new Alerta("Archivos Exportados");
        } catch (Exception e) {
            Alerta alerta = new Alerta("Error al crear directorio de archivos");
        }
    }

}
