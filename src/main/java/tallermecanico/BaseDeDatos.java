package tallermecanico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDeDatos {

    public Connection conexion;

    public Connection conexionUsuarioDB()  {
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto", "root", "dannyJP_2021");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con suscomputadoras*/
        //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","24457285");  /*Conecxion con suscomputadoras*/
        return conexion;
    }

    public void verAdministradores() throws SQLException {
        Statement cursor = conexion.createStatement();
        ResultSet resultado = cursor.executeQuery("Select * From LogInInfo");

        while (resultado.next()) {
            System.out.println(resultado.getString("username"));
            System.out.println(resultado.getString("password"));
        }
    }

    public void GuardarUsuario(String nombre, String apellido, String username, String password) {
        Statement cursor;
        try {
            cursor = conexion.createStatement();
            cursor.execute("insert into LogInInfo (nombre, apellido, username, password, tipo ) values('"+ nombre + "','" + apellido + "','" + username + "','" + password +"','Usuario')");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        public boolean ValidadUsuario (String username, String password) {
        Statement cursor;
        try {
            cursor = conexion.createStatement();
            int contador = 0;
            ResultSet result = cursor.executeQuery("select * from LogInInfo where username = '"+ username + "'and password = '"+ password + "'");
            while (result.next()){
                contador++;
            } 
            return contador > 0;
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        return false;
        } 
         
    }
    // Pendiente!!  crear metodos de actualizar, eliminar, mostrar, crear(CRUD) de empleados(elimnar a los demas pero a el mismo no) y vehiculos 

