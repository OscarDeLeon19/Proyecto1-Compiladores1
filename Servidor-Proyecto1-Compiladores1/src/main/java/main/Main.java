package main;

import java.io.File;
import javax.swing.JFileChooser;


public class Main {
      
    public static void main(String[] args) throws Exception {
        Analisis analisis = new Analisis();
        
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
        
        
        
    }   
   
}
