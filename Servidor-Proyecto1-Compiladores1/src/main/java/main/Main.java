package main;

import analisis.lexico.LexerServidor;
import analisis.sintactico.parser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
    
    ArrayList<String> lista_comentarios = new ArrayList<>();
    

    public void setLista_comentarios(ArrayList<String> lista_comentarios) {
        this.lista_comentarios = lista_comentarios;
    }
    
    
    
    
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista_comentarios = new ArrayList<>();
        
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
