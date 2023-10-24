/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author Danny Jimenez
 */
public class TallerMecanico {
    
    public static void main(String[] args) {
        new menu().setVisible(true);
        venta[] ventas = {
            new venta(1, "Producto A", 100.0),
            new venta(2, "Producto B", 75.5),
            new venta(3, "Producto C", 50.0)
        };

        reporteVentas reporteVentas = new reporteVentas("Reporte de Ventas Mensual", ventas);
        ReporteInventario reporteInventario = new ReporteInventario("Inventario Actual", 100);

        reporteVentas.generarReporte();
        System.out.println();
        reporteInventario.generarReporte();
    }
    }

