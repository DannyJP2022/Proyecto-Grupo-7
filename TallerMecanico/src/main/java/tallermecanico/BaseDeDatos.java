
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
