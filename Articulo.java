package Semana4.Ejercicios;

public class Articulo {

    private final String codigo;
    private final String descripcion;
    private final double precio;
    private int existencia;

    public Articulo(String codigo, String descripcion, double precio, int existencia) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrar() {
        System.out.println("Codigo: " + codigo +
                ", Desc: " + descripcion +
                ", Precio: " + precio +
                ", Existencia: " + existencia);
    }

    public void actualizarExistencia(int cantidad) {
        if (existencia + cantidad < 0) {
            System.out.println("No hay suficiente existencia");
        } else {
            existencia += cantidad;
            System.out.println("Nueva existencia: " + existencia);
        }
    }
}

