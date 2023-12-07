
package tallermecanico;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {
    public Connection conexion; 
     public Connection conexionUsuarioDB() throws ClassNotFoundException, SQLException{
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto","root","dannyJP_2021");
        //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con suscomputadoras*/
        //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con suscomputadoras*/
        return conexion;
    }
     
     public void verAdministradores() throws SQLException{
         Statement cursor = conexion.createStatement();
         ResultSet resultado = cursor.executeQuery("Select * From LogInInfo");
         
         while (resultado.next()){
             System.out.println(resultado.getString("username"));
             System.out.println(resultado.getString("password"));
         }
     }
     // Pendiente!!  crear metodos de actualizar, eliminar, mostrar, crear(CRUD) de empleados(elimnar a los demas pero a el mismo no) y vehiculos 
}
