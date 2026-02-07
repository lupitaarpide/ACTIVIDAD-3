package Semana4.Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* ========= EJERCICIO 1 ========= */
        try {
            System.out.println("Ejercicio 1: Suma");
            System.out.print("Numero 1: ");
            int a = sc.nextInt();
            System.out.print("Numero 2: ");
            int b = sc.nextInt();
            System.out.println("Resultado: " + (a + b));
        } catch (InputMismatchException e) {
            System.out.println("Solo numeros enteros");
            sc.nextLine();
        }

        /* ========= EJERCICIO 2 ========= */
        sc.nextLine();
        System.out.println("\nEjercicio 2: Clasificacion de edad");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad > 0 && edad < 13) {
            System.out.println("Hola " + nombre + ", eres un niño");
        } else if (edad < 18) {
            System.out.println("Hola " + nombre + ", eres adolescente");
        } else if (edad < 65) {
            System.out.println("Hola " + nombre + ", eres adulto");
        } else {
            System.out.println("Hola " + nombre + ", eres adulto mayor");
        }

        /* ========= EJERCICIO 3 ========= */
        System.out.println("\nEjercicio 3: Tabla");
        System.out.print("Numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        /* ========= EJERCICIO 4 ========= */
        System.out.println("\nEjercicio 4: Promedio");
        System.out.print("Cantidad de calificaciones: ");
        int cant = sc.nextInt();

        int suma = 0;
        for (int i = 0; i < cant; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            suma += sc.nextInt();
        }

        System.out.println("Promedio: " + (double) suma / cant);

        /* ========= EJERCICIO 5 ========= */
        sc.nextLine();
        System.out.println("\nEjercicio 5: Vocales");
        System.out.print("Palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        int vocales = 0, consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char l = palabra.charAt(i);
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        /* ========= EJERCICIO 6 ========= */
        System.out.println("\nEjercicio 6: Arreglo ordenado");
        System.out.print("Cantidad de numeros: ");
        int tam = sc.nextInt();

        int[] arr = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean ordenado = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                ordenado = false;
                break;
            }
        }

        System.out.println(ordenado ? "Esta ordenado" : "NO esta ordenado");

        /* ========= EJERCICIO 8 ========= */
        System.out.println("\nEjercicio 8: Buscar numero");
        System.out.print("Numero a buscar: ");
        int x = sc.nextInt();

        int indice = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("Encontrado en indice: " + indice);
        } else {
            System.out.println("No encontrado");
        }

        /* ========= EJERCICIO 10 ========= */
        int opcion;
        do {
            System.out.println("\n1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Numero 1: ");
                double n1 = sc.nextDouble();
                System.out.print("Numero 2: ");
                double n2 = sc.nextDouble();

                switch (opcion) {
                    case 1 -> System.out.println(n1 + n2);
                    case 2 -> System.out.println(n1 - n2);
                    case 3 -> System.out.println(n1 * n2);
                    case 4 -> {
                        while (n2 == 0) {
                            System.out.print("No dividir entre 0. Otro: ");
                            n2 = sc.nextDouble();
                        }
                        System.out.println(n1 / n2);
                    }
                }
            }

        } while (opcion != 5);

        sc.close();
    }
}