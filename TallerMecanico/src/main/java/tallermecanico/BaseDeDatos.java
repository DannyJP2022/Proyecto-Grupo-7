/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {
    
     public Connection conexionUsuarioDB() throws ClassNotFoundException, SQLException{
        Connection conexion = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con computadora de Jan*/
        //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con suscomputadoras*/
        //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con suscomputadoras*/
        return conexion;
    }
}
