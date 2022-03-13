package analisis.lexico;

import analisis.sintactico.sym;
import java_cup.runtime.Symbol;

%%
%class LexerServidor
%public
%line
%column
%cup
%cupdebug


L=[a-zA-Z_]
D=[0-9]
punto=[.]
espacio=[ ]+
tab = [\t]+
salto = [\n]+
rot = [\r]+
comilla = [\"]
decimal = ({D}+{punto}{D}+)
entero = {D}+
id = {L}({L}|{D})*
comilla_simple = [']

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

%{


%}

%%

import {System.out.println("Variable: " + yytext()); return new Symbol(sym.IMPORT, yyline+1, yycolumn+1, yytext());}
class {System.out.println("Variable: " + yytext()); return new Symbol(sym.CLASS, yyline+1, yycolumn+1, yytext());}
int {System.out.println("Variable:  " + yytext()); return new Symbol(sym.INT, yyline+1, yycolumn+1, yytext());}
boolean {System.out.println("Variable:  " + yytext()); return new Symbol(sym.BOOLEAN, yyline+1, yycolumn+1, yytext());}
String {System.out.println("Variable:  " + yytext()); return new Symbol(sym.STRING, yyline+1, yycolumn+1, yytext());}
char {System.out.println("Variable" + yytext()); return new Symbol(sym.CHAR, yyline+1, yycolumn+1, yytext());}
double {System.out.println("Variable: " + yytext()); return new Symbol(sym.DOUBLE, yyline+1, yycolumn+1, yytext());}
Object {System.out.println("Variable: " + yytext()); return new Symbol(sym.OBJECT, yyline+1, yycolumn+1, yytext());}
if {System.out.println("Variable: " + yytext()); return new Symbol(sym.IF, yyline+1, yycolumn+1, yytext());}
else {System.out.println("Variable: " + yytext()); return new Symbol(sym.ELSE, yyline+1, yycolumn+1, yytext());}
for {System.out.println("Variable: " + yytext()); return new Symbol(sym.FOR, yyline+1, yycolumn+1, yytext());}
while {System.out.println("Variable: " + yytext()); return new Symbol(sym.WHILE, yyline+1, yycolumn+1, yytext());}
do {System.out.println("Variable: " + yytext()); return new Symbol(sym.DO, yyline+1, yycolumn+1, yytext());}
switch {System.out.println("Variable: " + yytext()); return new Symbol(sym.SWITCH, yyline+1, yycolumn+1, yytext());}
case {System.out.println("Variable: " + yytext()); return new Symbol(sym.CASE, yyline+1, yycolumn+1, yytext());}
public {System.out.println("Variable: " + yytext()); return new Symbol(sym.PUBLIC, yyline+1, yycolumn+1, yytext());}
protected {System.out.println("Variable: " + yytext()); return new Symbol(sym.PROTECTED, yyline+1, yycolumn+1, yytext());}
private {System.out.println("Variable: " + yytext()); return new Symbol(sym.PRIVATE, yyline+1, yycolumn+1, yytext());}
final {System.out.println("Variable: " + yytext()); return new Symbol(sym.FINAL, yyline+1, yycolumn+1, yytext());}
break {System.out.println("Variable: " + yytext()); return new Symbol(sym.BREAK, yyline+1, yycolumn+1, yytext());}
return {System.out.println("Variable: " + yytext()); return new Symbol(sym.RETURN, yyline+1, yycolumn+1, yytext());}
void {System.out.println("Variable: " + yytext()); return new Symbol(sym.VOID, yyline+1, yycolumn+1, yytext());}
this {System.out.println("Variable: " + yytext()); return new Symbol(sym.THIS, yyline+1, yycolumn+1, yytext());}
true {System.out.println("Variable: " + yytext()); return new Symbol(sym.TRUE, yyline+1, yycolumn+1, yytext());}
false {System.out.println("Variable: " + yytext()); return new Symbol(sym.FALSE, yyline+1, yycolumn+1, yytext());}
new {System.out.println("Variable: " + yytext()); return new Symbol(sym.NEW, yyline+1, yycolumn+1, yytext());}
{espacio} {/*ignorar*/}
{tab} {/*ignorar*/}
{salto} {/*ignorar*/}
{rot} {/*ignorar*/}
{decimal} {System.out.println("decimal: " + yytext()); return new Symbol(sym.DECIMAL, yyline+1, yycolumn+1, yytext());}
{entero} {System.out.println("entero: " + yytext()); return new Symbol(sym.ENTERO, yyline+1, yycolumn+1, yytext());}
{id}+ {System.out.println("id: " + yytext());return new Symbol(sym.ID, yyline+1, yycolumn+1, yytext());}
{comilla}({id}|{entero}|{decimal}|{espacio}|{salto}|"+"|"-"|"*"|"/"|":"|",",";")*{comilla} {System.out.println("cadena: " + yytext()); return new Symbol(sym.CADENA, yyline+1, yycolumn+1, yytext());}
{comilla_simple}{id}{comilla_simple} {System.out.println("letra: " + yytext()); return new Symbol(sym.LETRA, yyline+1, yycolumn+1, yytext());}
{Comment} {System.out.println("Comentario: " + yytext());}
{punto} {System.out.println("signo: " + yytext()); return new Symbol(sym.PUNTO, yyline+1, yycolumn+1, yytext()); }
"==" {System.out.println("signo: " + yytext()); return new Symbol(sym.LOGICO_IGUAL, yyline+1, yycolumn+1, yytext());}
"!=" {System.out.println("signo: " + yytext()); return new Symbol(sym.LOGICO_DISTINTO, yyline+1, yycolumn+1, yytext());}
"<=" {System.out.println("signo: " + yytext()); return new Symbol(sym.MENOR_IGUAL, yyline+1, yycolumn+1, yytext());}
">=" {System.out.println("signo: " + yytext()); return new Symbol(sym.MAYOR_IGUAL, yyline+1, yycolumn+1, yytext());}
"&&" {System.out.println("signo: " + yytext()); return new Symbol(sym.LOGICO_Y, yyline+1, yycolumn+1, yytext());}
"||" {System.out.println("signo: " + yytext()); return new Symbol(sym.LOGICO_O, yyline+1, yycolumn+1, yytext());}
"++" {System.out.println("signo: " + yytext()); return new Symbol(sym.INCREMENTO, yyline+1, yycolumn+1, yytext());}
"--" {System.out.println("signo: " + yytext()); return new Symbol(sym.DECREMENTO, yyline+1, yycolumn+1, yytext());}
"+" {System.out.println("signo: " + yytext()); return new Symbol(sym.SUMA, yyline+1, yycolumn+1, yytext());}
"-" {System.out.println("signo: " + yytext()); return new Symbol(sym.RESTA, yyline+1, yycolumn+1, yytext());}
"*" {System.out.println("signo: " + yytext()); return new Symbol(sym.MULTIPLICACION, yyline+1, yycolumn+1, yytext());}
"/" {System.out.println("signo: " + yytext()); return new Symbol(sym.DIVISION, yyline+1, yycolumn+1, yytext());}
"(" {System.out.println("signo: " + yytext()); return new Symbol(sym.PARENTESIS_A, yyline+1, yycolumn+1, yytext());}
")" {System.out.println("signo: " + yytext()); return new Symbol(sym.PARENTESIS_C, yyline+1, yycolumn+1, yytext());}
":" {System.out.println("signo: " + yytext()); return new Symbol(sym.DOS_PUNTOS, yyline+1, yycolumn+1, yytext());}
";" {System.out.println("signo: " + yytext()); return new Symbol(sym.PUNTO_COMA, yyline+1, yycolumn+1, yytext());}
"{" {System.out.println("signo: " + yytext()); return new Symbol(sym.LLAVE_A, yyline+1, yycolumn+1, yytext());}
"}" {System.out.println("signo: " + yytext()); return new Symbol(sym.LLAVE_C, yyline+1, yycolumn+1, yytext());}
"[" {System.out.println("signo: " + yytext()); return new Symbol(sym.CORCHETE_A, yyline+1, yycolumn+1, yytext());}
"]" {System.out.println("signo: " + yytext()); return new Symbol(sym.CORCHETE_C, yyline+1, yycolumn+1, yytext());}
"=" {System.out.println("signo: " + yytext()); return new Symbol(sym.SIGNO_IGUAL, yyline+1, yycolumn+1, yytext());}
"," {System.out.println("signo: " + yytext()); return new Symbol(sym.COMA, yyline+1, yycolumn+1, yytext());}
"<" {System.out.println("signo: " + yytext()); return new Symbol(sym.MENOR, yyline+1, yycolumn+1, yytext());}
">" {System.out.println("signo: " + yytext()); return new Symbol(sym.MAYOR, yyline+1, yycolumn+1, yytext());}
[^] {System.out.println("Error: " + yytext()); return new Symbol(sym.ERROR, yyline+1, yycolumn+1, yytext());}
