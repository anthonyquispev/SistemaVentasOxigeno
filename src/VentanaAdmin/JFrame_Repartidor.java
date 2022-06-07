package VentanaAdmin;

import VentanaAdmin.JFrame_Admin;
import Algoritmos.BuscarOrdenar;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class JFrame_Repartidor extends javax.swing.JFrame {
    int codigo;
    int posicion;
    String texto = ""; 
    BuscarOrdenar JRepartidor = new BuscarOrdenar();
    
    public JFrame_Repartidor() {
        initComponents();
        this.cargarTablaOrdenada();
        this.setLocationRelativeTo(null);
        jButtonSalir.setIcon(setIcono("/Imagenes/Salir.png",jButtonSalir)); 
    }
    public Icon setIcono(String url, JButton button){
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = button.getWidth();
        int alto = button.getHeight();
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho-20, alto-20, Image.SCALE_DEFAULT));
        return icono;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelDeliveryPerson = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatosOrdenado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jLabelDatosBuscados = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoBusqueda = new javax.swing.JTextField();
        jScrollPanel = new javax.swing.JScrollPane();
        jTextAreaMostrarDatos = new javax.swing.JTextArea();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(37, 68, 89));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 710));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDeliveryPerson.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabelDeliveryPerson.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDeliveryPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDeliveryPerson.setText("DELIVERY PERSON");
        jPanel2.add(jLabelDeliveryPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 180, 30));

        tblDatosOrdenado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatosOrdenado.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jScrollPane3.setViewportView(tblDatosOrdenado);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 590, 300));

        btnBuscar.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 50));

        jLabelDatosBuscados.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDatosBuscados.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabelDatosBuscados.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDatosBuscados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatosBuscados.setText("DATOS BUSCADOS");
        jLabelDatosBuscados.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabelDatosBuscados, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 210, 30));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Código:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 80, 40));

        txtCodigoBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtCodigoBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoBusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0), 3));
        txtCodigoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBusquedaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 40));

        jTextAreaMostrarDatos.setEditable(false);
        jTextAreaMostrarDatos.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaMostrarDatos.setColumns(20);
        jTextAreaMostrarDatos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextAreaMostrarDatos.setForeground(java.awt.Color.white);
        jTextAreaMostrarDatos.setRows(5);
        jScrollPanel.setViewportView(jTextAreaMostrarDatos);

        jPanel2.add(jScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 400, 220));

        jButtonSalir.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        texto = "";
        if (!"".equals(this.txtCodigoBusqueda.getText())) {
            codigo = Integer.parseInt(this.txtCodigoBusqueda.getText());
            posicion = JRepartidor.busquedaBinariaRecursiva(codigo);
            if (posicion != -1) {
                texto += "\t\t\nCódigo: "+JRepartidor.getCodigoDelEmpleado(posicion)+
                        "\t\t\nNombre: "+JRepartidor.getNombreDelEmpleado(posicion)+
                        "\t\t\nApellido: "+JRepartidor.getApellidoEmpleado(posicion)+
                        "\t\t\nDNI: "+JRepartidor.getDNIEmpleado(posicion)+
                        "\t\t\nSueldo: s/"+JRepartidor.getSueldoDelEmpleado(posicion)+
                        "\t\t\nEmail: "+JRepartidor.getEmail(posicion);
                this.jTextAreaMostrarDatos.setText(texto);
            } else {
                this.jTextAreaMostrarDatos.setText("");
                JOptionPane.showMessageDialog(null, "Datos nos encontrados.");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBusquedaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        JFrame_Admin VP = new JFrame_Admin();
        VP.setLocationRelativeTo(null);
        VP.setVisible(true);
        this.dispose();
        VP.show();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void cargarTablaOrdenada() {
        //BuscarOrdenar BO = new BuscarOrdenar();
        DefaultTableModel modeloTabla;
        String[] titulos = {"Código", "Nombre", "Apellido", "DNI", "Sueldo", "Email"};
        int n = JRepartidor.getNumeroDeEmpleados();
        Object fila[][] = new Object[n][6];

        for (int i = 0; i < n; i++) {
            fila[i][0] = JRepartidor.getCodigoDelEmpleado(i);
            fila[i][1] = JRepartidor.getNombreDelEmpleado(i);
            fila[i][2] = JRepartidor.getApellidoEmpleado(i);
            fila[i][3] = JRepartidor.getDNIEmpleado(i); 
            fila[i][4] = JRepartidor.getSueldoDelEmpleado(i);
            fila[i][5] = JRepartidor.getEmail(i);    
        }
        modeloTabla = new DefaultTableModel(fila, titulos);
        this.tblDatosOrdenado.setModel(modeloTabla);
    }

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
            java.util.logging.Logger.getLogger(JFrame_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Repartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDatosBuscados;
    private javax.swing.JLabel jLabelDeliveryPerson;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPanel;
    private javax.swing.JTextArea jTextAreaMostrarDatos;
    private javax.swing.JTable tblDatosOrdenado;
    private javax.swing.JTextField txtCodigoBusqueda;
    // End of variables declaration//GEN-END:variables

    
}
