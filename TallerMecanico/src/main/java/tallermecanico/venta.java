/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author Danny Jimenez
 */
public class venta {
    private int id;
    private String producto;
    private double monto;

    public venta(int id, String producto, double monto) {
        this.id = id;
        this.producto = producto;
        this.monto = monto;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public double getMonto() {
        return monto;
    }
}
