
package jison;

import java.io.StringReader;
import java.util.ArrayList;
import jison.analisis.lexico.LexerJISON;
import jison.analisis.sintactico.parser;


public class DatosJISON {
 
    public DatosJISON() {
    }
    
    public Jison analizarJISON(String texto, ArrayList<String> errores){
        Jison jison = new Jison();
        try {
            StringReader str = new StringReader(texto);
            LexerJISON lexer = new LexerJISON(str);
            lexer.setErrores(errores);
            parser par = new parser(lexer);
            par.setErrores(errores);
            par.setJison(jison);
            par.parse();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return jison;
    }
    
    
}
