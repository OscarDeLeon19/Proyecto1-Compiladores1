package main;

import files.Carga;
import lineas.Numeracion;

public class App extends javax.swing.JFrame {

    Carga cargar = new Carga();
    String pathDEF;
    String pathJISON;

    public App(String pathDEF, String pathJISON) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.pathDEF = pathDEF;
        this.pathJISON = pathJISON;

        agregarNumeracion();
        cargarArchivos();
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
        panelREPORTES = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenu();

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pestanas.addTab(".def", panelDEF);

        area2.setColumns(20);
        area2.setRows(5);
        jScrollPane2.setViewportView(area2);

        javax.swing.GroupLayout panelJISONLayout = new javax.swing.GroupLayout(panelJISON);
        panelJISON.setLayout(panelJISONLayout);
        panelJISONLayout.setHorizontalGroup(
            panelJISONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        panelJISONLayout.setVerticalGroup(
            panelJISONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
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
            .addGap(0, 373, Short.MAX_VALUE)
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
                .addComponent(pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menuGuardar;
    private javax.swing.JPanel panelDEF;
    private javax.swing.JPanel panelJISON;
    private javax.swing.JPanel panelREPORTES;
    private javax.swing.JTabbedPane pestanas;
    // End of variables declaration//GEN-END:variables
}
