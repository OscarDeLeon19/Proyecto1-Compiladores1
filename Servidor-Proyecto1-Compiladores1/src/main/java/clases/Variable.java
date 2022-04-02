package clases;

import java.util.ArrayList;

public class Variable {

    private String id;
    private String tipo;
    private ArrayList<String> padres = new ArrayList<>();
    /**
     * Constructor de la clase variable.
     * Crea un objeto de tipo variable obtenido del analisis sintactico.
     */
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

    public void agregarPadre(String padre) {
        boolean comprobacion = false;
        for (String p : padres) {
            if (p.equals(padre)) {
                comprobacion = true;
                break;
            }
        }
        if (comprobacion == false) {
            padres.add(padre);
        }
    }
}
