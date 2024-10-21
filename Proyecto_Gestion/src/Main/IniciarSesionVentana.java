package Main;

import Objetos.Usuarios;
import Conexion.Login;
import java.io.File;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class IniciarSesionVentana extends javax.swing.JFrame {

    Usuarios lg = new Usuarios();
    Login login = new Login();
    
    private ImageIcon imagen;
    private Icon icono;

    private void pintarImagen(JLabel lb1, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), java.awt.Image.SCALE_DEFAULT));
        lb1.setIcon(this.icono);
        this.repaint();
    }

    public IniciarSesionVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.logooo, "src/imagenes/logopersonaaa.png");
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void validar() {
        String correo = txtCorreo.getText();
        String password = String.valueOf(txtPassword.getPassword());

        if (!"".equals(correo) || !"".equals(password)) {
            lg = login.log(correo, password);{
            if(lg.getCorreo()!=null && lg.getPassword()!=null){
                    
            Principal newframe = new Principal();      
            newframe.setVisible(true); 
            this.dispose();
            }
            else{
                  JOptionPane.showMessageDialog(null, "Credenciales Invalidas");
            }
        }
        }
    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCorreo = new javax.swing.JTextField();
        RegistroTitulo1 = new javax.swing.JLabel();
        RegistroTitulo2 = new javax.swing.JLabel();
        RegistroTitulo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        IngresarSesion = new javax.swing.JToggleButton();
        crearcuenta = new javax.swing.JToggleButton();
        logooo = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 23, 62));

        RegistroTitulo1.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo1.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegistroTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo1.setText("Correo Electronico:");

        RegistroTitulo2.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo2.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        RegistroTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo2.setText("Contraseña:");

        RegistroTitulo.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        RegistroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo.setText("INICIO DE SESIÓN ");

        IngresarSesion.setBackground(new java.awt.Color(244, 72, 33));
        IngresarSesion.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        IngresarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IngresarSesion.setText("Ingresar");
        IngresarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarSesionActionPerformed(evt);
            }
        });

        crearcuenta.setBackground(new java.awt.Color(14, 23, 62));
        crearcuenta.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        crearcuenta.setForeground(new java.awt.Color(244, 72, 33));
        crearcuenta.setText("Crear cuenta");
        crearcuenta.setBorder(null);
        crearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearcuentaActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(244, 72, 33));
        jToggleButton1.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Atras");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegistroTitulo1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RegistroTitulo2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(47, 47, 47))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(logooo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RegistroTitulo))
                            .addGap(85, 85, 85)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(crearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(RegistroTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logooo, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegistroTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(RegistroTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(IngresarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(crearcuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-----------------------------------------------------------------------------------------------
    //VINCULACION DE BOTON CREAR CUENTA CON OTRA VENTANA
    private void crearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearcuentaActionPerformed
        RegistroVentana newframe = new RegistroVentana();

        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_crearcuentaActionPerformed

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    //-------------------------------------------------------------------------------------------------
    //VINCULACION DE BOTON ATRAS CON OTRA VENTANA
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        AppLogin newframe = new AppLogin();

        newframe.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jToggleButton1ActionPerformed
//-------------------------------------------------------------------------------------------------------------------
    //MENSAJES AL INICIAR SESION 

    private void IngresarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarSesionActionPerformed
validar();

    }//GEN-LAST:event_IngresarSesionActionPerformed

    //-----------------------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(IniciarSesionVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //VISUALIZACION DE VENTANA 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesionVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton IngresarSesion;
    private javax.swing.JLabel RegistroTitulo;
    private javax.swing.JLabel RegistroTitulo1;
    private javax.swing.JLabel RegistroTitulo2;
    private javax.swing.JToggleButton crearcuenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel logooo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
