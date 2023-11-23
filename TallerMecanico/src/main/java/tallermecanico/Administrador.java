/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danny Jimenez
 */
public class Administrador extends Usuario {

    private String inventario;
    private TipoUsuario tipo;

    public Administrador(String inventario, String nombre, String apellido, String username, String password) {
        super(nombre, apellido, username, password);
        this.inventario = inventario;
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
        // Lógica para agregar un producto al inventario
        // Verificar si el producto ya existe en el inventario, actualizar cantidad, etc.
    }

    public void asignarPermisos(Usuario usuario, boolean permisos) {
        // Lógica para asignar o revocar permisos a un Usuario
        // Por ejemplo, dar acceso de administrador a un Usuario o restringir ciertas funciones
    }

    public void generarInforme(String tipoInforme) {
        // Lógica para generar distintos tipos de informes (Ingresos mensuales, rendimiento de empleados, etc.)
    }

    // Métodos para la gestión de usuarios
    public void agregarUsuario(Usuario usuario) {
        // Lógica para agregar un nuevo Usuario al sistema
    }

    public void eliminarUsuario(Usuario usuario) {
        // Lógica para eliminar un Usuario del sistema
    }

    public void modificarUsuario(Usuario usuario) {
        // Lógica para modificar los detalles de un Usuario existente
    }

    // Otros métodos relacionados con la gestión del taller, empleados, clientes, etc.
    // ...
    public String getInventario() {
        return inventario;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public TipoUsuario getTipo() {
        return tipo;
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
}
