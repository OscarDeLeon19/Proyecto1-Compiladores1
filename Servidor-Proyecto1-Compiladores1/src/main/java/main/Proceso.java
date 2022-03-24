
package main;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Proceso extends Thread {

    String[] paths;

    public Proceso(String[] paths) {
        this.paths = paths;
    }

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
