/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

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

    @Override
    public void generarReporte() {
        System.out.println("Reporte de Ventas: " + getTitulo());
        System.out.println("ID\tProducto\tMonto");

        for (venta venta : ventas) {
            System.out.println(venta.getId() + "\t" + venta.getProducto() + "\t" + venta.getMonto());
        }
    }

    // Getter para el título
    @Override
    public String getTitulo() {
        return titulo; // No es necesario usar "super" aquí
    }
}
