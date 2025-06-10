/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labsemana7;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Vista extends javax.swing.JFrame {
    
   
    private final JLabel[][] largo = new JLabel[3][6];
    private final ImageIcon[][] iconosTablero = new ImageIcon[3][6];
    private final String[][] idsTablero = new String[3][6];
    
    private final int TOTAL_PARES = 9;
    private int intentosRestantes;
    private int paresEncontrados;
    
    private JLabel primerLabelSeleccionado = null;
    private int primerI, primerJ;
    private boolean procesandoTurno = false;
    
    

    public Vista() {
        
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        largo[0][0]=jLabel1;
        largo[0][1]=jLabel2;
        largo[0][2]=jLabel3;
        largo[0][3]=jLabel4;
        largo[0][4]=jLabel5;
        largo[0][5]=jLabel6;
        largo[1][0]=jLabel12;
        largo[1][1]=jLabel11;
        largo[1][2]=jLabel10;
        largo[1][3]=jLabel9;
        largo[1][4]=jLabel8;
        largo[1][5]=jLabel7;
        largo[2][0]=jLabel18;
        largo[2][1]=jLabel17;
        largo[2][2]=jLabel16;
        largo[2][3]=jLabel15;
        largo[2][4]=jLabel14;
        largo[2][5]=jLabel13;
        
      reiniciarJuego();
        }

private void reiniciarJuego() {
        intentosRestantes = 10;
        paresEncontrados = 0;
        this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);

        procesandoTurno = false;
        primerLabelSeleccionado = null;
        
        String[] nombresDeImagenes = {
            "1.png", "1 - Copy.png", "2.png", "2 - Copy.png",
            "3.png", "3 - Copy.png", "4.png", "4 - Copy.png",
            "5.png", "5 - Copy.png", "6.png", "6 - Copy.png",
            "7.png", "7 - Copy.png", "8.png", "8 - Copy.png",
            "9.png", "9 - Copy.png"
        };

        Random rand = new Random();
        for (int i = 0; i < nombresDeImagenes.length; i++) {
            int indiceAleatorio = rand.nextInt(nombresDeImagenes.length);
            String temp = nombresDeImagenes[i];
            nombresDeImagenes[i] = nombresDeImagenes[indiceAleatorio];
            nombresDeImagenes[indiceAleatorio] = temp;
        }

        int contadorImagenes = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                String nombreImagen = nombresDeImagenes[contadorImagenes];
                String idCarta = nombreImagen.split(" ")[0].split("\\.")[0];
                
                iconosTablero[i][j] = new ImageIcon(getClass().getResource(nombreImagen));
                idsTablero[i][j] = idCarta;
                
                largo[i][j].setIcon(null);
                largo[i][j].setText("?");
                
                contadorImagenes++;
            }
        }
    }
          
               
        private void mostrarDialogoFinDeJuego(boolean gano) {
        String mensaje = gano ? "¡GANASTE!" : "¡PERDISTE! Te quedaste sin intentos.";
        
        int respuesta = JOptionPane.showConfirmDialog(this, 
                mensaje + "\n¿Quieres volver a jugar?", 
                "Fin del Juego", 
                JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            reiniciarJuego();
        } else {
            System.exit(0);
        }
    }  
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("?");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("?");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("?");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("?");
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("?");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("?");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("?");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("?");
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("?");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("?");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("?");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("?");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("?");
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(0, 0, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("?");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("?");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 0, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("?");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("?");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 51));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("?");
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int i = 0, j = 0;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int i = 0, j = 1;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      int i = 0, j = 2;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      int i = 0, j = 3;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        int i = 0, j = 4;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int i = 0, j = 5;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int i = 1, j = 0;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        int i = 1, j = 1;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      int i = 1 , j = 2;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int i = 1, j = 3;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int i = 1, j = 4;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       int i = 1, j = 5;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
       int i = 2, j = 0;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
       int i = 2, j = 1;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       int i = 2, j = 2;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
      int i = 2, j = 3;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        int i = 2, j = 4;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        int i = 2, j = 5;
        JLabel labelClicado = largo[i][j];
        if (procesandoTurno || labelClicado.getIcon() != null) { return; }

        labelClicado.setIcon(iconosTablero[i][j]);
        labelClicado.setText("");

        if (primerLabelSeleccionado == null) {
            primerLabelSeleccionado = labelClicado;
            primerI = i; primerJ = j;
        } else {
            procesandoTurno = true;
            if (idsTablero[primerI][primerJ].equals(idsTablero[i][j])) {
                paresEncontrados++;
                primerLabelSeleccionado = null;
                procesandoTurno = false;
                if (paresEncontrados == TOTAL_PARES) {
                    mostrarDialogoFinDeJuego(true);
                }
            } else {
                intentosRestantes--;
                this.setTitle("Juego de Memoria - Intentos: " + intentosRestantes);
                Timer timer = new Timer(1000, e -> {
                    primerLabelSeleccionado.setIcon(null);
                    primerLabelSeleccionado.setText("?");
                    labelClicado.setIcon(null);
                    labelClicado.setText("?");
                    primerLabelSeleccionado = null;
                    procesandoTurno = false;
                    if (intentosRestantes <= 0) {
                        mostrarDialogoFinDeJuego(false);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }//GEN-LAST:event_jLabel13MouseClicked

        
        
    public static void main(String args[]) {
     
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
