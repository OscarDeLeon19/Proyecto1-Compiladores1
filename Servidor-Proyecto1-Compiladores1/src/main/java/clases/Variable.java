
package clases;

import java.util.ArrayList;


public class Variable {
    
    private String id;
    private String tipo;
    private ArrayList<String> padres = new ArrayList<>();

    public Variable() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getPadres() {
        return padres;
    }

    public void setPadres(ArrayList<String> padres) {
        this.padres = padres;
    }   
   
    public void agregarPadre(String padre){
        padres.add(padre);
    }
}
