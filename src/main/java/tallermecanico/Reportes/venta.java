/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico.Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Danny Jimenez
 */
public class venta {
    private int id;
    private String producto;
    private double monto;

    public venta(int id, String producto, double monto) {
        this.id = id;
        this.producto = producto;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Map<String, Double> getCatalogoRepuestos() {
        return catalogoRepuestos;
    }

    public void setCatalogoRepuestos(Map<String, Double> catalogoRepuestos) {
        this.catalogoRepuestos = catalogoRepuestos;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    private Map<String, Double> catalogoRepuestos;
    private Connection connection;

    public venta() {
        catalogoRepuestos = new HashMap<>();
        catalogoRepuestos.put("Filtro de aceite", 15.0);
        catalogoRepuestos.put("Pastillas de freno", 30.0);
        catalogoRepuestos.put("Batería", 50.0);

        // Establecer la conexión a la base de datos (ajusta las credenciales y la URL según tu configuración)
        String url = "jdbc:mysql://localhost:3306/taller_mecanico";
        String usuario = "tu_usuario";
        String contraseña = "tu_contraseña";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void realizarVenta(String repuesto, int cantidad) {
        if (catalogoRepuestos.containsKey(repuesto)) {
            double precioUnitario = catalogoRepuestos.get(repuesto);
            double total = calcularTotal(precioUnitario, cantidad);
            generarFactura(repuesto, cantidad, total);

            // Almacenar la venta en la base de datos
            almacenarVentaEnBD(repuesto, cantidad, precioUnitario, total);
        } else {
            System.out.println("El repuesto '" + repuesto + "' no está disponible en el catálogo.");
        }
    }

    private double calcularTotal(double precioUnitario, int cantidad) {
        return precioUnitario * cantidad;
    }

    private void generarFactura(String repuesto, int cantidad, double total) {
        System.out.println("Factura de Venta");
        System.out.println("Repuesto: " + repuesto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + catalogoRepuestos.get(repuesto));
        System.out.println("Total: " + total);
    }

    private void almacenarVentaEnBD(String repuesto, int cantidad, double precioUnitario, double total) {
        try {
            // Preparar la consulta SQL para insertar la venta en la base de datos
            String sql = "INSERT INTO ventas (repuesto, cantidad, precio_unitario, total) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, repuesto);
            preparedStatement.setInt(2, cantidad);
            preparedStatement.setDouble(3, precioUnitario);
            preparedStatement.setDouble(4, total);

            // Ejecutar la consulta
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        venta venta = new venta();

        // Ejemplo de venta de repuestos
        venta.realizarVenta("Filtro de aceite", 2);
        venta.realizarVenta("Pastillas de freno", 3);
        venta.realizarVenta("Batería", 1);
        venta.realizarVenta("Llantas", 4); // Este repuesto no está en el catálogo
    }
}

    // Getters y setters

    

