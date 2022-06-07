package VentanaCliente;

import Algoritmos.Divide_venceras;
import Clases.*;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Algoritmos.AlgoritmoVoraz;
import otros.Conexion;

public class JPanel_Pedido extends javax.swing.JPanel {

    Hora H = new Hora();
    Fecha FE = new Fecha();

    public JPanel_Pedido() {
        initComponents();
        jButtonHacerPedido.setEnabled(false);
        actualizarDineroRecibido();
        jLabelBalones.setIcon(setIcono("/Imagenes/Balones.png", jLabelBalones));
    }

    private void actualizarDineroRecibido() {
        if (Sistema.tarjetaActual != null) {
            lblDineroRecibido.setText(String.valueOf(Sistema.tarjetaActual.getSaldo()));
        } else {
            lblDineroRecibido.setText(String.valueOf("0.00"));
        }
    }

    //Métodos para íconos de los botones
    public Icon setIcono(String url, JLabel label) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = 418;
        int alto = 340;
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public void BloquearCampos(boolean d) {
        Cantidad1.setEditable(!d);
        Cantidad2.setEditable(!d);
        Cantidad3.setEditable(!d);
        Cantidad4.setEditable(!d);
        Cantidad5.setEditable(!d);
        Cantidad6.setEditable(!d);
        Cantidad7.setEditable(!d);
        Cantidad8.setEditable(!d);
        Cantidad9.setEditable(!d);
    }

    public int CalcularTotal() {
        int suma = 0;
        int producto[] = new int[9];
        int[] precio = {Integer.parseInt(jLabelP1.getText().substring(3)),
            Integer.parseInt(jLabelP2.getText().substring(3)),
            Integer.parseInt(jLabelP3.getText().substring(3)),
            Integer.parseInt(jLabelP4.getText().substring(3)),
            Integer.parseInt(jLabelP5.getText().substring(3)),
            Integer.parseInt(jLabelP6.getText().substring(3)),
            Integer.parseInt(jLabelP7.getText().substring(3)),
            Integer.parseInt(jLabelP8.getText().substring(3)),
            Integer.parseInt(jLabelP9.getText().substring(3))
        };
        int[] cantidad = {Integer.parseInt(Cantidad1.getText()),
            Integer.parseInt(Cantidad2.getText()),
            Integer.parseInt(Cantidad3.getText()),
            Integer.parseInt(Cantidad4.getText()),
            Integer.parseInt(Cantidad5.getText()),
            Integer.parseInt(Cantidad6.getText()),
            Integer.parseInt(Cantidad7.getText()),
            Integer.parseInt(Cantidad8.getText()),
            Integer.parseInt(Cantidad9.getText())
        };

        for (int i = 0; i < 9; i++) {
            int mult = Divide_venceras.Multiplicacion(precio[i], cantidad[i]); // De esta forma solo se calcula la función Divide_venceras una vez por ciclo
            producto[i] = mult;
            suma = suma + mult;
        }

        jLabelS1.setText("S/." + producto[0]);
        jLabelS2.setText("S/." + producto[1]);
        jLabelS3.setText("S/." + producto[2]);
        jLabelS4.setText("S/." + producto[3]);
        jLabelS5.setText("S/." + producto[4]);
        jLabelS6.setText("S/." + producto[5]);
        jLabelS7.setText("S/." + producto[6]);
        jLabelS8.setText("S/." + producto[7]);
        jLabelS9.setText("S/." + producto[8]);

        return suma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cantidad1 = new javax.swing.JTextField();
        Cantidad2 = new javax.swing.JTextField();
        Cantidad3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Cantidad4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cantidad5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Cantidad6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Cantidad7 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Cantidad8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Cantidad9 = new javax.swing.JTextField();
        jLabelBalones = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelP1 = new javax.swing.JLabel();
        jLabelP2 = new javax.swing.JLabel();
        jLabelP3 = new javax.swing.JLabel();
        jLabelP4 = new javax.swing.JLabel();
        jLabelP5 = new javax.swing.JLabel();
        jLabelP6 = new javax.swing.JLabel();
        jLabelP7 = new javax.swing.JLabel();
        jLabelP8 = new javax.swing.JLabel();
        jLabelP9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButtonHacerPedido = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabelS1 = new javax.swing.JLabel();
        jLabelS2 = new javax.swing.JLabel();
        jLabelS3 = new javax.swing.JLabel();
        jLabelS4 = new javax.swing.JLabel();
        jLabelS5 = new javax.swing.JLabel();
        jLabelS6 = new javax.swing.JLabel();
        jLabelS7 = new javax.swing.JLabel();
        jLabelS8 = new javax.swing.JLabel();
        jLabelS9 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDineroRecibido = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(424, 698));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 352, 104, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("M-4 (113 L)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 406, 104, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("M-2(42 L)");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 379, 104, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("ML-6 (165 L)");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 435, 104, -1));

        Cantidad1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad1.setText("0");
        Cantidad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 378, 90, -1));

        Cantidad2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad2.setText("0");
        Cantidad2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        add(Cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 406, 90, -1));

        Cantidad3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad3.setText("0");
        Cantidad3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        Cantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad3ActionPerformed(evt);
            }
        });
        add(Cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 434, 90, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("M-6 (164 L)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 463, 104, -1));

        Cantidad4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad4.setText("0");
        Cantidad4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        add(Cantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 462, 90, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("M-7 (198 L)");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 491, 104, -1));

        Cantidad5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad5.setText("0");
        Cantidad5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        Cantidad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad5ActionPerformed(evt);
            }
        });
        add(Cantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 490, 90, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("M-9 (255 L)");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 519, 104, -1));

        Cantidad6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad6.setText("0");
        Cantidad6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        Cantidad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad6ActionPerformed(evt);
            }
        });
        add(Cantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 518, 90, -1));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("M-15 (425 L)");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 547, 104, -1));

        Cantidad7.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad7.setText("0");
        Cantidad7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        Cantidad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad7ActionPerformed(evt);
            }
        });
        add(Cantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 546, 90, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("M-22 (640 L)");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 575, 104, -1));

        Cantidad8.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad8.setText("0");
        Cantidad8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        add(Cantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 574, 90, -1));

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("M-24 (680 L)");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 603, 104, -1));

        Cantidad9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        Cantidad9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cantidad9.setText("0");
        Cantidad9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        Cantidad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cantidad9ActionPerformed(evt);
            }
        });
        add(Cantidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 602, 90, -1));

        jLabelBalones.setBackground(new java.awt.Color(255, 255, 255));
        add(jLabelBalones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 418, 290));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Precio");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 352, 87, -1));

        jLabelP1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP1.setText("S/.80");
        add(jLabelP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 379, 87, -1));

        jLabelP2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP2.setText("S/.100");
        add(jLabelP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 406, 87, -1));

        jLabelP3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP3.setText("S/.150");
        add(jLabelP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 435, 87, -1));

        jLabelP4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP4.setText("S/.200");
        add(jLabelP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 463, 87, -1));

        jLabelP5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP5.setText("S/.250");
        add(jLabelP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 491, 87, -1));

        jLabelP6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP6.setText("S/.300");
        add(jLabelP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 519, 87, -1));

        jLabelP7.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP7.setText("S/.400");
        add(jLabelP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 547, 87, -1));

        jLabelP8.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP8.setText("S/.500");
        add(jLabelP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 575, 87, -1));

        jLabelP9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelP9.setText("S/.550");
        add(jLabelP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 603, 87, -1));

        jLabel24.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cantidad");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 352, 96, -1));

        jLabel25.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Total");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 630, 96, -1));

        jButtonHacerPedido.setBackground(new java.awt.Color(102, 102, 255));
        jButtonHacerPedido.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButtonHacerPedido.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHacerPedido.setText("HACER PEDIDO");
        jButtonHacerPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonHacerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHacerPedidoActionPerformed(evt);
            }
        });
        add(jButtonHacerPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 656, -1, -1));

        jLabel26.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Subtotal");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 352, 87, -1));

        jLabelS1.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS1.setText("S/.0");
        add(jLabelS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 378, 87, -1));

        jLabelS2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS2.setText("S/.0");
        add(jLabelS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 407, 87, -1));

        jLabelS3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS3.setText("S/.0");
        add(jLabelS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 434, 87, -1));

        jLabelS4.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS4.setText("S/.0");
        add(jLabelS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 460, 87, -1));

        jLabelS5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS5.setText("S/.0");
        add(jLabelS5, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 491, 87, -1));

        jLabelS6.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS6.setText("S/.0");
        add(jLabelS6, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 519, 87, -1));

        jLabelS7.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS7.setText("S/.0");
        add(jLabelS7, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 547, 87, -1));

        jLabelS8.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS8.setText("S/.0");
        add(jLabelS8, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 575, 87, -1));

        jLabelS9.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelS9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelS9.setText("S/.0");
        add(jLabelS9, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 603, 87, -1));

        jLabelTotal.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelTotal.setText("S/.0");
        add(jLabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 630, 113, -1));

        jButtonCancelar.setBackground(new java.awt.Color(102, 102, 255));
        jButtonCancelar.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 656, -1, -1));

        jButtonCalcular.setBackground(new java.awt.Color(102, 102, 255));
        jButtonCalcular.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 12)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setText("CALCULAR");
        jButtonCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 656, -1, -1));

        jLabel1.setText("Dinero recibido:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 100, 30));

        lblDineroRecibido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(lblDineroRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void Cantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad3ActionPerformed

    }//GEN-LAST:event_Cantidad3ActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
        jLabelTotal.setText("S/." + CalcularTotal());
        BloquearCampos(true);
        jButtonHacerPedido.setEnabled(true);
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        BloquearCampos(false);
        jButtonHacerPedido.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonHacerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHacerPedidoActionPerformed
        if (!Cantidad1.equals("0") || !Cantidad2.equals("0") || !Cantidad3.equals("0") || !Cantidad4.equals("0") || !Cantidad5.equals("0") || !Cantidad6.equals("0") || !Cantidad7.equals("0")) {
            int CT = Integer.parseInt(Cantidad1.getText())
                    + Integer.parseInt(Cantidad2.getText())
                    + Integer.parseInt(Cantidad3.getText())
                    + Integer.parseInt(Cantidad4.getText())
                    + Integer.parseInt(Cantidad5.getText())
                    + Integer.parseInt(Cantidad6.getText())
                    + Integer.parseInt(Cantidad7.getText());

            int montoCobrar = CalcularTotal();

            double v[] = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.01};
            int s[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            double dineroRecibido = Double.parseDouble(lblDineroRecibido.getText());

            if (dineroRecibido >= montoCobrar) {

                Pedido pedido = new Pedido(Sistema.clienteActual.getDNI(), CT, montoCobrar);

                //Enlistar pedido en el cliente
                Sistema.clienteActual.insertarPedido(pedido);
                //Encolar pedido en el sitema
                Sistema.colaPedidos.encolar(pedido);

                double vuelto = Math.rint((dineroRecibido - montoCobrar) * 100) / 100;

                if (AlgoritmoVoraz.Voraz2(v, s, vuelto)) {
                    JOptionPane.showMessageDialog(null, AlgoritmoVoraz.MostrarCambio(v, s, vuelto),
                            "Cambio", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay solución");
                }

                //Actualizar el saldo de la tarjeta en la BD//
                PreparedStatement ps = null;
                try {
                    Conexion con = new Conexion();
                    Connection conexion = con.getConnection();
                    ps = conexion.prepareStatement("UPDATE Tarjeta SET saldo=? WHERE idTarjeta=?");
                    ps.setDouble(1, vuelto);
                    ps.setString(2, Sistema.tarjetaActual.getIdTarjeta());

                    int resultado = ps.executeUpdate();
                    if (resultado > 0) {
                        Sistema.tarjetaActual.setSaldo((float) vuelto);
                        lblDineroRecibido.setText(String.valueOf(Sistema.tarjetaActual.getSaldo()));
                        System.out.println("Base de datos actualizada correctamente");
                    } else {
                        System.out.println("Error al actualizar la Base de datos");
                    }
                    conexion.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            }
        }

    }//GEN-LAST:event_jButtonHacerPedidoActionPerformed

    private void Cantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad5ActionPerformed

    }//GEN-LAST:event_Cantidad5ActionPerformed

    private void Cantidad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad6ActionPerformed

    }//GEN-LAST:event_Cantidad6ActionPerformed

    private void Cantidad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad7ActionPerformed

    }//GEN-LAST:event_Cantidad7ActionPerformed

    private void Cantidad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cantidad9ActionPerformed

    }//GEN-LAST:event_Cantidad9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad1;
    private javax.swing.JTextField Cantidad2;
    private javax.swing.JTextField Cantidad3;
    private javax.swing.JTextField Cantidad4;
    private javax.swing.JTextField Cantidad5;
    private javax.swing.JTextField Cantidad6;
    private javax.swing.JTextField Cantidad7;
    private javax.swing.JTextField Cantidad8;
    private javax.swing.JTextField Cantidad9;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonHacerPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBalones;
    private javax.swing.JLabel jLabelP1;
    private javax.swing.JLabel jLabelP2;
    private javax.swing.JLabel jLabelP3;
    private javax.swing.JLabel jLabelP4;
    private javax.swing.JLabel jLabelP5;
    private javax.swing.JLabel jLabelP6;
    private javax.swing.JLabel jLabelP7;
    private javax.swing.JLabel jLabelP8;
    private javax.swing.JLabel jLabelP9;
    private javax.swing.JLabel jLabelS1;
    private javax.swing.JLabel jLabelS2;
    private javax.swing.JLabel jLabelS3;
    private javax.swing.JLabel jLabelS4;
    private javax.swing.JLabel jLabelS5;
    private javax.swing.JLabel jLabelS6;
    private javax.swing.JLabel jLabelS7;
    private javax.swing.JLabel jLabelS8;
    private javax.swing.JLabel jLabelS9;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel lblDineroRecibido;
    // End of variables declaration//GEN-END:variables
}
