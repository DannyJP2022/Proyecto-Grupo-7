/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

import javax.swing.JOptionPane;

/**
 *
 * @author Danny Jimenez
 */
public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
        } else {
            JOptionPane.showMessageDialog(null, "El precio no puede ser negativo");
        }
    }

    public void restarInventario(int cantidad) {
        if (this.cantidad >= cantidad && cantidad > 0) {
            this.cantidad -= cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "Inventario insuficiente");
        }
    }

    public void aumentarInventario(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        } else {
            JOptionPane.showMessageDialog(null, "Cantidad no válida para aumentar el inventario");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
