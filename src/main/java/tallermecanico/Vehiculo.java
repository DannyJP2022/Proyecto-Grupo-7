/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author Danny Jimenez
 */
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private String placa;
    private List<Mantenimiento> historialMantenimiento;

    public Vehiculo(String marca, String modelo, int año, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.historialMantenimiento = new ArrayList<>();
    }

    public void programarMantenimiento(String detalles, String fecha) {
    // Lógica para programar un mantenimiento para el vehículo
    Mantenimiento nuevoMantenimiento = new Mantenimiento(detalles, fecha);
    historialMantenimiento.add(nuevoMantenimiento);
}

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Mantenimiento> getHistorialMantenimiento() {
        return historialMantenimiento;
    }

    public void setHistorialMantenimiento(List<Mantenimiento> historialMantenimiento) {
        this.historialMantenimiento = historialMantenimiento;
    }
    
    private class Mantenimiento {
        private String detalles;
        private String fecha;

        public Mantenimiento(String detalles, String fecha) {
            this.detalles = detalles;
            this.fecha = fecha;
        }


        public String getDetalles() {
            return detalles;
        }

        public void setDetalles(String detalles) {
            this.detalles = detalles;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
    }
}
