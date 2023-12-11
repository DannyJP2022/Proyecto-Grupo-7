/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico.Reportes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tallermecanico.Reportes.Reporte;

/**
 *
 * @author Danny Jimenez
 */
class reporteVentas extends Reporte {
    private final venta[] ventas;

    public reporteVentas(String titulo, venta[] ventas) {
        super(titulo);
        this.ventas = ventas;
    }

    // Método para generar el reporte de ventas desde la base de datos
    public void generarReporteVentas(Connection connection) {
        try {
            // Consulta para obtener ingresos totales por ventas
            Statement statement = connection.createStatement();
            ResultSet ingresosTotalesResult = statement.executeQuery("SELECT SUM(Monto) AS IngresosTotales FROM Ventas");
            double ingresosTotales = 0;
            if (ingresosTotalesResult.next()) {
                ingresosTotales = ingresosTotalesResult.getDouble("IngresosTotales");
            }

            // Consulta para obtener desglose de ingresos por tipo de servicio
            ResultSet ingresosPorServicioResult = statement.executeQuery("SELECT TipoServicio, SUM(Monto) AS IngresosPorServicio FROM Ventas GROUP BY TipoServicio");
            System.out.println("Desglose de ingresos por tipo de servicio:");
            while (ingresosPorServicioResult.next()) {
                String tipoServicio = ingresosPorServicioResult.getString("TipoServicio");
                double ingresosPorServicio = ingresosPorServicioResult.getDouble("IngresosPorServicio");
                System.out.println("- " + tipoServicio + ": " + ingresosPorServicio);
            }

            // Consulta para obtener ventas de piezas y repuestos
            ResultSet ventasPiezasRepuestosResult = statement.executeQuery("SELECT Nombre, Cantidad, Monto FROM VentasPiezasRepuestos");
            System.out.println("\nVentas de piezas y repuestos:");
            while (ventasPiezasRepuestosResult.next()) {
                String nombre = ventasPiezasRepuestosResult.getString("Nombre");
                int cantidad = ventasPiezasRepuestosResult.getInt("Cantidad");
                double monto = ventasPiezasRepuestosResult.getDouble("Monto");
                System.out.println("- " + nombre + ": Cantidad vendida: " + cantidad + ", Monto: " + monto);
            }

            // Consulta para obtener el número de clientes atendidos
            ResultSet clientesAtendidosResult = statement.executeQuery("SELECT COUNT(DISTINCT ClienteID) AS NumClientes FROM Ventas");
            int numClientes = 0;
            if (clientesAtendidosResult.next()) {
                numClientes = clientesAtendidosResult.getInt("NumClientes");
            }
            
            // Procesamiento de los resultados (puedes imprimir o almacenar en un reporte)
            System.out.println("\nResumen general de ventas:");
            System.out.println("Ingresos totales: " + ingresosTotales);
            System.out.println("Número de clientes atendidos: " + numClientes);

            // Cerrar statement
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Getter para el título
    @Override
    public String getTitulo() {
        return titulo; // No es necesario usar "super" aquí
    }
}
//Recuerda reemplazar "url_de_tu_base_de_datos", "usuario" y "contraseña" con los detalles de tu base de datos real.