package VentanaCliente;

import Clases.Sistema;
import Clases.Tarjeta;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import otros.Conexion;

public class VincularTarjeta extends javax.swing.JPanel {

    DefaultTableModel modelo1;

    public VincularTarjeta() {
        initComponents();
        actualizarSaldoActual();
    }
    
    private void actualizarSaldoActual() {
        if (Sistema.tarjetaActual != null) {
            lblSaldoActual.setText(String.valueOf(Sistema.tarjetaActual.getSaldo()));
        } else {
            lblSaldoActual.setText(String.valueOf("0.00"));
        }
    }

    //Métodos para íconos de los botones
    public Icon setIcono(String url, JLabel label) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = 395;
        int alto = 318;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jButtonVerBoleta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSaldoActual = new javax.swing.JLabel();
        txtCod4 = new javax.swing.JTextField();
        txtCod1 = new javax.swing.JTextField();
        txtCod2 = new javax.swing.JTextField();
        txtCod3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel26.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Tipo");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Código:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 40));

        jLabel28.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Vincular Tarjeta");
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 420, 50));

        jButtonVerBoleta.setBackground(new java.awt.Color(102, 102, 255));
        jButtonVerBoleta.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButtonVerBoleta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerBoleta.setText("Ver boleta");
        jButtonVerBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(jButtonVerBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 733, -1, -1));

        jButton1.setText("Vincular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, 40));

        jLabel1.setText("Saldo:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 70, 40));

        lblSaldoActual.setText("0.00");
        add(lblSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 110, 40));

        txtCod4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtCod4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 60, 30));

        txtCod1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 60, 30));

        txtCod2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtCod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 60, 30));

        txtCod3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtCod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 30, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 30, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("-");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PreparedStatement ps = null;
        ResultSet rs = null;
        String codigoTarjeta = txtCod1.getText() + "" + txtCod2.getText() + "" + txtCod3.getText() + "" + txtCod4.getText();
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("SELECT saldo FROM Tarjeta WHERE idTarjeta=?");
            ps.setString(1, codigoTarjeta);
            rs = ps.executeQuery();
            if (rs.next()) {
                Float saldo = rs.getFloat("saldo");
                Sistema.tarjetaActual = new Tarjeta(codigoTarjeta, saldo);
            } else {
                Sistema.tarjetaActual = null;
                JOptionPane.showMessageDialog(null, "No se encontró el código de tarjeta insertado");
            }
            actualizarSaldoActual();
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVerBoleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblSaldoActual;
    private javax.swing.JTextField txtCod1;
    private javax.swing.JTextField txtCod2;
    private javax.swing.JTextField txtCod3;
    private javax.swing.JTextField txtCod4;
    // End of variables declaration//GEN-END:variables
}
