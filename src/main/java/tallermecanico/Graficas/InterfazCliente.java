/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico.Graficas;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Danny Jimenez
 */
public class InterfazCliente {
    // Método para configurar la interfaz específica del cliente
    public static void configurarInterfazCliente() {
        // Lógica para configurar la interfaz específica del cliente utilizando Swing
        JFrame frame = new JFrame("Interfaz Cliente");
        frame.setSize(400, 300);
        // Agregar componentes, botones, campos de texto, etc. específicos para clientes
        JLabel label = new JLabel("Bienvenido, cliente");
        frame.add(label);
        // Mostrar la interfaz
        frame.setVisible(true);
    }
}
