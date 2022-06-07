package VentanaAdmin;

import java.util.Arrays;
import javax.swing.JOptionPane;
import Algoritmos.AlgoritmoVoraz;

public class Voraz extends javax.swing.JPanel {

    private int cant[] = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public Voraz() {
        initComponents();
        this.actualizarSpinners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        txtDineroRecibido = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMontoCobrar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblVuelto = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnDarCambio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(440, 610));
        setPreferredSize(new java.awt.Dimension(424, 698));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Billetes");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 70, 40));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Monedas");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, 40));

        jLabel1.setText("S/. 200");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 30));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 50, 30));

        jLabel6.setText("S/. 5");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 40, 30));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });
        add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, 30));

        jLabel10.setText("S/. 0.2");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 40, 30));

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner10StateChanged(evt);
            }
        });
        add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 50, 30));

        jLabel2.setText("S/. 100");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 30));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 30));

        jLabel7.setText("S/. 2");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 40, 30));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner7StateChanged(evt);
            }
        });
        add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 50, 30));

        jLabel11.setText("S/. 0.1");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 50, 30));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner11StateChanged(evt);
            }
        });
        add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 50, 30));

        jLabel3.setText("S/. 50");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 30));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });
        add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 50, 30));

        jLabel8.setText("S/. 1");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 40, 30));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner8StateChanged(evt);
            }
        });
        add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 30));

        jLabel12.setText("S/. 0.05");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 50, 30));

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner12StateChanged(evt);
            }
        });
        add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 50, 30));

        jLabel4.setText("S/. 20");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 30));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });
        add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 50, 30));

        jLabel9.setText("S/. 0.5");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 40, 30));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner9StateChanged(evt);
            }
        });
        add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 50, 30));

        jLabel13.setText("S/. 0.01");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 50, 30));

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner13StateChanged(evt);
            }
        });
        add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 50, 30));

        jLabel5.setText("S/. 10");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 30));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel());
        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });
        add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 50, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Dinero recibido:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, 40));

        txtDineroRecibido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDineroRecibido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDineroRecibido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));
        add(txtDineroRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 150, 40));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Monto a cobrar:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 40));

        txtMontoCobrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMontoCobrar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoCobrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));
        add(txtMontoCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 150, 40));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Dar cambio de:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 120, 40));

        lblVuelto.setBackground(new java.awt.Color(51, 255, 204));
        lblVuelto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblVuelto.setForeground(new java.awt.Color(0, 0, 0));
        lblVuelto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVuelto.setOpaque(true);
        add(lblVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 110, 40));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("S/.");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 30, 40));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("S/.");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 30, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("S/.");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 30, 40));

        btnDarCambio.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDarCambio.setText("DAR CAMBIO");
        btnDarCambio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDarCambio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarCambioActionPerformed(evt);
            }
        });
        add(btnDarCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 220, 70));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(5.0F);
        jSeparator1.setAlignmentY(5.0F);
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 10, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        this.cant[0] = (int) jSpinner1.getValue();
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
        this.cant[5] = (int) jSpinner6.getValue();
    }//GEN-LAST:event_jSpinner6StateChanged

    private void jSpinner10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner10StateChanged
        this.cant[9] = (int) jSpinner10.getValue();
    }//GEN-LAST:event_jSpinner10StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        this.cant[1] = (int) jSpinner2.getValue();
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner7StateChanged
        this.cant[6] = (int) jSpinner7.getValue();
    }//GEN-LAST:event_jSpinner7StateChanged

    private void jSpinner11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner11StateChanged
        this.cant[10] = (int) jSpinner11.getValue();
    }//GEN-LAST:event_jSpinner11StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        this.cant[2] = (int) jSpinner3.getValue();
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jSpinner8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner8StateChanged
        this.cant[7] = (int) jSpinner8.getValue();
    }//GEN-LAST:event_jSpinner8StateChanged

    private void jSpinner12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner12StateChanged
        this.cant[11] = (int) jSpinner12.getValue();
    }//GEN-LAST:event_jSpinner12StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        this.cant[3] = (int) jSpinner4.getValue();
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner9StateChanged
        this.cant[8] = (int) jSpinner9.getValue();
    }//GEN-LAST:event_jSpinner9StateChanged

    private void jSpinner13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner13StateChanged
        this.cant[12] = (int) jSpinner13.getValue();
    }//GEN-LAST:event_jSpinner13StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
        this.cant[4] = (int) jSpinner5.getValue();
    }//GEN-LAST:event_jSpinner5StateChanged

    private void btnDarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarCambioActionPerformed
        double v[] = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.01};
        int s[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int auxS[] = Arrays.copyOf(s, s.length);
        int auxCant[] = Arrays.copyOf(cant, cant.length);

        double dineroRecibido, montoCobrar, vuelto;
        if (!"".equals(this.txtDineroRecibido.getText())
                && !"".equals(this.txtMontoCobrar.getText())) {

            dineroRecibido = Double.parseDouble(this.txtDineroRecibido.getText());
            montoCobrar = Double.parseDouble(this.txtMontoCobrar.getText());

            if (dineroRecibido >= montoCobrar) {
                vuelto = Math.rint((dineroRecibido - montoCobrar) * 100) / 100;
                this.lblVuelto.setText(String.valueOf(vuelto));

                if (AlgoritmoVoraz.Voraz(v, auxS, auxCant, vuelto)) {
                    AlgoritmoVoraz.Voraz(v, s, this.cant, vuelto);
                    this.actualizarSpinners();
                    JOptionPane.showMessageDialog(null, AlgoritmoVoraz.MostrarCambio(v, s, vuelto),
                            "Cambio", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay solución");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dinero recibido insuficiente");
            }
        }
    }//GEN-LAST:event_btnDarCambioActionPerformed

    private void actualizarSpinners() {
        this.jSpinner1.setValue(this.cant[0]);
        this.jSpinner2.setValue(this.cant[1]);
        this.jSpinner3.setValue(this.cant[2]);
        this.jSpinner4.setValue(this.cant[3]);
        this.jSpinner5.setValue(this.cant[4]);
        this.jSpinner6.setValue(this.cant[5]);
        this.jSpinner7.setValue(this.cant[6]);
        this.jSpinner8.setValue(this.cant[7]);
        this.jSpinner9.setValue(this.cant[8]);
        this.jSpinner10.setValue(this.cant[9]);
        this.jSpinner11.setValue(this.cant[10]);
        this.jSpinner12.setValue(this.cant[11]);
        this.jSpinner13.setValue(this.cant[12]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarCambio;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JLabel lblVuelto;
    private javax.swing.JTextField txtDineroRecibido;
    private javax.swing.JTextField txtMontoCobrar;
    // End of variables declaration//GEN-END:variables
}
