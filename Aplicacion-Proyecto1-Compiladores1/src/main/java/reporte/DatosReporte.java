package reporte;

import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jison.Jison;
import reporte.analisis.sintactico.parser;
import reporte.analisis.lexico.LexerReporte;

public class DatosReporte {

    private Jison jison;
    private TablaSimbolos tabla = new TablaSimbolos();
    private ArrayList<String> ids = new ArrayList<>();
    private ArrayList<Integer> fila = new ArrayList<>();
    private ArrayList<Integer> col = new ArrayList<>();
    private ArrayList<String> errores = new ArrayList<>();

    public void setErrores(ArrayList<String> errores) {
        this.errores = errores;
    }

    public DatosReporte(Jison jison) {
        this.jison = jison;
    }

    public void agregarID(String id, int fil, int columna) {
        ids.add(id);
        fila.add(fil);
        col.add(columna);
    }

    public void agregarSimbolosID(String tipo) {
        for (int i = 0; i < ids.size(); i++) {
            Simbolo sim = new Simbolo(ids.get(i), tipo, fila.get(i), col.get(i));
            if (tabla.comprobarSimbolo(sim) == false) {
                tabla.agregarSimbolo(sim);
            } else {
                errores.add("Error Semantico en linea: " + fila.get(i) + " | La variable ya esta declarada");
            }
        }
        ids.clear();
        fila.clear();
        col.clear();
    }

    public void agregarSimboloDeclaracion(String id, String tipo, String valor, int linea, int columna) {
        Simbolo sim = new Simbolo(id, tipo, valor, linea, columna);
        if (tabla.comprobarSimbolo(sim) == false) {
            tabla.agregarSimbolo(sim);
        } else {
            errores.add("Error Semantico en linea: " + linea + " | La variable ya esta declarada");
        }
    }

    public Object obtenerValorJISON(String lista, int i, String parametro, int linea) {
        Object valor = null;
        try {
            if (parametro == null) {
                errores.add("Error Semantico en linea: " + linea + "No se pueden usar objetos en el programa");
            } else {
                if (lista.equals("Score")) {
                    valor = jison.getScore();
                } else if (lista.equals("Clases")) {
                    valor = jison.obtenerParametrosClases(parametro, i);
                } else if (lista.equals("Variables")) {
                    valor = jison.obtenerParametrosVariables(parametro, i);
                } else if (lista.equals("Metodos")) {
                    valor = jison.obtenerParametrosMetodos(parametro, i);
                } else if (lista.equals("Comentarios")) {
                    valor = jison.obtenerParametrosComentarios(parametro, i);
                }
            }

        } catch (Exception e) {
            errores.add("Error Semantico en linea: " + linea);
        }
        return valor;
    }

    public String obtenerID(String id, int linea) {
        String valor = null;
        boolean obtencion = false;
        for (Simbolo simbolo : tabla.getTabla()) {
            if (simbolo.getId().equals(id)) {
                valor = simbolo.getValor();
                obtencion = true;
            }
        }
        if (obtencion == false) {
            errores.add("Error Semantico en linea: " + linea + " | La variable no fue definida");
        }
        return valor;
    }

    public void asignarID(String id, String valor, int linea) {
        boolean obtencion = false;
        for (Simbolo simbolo : tabla.getTabla()) {
            if (simbolo.getId().equals(id)) {
                simbolo.setValor(valor);
                obtencion = true;
            }
        }
        if (obtencion == false) {
            errores.add("Error Semantico en linea: " + linea + " | La variable no fue definida");
        }
    }

    public String convertirCadena(String cadena, String resto) {
        String cad = cadena.substring(1, cadena.length() - 1);
        if (resto != null) {
            cad = cad + resto;
        }
        return cad;
    }

    public void pintar() {
        tabla.pintarSimbolos();
    }

}
