/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Main;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class AppLogin extends javax.swing.JFrame {

//-----------------------------------------------------------------------------------------------------------------------------------------------------    
    
//CLASE PARA IMAGENES    
    
    private ImageIcon  imagen;
    private Icon icono;
    
    private void pintarImagen(JLabel lb1, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_DEFAULT));
        lb1.setIcon(this.icono);
        this.repaint();
    }
  
//IMPORTACIÓN DE IMAGEN A VENTANA
    public AppLogin() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.pintarImagen(this.logo, "src/imagenes/aplicacionlogo.png");  
    
    
    }
   //------------------------------------------------------------------------------------------------------------------------------------------------------     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        CrearCuenta = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        RegistroTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 23, 62));

        CrearCuenta.setBackground(new java.awt.Color(244, 72, 33));
        CrearCuenta.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        CrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        CrearCuenta.setText("Crear Cuenta");
        CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaActionPerformed(evt);
            }
        });

        IniciarSesion.setBackground(new java.awt.Color(244, 72, 33));
        IniciarSesion.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setText("Iniciar Sesión");
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        logo.setAlignmentY(0.0F);

        RegistroTitulo.setBackground(new java.awt.Color(0, 204, 204));
        RegistroTitulo.setFont(new java.awt.Font("Maiandra GD", 1, 28)); // NOI18N
        RegistroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        RegistroTitulo.setText("¡BIENVENIDOS!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistroTitulo))))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(RegistroTitulo)
                .addGap(18, 18, 18)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //-----------------------------------------------------------------------------------------------
    private void CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaActionPerformed
        
    //VINCULACION DE BOTON CREAR CUENTA CON VENTANA SIGUIENTE   
        RegistroVentana newframe = new RegistroVentana();
        
        newframe.setVisible(true);
        
        this.dispose();
        
        
    }//GEN-LAST:event_CrearCuentaActionPerformed
    
    //-----------------------------------------------------------------------------------------------
    
    
    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
     
    //VINCULACION DE BOTON INICIAR SESIÓN CON VENTANA SIGUIENTE
        IniciarSesionVentana newframe = new IniciarSesionVentana();
        
        newframe.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_IniciarSesionActionPerformed

    //-----------------------------------------------------------------------------------------------
    
    //VISUALIZACION DE VENTANA 
    public static void main(String args[]) {
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppLogin().setVisible(true);
            }
        });
    }

    //-----------------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearCuenta;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JLabel RegistroTitulo;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables



}
