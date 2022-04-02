package main;

import clases.Clase;
import clases.Comentario;
import clases.Metodo;
import clases.Variable;
import java.util.ArrayList;

public class Comparacion {

    private Exportar exportar = new Exportar();
    private ArrayList<Comentario> listaComentarios = new ArrayList<>();
    private ArrayList<Clase> listaClases = new ArrayList<>();
    private ArrayList<Metodo> listaMetodos = new ArrayList<>();
    private ArrayList<Variable> listaVariables = new ArrayList<>();
    private ArrayList<String> listaArreglados = new ArrayList<>();
    private double score = 0;
    /**
     * Constructor de la clase comparacion
     */
    public Comparacion() {
    }
    /**
     * Compara las clases del proyecto 1 y del segundo
     * @param lista1 Lista de clases del proyecto 1
     * @param lista2 Lista de clases del proyecto 2
     */
    public void compararClases(ArrayList<Clase> lista1, ArrayList<Clase> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            Clase clase = lista1.get(i);
            for (int j = 0; j < lista2.size(); j++) {
                Clase nueva = lista2.get(j);
                if (clase.getId().equals(nueva.getId())) {
                    boolean comparacion = compararMetodosClase(clase.getLista_metodos(), nueva.getLista_metodos());
                    if (comparacion == true) {
                        Clase copia = new Clase();
                        copia.setId(clase.getId());
                        copia.setCantidadMetodos(clase.getCantidadMetodos());
                        copia.setLista_metodos(clase.getLista_metodos());
                        copia.setRepeticiones(clase.getRepeticiones() + nueva.getRepeticiones());
                        listaClases.add(copia);
                    }
                }
            }
        }
        double clasesRepetidas = 0;
        double clasesProyecto1 = 0;
        double clasesProyecto2 = 0;
        for (int i = 0; i < listaClases.size(); i++) {
            clasesRepetidas += listaClases.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista1.size(); i++) {
            clasesProyecto1 += lista1.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista2.size(); i++) {
            clasesProyecto2 += lista2.get(i).getRepeticiones();
        }
        
        double nuevoScore = (clasesRepetidas / (clasesProyecto1 + clasesProyecto2))*0.25;
        score = score + nuevoScore;
    }
    
    /**
     * Compara los metodos de una clase con la de otra para corroborar que son clases repetidas.
     * @param lista1 Lista de metodos del proyecto 1
     * @param lista2 Lista de metodos del proyecto 1
     * @return Verdadero si la clase esta repetida y falso si es lo contrario
     */
    private boolean compararMetodosClase(ArrayList<Metodo> lista1, ArrayList<Metodo> lista2) {
        boolean comparacion = true;
        if (lista1.size() == lista2.size()) {
            for (int i = 0; i < lista1.size(); i++) {
                Metodo metodo = lista1.get(i);
                comparacion = false;
                for (int j = 0; j < lista2.size(); j++) {
                    Metodo nuevo = lista2.get(j);
                    if (metodo.getId().equals(nuevo.getId())) {
                        comparacion = true;
                    }
                }
                if (comparacion == false) {
                    break;
                }
            }
        } else {
            comparacion = false;
        }
        return comparacion;
    }
    /**
     * Compara las variable de un proyecto con el de otro
     * @param lista1 La lista de variables del proyecto 1
     * @param lista2 La lista de variables del proyecto 2
     */
    public void compararVariables(ArrayList<Variable> lista1, ArrayList<Variable> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            Variable var1 = lista1.get(i);
            for (int j = 0; j < lista2.size(); j++) {
                Variable var2 = lista2.get(j);
                if (var1.getId().equals(var2.getId()) && var1.getTipo().equals(var2.getTipo())) {
                    Variable nuevaVariable = var1;
                    for (String padre : var2.getPadres()) {
                        nuevaVariable.agregarPadre(padre);
                    }
                    Variable copia = new Variable();
                    copia.setId(var1.getId());
                    copia.setPadres(nuevaVariable.getPadres());
                    copia.setTipo(var1.getTipo());
                    copia.setRepeticiones(var1.getRepeticiones() + var2.getRepeticiones());
                    listaVariables.add(copia);
                    break;
                }
            }
        }
        double variablesRepetidas = 0;
        double variablesProyecto1 = 0;
        double variablesProyecto2 = 0;
        for (int i = 0; i < listaVariables.size(); i++) {
            variablesRepetidas += listaVariables.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista1.size(); i++) {
            variablesProyecto1 += lista1.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista2.size(); i++) {
            variablesProyecto2 += lista2.get(i).getRepeticiones();
        }
        
        double nuevoScore = (variablesRepetidas / (variablesProyecto1 + variablesProyecto2))*0.25;
        score = score + nuevoScore;
    }
    /**
     * Compara los metodos de los proyectos
     * @param lista1 La lista de metodos del proyecto 1
     * @param lista2 La lista de metodos del proyecto 2
     */
    public void compararMetodos(ArrayList<Metodo> lista1, ArrayList<Metodo> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            Metodo metodo = lista1.get(i);
            for (int j = 0; j < lista2.size(); j++) {
                Metodo nuevo = lista2.get(j);
                if (metodo.getId().equals(nuevo.getId())) {
                    boolean comparacion = compararParametrosMetodo(metodo.getListaParametros(), nuevo.getListaParametros());
                    if (comparacion == true) {
                        Metodo copia = new Metodo();
                        copia.setId(metodo.getId());
                        copia.setTipo(metodo.getTipo());
                        copia.setCantidad_parametros(metodo.getCantidad_parametros());
                        copia.setListaParametros(metodo.getListaParametros());
                        copia.setRepeticiones(metodo.getRepeticiones()+nuevo.getRepeticiones());
                        listaMetodos.add(copia);
                    }
                }
            }
        }
        double metodosRepetidos = 0;
        double metodosProyecto1 = 0;
        double metodosProyecto2 = 0;
        for (int i = 0; i < listaMetodos.size(); i++) {
            metodosRepetidos += listaMetodos.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista1.size(); i++) {
            metodosProyecto1 += lista1.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista2.size(); i++) {
            metodosProyecto2 += lista2.get(i).getRepeticiones();
        }
        double nuevoScore = (metodosRepetidos / (metodosProyecto1 + metodosProyecto2))*0.25;
        score = score + nuevoScore;
    }
    
    /**
     * Compara Los parametros de un metodo con otro.
     * @param lista1 La lista de parametros de el primer metodo
     * @param lista2 La lista de parametros de el segundo metodo
     * @return Verdadero si tienen los mismos metodos y falso si es lo contrario.
     */
    private boolean compararParametrosMetodo(ArrayList<Variable> lista1, ArrayList<Variable> lista2) {
        boolean comparacion = true;
        if (lista1.size() == lista2.size()) {
            for (int i = 0; i < lista1.size(); i++) {
                Variable parametro = lista1.get(i);
                comparacion = false;
                for (int j = 0; j < lista2.size(); j++) {
                    Variable nueva = lista2.get(j);
                    if (parametro.getId().equals(nueva.getId())) {
                        comparacion = true;
                    }
                }
                if (comparacion == false) {
                    break;
                }
            }
        } else {
            comparacion = false;
        }
        return comparacion;
    }
    /**
     * Compara los comentarios repetidos de un proyecto con otro
     * @param lista1 La lista de comentarios del proyecto 1
     * @param lista2 La lista de comentarios del proyecto 2
     */
    public void compararComentarios(ArrayList<Comentario> lista1, ArrayList<Comentario> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j < lista2.size(); j++) {
                if (lista1.get(i).getTexto().equals(lista2.get(j).getTexto())) {
                    Comentario copia = new Comentario();
                    copia.setTexto(lista1.get(i).getTexto());
                    copia.setRepeticiones(lista1.get(i).getRepeticiones() + lista2.get(i).getRepeticiones());
                    listaComentarios.add(copia);
                }
            }
        }
        double comentariosRepetidos = 0;
        double comentariosProyecto1 = 0;
        double comentariosProyecto2 = 0;
        for (int i = 0; i < listaComentarios.size(); i++) {
            comentariosRepetidos += listaComentarios.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista1.size(); i++) {
            comentariosProyecto1 += lista1.get(i).getRepeticiones();
        }
        for (int i = 0; i < lista2.size(); i++) {
            comentariosProyecto2 += lista2.get(i).getRepeticiones();
        }
        double nuevoScore = (comentariosRepetidos / (comentariosProyecto1 + comentariosProyecto2))*0.25;
        score = score + nuevoScore;
    }

    /**
     * Quita los saltos del linea, tabulacion, etc. Para que el comentario quede en una sola linea.
     */
    public void arreglarComentarios() {
        for (Comentario cm : listaComentarios) {
            String comentario = cm.getTexto();
            String nuevo = "";
            for (int i = 0; i < comentario.length(); i++) {
                String letra = comentario.substring(i, i + 1);
                if ("\n".equals(letra) || "\r".equals(letra) || "\t".equals(letra)) {
                    nuevo = nuevo + " ";
                } else {
                    nuevo = nuevo + letra;
                }
            }
            listaArreglados.add(nuevo);
        }
    }
    /**
     * Crea el texto json para posteriormente exportar los archivos.
     */
    public void exportar() {
        arreglarComentarios();
        String json = "{\n"
                + "\tScore: \"" + score + "\",\n"
                + "\tClases:[\n";
        for (int i = 0; i < listaClases.size(); i++) {
            Clase clase = listaClases.get(i);
            if (i == listaClases.size() - 1) {
                json = json + "\t\t{Nombre: \"" + clase.getId() + "\"}\n";
            } else {
                json = json + "\t\t{Nombre: \"" + clase.getId() + "\"},\n";
            }
        }
        json = json + "\t" + "],\n";
        json = json + "\tVariables:[\n";
        for (int i = 0; i < listaVariables.size(); i++) {
            Variable var = listaVariables.get(i);
            if (i == listaVariables.size() - 1) {
                json = json + "\t\t{Nombre: \"" + var.getId() + "\", Tipo: \"" + var.getTipo() + "\", Funcion: ";
                ArrayList<String> padres = var.getPadres();
                for (int j = 0; j < padres.size(); j++) {
                    if (j == padres.size() - 1) {
                        json = json + "\"" + padres.get(j) + "\"";
                    } else {
                        json = json + "\"" + padres.get(j) + "\", ";
                    }
                }
                json = json + "}\n";
            } else {
                json = json + "\t\t{Nombre: \"" + var.getId() + "\", Tipo: \"" + var.getTipo() + "\", Funcion: ";
                ArrayList<String> padres = var.getPadres();
                for (int j = 0; j < padres.size(); j++) {
                    if (j == padres.size() - 1) {
                        json = json + "\"" + padres.get(j) + "\"";
                    } else {
                        json = json + "\"" + padres.get(j) + "\", ";
                    }
                }
                json = json + "},\n";
            }
        }
        json = json + "\t" + "],\n";
        json = json + "\tMetodos:[\n";
        for (int i = 0; i < listaMetodos.size(); i++) {
            Metodo metodo = listaMetodos.get(i);
            if (i == listaMetodos.size() - 1) {
                json = json + "\t\t{Nombre: \"" + metodo.getId() + "\", Tipo: \"" + metodo.getTipo() + "\", Parametros: " + metodo.getListaParametros().size() + "}\n";
            } else {
                json = json + "\t\t{Nombre: \"" + metodo.getId() + "\", Tipo: \"" + metodo.getTipo() + "\", Parametros: " + metodo.getListaParametros().size() + "},\n";
            }
        }
        json = json + "\t" + "],\n";
        json = json + "\tComentarios:[\n";
        for (int i = 0; i < listaArreglados.size(); i++) {
            String comentario = listaArreglados.get(i);
            if (i == listaArreglados.size() - 1) {
                json = json + "\t\t{Texto: \"" + comentario + "\"}\n";
            } else {
                json = json + "\t\t{Texto: \"" + comentario + "\"},\n";
            }
        }
        json = json + "\t" + "]\n";
        json = json + "}";

        Carpeta carpeta = new Carpeta(json);
        carpeta.setVisible(true);
    }

}
