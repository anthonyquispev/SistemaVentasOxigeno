package VentanaAdmin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrame_DeliveryPerson extends javax.swing.JInternalFrame {
     
    public class Nodo{
        int codigo;
        String nombre;
        String apellido1;
        String dni;
        float sueldo;
        String email;
        Nodo sig;
        
        public Nodo(int cod, String nombre, String ape, String DNI, float sueldo, String email){
            this.codigo = cod;
            this.nombre = nombre;
            this.apellido1 = ape;
            this.dni = DNI;
            this.sueldo = sueldo;
            this.email = email;
        }
    }
    DefaultTableModel Modelo;
    String [] cabecera = {"N°","Código","Nombre","Ape. Paterno","DNI","Sueldo","Email"};
    String [][] data = {};
    public Nodo ini,fin;
    public Nodo pFound;
    int num = 0;
       
    public JFrame_DeliveryPerson() {
        initComponents();
        ini = fin = pFound = null;
        Modelo = new DefaultTableModel(data,cabecera);
        txtaRegistro.setModel(Modelo);
    }
  
    @SuppressWarnings("unchecked")

    void habilitar(){
        btneliminar.setEnabled(true);
        btnguardar.setEnabled(false);
    }
    void deshabilitar(){
       btneliminar.setEnabled(false);
       btnguardar.setEnabled(true);
    }
    void limpiarentradas(){
        txtcodigo.setText("");
        txtnombre.setText("");
        txtapellido1.setText("");
        txtdni.setText("");
        jTextSueldo.setText("");
        jTextEmail.setText("");
        txtcodigo.requestFocus();
    }
    void vaciar_tabla(){
        int filas = txtaRegistro.getRowCount(); 
        for(int i=0; i<filas; i++)
            Modelo.removeRow(0);
    }
    
    void ver_datos(){
        int codi;
        String nom, ape1, DNI, email;
        float sueldo;
        Nodo aux = ini; 
        num = 0;
        vaciar_tabla();
        while (aux != null) {
            codi = aux.codigo;
            nom = aux.nombre;
            ape1 = aux.apellido1;
            DNI = aux.dni;
            email = aux.email;
            sueldo = aux.sueldo;
            num++;
            Object[] fila = {num, codi, nom, ape1, DNI, sueldo, email};
            Modelo.addRow(fila);
            aux = aux.sig;
        }
    }
    Nodo buscar(Nodo inicio, int cod){
        Nodo pos = inicio;
        while((pos!=null) && (cod != pos.codigo))
            pos = pos.sig;
        return pos;
    }
    Nodo insertarinicio(Nodo inicio, int cod, String nom, String ape1, String dni, float sueldo, String email){
        Nodo nuevo = new Nodo(cod, nom, ape1, dni, sueldo, email);
        nuevo.sig = inicio;
        inicio = nuevo;
        return inicio;
    }
    
    void eliminar(Nodo actual){     
        if (ini == fin && actual.codigo == ini.codigo) {
            ini = fin = null;
            //Verificamos el nodo inicial
        } else if (actual.codigo == ini.codigo) {
            ini = ini.sig;
        } else {
            Nodo anterior, temporal;
            anterior = ini;
            temporal = ini.sig;

            while (temporal != null && temporal.codigo != actual.codigo) {
                anterior = anterior.sig;
                temporal = temporal.sig;
            }
            if (temporal != null) {
                anterior.sig = temporal.sig;
                if (temporal == fin) {
                    fin = anterior;
                }
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelAP = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelSueldo = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido1 = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextSueldo = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnreestaurar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaRegistro = new javax.swing.JTable();

        setBackground(new java.awt.Color(37, 68, 89));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro");
        setPreferredSize(new java.awt.Dimension(745, 440));
        setRequestFocusEnabled(false);

        jLabelCodigo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setText("Código:");

        jLabelNombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");

        jLabelAP.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelAP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAP.setText("Apellido Paterno:");

        jLabelDNI.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelDNI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDNI.setText("DNI:");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registrar Nuevo Delivery Person");

        jLabelEmail.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email:");

        jLabelSueldo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabelSueldo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSueldo.setText("Sueldo:");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        btnguardar.setBackground(new java.awt.Color(0, 153, 153));
        btnguardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnreestaurar.setBackground(new java.awt.Color(0, 153, 153));
        btnreestaurar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnreestaurar.setForeground(new java.awt.Color(255, 255, 255));
        btnreestaurar.setText("Restaurar");
        btnreestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreestaurarActionPerformed(evt);
            }
        });

        btnconsultar.setBackground(new java.awt.Color(0, 153, 153));
        btnconsultar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar.setText("Consultar");
        btnconsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 153, 153));
        btneliminar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setText("Eliminar");
        btneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtaRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(txtaRegistro);
        txtaRegistro.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnreestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jLabelNombre))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelSueldo)
                            .addComponent(jLabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdni)
                            .addComponent(jTextEmail)
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSueldo)
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnreestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!txtcodigo.getText().equals("")) {
            int cod = Integer.parseInt(txtcodigo.getText());
            String nom = txtnombre.getText().toUpperCase();
            String ape1 = txtapellido1.getText().toUpperCase();
            String dni = txtdni.getText();
            float sueldo = Float.parseFloat(jTextSueldo.getText());
            String email = jTextEmail.getText();
            ini = insertarinicio(ini, cod, nom, ape1, dni, sueldo, email);
            limpiarentradas();
            ver_datos();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        String cod = txtcodigo.getText();
        if(cod.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"Ingrese en codigo por favor");
        }else {
            int codi = Integer.parseInt(cod);
            pFound = buscar(ini,codi);
            if(pFound != null){
                txtnombre.setText(pFound.nombre);
                txtapellido1.setText(pFound.apellido1);
                txtdni.setText(pFound.dni);
                jTextEmail.setText(pFound.email);
                jTextSueldo.setText(String.valueOf(pFound.sueldo));
                habilitar();
            } else {
                JOptionPane.showMessageDialog(this,"El codigo: "+cod+" , no esta en la lista..");
            }
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String cod = txtcodigo.getText();
        if(cod.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"Ingrese en codigo por favor");
        }else {
            eliminar(pFound);
            limpiarentradas();
            ver_datos();
            if (ini == null) {
                JOptionPane.showMessageDialog(this, "La lista esta vacia");
            }
            deshabilitar();
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnreestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreestaurarActionPerformed
        limpiarentradas();
        deshabilitar();
    }//GEN-LAST:event_btnreestaurarActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnreestaurar;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAP;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextSueldo;
    private javax.swing.JTable txtaRegistro;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    
}
