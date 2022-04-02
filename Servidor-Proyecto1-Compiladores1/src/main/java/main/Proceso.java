
package main;

import java.io.File;


public class Proceso extends Thread {

    private String[] paths;
    /**
     * Constructor de la clase proceso. Crea un hilo donde se ejecutan las acciones del servidor.
     * @param paths Los paths del primer y segundo proyecto
     */
    public Proceso(String[] paths) {
        this.paths = paths;
    }
    /**
     * Inicia el analisis de de los proyectos.
     */
    @Override
    public void run() {
        Analisis analisis = new Analisis();
        File proyecto1 = new File(paths[0]);
        File proyecto2 = new File(paths[1]);
        analisis.iniciarAnalisisProyecto1(proyecto1);
        analisis.iniciarAnalisisProyecto2(proyecto2);
        analisis.comparar();

    }

}
