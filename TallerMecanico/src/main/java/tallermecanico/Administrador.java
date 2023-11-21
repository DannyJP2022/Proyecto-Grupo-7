
package tallermecanico;

import java.util.List;


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

    public Administrador(String inventario, int id, String nombre, String apellido, String username, String password) {
        super(id, nombre, apellido, username, password);
        this.inventario = inventario;
    }
   

    public void agregarProducto(producto producto, int cantidad) {
        // Verificar si el producto ya existe en el inventario
    
    }

}
