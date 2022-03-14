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

    public void iniciarAnalisisProyecto1() {
        Lista lista1 = new Lista();
        File fichero;
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        System.out.println(fichero.getAbsolutePath());
        try {

            for (File file : fichero.listFiles()) {
                if (file.getName().endsWith(".java")){
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

            System.out.println(listaComentarios1);
            System.out.println("Variables");
            for (Variable var : listaVariables1) {
                System.out.println("ID: " + var.getId());
                System.out.println("Tipo: " + var.getTipo());
                System.out.println("Padres: " + var.getPadres());
                System.out.println("");
            }
            System.out.println("Metodos");
            for (Metodo metodo : listaMetodos1) {
                System.out.println("ID: " + metodo.getId());
                System.out.println("Tipo: " + metodo.getTipo());
                System.out.println("Cantidad de Parametros: " + metodo.getListaParametros().size());
                System.out.println("Parametros:");
                for (Variable parametro : metodo.getListaParametros()) {
                    System.out.println("Id Parametro:" + parametro.getId());
                    System.out.println("Tipo Parametro:" + parametro.getTipo());
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("Clases");
            for (Clase clase : listaClase1) {
                System.out.println("ID: " + clase.getId());
                System.out.println("Cantidad de Metodos: " + clase.getCantidadMetodos());
                System.out.println("Metodos:");
                for (Metodo parametro : clase.getLista_metodos()) {
                    System.out.println("Id Parametro:" + parametro.getId());
                    System.out.println("Tipo Parametro:" + parametro.getTipo());
                    System.out.println("");
                }
                System.out.println("");
            }

            JOptionPane.showMessageDialog(null, "Bien");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar archivo");
        }
    }

}
