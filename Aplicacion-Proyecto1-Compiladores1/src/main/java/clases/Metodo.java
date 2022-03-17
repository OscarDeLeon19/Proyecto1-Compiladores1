
package clases;

import java.util.ArrayList;


public class Metodo {
    
    private String id;
    private String tipo;
    private int cantidad_parametros = 0;
    private ArrayList<Variable> listaParametros = new ArrayList<>();

    public Metodo() {
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

    public int getCantidad_parametros() {
        return cantidad_parametros;
    }

    public void setCantidad_parametros(int cantidad_parametros) {
        this.cantidad_parametros = cantidad_parametros;
    }

    public ArrayList<Variable> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(ArrayList<Variable> listaParametros) {
        this.listaParametros = listaParametros;
    }
    
    public void añadirParametro(Variable parametro){
        listaParametros.add(0,parametro);
    }
    
    public void reiniciarListaParametros(){
        listaParametros.clear();
    }
}
