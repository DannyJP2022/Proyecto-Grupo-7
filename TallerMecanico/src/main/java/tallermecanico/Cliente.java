/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author Danny Jimenez
 */
public class Cliente extends Usuario {
    private String telefono;
    private String direccion;
    private TipoUsuario tipo;

    public Cliente(String telefono, String direccion, TipoUsuario tipo, String nombre, String apellido, String username, String password) {
        super(nombre, apellido, username, password);
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    

    // Resto del código igual...

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public void interfazCliente() {
        InterfazCliente.configurarInterfazCliente();
    }

    @Override
    public boolean autenticar(String username, String password) {
        // Lógica de autenticación mejorada considerando el tipo de usuario
        
        return this.getUsername().equals(username) && this.getPassword().equals(password) && this.tipo == TipoUsuario.CLIENTE;
    }
}
