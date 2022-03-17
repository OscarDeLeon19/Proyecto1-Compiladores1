
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

    public Jison(String score) {
        this.score = score;
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
    
    
    
}
