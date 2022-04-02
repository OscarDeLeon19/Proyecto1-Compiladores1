
package jison;

import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jison.analisis.lexico.LexerJISON;
import jison.analisis.sintactico.parser;


public class DatosJSON {
    /**
     * Constructor de la clase Datos Json
     */
    public DatosJSON() {
    }
    /**
     * Inicia el analisis lexico y sintactico de el archivo Json del proyecto.
     * @param texto El texto del archivo Json
     * @param errores La lista de errores de la aplicacion
     * @return El json con los datos guardados.
     */
    public Json analizarJSON(String texto, ArrayList<String> errores){
        Json json = new Json();
        try {
            StringReader str = new StringReader(texto);
            LexerJISON lexer = new LexerJISON(str);
            lexer.setErrores(errores);
            parser par = new parser(lexer);
            par.setErrores(errores);
            par.setJson(json);
            par.parse();
            JOptionPane.showMessageDialog(null, "Jison compilado correctamente");
        } catch (Exception e) {
            json = null;
        }
        return json;
    }
    
    
}
