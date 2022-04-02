package clases;

import java.util.ArrayList;

public class Clase {

    private String id;
    private ArrayList<Metodo> lista_metodos = new ArrayList<>();
    private int cantidadMetodos = 0;
    private int repeticiones = 1;
    /**
     * Constructor de la clase "Clase"
     */
    public Clase() {
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Metodo> getLista_metodos() {
        return lista_metodos;
    }

    public void setLista_metodos(ArrayList<Metodo> lista_metodos) {
        this.lista_metodos = lista_metodos;
    }
    /**
     * Agrega un metodo a la lista de metodos de la clase
     * @param nuevo_metodo 
     */
    public void agregarMetodo(Metodo nuevo_metodo) {
        lista_metodos.add(nuevo_metodo);
        cantidadMetodos++;
    }

    public int getCantidadMetodos() {
        return cantidadMetodos;
    }

    public void setCantidadMetodos(int cantidadMetodos) {
        this.cantidadMetodos = cantidadMetodos;
    }
    
    public void aumentarRepeticiones(int cantidad){
        repeticiones += cantidad;
    }

}
