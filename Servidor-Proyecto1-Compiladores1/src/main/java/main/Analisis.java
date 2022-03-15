package main;

import analisis.lexico.LexerServidor;
import analisis.sintactico.parser;
import clases.Clase;
import clases.Metodo;
import clases.Variable;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Analisis {

    private ArrayList<String> listaComentarios1 = new ArrayList<>();
    private ArrayList<Clase> listaClase1 = new ArrayList<>();
    private ArrayList<Metodo> listaMetodos1 = new ArrayList<>();
    private ArrayList<Variable> listaVariables1 = new ArrayList<>();

    private ArrayList<String> listaComentarios2 = new ArrayList<>();
    private ArrayList<Clase> listaClase2 = new ArrayList<>();
    private ArrayList<Metodo> listaMetodos2 = new ArrayList<>();
    private ArrayList<Variable> listaVariables2 = new ArrayList<>();

    public Analisis() {
    }

    public void iniciarAnalisisProyecto1(File fichero) {
        Lista lista1 = new Lista();
        try {

            for (File file : fichero.listFiles()) {
                if (file.getName().endsWith(".java")) {
                    FileReader Lector = new FileReader(file);
                    LexerServidor lexer = new LexerServidor(Lector);
                    lexer.setLista(lista1);
                    parser par = new parser(lexer);
                    par.setLista(lista1);
                    par.parse();
                } else {
                    System.out.println("Error en el archivo");
                }

            }

            lista1.eliminarRepetidos();
            listaComentarios1 = lista1.getListaComentarios();
            listaClase1 = lista1.getListaClase();
            listaMetodos1 = lista1.getListaMetodos();
            listaVariables1 = lista1.getListaVariables();

           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }
    }

    public void iniciarAnalisisProyecto2(File fichero) {
        Lista lista2 = new Lista();
        try {

            for (File file : fichero.listFiles()) {
                if (file.getName().endsWith(".java")) {
                    FileReader Lector = new FileReader(file);
                    LexerServidor lexer = new LexerServidor(Lector);
                    lexer.setLista(lista2);
                    parser par = new parser(lexer);
                    par.setLista(lista2);
                    par.parse();
                } else {
                    System.out.println("Error en el archivo");
                }

            }

            lista2.eliminarRepetidos();
            listaComentarios2 = lista2.getListaComentarios();
            listaClase2 = lista2.getListaClase();
            listaMetodos2 = lista2.getListaMetodos();
            listaVariables2 = lista2.getListaVariables();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }
    }

    public void comparar(){
        Comparacion comparacion = new Comparacion();
        comparacion.compararClases(listaClase1, listaClase2);
        comparacion.compararVariables(listaVariables1, listaVariables2);
        comparacion.compararMetodos(listaMetodos1, listaMetodos2);
        comparacion.compararComentarios(listaComentarios1, listaComentarios2);
        comparacion.exportar();
    }
}
