package Semana4.Act3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto p1 = new Producto();
        Producto p2 = new Producto();

        try {
            // ===== Producto 1 =====
            System.out.println("Producto 1");

            System.out.print("Descripción: ");
            p1.setDescripcion(sc.nextLine());

            System.out.print("Código: ");
            p1.setCodigo(sc.nextLine());

            System.out.print("Tipo: ");
            p1.setTipo(sc.nextLine());

            System.out.print("Costo: ");
            p1.setCosto(sc.nextDouble());

            System.out.print("Impuesto (%): ");
            p1.setImpuesto(sc.nextDouble());

            sc.nextLine(); // limpiar buffer

            // ===== Producto 2 =====
            System.out.println("\nProducto 2");

            System.out.print("Descripción: ");
            p2.setDescripcion(sc.nextLine());

            System.out.print("Código: ");
            p2.setCodigo(sc.nextLine());

            System.out.print("Tipo: ");
            p2.setTipo(sc.nextLine());

            System.out.print("Costo: ");
            p2.setCosto(sc.nextDouble());

            System.out.print("Impuesto (%): ");
            p2.setImpuesto(sc.nextDouble());

        } catch (Exception e) {
            System.out.println("Error al ingresar los datos");
        }

        System.out.println("\nDatos del Producto 1:");
        p1.muestraProducto();

        System.out.println("\nDatos del Producto 2:");
        p2.muestraProducto();

        String mayor = compararProductos(p1, p2);
        System.out.println("\nProducto con mayor precio de venta: " + mayor);
    }

    public static String compararProductos(Producto a, Producto b) {
        double precioA = a.calcularPrecio(20);
        double precioB = b.calcularPrecio(20);

        if (precioA > precioB) {
            return a.getDescripcion();
        } else {
            return b.getDescripcion();
        }
    }
}
