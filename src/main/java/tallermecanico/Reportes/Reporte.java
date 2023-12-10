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
abstract class Reporte {
    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Reporte(String titulo) {
        this.titulo = titulo;
    }
    // Método para generar el reporte general desde la base de datos
    public void generarReporteGeneral(Connection connection) {
        try {
            // Consultas para contar usuarios creados, eliminados, modificados y vehículos
            Statement statement = connection.createStatement();

            // Contar usuarios creados
            ResultSet usuariosCreados = statement.executeQuery("SELECT COUNT(*) FROM Usuarios");
            int totalUsuariosCreados = 0;
            if (usuariosCreados.next()) {
                totalUsuariosCreados = usuariosCreados.getInt(1);
            }

            // Consulta para contar usuarios eliminados
            ResultSet usuariosEliminados = statement.executeQuery("SELECT COUNT(*) FROM Bitacora WHERE accion = 'eliminado'");
            int totalUsuariosEliminados = 0;
            if (usuariosEliminados.next()) {
                totalUsuariosEliminados = usuariosEliminados.getInt(1);
            }

            // Consulta para contar usuarios modificados
            ResultSet usuariosModificados = statement.executeQuery("SELECT COUNT(*) FROM Bitacora WHERE accion = 'modificado'");
            int totalUsuariosModificados = 0;
            if (usuariosModificados.next()) {
                totalUsuariosModificados = usuariosModificados.getInt(1);
            }

            // Consulta para contar vehículos
            ResultSet vehiculos = statement.executeQuery("SELECT COUNT(*) FROM Vehiculos");
            int totalVehiculos = 0;
            if (vehiculos.next()) {
                totalVehiculos = vehiculos.getInt(1);
            }

            // Procesamiento de datos obtenidos
            // Aquí podrías imprimir o almacenar los resultados en un formato de informe
            System.out.println("Reporte General:");
            System.out.println("Usuarios creados: " + totalUsuariosCreados);
            System.out.println("Usuarios eliminados: " + totalUsuariosEliminados);
            System.out.println("Usuarios modificados: " + totalUsuariosModificados);
            System.out.println("Vehículos: " + totalVehiculos);

            // Cerrar statement
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
    
//Recuerda reemplazar "url_de_tu_base_de_datos", "usuario" y "contraseña" con los detalles de tu base de datos real.

    

