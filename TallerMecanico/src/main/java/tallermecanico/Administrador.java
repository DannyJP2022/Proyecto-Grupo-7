
package tallermecanico;

import java.util.ArrayList;
import java.util.List;



public class Administrador extends Usuario {
    private TipoUsuario tipo;

    public Administrador(String username, String password) {
        super();
        this.tipo = TipoUsuario.ADMINISTRADOR;
    }

    @Override
    public boolean autenticar(String username, String password) {
        if (this.getUsername().equals(username) && this.getPassword().equals(password) && this.tipo == TipoUsuario.ADMINISTRADOR) {
            return true;
        }
        return false;
    }
    private boolean tienePermisosEspeciales;

    public void agregarProducto(Producto producto, int cantidad) {
        // agregar un producto al inventario
        // Verificar si el producto ya existe en el inventario, actualizar cantidad, etc.
    }

    public void asignarPermisos(Usuario usuario, boolean permisos) {
        // asignar o revocar permisos a un Usuario
        // Por ejemplo, dar acceso de administrador a un Usuario o restringir ciertas funciones
    }

    public void generarInforme(String tipoInforme) {
        // Lógica para generar distintos tipos de informes (Ingresos mensuales, rendimiento de empleados, etc.)
    }

  
    public void agregarUsuario(Usuario usuario) {

    }

    public void eliminarUsuario(Usuario usuario) {

    }

    public void modificarUsuario(Usuario usuario) {
    }


    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public boolean isTienePermisosEspeciales() {
        return tienePermisosEspeciales;
    }

    public void setTienePermisosEspeciales(boolean tienePermisosEspeciales) {
        this.tienePermisosEspeciales = tienePermisosEspeciales;
    }

    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Usuario> usuarios) {
        Usuario.usuarios = usuarios;
    }


    public static List<Administrador> administrador = new ArrayList();

    public static List<Administrador> getAdministrador() {
        return administrador;
    }

    public static void setAdministrador(List<Administrador> administrador) {
        Administrador.administrador = administrador;
    }

    public Administrador(String inventario, int id, String nombre, String apellido, String username, String password, String tipo) {
        super(id, nombre, apellido, username, password, tipo);
    }
}
