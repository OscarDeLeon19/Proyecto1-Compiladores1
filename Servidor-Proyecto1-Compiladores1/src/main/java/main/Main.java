package main;

import analisis.lexico.LexerServidor;
import analisis.sintactico.parser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
    
    public static void main(String[] args) throws Exception {
        File fichero;
        JFileChooser seleccionar = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo Java", "java");
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.addChoosableFileFilter(filtro);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        try {
            FileReader Lector = new FileReader(fichero);
            LexerServidor lexer = new LexerServidor(Lector);
            parser par = new parser(lexer);
            par.parse();
            JOptionPane.showMessageDialog(null, "Bien");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }              
    }   
   
}
