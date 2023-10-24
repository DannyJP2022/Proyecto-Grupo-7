/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author Danny Jimenez
 */
class ReporteInventario extends Reporte {
    private int cantidadProductos;

    public ReporteInventario(String titulo, int cantidadProductos) {
        super(titulo);
        this.cantidadProductos = cantidadProductos;
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte de Inventario: " + getTitulo());
        System.out.println("Cantidad de Productos: " + cantidadProductos);
    }

    // Getter para el título
    public String getTitulo() {
        return titulo; // No es necesario usar "super" aquí
    }
}
