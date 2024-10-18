
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class productosBase {
   
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

     public void registrar(String codigo, String nombre, int cantidad) {
        try {
        // Obtener conexión
        conexion = cn.getConnection();
        
        String sql = "INSERT INTO productos (codigo, nombreProducto,cantidad) VALUES (?, ?, ?)";
        
        // Preparar declaración
        PreparedStatement ps = conexion.prepareStatement(sql);
        
        ps.setString(1,codigo);
        ps.setString(2, nombre);
        ps.setInt(3,cantidad);
 
        ps.executeUpdate();
        
        // Mensaje de éxito
        JOptionPane.showMessageDialog(null, "Registro Exitoso");
        
    
    } catch (Exception ex) {
        // Mostrar mensaje de error
        System.out.println(ex.toString());
    }
   }
}
    

