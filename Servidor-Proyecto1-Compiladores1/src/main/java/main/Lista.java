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
    /**
     * Constructor de la clase Lista
     */
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
    /**
     * Añade un comentario a la lista de comentarios
     * @param comentario 
     */
    public void añadirComentario(String comentario) {
        listaComentarios.add(comentario);
    }
    /**
     * Añade una variable nueva obtenida desde el analizador sintactico
     * @param id El id de la variable
     * @param tipo El tipo de la variable
     */
    public void añadirDatosVariable(String id, String tipo) {
        variable.setId(id);
        variable.setTipo(tipo);
        listaVariables.add(variable);
        Variable nueva = new Variable();
        variable = nueva;
    }
    /**
     * Añade un metodo a la lista de metodos del proyecto
     * @param id El identificador del metodo
     * @param tipo El tipo de metodo
     * @param conteo El conteo de metodos que se ha realizado
     */
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
    /**
     * Añade un parametro de un metodo a la lista de parametros
     * @param id El identificador del parametro
     * @param tipo El tipo del parametro
     */
    public void añadirParametro(String id, String tipo) {
        parametro.setId(id);
        parametro.setTipo(tipo);
        metodo.añadirParametro(parametro);
        Variable nuevo = new Variable();
        parametro = nuevo;
    }
    /**
     * Reinicia la lista de parametros para dejarla limpia
     */
    public void reiniciarParametros() {
        metodo.reiniciarListaParametros();
    }
    /**
     * Agrega una clase a la lista de clases del proyecto
     * @param id El identificador de la clase 
     */
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
    /**
     * Cuenta los metodos que tiene cada clase
     * @return La cantidad de metodos
     */
    public int contarMetodos() {
        int numero = 0;
        for (Clase cl : listaClase) {
            numero = numero + cl.getCantidadMetodos();
        }
        return numero;
    }
    /**
     * Agrega la clase como parametro "Padre" a las variables que no tengan uno
     * @param padre El nombre de la clase
     */
    public void agregarClasesPadre(String padre) {
        for (int i = 0; i < listaVariables.size(); i++) {
            Variable aux = listaVariables.get(i);
            if (aux.getPadres().isEmpty()) {
                aux.agregarPadre(padre);
            }
        }
    }
    /**
     * Elimina las variables repetidas para agregar los valores a los padres
     */
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
                    listaVariables.remove(j);
                    j--;
                }
            }
        }
    }

}
