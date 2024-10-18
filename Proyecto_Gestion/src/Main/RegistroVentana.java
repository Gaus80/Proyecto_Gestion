package Main;

import Conexion.Conexion;
import java.io.File;
import java.util.Formatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;

public class RegistroVentana extends javax.swing.JFrame {
    
    private ImageIcon imagen;
    private Icon icono;
    
    Conexion cn = new Conexion();
    Connection conexion = cn.getConnection();
    
    private void pintarImagen(JLabel lb1, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), java.awt.Image.SCALE_DEFAULT));
        lb1.setIcon(this.icono);
        this.repaint();
    }
    
 
    public RegistroVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.logod, "src/imagenes/aplicacionlogo.png");
        this.pintarImagen(this.logonombre, "src/imagenes/logopers.png");
        this.pintarImagen(this.logoemail, "src/imagenes/logoemail.png");
        this.pintarImagen(this.logotelefono, "src/imagenes/logotelefono.png");
        this.pintarImagen(this.logocandado, "src/imagenes/logocandado.png");
        //------------------------------------------------------------------------------------------------------------------------------------------------------------   
    }
    
    private void crear() {
    try {
        // Obtener conexión
        conexion = cn.getConnection();
        
        // Consulta SQL correcta sin incluir el campo AUTO_INCREMENT
        String sql = "INSERT INTO usuarios (id, nombre, correo, telefono, pass) VALUES (?,?, ?, ?, ?)";
        
        // Preparar declaración
        PreparedStatement ps = conexion.prepareStatement(sql);
        
        ps.setString(1, "0");
        ps.setString(2, txtName.getText().trim());
        ps.setString(3, txtEmail.getText().trim());
        ps.setString(4, txtPhone.getText().trim());
        ps.setString(5, new String(txtPass.getPassword()).trim()); // Convertir char[] a String
        
        // Ejecutar actualización
        ps.executeUpdate();
        
        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        
        // Limpiar campos
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtPass.setText("");
        
    } catch (Exception ex) {
        // Mostrar mensaje de error
        System.out.println(ex.toString());
    }
}

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        EnviarRegistro = new javax.swing.JButton();
        RegistroTitulo = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        RegistroTitulo1 = new javax.swing.JLabel();
        RegistroTitulo2 = new javax.swing.JLabel();
        RegistroTitulo3 = new javax.swing.JLabel();
        RegistroTitulo4 = new javax.swing.JLabel();
        logod = new javax.swing.JLabel();
        logonombre = new javax.swing.JLabel();
        logoemail = new javax.swing.JLabel();
        logotelefono = new javax.swing.JLabel();
        logocandado = new javax.swing.JLabel();
        atras = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(17, 21, 66));

        txtName.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        EnviarRegistro.setBackground(new java.awt.Color(244, 72, 33));
        EnviarRegistro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        EnviarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        EnviarRegistro.setText("Enviar");
        EnviarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarRegistroActionPerformed(evt);
            }
        });

        RegistroTitulo.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        RegistroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo.setText("REGISTRO");

        RegistroTitulo1.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo1.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegistroTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo1.setText("Nombre Completo:");

        RegistroTitulo2.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo2.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegistroTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo2.setText("Correo Electronico:");

        RegistroTitulo3.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo3.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegistroTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo3.setText("Numero de Celular:");

        RegistroTitulo4.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegistroTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo4.setText("Contraseña:");

        atras.setBackground(new java.awt.Color(244, 72, 33));
        atras.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(255, 255, 255));
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(logoemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegistroTitulo2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(EnviarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistroTitulo1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logocandado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logotelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegistroTitulo3)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistroTitulo4)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logod, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegistroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(logod, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistroTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegistroTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegistroTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegistroTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RegistroTitulo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logocandado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EnviarRegistro)
                .addGap(29, 29, 29)
                .addComponent(atras)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    //------------------------------------------------------------------------------------------------------------------------
    //AL MOMENTO DE REGISTRARSE, CUMPLE CON LA FUNCION DE LIMPIARSE LAS CASILLAS

    private void EnviarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarRegistroActionPerformed
        crear();

    }//GEN-LAST:event_EnviarRegistroActionPerformed

    //------------------------------------------------------------------------------------------------------------------------
    //VINCULACION DE BOTON ATRAS CON OTRA VENTANA

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        
        AppLogin newframe = new AppLogin();
        
        newframe.setVisible(true);
        
        this.dispose();

    }//GEN-LAST:event_atrasActionPerformed

    //------------------------------------------------------------------------------------------------------------------------
    //PARA QUE AL EJECUTAR LA PANTALLA APAREZCA
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
            java.util.logging.Logger.getLogger(RegistroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarRegistro;
    private javax.swing.JLabel RegistroTitulo;
    private javax.swing.JLabel RegistroTitulo1;
    private javax.swing.JLabel RegistroTitulo2;
    private javax.swing.JLabel RegistroTitulo3;
    private javax.swing.JLabel RegistroTitulo4;
    private javax.swing.JToggleButton atras;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logocandado;
    private javax.swing.JLabel logod;
    private javax.swing.JLabel logoemail;
    private javax.swing.JLabel logonombre;
    private javax.swing.JLabel logotelefono;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
