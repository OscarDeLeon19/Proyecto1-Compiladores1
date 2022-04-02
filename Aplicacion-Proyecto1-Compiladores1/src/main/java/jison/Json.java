package jison;

import clases.Clase;
import clases.Metodo;
import clases.Variable;
import java.util.ArrayList;

public class Json {

    private String score;
    private ArrayList<Clase> clases = new ArrayList<>();
    private ArrayList<Metodo> metodos = new ArrayList<>();
    private ArrayList<Variable> variables = new ArrayList<>();
    private ArrayList<String> comentarios = new ArrayList<>();
    private Variable var = new Variable();
    /**
     * Constructor de la clase JSon
     */
    public Json() {

    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodo> metodos) {
        this.metodos = metodos;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }
    /**
     * Agrega una clase a la lista de clases del Json
     * @param nombre El nombre
     */
    public void agregarClase(String nombre) {
        Clase clase = new Clase();
        clase.setId(nombre);
        clases.add(clase);
    }
    /**
     * Agrega el nombre de una funcion al valor padre de una variable
     * @param funcion EL nombre de la funcion.
     */
    public void agregarFuncion(String funcion) {
        var.agregarPadre(funcion);
    }
    /**
     * Agrega una variable a la lista de variables 
     * @param nombre El nombre de la variable
     * @param tipo El tipo de la variable
     */
    public void agregarVariable(String nombre, String tipo) {
        var.setId(nombre);
        var.setTipo(tipo);
        variables.add(var);
        Variable nueva = new Variable();
        var = nueva;
    }
    /**
     * Agrega un metodo a la lista de metodos del archivo Json
     * @param nombre El nombre del metodo
     * @param tipo El tipo del metodo
     * @param param La cantidad de parametros que contiene el metodo.
     */
    public void agregarMetodo(String nombre, String tipo, int param) {
        Metodo metodo = new Metodo();
        metodo.setId(nombre);
        metodo.setTipo(tipo);
        metodo.setCantidad_parametros(param);
        metodos.add(metodo);
    }
    /**
     * Agrega un comentario a la lista de comentarios
     * @param comentario El texto del comentario
     */
    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }
    /**
     * Obtiene el nombre de una clase solicitada.
     * @param parametro El tipo de valor necesario de la clase
     * @param i El lugar en donde se encuentra la clase en la lista.
     * @return El nombre de la clase
     */
    public String obtenerParametrosClases(String parametro, int i) {
        String valor = "";
        Clase clase = clases.get(i);
        if (parametro.equals("Nombre")) {
            valor = String.valueOf(clase.getId());
        }
        return valor;
    }
    /**
     * Obtiene el parametro de una variable
     * @param parametro El tipo de parametro necesario
     * @param i El lugar de la variable en la lista
     * @return El parametro solicitado.
     */
    public String obtenerParametrosVariables(String parametro, int i) {
        String valor = "";
        Variable variable = variables.get(i);

        if (parametro.equals("Nombre")) {
            valor = variable.getId();
        } else if (parametro.equals("Tipo")) {
            valor = variable.getTipo();
        } else if (parametro.equals("Funcion")) {
            valor = String.valueOf(variable.getPadres());
        }
        return valor;
    }
    /**
     * Obtiene el parametro de un metodo
     * @param parametro El tipo de parametro solicitado
     * @param i El lugar de el metodo que se solicita
     * @return El valor del parametro solicitado.
     */
    public String obtenerParametrosMetodos(String parametro, int i) {
        String valor = "";
        Metodo metodo = metodos.get(i);

        if (parametro.equals("Nombre")) {
            valor = metodo.getId();
        } else if (parametro.equals("Tipo")) {
            valor = metodo.getTipo();
        } else if (parametro.equals("Parametros")) {
            valor = String.valueOf(metodo.getCantidad_parametros());
        }
        return valor;
    }
    /**
     * Obtiene el texto de un comentario
     * @param parametro el tipo de parametro
     * @param i El lugar del comentario en la lista
     * @return El valor solicitado.
     */
    public String obtenerParametrosComentarios(String parametro, int i) {
        String valor = "";
        if (parametro.equals("Texto")) {
            valor = comentarios.get(i);
        }
        return valor;
    }

}
