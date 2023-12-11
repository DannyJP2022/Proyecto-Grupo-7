/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quesa
 */
public class Usuario {
     private int id;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String tipo;

    public Usuario() {
    }           

    public Usuario(int id, String nombre, String apellido, String username, String password, String tipo) {
        this.id = id;
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

    
    
    public static List<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(List<Usuario> usuarios) {
        Usuario.usuarios = usuarios;
    }

    public static List<Usuario> usuarios = new ArrayList();

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
