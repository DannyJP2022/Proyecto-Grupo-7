
package tallermecanico;

import java.util.List;


public class cliente extends usuario {

    private String telefono;
    private String direccion;

    public cliente(String telefono, String direccion, int id, String nombre, String apellido, String username, String password) {
        super(id, nombre, apellido, username, password);
        this.telefono = telefono;
        this.direccion = direccion;
    }
  
    public void realizarCompra(producto producto, int cantidad) {

    }

    public void solicitarCitaMantenimiento(vehiculo vehiculo, String descripcion) {

        // implementar la lógica para registrar una cita de mantenimiento
    // almacenar detalles como la fecha, hora, descripción, etc., en una estructura de datos adecuada.
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public static List<usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<usuario> usuarios) {
        usuario.usuarios = usuarios;
    }
}
