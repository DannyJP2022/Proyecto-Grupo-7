
package tallermecanico;


public class TallerMecanico {
    
    public static void main(String[] args) {
// new PaginaPrincipal().setVisible(true); es lo mismo que lo de abajo
PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
paginaPrincipal.setVisible(true);
        venta[] ventas = {
            new venta(1, "Producto A", 100.0),
            new venta(2, "Producto B", 75.5),
            new venta(3, "Producto C", 50.0)
        };

//esta dando error por eso lo comento -----> reporteVentas reporteVentas = new reporteVentas("Reporte de Ventas Mensual", ventas);
        ReporteInventario reporteInventario = new ReporteInventario("Inventario Actual", 100);

//esta dando error por eso lo comento -----> reporteVentas.generarReporte();
        System.out.println();
        reporteInventario.generarReporte();
    }
    }

