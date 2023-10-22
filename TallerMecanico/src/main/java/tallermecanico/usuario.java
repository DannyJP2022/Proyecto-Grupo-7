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
public class usuario {

    private String nombre;
    private String apellido;
    private String username;
    private String password;

    public usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
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

    public static List<usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<usuario> usuarios) {
        usuario.usuarios = usuarios;
    }

    public static List<usuario> usuarios = new ArrayList();

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

}
