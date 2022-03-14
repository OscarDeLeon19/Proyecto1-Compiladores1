package main;

import clases.Clase;
import clases.Metodo;
import clases.Variable;
import java.util.ArrayList;

public class Lista {

    private ArrayList<String> listaComentarios = new ArrayList<>();
    private ArrayList<Clase> listaClase = new ArrayList<>();
    private ArrayList<Metodo> listaMetodos = new ArrayList<>();
    private ArrayList<Variable> listaVariables = new ArrayList<>();

    private Variable variable = new Variable();
    private Variable parametro = new Variable();
    private Metodo metodo = new Metodo();
    private Clase clase = new Clase();

    public Lista() {
    }

    public ArrayList<String> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<String> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public ArrayList<Clase> getListaClase() {
        return listaClase;
    }

    public void setListaClase(ArrayList<Clase> listaClase) {
        this.listaClase = listaClase;
    }

    public ArrayList<Metodo> getListaMetodos() {
        return listaMetodos;
    }

    public void setListaMetodos(ArrayList<Metodo> listaMetodos) {
        this.listaMetodos = listaMetodos;
    }

    public ArrayList<Variable> getListaVariables() {
        return listaVariables;
    }

    public void setListaVariables(ArrayList<Variable> listaVariables) {
        this.listaVariables = listaVariables;
    }

    public void añadirComentario(String comentario) {
        listaComentarios.add(comentario);
    }

    public void añadirDatosVariable(String id, String tipo) {
        variable.setId(id);
        variable.setTipo(tipo);
        listaVariables.add(variable);
        Variable nueva = new Variable();
        variable = nueva;
    }

    public void añadirMetodo(String id, String tipo, int conteo) {
        metodo.setId(id);
        metodo.setTipo(tipo);
        int cantidadVariables = listaVariables.size() - 1;
        int resta = cantidadVariables - conteo;
        for (int i = cantidadVariables; i > resta; i--) {

            Variable var = listaVariables.get(i);
            var.agregarPadre(id);
        }
        listaMetodos.add(metodo);
        Metodo nuevo = new Metodo();
        metodo = nuevo;
    }

    public void añadirParametro(String id, String tipo) {
        parametro.setId(id);
        parametro.setTipo(tipo);
        metodo.añadirParametro(parametro);
        Variable nuevo = new Variable();
        parametro = nuevo;
    }

    public void reiniciarParametros() {
        metodo.reiniciarListaParametros();
    }

    public void agregarClase(String id) {
        clase.setId(id);
        int numero = contarMetodos();
        for (int i = numero; i < listaMetodos.size(); i++) {
            clase.agregarMetodo(listaMetodos.get(i));
        }
        listaClase.add(clase);
        agregarClasesPadre(id);
        Clase nueva = new Clase();
        clase = nueva;
    }

    public int contarMetodos() {
        int numero = 0;
        for (Clase cl : listaClase) {
            numero = numero + cl.getCantidadMetodos();
        }
        return numero;
    }

    public void agregarClasesPadre(String padre) {
        for (int i = 0; i < listaVariables.size(); i++) {
            Variable aux = listaVariables.get(i);
            if (aux.getPadres().isEmpty()) {
                aux.agregarPadre(padre);
            }
        }
    }
    
    
    public void eliminarRepetidos(){
        for (int i = 0; i < listaVariables.size(); i++) {
            Variable aux = listaVariables.get(i);
            for (int j = i+1; j < listaVariables.size(); j++) {
                Variable repetida = listaVariables.get(j);
                if(aux.getId().equals(repetida.getId()) && aux.getTipo().equals(repetida.getTipo())){
                    ArrayList<String> padres = repetida.getPadres();
                    for (int k = 0; k < padres.size(); k++) {
                        aux.agregarPadre(padres.get(k));                                         
                    }
                    System.out.println(listaVariables.size());
                    listaVariables.remove(j);
                    System.out.println(listaVariables.size());
                    j--;
                }
            }
        }
    }

}
