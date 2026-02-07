
# Actividad 3. "Clase (PRODUCTO)" y "Clase principal (Main)" 
## Códigos:
### Clase Producto
'''java
package Semana4.Act3;

public class Producto {

    private String descripcion;
    private String codigo;
    private String tipo;
    private double costo;
    private double impuesto;



    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCosto() {
        return costo;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }



    public void muestraProducto() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo);
        System.out.println("Impuesto: " + impuesto + "%");
    }



    public double calcularPrecio(double utilidad) {
        double precioBase = costo + (costo * utilidad / 100);
        double precioFinal = precioBase + (precioBase * impuesto / 100);
        return precioFinal;
    }
}

## **El programa está compuesto por dos clases: Producto y Main.** 
### Clase Main
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

## Descripción de la clase Producto

La clase Producto representa un producto y contiene los siguientes atributos privados:
descripcion (String)

* codigo (String)
* tipo (String)
* costo (double)
* impuesto (double)

Incluye métodos get y set para acceder y modificar cada atributo.
El método muestraProducto() muestra en pantalla todos los datos del producto.
El método calcularPrecio(double utilidad) calcula el precio de venta sumando al costo el porcentaje de utilidad y posteriormente el impuesto, devolviendo el precio final.

## Descripción de la clase principal (Main)

En la clase Main se crean dos objetos de tipo Producto.
El usuario ingresa los datos de cada producto mediante teclado, utilizando un bloque try-catch para manejar errores.

Después, se muestran los datos de ambos productos en pantalla.
Finalmente, se utiliza el método compararProductos, el cual calcula el precio de venta de cada producto con una utilidad del 20% y devuelve la descripción del producto con el mayor precio de venta.
