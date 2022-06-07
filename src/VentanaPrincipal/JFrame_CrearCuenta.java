package VentanaPrincipal;

import Clases.Cliente;
import Clases.Sistema;
import Serializador.SerializadoraGen;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFrame_CrearCuenta extends javax.swing.JFrame {

    public JFrame_CrearCuenta() {
        setUndecorated(true);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
    }

    private boolean ValidarForm() {
        if (this.jTextField_NombreDeUsuario.getText().equals("") || this.jTextField_DNI.getText().equals("")
                || this.jTextField_Nombres.equals("") || this.jTextField_Apellidos.equals("") || this.jTextField_CorreoElectronico.equals("")
                || this.jTextField_Direccion.equals("") || this.jTextField_NumeroTelefonico.equals("") || this.jPasswordField_Contrasenia.equals("")) {
            return false;
        }
        return true;
    }

    private void limpiarControles() {
        this.jTextField_NombreDeUsuario.setText("");
        this.jTextField_DNI.setText("");
        this.jTextField_Nombres.setText("");
        this.jTextField_Apellidos.setText("");
        this.jTextField_CorreoElectronico.setText("");
        this.jTextField_Direccion.setText("");
        this.jTextField_NumeroTelefonico.setText("");
        this.jPasswordField_Contrasenia.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_NombreDeUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonCrearCuenta = new javax.swing.JButton();
        jPasswordField_Contrasenia = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_DNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Nombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Apellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_CorreoElectronico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_NumeroTelefonico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NÚMERO TELEFÓNICO");

        jTextField_NombreDeUsuario.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_NombreDeUsuario.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_NombreDeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_NombreDeUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_NombreDeUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_NombreDeUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_NombreDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreDeUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CREAR CUENTA");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRE DE USUARIO");

        jButtonSalir.setBackground(new java.awt.Color(102, 102, 255));
        jButtonSalir.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("CANCELAR");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonCrearCuenta.setBackground(new java.awt.Color(102, 102, 255));
        jButtonCrearCuenta.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButtonCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrearCuenta.setText("CREAR CUENTA");
        jButtonCrearCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCuentaActionPerformed(evt);
            }
        });

        jPasswordField_Contrasenia.setBackground(new java.awt.Color(102, 102, 255));
        jPasswordField_Contrasenia.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jPasswordField_Contrasenia.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField_Contrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField_Contrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPasswordField_Contrasenia.setCaretColor(new java.awt.Color(255, 255, 255));
        jPasswordField_Contrasenia.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPasswordField_Contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_ContraseniaActionPerformed(evt);
            }
        });
        jPasswordField_Contrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_ContraseniaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTRASEÑA");

        jTextField_DNI.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_DNI.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_DNI.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_DNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_DNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_DNI.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DNIActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DNI");

        jTextField_Nombres.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_Nombres.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_Nombres.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Nombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Nombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_Nombres.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOMBRES");

        jTextField_Apellidos.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_Apellidos.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_Apellidos.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Apellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_Apellidos.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ApellidosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("APELLIDOS");

        jTextField_CorreoElectronico.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_CorreoElectronico.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_CorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_CorreoElectronico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_CorreoElectronico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_CorreoElectronico.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_CorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CorreoElectronicoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CORREO ELECTRÓNICO");

        jTextField_Direccion.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_Direccion.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_Direccion.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DireccionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DIRECCIÓN");

        jTextField_NumeroTelefonico.setBackground(new java.awt.Color(102, 102, 255));
        jTextField_NumeroTelefonico.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jTextField_NumeroTelefonico.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_NumeroTelefonico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_NumeroTelefonico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTextField_NumeroTelefonico.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_NumeroTelefonico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NumeroTelefonicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordField_Contrasenia)
                            .addComponent(jTextField_DNI)
                            .addComponent(jTextField_Nombres)
                            .addComponent(jTextField_Apellidos)
                            .addComponent(jTextField_CorreoElectronico)
                            .addComponent(jTextField_Direccion)
                            .addComponent(jTextField_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jTextField_NumeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_NumeroTelefonico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_NombreDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreDeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreDeUsuarioActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        JFrame_Login Login = new JFrame_Login();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        Login.show();
        this.dispose();

    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCuentaActionPerformed
        // TODO add your handling code here:
        Cliente cliente;
        if (ValidarForm()) {
            cliente = new Cliente(jTextField_NombreDeUsuario.getText(), jPasswordField_Contrasenia.getText(), jTextField_Direccion.getText(), jTextField_NumeroTelefonico.getText(), jTextField_DNI.getText(), jTextField_Nombres.getText(), jTextField_Apellidos.getText(), jTextField_CorreoElectronico.getText());
            if (Sistema.cliente.ingresar(cliente)) {
                JOptionPane.showMessageDialog(this, "Registro concluido exitosamente.");
                limpiarControles();
            } else {
                JOptionPane.showMessageDialog(this, "El cliente ya ha sido registrado previamente.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese todos los datos solicitados.");
        }
        SerializadoraGen.serializarClientes("Clientes.txt", Sistema.cliente);
        JFrame_Login Login = new JFrame_Login();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        Login.show();
        this.dispose();

    }//GEN-LAST:event_jButtonCrearCuentaActionPerformed

    private void jPasswordField_ContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_ContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ContraseniaActionPerformed

    private void jPasswordField_ContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_ContraseniaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ContraseniaKeyTyped

    private void jTextField_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DNIActionPerformed

    private void jTextField_NombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombresActionPerformed

    private void jTextField_ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ApellidosActionPerformed

    private void jTextField_CorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CorreoElectronicoActionPerformed

    private void jTextField_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DireccionActionPerformed

    private void jTextField_NumeroTelefonicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NumeroTelefonicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NumeroTelefonicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearCuenta;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Contrasenia;
    private javax.swing.JTextField jTextField_Apellidos;
    private javax.swing.JTextField jTextField_CorreoElectronico;
    private javax.swing.JTextField jTextField_DNI;
    private javax.swing.JTextField jTextField_Direccion;
    private javax.swing.JTextField jTextField_NombreDeUsuario;
    private javax.swing.JTextField jTextField_Nombres;
    private javax.swing.JTextField jTextField_NumeroTelefonico;
    // End of variables declaration//GEN-END:variables
}
