// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/oscar/Desktop/Git/Proyecto1-Compiladores1/Aplicacion-Proyecto1-Compiladores1/src/main/java/reporte/ciclo/lexerCiclo.flex

package reporte.ciclo;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import reporte.ciclo.Simbolos;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class LexerCiclo implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\u10fe\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\0\1\3\22\0\1\4\1\0"+
    "\1\5\5\0\1\6\1\7\1\10\1\11\1\0\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\7\15\2\20\1\21"+
    "\1\0\1\22\2\0\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\2\31\1\34\1\35\1\36"+
    "\1\37\1\40\1\31\1\41\1\42\1\43\1\44\1\45"+
    "\1\31\1\46\2\31\1\47\1\0\1\50\1\0\1\31"+
    "\1\0\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\2\31\1\34\1\35\1\36\1\37\1\40"+
    "\1\31\1\41\1\42\1\43\1\44\1\45\1\31\1\46"+
    "\2\31\265\0\2\51\115\0\1\52\u0180\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\4\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\15\15\1\16"+
    "\1\17\2\1\1\0\1\20\2\0\1\21\1\22\3\15"+
    "\1\23\1\24\7\15\1\25\1\15\1\26\1\15\1\27"+
    "\1\0\1\15\3\0\1\30\4\15\1\0\4\15\1\0"+
    "\4\15\1\0\1\15\1\0\1\15\1\0\3\15\1\0"+
    "\4\15\1\0\3\15\2\31\1\15\2\0\1\15\1\0"+
    "\2\15\1\0\1\15\1\0\4\15\1\0\1\32\1\33"+
    "\1\34\1\15\1\0\1\32\2\35\2\15\1\0\2\36"+
    "\1\15\1\37\1\15\2\40\1\15\1\0\1\15\2\41"+
    "\2\42\2\15\1\0\3\15\1\0\1\15\1\0\1\15"+
    "\2\43\1\15\1\0\2\44\2\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\u0102\0\53"+
    "\0\53\0\53\0\53\0\53\0\53\0\53\0\u012d\0\u0158"+
    "\0\53\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285"+
    "\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387\0\53\0\53"+
    "\0\u03b2\0\u03dd\0\u0102\0\53\0\u0408\0\u0433\0\53\0\u0183"+
    "\0\u045e\0\u0489\0\u04b4\0\u0183\0\u0183\0\u04df\0\u050a\0\u0535"+
    "\0\u0560\0\u058b\0\u05b6\0\u05e1\0\u0183\0\u060c\0\u0183\0\u0637"+
    "\0\u0183\0\u0662\0\u068d\0\u06b8\0\u06e3\0\u070e\0\u0433\0\u0739"+
    "\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u083b\0\u0866\0\u0891"+
    "\0\u08bc\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993\0\u09be\0\u09e9"+
    "\0\u0a14\0\u0a3f\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16\0\u0b41"+
    "\0\u0b6c\0\u0b97\0\u0bc2\0\u0bed\0\u0c18\0\u0c43\0\u0183\0\53"+
    "\0\u0c6e\0\u0c99\0\u0cc4\0\u0cef\0\u0d1a\0\u0d45\0\u0d70\0\u0d9b"+
    "\0\u0dc6\0\u0df1\0\u0e1c\0\u0e47\0\u0e72\0\u0e9d\0\u0ec8\0\u0183"+
    "\0\u0183\0\u0183\0\u0ef3\0\u0f1e\0\53\0\u0183\0\53\0\u0f49"+
    "\0\u0f74\0\u0f9f\0\u0183\0\53\0\u0fca\0\u0183\0\u0ff5\0\u0183"+
    "\0\53\0\u1020\0\u104b\0\u1076\0\u0183\0\53\0\u0183\0\53"+
    "\0\u10a1\0\u10cc\0\u10f7\0\u1122\0\u114d\0\u1178\0\u11a3\0\u11ce"+
    "\0\u11f9\0\u1224\0\u0183\0\53\0\u124f\0\u127a\0\u0183\0\53"+
    "\0\u0183\0\53";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\3\17\1\2\1\20"+
    "\1\21\1\22\1\23\1\24\2\22\1\25\1\22\1\26"+
    "\1\27\1\22\1\30\1\31\1\22\1\32\1\33\1\34"+
    "\1\35\1\22\1\36\1\22\1\37\1\40\1\41\1\42"+
    "\54\0\1\3\53\0\1\4\53\0\1\5\53\0\1\6"+
    "\52\0\1\43\1\44\2\0\3\43\1\0\1\43\3\45"+
    "\27\43\17\0\1\46\1\0\3\17\47\0\1\47\53\0"+
    "\3\22\3\0\24\22\21\0\3\22\3\0\16\22\1\50"+
    "\5\22\21\0\3\22\3\0\11\22\1\51\2\22\1\52"+
    "\7\22\21\0\3\22\3\0\21\22\1\53\2\22\21\0"+
    "\1\22\1\54\1\55\3\0\24\22\21\0\3\22\3\0"+
    "\13\22\1\56\10\22\21\0\3\22\3\0\4\22\1\57"+
    "\17\22\21\0\3\22\3\0\14\22\1\60\7\22\21\0"+
    "\3\22\3\0\1\61\23\22\21\0\3\22\3\0\4\22"+
    "\1\62\17\22\21\0\3\22\3\0\2\22\1\63\21\22"+
    "\21\0\3\22\3\0\1\64\2\22\1\65\1\66\2\22"+
    "\1\67\1\70\5\22\1\71\5\22\2\0\1\72\16\0"+
    "\3\22\3\0\1\73\23\22\42\0\1\74\41\0\1\75"+
    "\31\0\1\43\1\44\2\0\3\43\1\76\1\43\3\45"+
    "\27\43\21\0\3\77\50\0\3\22\3\0\1\100\23\22"+
    "\21\0\3\22\3\0\12\22\1\101\11\22\21\0\3\22"+
    "\3\0\13\22\1\102\10\22\21\0\3\22\3\0\10\22"+
    "\1\103\13\22\2\0\1\104\16\0\3\22\3\0\20\22"+
    "\1\105\3\22\21\0\3\22\3\0\12\22\1\106\11\22"+
    "\21\0\3\22\3\0\16\22\1\107\5\22\21\0\3\22"+
    "\3\0\17\22\1\110\4\22\3\0\1\111\15\0\3\22"+
    "\3\0\14\22\1\112\7\22\21\0\3\22\3\0\1\22"+
    "\1\113\22\22\21\0\3\22\3\0\23\22\1\114\21\0"+
    "\3\22\3\0\15\22\1\115\6\22\44\0\1\116\27\0"+
    "\3\22\3\0\16\22\1\117\5\22\37\0\1\104\15\0"+
    "\1\104\40\0\1\120\30\0\3\43\50\0\3\22\3\0"+
    "\17\22\1\121\4\22\3\0\1\122\15\0\3\22\3\0"+
    "\4\22\1\123\17\22\21\0\3\22\3\0\2\22\1\124"+
    "\21\22\21\0\3\22\3\0\2\22\1\125\21\22\31\0"+
    "\1\126\42\0\3\22\3\0\14\22\1\127\7\22\21\0"+
    "\3\22\3\0\1\22\1\130\22\22\21\0\3\22\3\0"+
    "\1\131\23\22\21\0\3\22\3\0\21\22\1\132\2\22"+
    "\50\0\1\133\23\0\3\22\3\0\16\22\1\134\5\22"+
    "\21\0\3\22\3\0\11\22\1\135\12\22\21\0\3\22"+
    "\3\0\20\22\1\136\3\22\21\0\3\22\3\0\14\22"+
    "\1\137\7\22\43\0\1\140\30\0\3\22\3\0\10\22"+
    "\1\141\13\22\2\0\1\142\42\0\1\143\26\0\3\22"+
    "\3\0\4\22\1\144\17\22\33\0\1\145\40\0\3\22"+
    "\3\0\13\22\1\146\10\22\21\0\3\22\3\0\10\22"+
    "\1\147\13\22\2\0\1\150\16\0\3\22\3\0\10\22"+
    "\1\151\13\22\2\0\1\152\34\0\1\152\15\0\1\152"+
    "\16\0\3\22\3\0\3\22\1\153\20\22\21\0\3\22"+
    "\3\0\16\22\1\154\5\22\21\0\3\22\3\0\12\22"+
    "\1\155\11\22\21\0\3\22\3\0\11\22\1\156\12\22"+
    "\40\0\1\157\33\0\3\22\3\0\4\22\1\160\17\22"+
    "\21\0\3\22\3\0\4\22\1\161\17\22\21\0\3\22"+
    "\3\0\14\22\1\162\7\22\21\0\3\22\3\0\1\163"+
    "\23\22\27\0\1\164\56\0\1\165\40\0\3\22\3\0"+
    "\17\22\1\166\4\22\3\0\1\167\42\0\1\167\7\0"+
    "\1\167\15\0\3\22\3\0\20\22\1\170\3\22\21\0"+
    "\3\22\3\0\14\22\1\171\7\22\43\0\1\172\30\0"+
    "\3\22\3\0\14\22\1\173\7\22\43\0\1\174\30\0"+
    "\3\22\3\0\14\22\1\175\7\22\21\0\3\22\3\0"+
    "\4\22\1\176\17\22\21\0\3\22\3\0\4\22\1\177"+
    "\17\22\21\0\3\22\3\0\20\22\1\200\3\22\47\0"+
    "\1\201\24\0\3\22\3\0\1\22\1\202\22\22\30\0"+
    "\1\203\43\0\3\22\3\0\1\204\23\22\21\0\3\22"+
    "\3\0\13\22\1\205\10\22\42\0\1\206\31\0\3\22"+
    "\3\0\17\22\1\207\4\22\3\0\1\210\15\0\3\22"+
    "\3\0\20\22\1\211\3\22\21\0\3\22\3\0\11\22"+
    "\1\212\12\22\40\0\1\213\33\0\3\22\3\0\16\22"+
    "\1\214\5\22\21\0\3\22\3\0\16\22\1\215\5\22"+
    "\21\0\3\22\3\0\4\22\1\216\17\22\33\0\1\217"+
    "\40\0\3\22\3\0\10\22\1\220\13\22\2\0\1\221"+
    "\16\0\3\22\3\0\14\22\1\222\7\22\21\0\3\22"+
    "\3\0\17\22\1\223\4\22\3\0\1\224\42\0\1\224"+
    "\7\0\1\224\15\0\3\22\3\0\14\22\1\225\7\22"+
    "\43\0\1\226\30\0\3\22\3\0\17\22\1\227\4\22"+
    "\3\0\1\230\15\0\3\22\3\0\17\22\1\231\4\22"+
    "\3\0\1\232\42\0\1\232\7\0\1\232";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4773];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\7\11\2\1\1\11\15\1\2\11"+
    "\2\1\1\0\1\11\2\0\1\11\22\1\1\0\1\1"+
    "\3\0\5\1\1\0\4\1\1\0\4\1\1\0\1\1"+
    "\1\0\1\1\1\0\3\1\1\0\4\1\1\0\4\1"+
    "\1\11\1\1\2\0\1\1\1\0\2\1\1\0\1\1"+
    "\1\0\4\1\1\0\4\1\1\0\1\11\1\1\1\11"+
    "\2\1\1\0\1\1\1\11\4\1\1\11\1\1\1\0"+
    "\2\1\1\11\1\1\1\11\2\1\1\0\3\1\1\0"+
    "\1\1\1\0\2\1\1\11\1\1\1\0\1\1\1\11"+
    "\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[154];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    private ArrayList<String> errores = new ArrayList<>();

    public void setErrores(ArrayList<String> errores) {
        this.errores = errores;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCiclo(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Simbolos.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { errores.add("Error Lexico: | Lexema: " + yytext() + " | Linea: " + (yyline+1) + " | Columna: " + (yycolumn+1));;return new Symbol(Simbolos.ERROR, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 38: break;
          case 2:
            { /*ignorar*/
            }
            // fall through
          case 39: break;
          case 3:
            { return new Symbol(Simbolos.PARENTESIS_A, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 40: break;
          case 4:
            { return new Symbol(Simbolos.PARENTESIS_C, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 41: break;
          case 5:
            { return new Symbol(Simbolos.MULTIPLICACION, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 42: break;
          case 6:
            { return new Symbol(Simbolos.SUMA, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 43: break;
          case 7:
            { return new Symbol(Simbolos.RESTA, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 44: break;
          case 8:
            { return new Symbol(Simbolos.PUNTO, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 45: break;
          case 9:
            { return new Symbol(Simbolos.DIVISION, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 46: break;
          case 10:
            { return new Symbol(Simbolos.ENTERO, yyline+1, yycolumn+1, Integer.parseInt(yytext()));
            }
            // fall through
          case 47: break;
          case 11:
            { return new Symbol(Simbolos.ETIQUETA_ABRIR, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 48: break;
          case 12:
            { return new Symbol(Simbolos.ETIQUETA_CERRAR, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 49: break;
          case 13:
            { return new Symbol(Simbolos.ID, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 50: break;
          case 14:
            { return new Symbol(Simbolos.CORCHETE_A, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 51: break;
          case 15:
            { return new Symbol(Simbolos.CORCHETE_C, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 52: break;
          case 16:
            { return new Symbol(Simbolos.CADENA, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 53: break;
          case 17:
            { return new Symbol(Simbolos.ETIQUETA_FIN, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 54: break;
          case 18:
            { return new Symbol(Simbolos.BR, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 55: break;
          case 19:
            { return new Symbol(Simbolos.H1, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 56: break;
          case 20:
            { return new Symbol(Simbolos.H2, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 57: break;
          case 21:
            { return new Symbol(Simbolos.TD, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 58: break;
          case 22:
            { return new Symbol(Simbolos.TH, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 59: break;
          case 23:
            { return new Symbol(Simbolos.TR, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 60: break;
          case 24:
            { return new Symbol(Simbolos.DECIMAL, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 61: break;
          case 25:
            { return new Symbol(Simbolos.TIPO, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 62: break;
          case 26:
            { return new Symbol(Simbolos.SCORE, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 63: break;
          case 27:
            { return new Symbol(Simbolos.TABLE, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 64: break;
          case 28:
            { return new Symbol(Simbolos.TEXTO, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 65: break;
          case 29:
            { return new Symbol(Simbolos.CLASES, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 66: break;
          case 30:
            { return new Symbol(Simbolos.INICIO, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 67: break;
          case 31:
            { return new Symbol(Simbolos.NOMBRE, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 68: break;
          case 32:
            { return new Symbol(Simbolos.RESULT, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 69: break;
          case 33:
            { return new Symbol(Simbolos.FUNCION, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 70: break;
          case 34:
            { return new Symbol(Simbolos.METODOS, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 71: break;
          case 35:
            { return new Symbol(Simbolos.VARIABLES, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 72: break;
          case 36:
            { return new Symbol(Simbolos.PARAMETROS, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 73: break;
          case 37:
            { return new Symbol(Simbolos.COMENTARIOS, yyline+1, yycolumn+1, yytext());
            }
            // fall through
          case 74: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Converts an int token code into the name of the
   * token by reflection on the cup symbol class/interface sym
   */
  private static String getTokenName(int token) {
    try {
      java.lang.reflect.Field [] classFields = Simbolos.class.getFields();
      for (int i = 0; i < classFields.length; i++) {
        if (classFields[i].getInt(null) == token) {
          return classFields[i].getName();
        }
      }
    } catch (Exception e) {
      e.printStackTrace(System.err);
    }

    return "UNKNOWN TOKEN";
  }

  /**
   * Same as next_token but also prints the token to standard out
   * for debugging.
   */
  public java_cup.runtime.Symbol debug_next_token() throws java.io.IOException {
    java_cup.runtime.Symbol s = next_token();
    System.out.println( "line:" + (yyline+1) + " col:" + (yycolumn+1) + " --"+ yytext() + "--" + getTokenName(s.sym) + "--");
    return s;
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java LexerCiclo [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        LexerCiclo scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new LexerCiclo(reader);
          while ( !scanner.zzAtEOF ) scanner.debug_next_token();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
