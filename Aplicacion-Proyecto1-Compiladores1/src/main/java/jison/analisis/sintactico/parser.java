
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package jison.analisis.sintactico;

import java_cup.runtime.Symbol;
import jison.analisis.lexico.*;
import java.util.ArrayList;
import jison.Jison;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\005\000\002\016" +
    "\002\000\002\003\020\000\002\004\007\000\002\004\004" +
    "\000\002\005\011\000\002\005\007\000\002\005\004\000" +
    "\002\006\007\000\002\006\004\000\002\007\021\000\002" +
    "\007\017\000\002\007\004\000\002\010\005\000\002\010" +
    "\003\000\002\015\005\000\002\011\007\000\002\011\004" +
    "\000\002\012\021\000\002\012\017\000\002\012\004\000" +
    "\002\013\007\000\002\013\004\000\002\014\013\000\002" +
    "\014\012\000\002\014\011\000\002\014\010\000\002\014" +
    "\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\220\000\004\021\005\001\002\000\004\002\222\001" +
    "\002\000\004\004\007\001\002\000\004\022\221\001\002" +
    "\000\004\020\010\001\002\000\004\017\011\001\002\000" +
    "\004\016\012\001\002\000\004\017\013\001\002\000\004" +
    "\025\014\001\002\000\006\003\uffff\005\uffff\001\002\000" +
    "\006\003\016\005\017\001\002\000\004\023\220\001\002" +
    "\000\004\020\177\001\002\000\004\025\021\001\002\000" +
    "\006\003\022\006\024\001\002\000\004\023\176\001\002" +
    "\000\004\025\074\001\002\000\004\020\025\001\002\000" +
    "\004\023\026\001\002\000\006\003\027\021\031\001\002" +
    "\000\004\022\073\001\002\000\006\024\055\025\054\001" +
    "\002\000\004\011\032\001\002\000\004\020\033\001\002" +
    "\000\004\017\035\001\002\000\004\025\040\001\002\000" +
    "\004\027\036\001\002\000\004\017\037\001\002\000\006" +
    "\022\ufff1\025\ufff1\001\002\000\004\012\041\001\002\000" +
    "\004\020\042\001\002\000\004\017\035\001\002\000\004" +
    "\025\044\001\002\000\004\013\045\001\002\000\004\020" +
    "\046\001\002\000\004\017\035\001\002\000\006\022\ufff2" +
    "\025\ufff2\001\002\000\006\022\052\025\051\001\002\000" +
    "\004\017\035\001\002\000\006\024\ufff5\025\ufff5\001\002" +
    "\000\006\022\ufff3\025\ufff3\001\002\000\004\021\056\001" +
    "\002\000\004\025\ufff8\001\002\000\004\011\057\001\002" +
    "\000\004\020\060\001\002\000\004\017\035\001\002\000" +
    "\004\025\062\001\002\000\004\012\063\001\002\000\004" +
    "\020\064\001\002\000\004\017\035\001\002\000\004\025" +
    "\066\001\002\000\004\013\067\001\002\000\004\020\070" +
    "\001\002\000\004\017\035\001\002\000\006\022\072\025" +
    "\051\001\002\000\006\024\ufff6\025\ufff6\001\002\000\006" +
    "\024\ufff4\025\ufff4\001\002\000\006\003\075\007\077\001" +
    "\002\000\004\023\175\001\002\000\004\025\141\001\002" +
    "\000\004\020\100\001\002\000\004\023\101\001\002\000" +
    "\006\003\102\021\104\001\002\000\004\022\140\001\002" +
    "\000\006\024\122\025\121\001\002\000\004\011\105\001" +
    "\002\000\004\020\106\001\002\000\004\017\035\001\002" +
    "\000\004\025\110\001\002\000\004\012\111\001\002\000" +
    "\004\020\112\001\002\000\004\017\035\001\002\000\004" +
    "\025\114\001\002\000\004\014\115\001\002\000\004\020" +
    "\116\001\002\000\004\031\117\001\002\000\004\022\120" +
    "\001\002\000\006\024\uffed\025\uffed\001\002\000\004\021" +
    "\123\001\002\000\004\025\ufff0\001\002\000\004\011\124" +
    "\001\002\000\004\020\125\001\002\000\004\017\035\001" +
    "\002\000\004\025\127\001\002\000\004\012\130\001\002" +
    "\000\004\020\131\001\002\000\004\017\035\001\002\000" +
    "\004\025\133\001\002\000\004\014\134\001\002\000\004" +
    "\020\135\001\002\000\004\031\136\001\002\000\004\022" +
    "\137\001\002\000\006\024\uffee\025\uffee\001\002\000\006" +
    "\024\uffec\025\uffec\001\002\000\006\003\143\010\144\001" +
    "\002\000\004\022\ufffe\001\002\000\004\023\174\001\002" +
    "\000\004\020\145\001\002\000\004\023\146\001\002\000" +
    "\006\003\147\021\151\001\002\000\004\022\173\001\002" +
    "\000\006\024\162\025\161\001\002\000\004\015\152\001" +
    "\002\000\004\020\153\001\002\000\004\017\154\001\002" +
    "\000\004\030\155\001\002\000\006\017\156\022\157\001" +
    "\002\000\004\022\160\001\002\000\006\024\uffe6\025\uffe6" +
    "\001\002\000\006\024\uffe7\025\uffe7\001\002\000\004\021" +
    "\163\001\002\000\004\022\uffeb\001\002\000\004\015\164" +
    "\001\002\000\004\020\165\001\002\000\004\017\166\001" +
    "\002\000\004\030\167\001\002\000\006\017\170\022\171" +
    "\001\002\000\004\022\172\001\002\000\006\024\uffe8\025" +
    "\uffe8\001\002\000\006\024\uffe9\025\uffe9\001\002\000\006" +
    "\024\uffe5\025\uffe5\001\002\000\004\022\uffea\001\002\000" +
    "\004\025\uffef\001\002\000\004\025\ufff7\001\002\000\004" +
    "\023\200\001\002\000\006\003\201\021\203\001\002\000" +
    "\004\022\217\001\002\000\006\024\211\025\210\001\002" +
    "\000\004\011\204\001\002\000\004\020\205\001\002\000" +
    "\004\017\035\001\002\000\004\022\207\001\002\000\006" +
    "\024\ufffa\025\ufffa\001\002\000\004\021\212\001\002\000" +
    "\004\025\ufffd\001\002\000\004\011\213\001\002\000\004" +
    "\020\214\001\002\000\004\017\035\001\002\000\004\022" +
    "\216\001\002\000\006\024\ufffb\025\ufffb\001\002\000\006" +
    "\024\ufff9\025\ufff9\001\002\000\004\025\ufffc\001\002\000" +
    "\004\002\000\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\220\000\004\002\003\001\001\000\002\001\001\000" +
    "\004\003\005\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\016\014\001\001\000\004\004\017" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\006\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\027\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\015\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\015" +
    "\042\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\010\047\015\046\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\052\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\015\060" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\015\064\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\010\070\015\046\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\011\075\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\012\102" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\015\106\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\015" +
    "\112\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\015\125\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\015\131" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\141\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\014\147\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\201\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\015\205\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\015\214\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private ArrayList<String> errores = new ArrayList<>();
    private Jison jison;

    public void setJison(Jison jison) {
        this.jison = jison;
    }

    public parser(LexerJISON lexer) {
            super(lexer);
    }

    public void setErrores(ArrayList<String> errores) {
        this.errores = errores;
    }
  
    public void syntax_error(Symbol s) {
        errores.add("Error Sintactico: Lexema: " + String.valueOf(s.value) + " | Linea: " +  s.left + " | columna: " +  s.right);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= LLAVE_A cuerpo LLAVE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // NT$0 ::= 
            {
              Object RESULT =null;
		int numeroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int numeroright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object numero = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
jison.setScore(numero.toString());
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // cuerpo ::= SCORE DOS_PUNTOS COMILLA DECIMAL COMILLA COMA NT$0 clase COMA variable COMA metodo COMA comentario 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		int numeroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int numeroright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		Object numero = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cuerpo",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-13)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // clase ::= CLASES DOS_PUNTOS CORCHETE_A gram_clase CORCHETE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("clase",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // clase ::= error CORCHETE_A 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("clase",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // gram_clase ::= gram_clase COMA LLAVE_A NOMBRE DOS_PUNTOS identificador LLAVE_C 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		jison.agregarClase(var);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_clase",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // gram_clase ::= LLAVE_A NOMBRE DOS_PUNTOS identificador LLAVE_C 
            {
              Object RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		jison.agregarClase(var);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_clase",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // gram_clase ::= error LLAVE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_clase",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // variable ::= VARIABLES DOS_PUNTOS CORCHETE_A gram_variable CORCHETE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // variable ::= error CORCHETE_A 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("variable",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // gram_variable ::= gram_variable COMA LLAVE_A NOMBRE DOS_PUNTOS identificador COMA TIPO DOS_PUNTOS identificador COMA FUNCION DOS_PUNTOS funciones LLAVE_C 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		String nombre = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		jison.agregarVariable(nombre, tipo);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_variable",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // gram_variable ::= LLAVE_A NOMBRE DOS_PUNTOS identificador COMA TIPO DOS_PUNTOS identificador COMA FUNCION DOS_PUNTOS funciones LLAVE_C 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		String nombre = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		jison.agregarVariable(nombre, tipo);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_variable",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // gram_variable ::= error LLAVE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_variable",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // funciones ::= funciones COMA identificador 
            {
              Object RESULT =null;
		int funcionleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int funcionright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String funcion = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		jison.agregarFuncion(funcion);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funciones",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // funciones ::= identificador 
            {
              Object RESULT =null;
		int funcionleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int funcionright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String funcion = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		jison.agregarFuncion(funcion);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("funciones",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // identificador ::= COMILLA ID COMILLA 
            {
              String RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String var = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = var;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("identificador",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // metodo ::= METODOS DOS_PUNTOS CORCHETE_A gram_metodo CORCHETE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("metodo",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // metodo ::= error CORCHETE_A 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("metodo",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // gram_metodo ::= gram_metodo COMA LLAVE_A NOMBRE DOS_PUNTOS identificador COMA TIPO DOS_PUNTOS identificador COMA PARAMETROS DOS_PUNTOS ENTERO LLAVE_C 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		String nombre = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int paramleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int paramright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer param = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		jison.agregarMetodo(nombre, tipo, param);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_metodo",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // gram_metodo ::= LLAVE_A NOMBRE DOS_PUNTOS identificador COMA TIPO DOS_PUNTOS identificador COMA PARAMETROS DOS_PUNTOS ENTERO LLAVE_C 
            {
              Object RESULT =null;
		int nombreleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).left;
		int nombreright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-9)).right;
		String nombre = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-9)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int paramleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int paramright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer param = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		jison.agregarMetodo(nombre, tipo, param);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_metodo",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // gram_metodo ::= error LLAVE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_metodo",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // comentario ::= COMENTARIOS DOS_PUNTOS CORCHETE_A gram_comentario CORCHETE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comentario",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // comentario ::= error CORCHETE_A 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("comentario",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // gram_comentario ::= gram_comentario COMA LLAVE_A TEXTO DOS_PUNTOS COMILLA COMENTARIO COMILLA LLAVE_C 
            {
              Object RESULT =null;
		int comleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int comright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String com = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		jison.agregarComentario(com);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_comentario",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // gram_comentario ::= gram_comentario COMA LLAVE_A TEXTO DOS_PUNTOS COMILLA COMENTARIO LLAVE_C 
            {
              Object RESULT =null;
		int comleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int comright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String com = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		jison.agregarComentario(com.substring(0,com.length() -1));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_comentario",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // gram_comentario ::= LLAVE_A TEXTO DOS_PUNTOS COMILLA COMENTARIO COMILLA LLAVE_C 
            {
              Object RESULT =null;
		int comleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int comright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String com = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		jison.agregarComentario(com);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_comentario",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // gram_comentario ::= LLAVE_A TEXTO DOS_PUNTOS COMILLA COMENTARIO LLAVE_C 
            {
              Object RESULT =null;
		int comleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int comright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String com = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		jison.agregarComentario(com.substring(0,com.length() -1));
              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_comentario",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // gram_comentario ::= error LLAVE_C 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("gram_comentario",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}