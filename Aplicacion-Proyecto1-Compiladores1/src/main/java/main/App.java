package main;

import clases.Clase;
import clases.Metodo;
import clases.Variable;
import files.Carga;
import java.io.File;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import jison.DatosJISON;
import jison.Jison;
import lineas.Numeracion;
import reporte.DatosReporte;
import reporte.analisis.lexico.LexerReporte;
import reporte.analisis.sintactico.parser;

public class App extends javax.swing.JFrame {

    private Carga carga = new Carga();
    private ArrayList<String> errores = new ArrayList<String>();
    private Jison jison;
    private String pathDEF;
    private String pathJSON;
    private String pathReporte;

    public App(String pathDEF, String pathJSON, String pathReporte) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.pathDEF = pathDEF;
        this.pathJSON = pathJSON;
        this.pathReporte = pathReporte;
        agregarNumeracion();
        cargarArchivos();

        compilarJison();

        area1.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int pos = e.getDot();
                try {
                    int row = area1.getLineOfOffset(pos) + 1;
                    int col = pos - area1.getLineStartOffset(row - 1) + 1;
                    labelPosDef.setText("Fila: " + row + " Columna: " + col);
                } catch (BadLocationException exc) {
                    System.out.println(exc);
                }
            }
        });

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

    public void cargarArchivos() {
        carga.cargarArchivo(pathDEF, area1);
        carga.cargarArchivo(pathJSON, area2);
    }

    public void agregarNumeracion() {
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
        botonReporte = new javax.swing.JButton();
        labelPosDef = new javax.swing.JLabel();
        panelJISON = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        botonCompilarJISON = new javax.swing.JButton();
        labelPosJison = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaErrores = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAbrirProyecto = new javax.swing.JMenuItem();
        itemComparar = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenu();
        itemGuardarDEF = new javax.swing.JMenuItem();
        itemGuardarJison = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        area1.setColumns(20);
        area1.setRows(5);
        jScrollPane1.setViewportView(area1);

        botonReporte.setText("Crear Reporte ");
        botonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteActionPerformed(evt);
            }
        });

        labelPosDef.setText("Fila: Columna: ");

        javax.swing.GroupLayout panelDEFLayout = new javax.swing.GroupLayout(panelDEF);
        panelDEF.setLayout(panelDEFLayout);
        panelDEFLayout.setHorizontalGroup(
            panelDEFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDEFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPosDef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        panelDEFLayout.setVerticalGroup(
            panelDEFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDEFLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDEFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(labelPosDef))
                .addContainerGap())
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

        pestanas.addTab("json", panelJISON);

        jLabel1.setText("Consola de errores:");

        areaErrores.setColumns(20);
        areaErrores.setRows(5);
        areaErrores.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        areaErrores.setEnabled(false);
        jScrollPane3.setViewportView(areaErrores);

        jMenu1.setText("Archivo");

        itemAbrirProyecto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemAbrirProyecto.setText("Abrir Proyecto");
        itemAbrirProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(itemAbrirProyecto);

        itemComparar.setText("Comparar Proyectos");
        itemComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCompararActionPerformed(evt);
            }
        });
        jMenu1.add(itemComparar);

        jMenuBar1.add(jMenu1);

        menuGuardar.setText("Guardar");

        itemGuardarDEF.setText("Guardar .def");
        itemGuardarDEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarDEFActionPerformed(evt);
            }
        });
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(pestanas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCompilarJISONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompilarJISONActionPerformed
        compilarJison();
    }//GEN-LAST:event_botonCompilarJISONActionPerformed

    private void itemGuardarJisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarJisonActionPerformed
        carga.guardar(pathJSON, area2.getText());
    }//GEN-LAST:event_itemGuardarJisonActionPerformed

    private void botonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteActionPerformed
        DatosReporte dtsRep = new DatosReporte(jison);
        areaErrores.setText("");        
        errores.clear();
        try {
            dtsRep.setErrores(errores);
            StringReader str = new StringReader(area1.getText());
            LexerReporte lexer = new LexerReporte(str);
            lexer.setErrores(errores);
            parser par = new parser(lexer);
            par.setErrores(errores);
            par.setDtsRep(dtsRep);
            par.parse();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de compilacion de archivo");
        }

        if (errores.isEmpty() == true) {
            String cuerpo = dtsRep.exportarHTML();
            carga.exportarHTML(pathReporte, cuerpo);
            visualizarReporte();
        } else if (errores.isEmpty() == false) {
            areaErrores.append("Errores en el archivo de reportes");
            areaErrores.append("\n");
            agregarErrores();
        }
    }//GEN-LAST:event_botonReporteActionPerformed

    private void itemGuardarDEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarDEFActionPerformed
        carga.guardar(pathDEF, area1.getText());
    }//GEN-LAST:event_itemGuardarDEFActionPerformed

    private void itemAbrirProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirProyectoActionPerformed
        try {
            String[] paths = carga.obtenerCOPY();
            App app = new App(paths[0], paths[1], paths[2]);
            app.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se eligio un archivo correctamente");
        }
    }//GEN-LAST:event_itemAbrirProyectoActionPerformed

    private void itemCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCompararActionPerformed
        VentanaComparar vtnComparar = new VentanaComparar();
        vtnComparar.setVisible(true);
    }//GEN-LAST:event_itemCompararActionPerformed

    public void compilarJison() {
        String texto = area2.getText();
        DatosJISON datos = new DatosJISON();
        areaErrores.setText("");   
        errores.clear();
        jison = datos.analizarJISON(texto, errores);

        if (errores.isEmpty() == false) {
            areaErrores.append("Errores en el archivo Jison");
            areaErrores.append("\n");
            agregarErrores();
        }

    }

    public void agregarErrores() {
        areaErrores.setText("");
        for (String error : errores) {
            areaErrores.append(error);
            areaErrores.append("\n");
        }
    }

    public void visualizarReporte() {

        try {            
            File file = new File(pathReporte);         
            Reporte reporte = new Reporte();
            reporte.verReporte(file);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al visualizar reporte");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JTextArea areaErrores;
    private javax.swing.JButton botonCompilarJISON;
    private javax.swing.JButton botonReporte;
    private javax.swing.JMenuItem itemAbrirProyecto;
    private javax.swing.JMenuItem itemComparar;
    private javax.swing.JMenuItem itemGuardarDEF;
    private javax.swing.JMenuItem itemGuardarJison;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelPosDef;
    private javax.swing.JLabel labelPosJison;
    private javax.swing.JMenu menuGuardar;
    private javax.swing.JPanel panelDEF;
    private javax.swing.JPanel panelJISON;
    private javax.swing.JTabbedPane pestanas;
    // End of variables declaration//GEN-END:variables
}
