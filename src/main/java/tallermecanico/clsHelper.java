/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

import java.awt.TextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author sjbla
 */
public class clsHelper {
    public int recibeInt(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    } 
    public float recibeFloat(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    } 
    public char recibeChar(String mensaje){
        return JOptionPane.showInputDialog(mensaje).toUpperCase().charAt(0);
    } 
    public String recibeString(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    } 
    public void imprimeMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    } 
    public void imprimeMensaje(TextArea mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    } 
}
