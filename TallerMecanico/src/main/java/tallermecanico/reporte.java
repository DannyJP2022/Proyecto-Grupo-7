/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author Danny Jimenez
 */
abstract class Reporte {
    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Reporte(String titulo) {
        this.titulo = titulo;
    }

    public abstract void generarReporte();
}
