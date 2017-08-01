package juego_1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Timer;

public class interfaz_1 extends javax.swing.JFrame {

    panel pizarra;

    public interfaz_1() {
        initComponents();
        setTitle("Juego Natacion");
        setLocationRelativeTo(null);
        //se crea instancia a panel de animacion y se añade a la interfaz
        pizarra = new panel(this.jPanel1.getSize());
        this.jPanel1.add(pizarra);

        box.setVisible(false);
        box2.setVisible(false);
        box3.setVisible(false);
        box4.setVisible(false);
        box6.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        la2 = new javax.swing.JLabel();
        la3 = new javax.swing.JLabel();
        b = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        co = new javax.swing.JComboBox<>();
        botonagregar = new javax.swing.JButton();
        box = new javax.swing.JCheckBox();
        box2 = new javax.swing.JCheckBox();
        box3 = new javax.swing.JCheckBox();
        box4 = new javax.swing.JCheckBox();
        box6 = new javax.swing.JCheckBox();
        la6 = new javax.swing.JLabel();
        te = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piscina");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b.setText("Iniciar");
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b2.setText("Reiniciar Carrera");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b3.setText("Regresar");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        l6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l6.setText("Ingrese el numero de Nadadores");

        co.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nadador 1", "Nadador 2", "Nadador 3", "Nadador 4", "Nadador 5" }));
        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });

        botonagregar.setText("Ingresar Nadador");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        la6.setText("Tiempo de Carrera:");

        te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Reportes");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(la6)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(box4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(box3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(la2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(la1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(box2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(box)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(la3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(box6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l6)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(te, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box)
                            .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(box2)
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(la1)
                                        .addGap(35, 35, 35)
                                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(la2)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(box4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(la3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(box6))
                                        .addGap(124, 124, 124))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(la6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked


    }//GEN-LAST:event_bMouseClicked

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        panel o = new panel(this.jPanel1.getSize());


        this.jPanel1.add(o);
        new crono().setVisible(false);
        if (box.isSelected()) {
            pizarra.animar(true, false, false, false, false, evt);
            
        }
        if (box2.isSelected()) {
            pizarra.animar(false, true, false, false, false, evt);
            
        }
        if (box3.isSelected()) {
            pizarra.animar(false, false, true, false, false, evt);
            
        }
        if (box4.isSelected()) {
            pizarra.animar(false, false, false, true, false, evt);
            
        }
        if (box6.isSelected()) {
            pizarra.animar(false, false, false, false, true, evt);
         
        }
        b.setEnabled(false);


    }//GEN-LAST:event_bActionPerformed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked

        new interfaz_1().setVisible(true);
        new crono().setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_b2MouseClicked

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

    }//GEN-LAST:event_b2ActionPerformed

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coActionPerformed

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
        if (co.getSelectedItem().equals("Nadador 1")) {
            l1.setText("Nadador 1");
            box.setVisible(true);
            box.setSelected(true);
            box.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 2")) {
            l2.setText("Nadador 2");
            box2.setVisible(true);
            box2.setSelected(true);
            box2.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 3")) {
            l3.setText("Nadador 3");
            box3.setVisible(true);
            box3.setSelected(true);
            box3.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 4")) {
            l4.setText("Nadador 4");
            box4.setVisible(true);
            box4.setSelected(true);
            box4.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 5")) {
            l5.setText("Nadador 5");
            box6.setVisible(true);
            box6.setSelected(true);
            box6.setEnabled(false);
        }

    }//GEN-LAST:event_botonagregarActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed

    }//GEN-LAST:event_boxActionPerformed

    private void teActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teActionPerformed

    }//GEN-LAST:event_teActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       // new menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton botonagregar;
    private javax.swing.JCheckBox box;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private javax.swing.JCheckBox box4;
    private javax.swing.JCheckBox box6;
    private javax.swing.JComboBox<String> co;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel la1;
    private javax.swing.JLabel la2;
    private javax.swing.JLabel la3;
    private javax.swing.JLabel la6;
    private java.awt.TextField te;
    // End of variables declaration//GEN-END:variables

}
