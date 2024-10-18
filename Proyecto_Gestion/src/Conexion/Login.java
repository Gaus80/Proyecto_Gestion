package Conexion;

import Objetos.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    
    Connection conexion;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public Usuarios log(String correo, String pass) {
        Usuarios login = new Usuarios();
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND pass = ?";
        
        try {
            
            conexion = cn.getConnection();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                login.setId(rs.getInt("id"));
                login.setNombre(rs.getString("nombre"));
                login.setCorreo(rs.getString("correo"));
                login.setTelefono(rs.getString("telefono"));
                login.setPassword(rs.getString("pass"));
                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            
        }
        return login;
    }
}
