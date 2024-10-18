/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class Conexion {
                    
    public Connection conectar;
    public String driver;
    public String bd;
    public String usuario;
    public String password;

 
    public Conexion() {
        conectar = null;
        driver = "com.mysql.cj.jdbc.Driver"; // Updated driver
        bd ="jdbc:mysql://localhost:3306/proyecto_gestion?useSSL=false&serverTimezone=UTC";
        usuario = "root";
        password = "8023";
    }

    public Connection getConnection() {
        try {
            Class.forName(driver); // Load the driver class
            conectar = DriverManager.getConnection(this.bd, this.usuario, this.password);

        } catch (Exception e) {
            System.out.println(e);
        }
        return conectar;
    }
}



