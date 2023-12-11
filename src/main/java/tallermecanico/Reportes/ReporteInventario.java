/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico.Reportes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Danny Jimenez
 */
public class ReporteInventario extends Reporte {

    private final int cantidadProductos;

    public ReporteInventario(String titulo, int cantidadProductos) {
        super(titulo);
        this.cantidadProductos = cantidadProductos;
    }

    
    // Método para generar el reporte de inventario desde la base de datos
    public void generarReporteInventario(Connection connection) {
        try {
            // Consultas para obtener información del inventario
            Statement statement = connection.createStatement();

            // Consulta para obtener lista de piezas
            ResultSet piezasResult = statement.executeQuery("SELECT Nombre, Descripcion, NumeroPartes, CantidadDisponible FROM Piezas");
            System.out.println("Lista de piezas:");
            while (piezasResult.next()) {
                String nombre = piezasResult.getString("Nombre");
                String descripcion = piezasResult.getString("Descripcion");
                int numeroPartes = piezasResult.getInt("NumeroPartes");
                int cantidadDisponible = piezasResult.getInt("CantidadDisponible");
                System.out.println("- Nombre: " + nombre + ", Descripción: " + descripcion + ", Número de partes: " + numeroPartes + ", Cantidad disponible: " + cantidadDisponible);
            }

            // Consulta para obtener consumibles
            ResultSet consumiblesResult = statement.executeQuery("SELECT Nombre, CantidadDisponible FROM Consumibles");
            System.out.println("\nConsumibles:");
            while (consumiblesResult.next()) {
                String nombre = consumiblesResult.getString("Nombre");
                int cantidadDisponible = consumiblesResult.getInt("CantidadDisponible");
                System.out.println("- " + nombre + ": Cantidad disponible: " + cantidadDisponible);
            }

            // Consulta para obtener neumáticos y repuestos
            ResultSet neumaticosResult = statement.executeQuery("SELECT Tipo, CantidadDisponible FROM Neumaticos");
            System.out.println("\nNeumáticos y repuestos:");
            while (neumaticosResult.next()) {
                String tipo = neumaticosResult.getString("Tipo");
                int cantidadDisponible = neumaticosResult.getInt("CantidadDisponible");
                System.out.println("- Tipo: " + tipo + ", Cantidad disponible: " + cantidadDisponible);
            }

            // Cerrar statement
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Recuerda reemplazar "url_de_tu_base_de_datos", "usuario" y "contraseña" con los detalles de tu base de datos real.

    // Getter para el título
    @Override
    public String getTitulo() {
        return titulo; // No es necesario usar "super" aquí
    }
}
