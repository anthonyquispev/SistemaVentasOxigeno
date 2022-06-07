package VentanaAdmin;

import Clases.Balon_Gas;
import Clases.Sistema;
import Serializador.SerializadoraGen;
import VentanaPrincipal.JFrame_Login;
import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JFrame_Admin extends javax.swing.JFrame {

    public JFrame_Admin() {
        setUndecorated(true);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        jButtonSalir.setIcon(setIcono("/Imagenes/Salir.png", jButtonSalir));
        jButtonUsuarios.setIcon(setIcono("/Imagenes/Usuarios.png", jButtonSalir));
        btnColaPedidos.setIcon(setIcono("/Imagenes/Pedidos.png", jButtonSalir));
    }

    //Métodos para íconos de los botones
    public Icon setIcono(String url, JButton button) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = button.getWidth();
        int alto = button.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho - 20, alto - 20, Image.SCALE_DEFAULT));
        return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        BRutas = new javax.swing.JButton();
        jButtonRepartidores = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonRepartidores1 = new javax.swing.JButton();
        btnColaPedidos = new javax.swing.JButton();
        jPanelIntro = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("frame3"); // NOI18N
        setPreferredSize(new java.awt.Dimension(495, 709));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(0, 204, 204));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 50, 50));

        jButtonUsuarios.setBackground(new java.awt.Color(0, 204, 204));
        jButtonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        BRutas.setBackground(new java.awt.Color(0, 204, 204));
        BRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/direction_32px.png"))); // NOI18N
        BRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRutasActionPerformed(evt);
            }
        });
        jPanel1.add(BRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 50, 50));

        jButtonRepartidores.setBackground(new java.awt.Color(0, 204, 204));
        jButtonRepartidores.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRepartidores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultation_30px.png"))); // NOI18N
        jButtonRepartidores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRepartidores.setPreferredSize(new java.awt.Dimension(60, 36));
        jButtonRepartidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepartidoresActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRepartidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 50));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registration_26px.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 50, 50));

        jButtonRepartidores1.setBackground(new java.awt.Color(0, 204, 204));
        jButtonRepartidores1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRepartidores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/money_24px.png"))); // NOI18N
        jButtonRepartidores1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRepartidores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepartidores1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRepartidores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 50, 50));

        btnColaPedidos.setBackground(new java.awt.Color(0, 204, 204));
        btnColaPedidos.setForeground(new java.awt.Color(255, 51, 51));
        btnColaPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delivery_32px.png"))); // NOI18N
        btnColaPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColaPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaPedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btnColaPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 50, 46));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jPanelIntro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIntro.setPreferredSize(new java.awt.Dimension(495, 709));

        jLabel28.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Bienvenido, Administrador");

        javax.swing.GroupLayout jPanelIntroLayout = new javax.swing.GroupLayout(jPanelIntro);
        jPanelIntro.setLayout(jPanelIntroLayout);
        jPanelIntroLayout.setHorizontalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        jPanelIntroLayout.setVerticalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -1, 450, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        SerializadoraGen.serializarClientes("Clientes.txt", Sistema.cliente);
        SerializadoraGen.serializarMensajesClientes("ColaPedidos.txt", Sistema.colaPedidos);

        JFrame_Login VP = new JFrame_Login();
        VP.setLocationRelativeTo(null);
        VP.setVisible(true);
        this.dispose();
        VP.show();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        // TODO add your handling code here:
        Usuarios PU = new Usuarios();
        PU.setSize(415, 670);//Tamaño del Voraz
        PU.setLocation(5, 5);//Posición dentro del Voraz principal

        jPanelIntro.removeAll();
        jPanelIntro.add(PU, BorderLayout.CENTER);
        jPanelIntro.revalidate();
        jPanelIntro.repaint();
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void BRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRutasActionPerformed
        JFrame_Rutas frm = new JFrame_Rutas();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_BRutasActionPerformed

    private void jButtonRepartidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepartidoresActionPerformed
        JFrame_Repartidor R = new JFrame_Repartidor();
        R.show();
        this.dispose();
    }//GEN-LAST:event_jButtonRepartidoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistrarEmpleado P = new RegistrarEmpleado();
        P.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRepartidores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepartidores1ActionPerformed
        // TODO add your handling code here:
        Voraz PP = new Voraz();

        PP.setSize(424, 698);//Tamaño del Voraz
        PP.setLocation(5, 5);//Posición dentro del Voraz principal

        jPanelIntro.removeAll();
        jPanelIntro.add(PP, BorderLayout.CENTER);
        jPanelIntro.revalidate();
        jPanelIntro.repaint();
    }//GEN-LAST:event_jButtonRepartidores1ActionPerformed

    private void btnColaPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaPedidosActionPerformed
        // TODO add your handling code here:
        ColaPedidos pnl = new ColaPedidos();
        pnl.setSize(424, 698);//Tamaño del Voraz
        pnl.setLocation(5, 5);//Posición dentro del Voraz principal

        jPanelIntro.removeAll();
        jPanelIntro.add(pnl, BorderLayout.CENTER);
        jPanelIntro.revalidate();
        jPanelIntro.repaint();
    }//GEN-LAST:event_btnColaPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRutas;
    private javax.swing.JButton btnColaPedidos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRepartidores;
    private javax.swing.JButton jButtonRepartidores1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelIntro;
    // End of variables declaration//GEN-END:variables
}