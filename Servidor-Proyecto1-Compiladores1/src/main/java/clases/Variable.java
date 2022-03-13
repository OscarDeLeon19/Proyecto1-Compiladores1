
package clases;


public class Variable {
    
    private String id;
    private String tipo;
    private Metodo padre;

    public Variable() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Metodo getPadre() {
        return padre;
    }

    public void setPadre(Metodo padre) {
        this.padre = padre;
    }
    
    
    
}
