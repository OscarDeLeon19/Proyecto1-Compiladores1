package jison;

import clases.Clase;
import clases.Metodo;
import clases.Variable;
import java.util.ArrayList;

public class Jison {

    private String score;
    private ArrayList<Clase> clases = new ArrayList<>();
    private ArrayList<Metodo> metodos = new ArrayList<>();
    private ArrayList<Variable> variables = new ArrayList<>();
    private ArrayList<String> comentarios = new ArrayList<>();
    private Variable var = new Variable();

    public Jison() {

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

    public void agregarClase(String nombre) {
        Clase clase = new Clase();
        clase.setId(nombre);
        clases.add(clase);
    }

    public void agregarFuncion(String funcion) {
        var.agregarPadre(funcion);
    }

    public void agregarVariable(String nombre, String tipo) {
        var.setId(nombre);
        var.setTipo(tipo);
        variables.add(var);
        Variable nueva = new Variable();
        var = nueva;
    }

    public void agregarMetodo(String nombre, String tipo, int param) {
        Metodo metodo = new Metodo();
        metodo.setId(nombre);
        metodo.setTipo(tipo);
        metodo.setCantidad_parametros(param);
        metodos.add(metodo);
    }

    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }

    public String obtenerParametrosClases(String parametro, int i) {
        String valor = "";
        Clase clase = clases.get(i);
        if (parametro.equals("Nombre")) {
            valor = String.valueOf(clase.getId());
        }
        return valor;
    }

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

    public String obtenerParametrosComentarios(String parametro, int i) {
        String valor = "";
        if (parametro.equals("Texto")) {
            valor = comentarios.get(i);
        }
        return valor;
    }

}
