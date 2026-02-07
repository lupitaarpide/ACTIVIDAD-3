package Semana4.Ejercicios;

public class Producto {

    private final String nombre;
    private final double costo;
    private final double impuesto;

    public Producto(String nombre, double costo, double impuesto) {
        this.nombre = nombre;
        this.costo = costo;
        this.impuesto = impuesto;
    }

    public double calcularPrecio(double utilidad) {
        double precio = costo + (costo * utilidad / 100);
        precio = precio + (precio * impuesto / 100);
        return precio;
    }

    public String getNombre() { return nombre; }
    public double getCosto() { return costo; }
    public double getImpuesto() { return impuesto; }
}