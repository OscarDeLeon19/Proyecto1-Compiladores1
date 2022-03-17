package main;

import clases.Clase;
import clases.Metodo;
import clases.Variable;
import java.util.ArrayList;

public class Comparacion {

    private Exportar exportar = new Exportar();
    private ArrayList<String> listaComentarios = new ArrayList<>();
    private ArrayList<Clase> listaClases = new ArrayList<>();
    private ArrayList<Metodo> listaMetodos = new ArrayList<>();
    private ArrayList<Variable> listaVariables = new ArrayList<>();
    private ArrayList<String> listaArreglados = new ArrayList<>();
    private double score = 0;

    public Comparacion() {
    }

    public void compararClases(ArrayList<Clase> lista1, ArrayList<Clase> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            Clase clase = lista1.get(i);
            for (int j = 0; j < lista2.size(); j++) {
                Clase nueva = lista2.get(j);
                if (clase.getId().equals(nueva.getId())) {
                    boolean comparacion = compararMetodosClase(clase.getLista_metodos(), nueva.getLista_metodos());
                    if (comparacion == true) {
                        listaClases.add(clase);
                    }
                }
            }
        }
        double tamanioClase = listaClases.size();
        double tamaño1 = lista1.size();
        double tamaño2 = lista2.size();
        double nuevoScore = tamanioClase / (tamaño1 + tamaño2);
        score = score + nuevoScore;
    }

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
                    listaVariables.add(nuevaVariable);
                    break;
                }
            }
        }
        double tamanioClase = listaVariables.size();
        double tamaño1 = lista1.size();
        double tamaño2 = lista2.size();
        double nuevoScore = tamanioClase / (tamaño1 + tamaño2);
        score = score + nuevoScore;
    }

    public void compararMetodos(ArrayList<Metodo> lista1, ArrayList<Metodo> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            Metodo metodo = lista1.get(i);
            for (int j = 0; j < lista2.size(); j++) {
                Metodo nuevo = lista2.get(j);
                if (metodo.getId().equals(nuevo.getId())) {
                    boolean comparacion = compararParametrosMetodo(metodo.getListaParametros(), nuevo.getListaParametros());
                    if (comparacion == true) {
                        listaMetodos.add(metodo);
                    }
                }
            }
        }
        double tamanioClase = listaMetodos.size();
        double tamaño1 = lista1.size();
        double tamaño2 = lista2.size();
        double nuevoScore = tamanioClase / (tamaño1 + tamaño2);
        score = score + nuevoScore;
    }

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

    public void compararComentarios(ArrayList<String> lista1, ArrayList<String> lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j < lista2.size(); j++) {
                if (lista1.get(i).equals(lista2.get(j))) {
                    listaComentarios.add(lista1.get(i));
                }
            }
        }
        double tamanioClase = listaComentarios.size();
        double tamaño1 = lista1.size();
        double tamaño2 = lista2.size();
        double nuevoScore = tamanioClase / (tamaño1 + tamaño2);
        score = score + nuevoScore;
    }

    public void arreglarComentarios() {
        for (String comentario : listaComentarios) {
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

    public void exportar() {
        /*
        System.out.println("Score: " + score);

        System.out.println("Comentarios");
        System.out.println(listaComentarios);
        System.out.println("Variables");
        for (Variable var : listaVariables) {
            System.out.println("ID: " + var.getId());
            System.out.println("Tipo: " + var.getTipo());
            System.out.println("Padres: " + var.getPadres());
            System.out.println("");
        }
        System.out.println("Metodos");
        for (Metodo metodo : listaMetodos) {
            System.out.println("ID: " + metodo.getId());
            System.out.println("Tipo: " + metodo.getTipo());
            System.out.println("Cantidad de Parametros: " + metodo.getListaParametros().size());
            System.out.println("Parametros:");
            for (Variable parametro : metodo.getListaParametros()) {
                System.out.println("Id Parametro:" + parametro.getId());
                System.out.println("Tipo Parametro:" + parametro.getTipo());
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Clases");
        for (Clase clase : listaClases) {
            System.out.println("ID: " + clase.getId());
            System.out.println("Cantidad de Metodos: " + clase.getCantidadMetodos());
            System.out.println("Metodos:");
            for (Metodo parametro : clase.getLista_metodos()) {
                System.out.println("Id Parametro:" + parametro.getId());
                System.out.println("Tipo Parametro:" + parametro.getTipo());
                System.out.println("");
            }
            System.out.println("");
        }
         */

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

        exportar.exportarJISON(json);
    }

}
