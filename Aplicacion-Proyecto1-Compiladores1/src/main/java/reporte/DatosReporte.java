package reporte;

import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jison.Jison;
import reporte.ciclo.LexerCiclo;
import reporte.analisis.sintactico.parser;
import reporte.analisis.lexico.LexerReporte;
import reporte.ciclo.AnalizadorCiclo;

public class DatosReporte {

    private Jison jison;
    private TablaSimbolos tabla = new TablaSimbolos();
    private ArrayList<String> ids = new ArrayList<>();
    private ArrayList<Integer> fila = new ArrayList<>();
    private ArrayList<Integer> col = new ArrayList<>();
    private ArrayList<String> errores = new ArrayList<>();
    private ArrayList<String> lineasHTML = new ArrayList<>();
    private ArrayList<String> etiquetasFor = new ArrayList<>();
    private String etiquetaValor = "";
    private int inicioFor = 0;
    private int finFor = 0;
    private boolean forActivo = false;
    private Simbolo simFor = null;

    public String getEtiquetaValor() {
        return etiquetaValor;
    }

    public void setEtiquetaValor(String etiquetaValor) {
        this.etiquetaValor = etiquetaValor;
    }

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
            errores.add("Error Semantico en linea: " + linea + " | La variable solicitada no existe");
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
        System.out.println("HTML");
        //System.out.println(etiquetasFor);
        System.out.println("");
        for (int i = 0; i < lineasHTML.size(); i++) {
            System.out.println(lineasHTML.get(i));
        }

    }

    public void iniciarFor(int inicioFor, int finFor) {
        this.inicioFor = inicioFor;
        this.finFor = finFor;
        forActivo = true;

    }

    public void recorrerFor() {
        if (forActivo == true || errores.isEmpty() == false) {
            forActivo = false;
            String texto = "INICIO\n";
            for (int i = 0; i < etiquetasFor.size(); i++) {
                texto = texto + etiquetasFor.get(i);
                texto = texto + "\n";
            }
            System.out.println(texto);
            String completo = "";
            for (int i = inicioFor; i < finFor; i++) {
                completo = completo + texto;
            }
            try {
                if (completo.equals("") == false) {
                    StringReader str = new StringReader(completo);
                    LexerCiclo lexer = new LexerCiclo(str);
                    AnalizadorCiclo ciclo = new AnalizadorCiclo(lexer);
                    ciclo.setDtsRep(this);
                    ciclo.setErrores(errores);
                    ciclo.parse();
                }
            } catch (Exception e) {
                errores.add("Error en el ciclo");
            }
            etiquetasFor.clear();
            simFor = null;
            inicioFor = 0;
            finFor = 0;
        } else {
            errores.add("No puede haber un ciclo dentro de otro ciclo");
        }
    }

    public void obtenerSimboloFor(String id) {
        for (Simbolo simbolo : tabla.getTabla()) {
            if (simbolo.getId().equals(id)) {
                simFor = simbolo;
            }
        }
    }

    public void agregarEtiqueta(String etiqueta) {
        if (forActivo == true) {
            etiquetasFor.add(etiqueta);
        } else {
            lineasHTML.add(etiqueta);
        }
    }

    public void agregarH1(String valor) {
        if (forActivo == true) {
            etiquetasFor.add("<h1>" + etiquetaValor + "</h1>");
        } else {
            lineasHTML.add("<h1>" + valor + "</h1>");
        }
    }

    public void agregarH2(String valor) {
        if (forActivo == true) {
            etiquetasFor.add("<h2>" + etiquetaValor + "</h2>");
        } else {
            lineasHTML.add("<h2>" + valor + "</h2>");
        }
    }

    public void agregarFilaTH(String valor) {
        if (forActivo == true) {
            etiquetasFor.add("<th scope=\"col\">" + etiquetaValor + "</th>");
        } else {
            lineasHTML.add("<th scope=\"col\">" + valor + "</th>");
        }
    }

    public void agregarFilaTD(String valor) {
        if (forActivo == true) {
            etiquetasFor.add("<td>" + etiquetaValor + "</td>");
        } else {
            lineasHTML.add("<td>" + valor + "</td>");
        }
    }

    public void aumentarID() {
        simFor.sumarValor();
    }

    public String exportarHTML() {
        String cuerpo = "";
        for (String linea : lineasHTML) {
            cuerpo = cuerpo + linea + "\n";
        }
        return cuerpo;
    }

}
