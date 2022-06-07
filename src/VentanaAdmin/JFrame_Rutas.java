package VentanaAdmin;

import Algoritmos.CaminosMinimos;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFrame_Rutas extends javax.swing.JFrame {

    int[][] L = {{0, 999, 110, 999, 90, 999, 999, 999, 999, 999, 999, 999, 999},
    {999, 0, 999, 83, 999, 999, 999, 999, 999, 999, 999, 999, 999},
    {999, 999, 0, 999, 70, 999, 999, 999, 999, 999, 999, 999, 999},
    {999, 999, 999, 0, 999, 999, 999, 999, 999, 999, 999, 121, 999},
    {999, 999, 999, 999, 0, 999, 999, 80, 999, 80, 999, 999, 999},
    {999, 999, 999, 999, 90, 0, 999, 999, 999, 999, 999, 999, 999},
    {999, 65, 160, 999, 999, 999, 0, 999, 999, 999, 999, 999, 999},
    {999, 999, 999, 999, 999, 80, 68, 0, 999, 999, 110, 73, 65},
    {999, 999, 999, 999, 999, 999, 40, 999, 0, 999, 999, 999, 999},
    {100, 999, 999, 999, 80, 999, 999, 999, 999, 0, 999, 999, 999},
    {999, 999, 999, 999, 999, 999, 999, 999, 50, 999, 0, 999, 999},
    {999, 999, 999, 121, 999, 999, 999, 999, 999, 999, 999, 0, 999},
    {999, 60, 999, 79, 999, 999, 999, 999, 999, 999, 999, 999, 0}};

    public JFrame_Rutas() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        jButtonSalir.setIcon(setIcono("/Imagenes/Salir.png", jButtonSalir));
        jLabelRutas.setIcon(setIcono("/Imagenes/Grafo_Rutas.png", jLabelRutas));
    }

    //Métodos para íconos de los botones
    public Icon setIcono(String url, JLabel label) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = 810;
        int alto = 605;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public Icon setIcono(String url, JButton button) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = button.getWidth();
        int alto = button.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho - 20, alto - 20, Image.SCALE_DEFAULT));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConsultarRuta = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelRutas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(825, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConsultarRuta.setBackground(new java.awt.Color(0, 0, 0));
        jButtonConsultarRuta.setFont(new java.awt.Font("Kalinga", 1, 18)); // NOI18N
        jButtonConsultarRuta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultarRuta.setText("Consultar Ruta");
        jButtonConsultarRuta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonConsultarRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonConsultarRuta.setFocusTraversalPolicyProvider(true);
        jButtonConsultarRuta.setSelected(true);
        jButtonConsultarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarRutaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultarRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 150, 60));

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setBorder(null);
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.setFocusTraversalPolicyProvider(true);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 60, 50));

        jLabelRutas.setToolTipText("");
        jLabelRutas.setPreferredSize(new java.awt.Dimension(780, 570));
        getContentPane().add(jLabelRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarRutaActionPerformed
        CaminosMinimos CA = new CaminosMinimos(L);
        CA.rutas();
        int a;
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ruta origen: ", "Distrito de Origen",
                    JOptionPane.INFORMATION_MESSAGE));
        } while (a < 1 || a > 13);
        int b;
        do {
            b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la ruta destino: ", "Distrito de Destino",
                    JOptionPane.INFORMATION_MESSAGE));
        } while (b < 1 || b > 13);
        CA.MetodoFloyd(a, b);
        CA.Camino(a, b);
    }//GEN-LAST:event_jButtonConsultarRutaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        JFrame_Admin frm = new JFrame_Admin();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        this.dispose();
        frm.show();
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Rutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Rutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarRuta;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelRutas;
    // End of variables declaration//GEN-END:variables
}
