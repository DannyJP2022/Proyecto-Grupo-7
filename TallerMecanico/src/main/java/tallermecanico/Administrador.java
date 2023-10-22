/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

import java.util.List;

/**
 *
 * @author Danny Jimenez
 */
public class Administrador extends usuario {
    private String inventario;

    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public static List<usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<usuario> usuarios) {
        usuario.usuarios = usuarios;
    }

    public Administrador(String inventario, String nombre, String apellido, String username, String password) {
        super(nombre, apellido, username, password);
        this.inventario = inventario;
    }

    public void agregarProducto(producto producto, int cantidad) {
        // Verificar si el producto ya existe en el inventario
    
    }

}
