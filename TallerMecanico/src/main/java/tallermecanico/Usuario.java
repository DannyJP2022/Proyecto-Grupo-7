
package tallermecanico;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD:TallerMecanico/src/main/java/tallermecanico/Usuario.java
/**
 *
 * @author Danny Jimenez
 */
public class Usuario {
=======

public class usuario {
>>>>>>> 10c01c4b23c6e557abca58212ce15420abdcee82:TallerMecanico/src/main/java/tallermecanico/usuario.java

     private int id;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String tipo;

<<<<<<< HEAD:TallerMecanico/src/main/java/tallermecanico/Usuario.java
    public Usuario(String nombre, String apellido, String username, String password) {
=======
    public usuario(int id, String nombre, String apellido, String username, String password, String tipo) {
        this.id = id;
>>>>>>> 10c01c4b23c6e557abca58212ce15420abdcee82:TallerMecanico/src/main/java/tallermecanico/usuario.java
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.tipo = tipo;
    }


    
    

    public boolean autenticar(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD:TallerMecanico/src/main/java/tallermecanico/Usuario.java
    public static List<Usuario> getUsuarios() {
=======
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public static List<usuario> getUsuarios() {
>>>>>>> 10c01c4b23c6e557abca58212ce15420abdcee82:TallerMecanico/src/main/java/tallermecanico/usuario.java
        return usuarios;
    }

    public static void setUsuarios(List<Usuario> usuarios) {
        Usuario.usuarios = usuarios;
    }

    public static List<Usuario> usuarios = new ArrayList();

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", username=" + username + ", password=" + password + '}';
    }

    

}
