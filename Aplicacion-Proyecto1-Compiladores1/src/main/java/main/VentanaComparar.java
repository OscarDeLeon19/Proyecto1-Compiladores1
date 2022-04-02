package main;

import files.DatosSocket;
import java.io.File;
import javax.swing.JFileChooser;

public class VentanaComparar extends javax.swing.JFrame {

    public VentanaComparar() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        boton2 = new javax.swing.JButton();
        botonComparar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comparar Proyectos");

        jLabel1.setText("Proyecto 1: ");

        text1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text1.setEnabled(false);

        boton1.setText("Agregar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Proyecto 2: ");

        text2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        text2.setEnabled(false);

        boton2.setText("Agregar");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        botonComparar.setText("Comparar");
        botonComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompararActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(botonComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonComparar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Agrega la direccion de la carpeta del proyecto 1.
     * @param evt 
     */
    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        File fichero;
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        text1.setText(fichero.getAbsolutePath());
    }//GEN-LAST:event_boton1ActionPerformed
    /**
     * Agrega la direccion de la carpeta del proyecto 2.
     * @param evt 
     */
    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        File fichero;
        JFileChooser seleccionar = new JFileChooser();
        seleccionar.setAcceptAllFileFilterUsed(false);
        seleccionar.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        seleccionar.showOpenDialog(null);
        fichero = seleccionar.getSelectedFile();
        text2.setText(fichero.getAbsolutePath());
    }//GEN-LAST:event_boton2ActionPerformed
    /**
     * Envia los datos al socket para que se ejecute el analisis de los proyectos.
     * @param evt 
     */
    private void botonCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompararActionPerformed
        if (text1.getText().equals("") || text2.getText().equals("")) {
            
        } else {
            DatosSocket dtsSocket = new DatosSocket();
            dtsSocket.enviarParametros(text1.getText(), text2.getText());
        }
    }//GEN-LAST:event_botonCompararActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton botonComparar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    // End of variables declaration//GEN-END:variables
}
