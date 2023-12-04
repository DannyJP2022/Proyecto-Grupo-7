
package tallermecanico;

import java.util.List;


public class Administrador extends Usuario {
    private String inventario;

    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Usuario> usuarios) {
        Usuario.usuarios = usuarios;
    }

    public Administrador(String inventario, int id, String nombre, String apellido, String username, String password, String tipo) {
        super(id, nombre, apellido, username, password, tipo);
        this.inventario = inventario;
    }

   
   

    public void agregarProducto(producto producto, int cantidad) {
        // Verificar si el producto ya existe en el inventario
    
    }

}
