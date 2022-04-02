
package clases;


public class Comentario {
    
    private String texto;
    private int repeticiones = 1;

    public Comentario() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }
    
    public void aumentarRepeticiones(int cantidad){
        repeticiones += cantidad;
    }
    
}
