package main;

import files.Carga;
import java.util.ArrayList;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import jison.DatosJISON;
import jison.Jison;
import lineas.Numeracion;



public class App extends javax.swing.JFrame {

    private Carga cargar = new Carga();
    private ArrayList<String> errores = new ArrayList<String>();
    private Jison jison;
    private String pathDEF;
    private String pathJISON;

    public App(String pathDEF, String pathJISON) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.pathDEF = pathDEF;
        this.pathJISON = pathJISON;

        agregarNumeracion();
        cargarArchivos();
        
        area2.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int pos = e.getDot();
                try {
                    int row = area2.getLineOfOffset(pos) + 1;
                    int col = pos - area2.getLineStartOffset(row - 1) + 1;
                    labelPosJison.setText("Fila: " + row + " Columna: " + col);
                } catch (BadLocationException exc) {
                    System.out.println(exc);
                }
            }
        });
    }
    
    public void cargarArchivos(){
        System.out.println("DEF" + pathDEF);
        System.out.println("JISON" + pathJISON);
        cargar.cargarArchivo(pathDEF, area1);
        cargar.cargarArchivo(pathJISON, area2);
    }
    
    public void agregarNumeracion(){
        Numeracion lineas1 = new Numeracion(area1);
        Numeracion lineas2 = new Numeracion(area2);
        jScrollPane1.setRowHeaderView(lineas1);
        jScrollPane2.setRowHeaderView(lineas2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestanas = new javax.swing.JTabbedPane();
        panelDEF = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        panelJISON = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        botonCompilarJISON = new javax.swing.JButton();
        labelPosJison = new javax.swing.JLabel();
        panelREPORTES = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenu();
        itemGuardarDEF = new javax.swing.JMenuItem();
        itemGuardarJison = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        javax.swing.GroupLayout panelDEFLayout = new javax.swing.GroupLayout(panelDEF);
        panelDEF.setLayout(panelDEFLayout);
        panelDEFLayout.setHorizontalGroup(
            panelDEFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        panelDEFLayout.setVerticalGroup(
            panelDEFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDEFLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        pestanas.addTab(".def", panelDEF);

        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane2.setViewportView(area2);

        botonCompilarJISON.setText("Compilar");
        botonCompilarJISON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompilarJISONActionPerformed(evt);
            }
        });

        labelPosJison.setText("Fila: Columna:");

        javax.swing.GroupLayout panelJISONLayout = new javax.swing.GroupLayout(panelJISON);
        panelJISON.setLayout(panelJISONLayout);
        panelJISONLayout.setHorizontalGroup(
            panelJISONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addGroup(panelJISONLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPosJison)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCompilarJISON, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        panelJISONLayout.setVerticalGroup(
            panelJISONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJISONLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJISONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCompilarJISON, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(labelPosJison))
                .addContainerGap())
        );

        pestanas.addTab("jison", panelJISON);

        javax.swing.GroupLayout panelREPORTESLayout = new javax.swing.GroupLayout(panelREPORTES);
        panelREPORTES.setLayout(panelREPORTESLayout);
        panelREPORTESLayout.setHorizontalGroup(
            panelREPORTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelREPORTESLayout.setVerticalGroup(
            panelREPORTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        pestanas.addTab("reportes", panelREPORTES);

        jLabel1.setText("Consola de errores:");

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Abrir Proyecto");
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Comparar Proyectos");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        menuGuardar.setText("Guardar");

        itemGuardarDEF.setText("Guardar .def");
        menuGuardar.add(itemGuardarDEF);

        itemGuardarJison.setText("Guardar .jison");
        itemGuardarJison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarJisonActionPerformed(evt);
            }
        });
        menuGuardar.add(itemGuardarJison);

        jMenuBar1.add(menuGuardar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pestanas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCompilarJISONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompilarJISONActionPerformed
        compilarJison();
    }//GEN-LAST:event_botonCompilarJISONActionPerformed

    private void itemGuardarJisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarJisonActionPerformed
        cargar.guardar(pathJISON, area2.getText());
    }//GEN-LAST:event_itemGuardarJisonActionPerformed

    public void compilarJison(){
        String texto = area2.getText();
        DatosJISON datos = new DatosJISON();
        jison = datos.analizarJISON(texto, errores);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JButton botonCompilarJISON;
    private javax.swing.JMenuItem itemGuardarDEF;
    private javax.swing.JMenuItem itemGuardarJison;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPosJison;
    private javax.swing.JMenu menuGuardar;
    private javax.swing.JPanel panelDEF;
    private javax.swing.JPanel panelJISON;
    private javax.swing.JPanel panelREPORTES;
    private javax.swing.JTabbedPane pestanas;
    // End of variables declaration//GEN-END:variables
}
