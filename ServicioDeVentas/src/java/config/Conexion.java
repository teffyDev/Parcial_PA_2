/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;
    String url = "jdbc:mysql://localhost :7636/bd_ventas";
    String user = "root";
    String pass = "";

    public Connection Conexion() {
        try {
            Class.forName("con.mysql.jdbc.Driver");
            con = DriverManager. getConnection (url, user, pass);
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println("error en la conexion con la base de datos " + e.getMessage());
        }
        return con;
    }
}
