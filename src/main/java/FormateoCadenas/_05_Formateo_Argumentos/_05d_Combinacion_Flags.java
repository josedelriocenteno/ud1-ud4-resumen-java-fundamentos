/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormateoCadenas._05_Formateo_Argumentos;

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * VIII – Formateo de cadenas
 *
 * Archivo: 05d_Combinacion_Flags.java
 *
 * OBJETIVO
 * --------
 * Combinar:
 *  - Ancho de campo
 *  - Justificación
 *  - Relleno con ceros
 *  - Índices de argumentos
 *
 * Para crear tablas y salidas complejas.
 */

public class _05d_Combinacion_Flags {

    public static void main(String[] args) {

        int id = 7;
        String producto = "Café";
        double precio = 1.5;

        /*
         * 1. Tabla básica combinando ancho y justificación
         */
        System.out.printf("|%-5s|%-10s|%10s|%n", "ID", "Producto", "Precio");
        System.out.printf("|%-5d|%-10s|%10.2f|%n", id, producto, precio);

        /*
         * 2. Relleno con ceros para IDs
         */
        System.out.printf("|%05d|%-10s|%10.2f|%n", id, producto, precio); // ID: 00007

        /*
         * 3. Repetir argumentos con índices
         */
        System.out.printf("Producto %2$s (ID: %1$05d) cuesta %3$.2f%n",
                id, producto, precio);

        /*
         * 4. Mezcla completa: ancho + justificación + ceros + índice
         */
        System.out.printf("|%-10s|%1$05d|%2$10.2f|%n", id, precio, producto);

        /*
         * 5. Ejemplo práctico: varias filas
         */
        int[] ids = {1, 2, 3};
        String[] productos = {"Té", "Leche", "Pan"};
        double[] precios = {2.75, 0.99, 1.25};

        System.out.printf("|%-5s|%-10s|%10s|%n", "ID", "Producto", "Precio");
        for (int i = 0; i < ids.length; i++) {
            System.out.printf("|%05d|%-10s|%10.2f|%n",
                    ids[i], productos[i], precios[i]);
        }

        /*
         * 6. RESUMEN
         * ----------
         * - %-10s → izquierda
         * - %10.2f → derecha + 2 decimales
         * - %05d → relleno con ceros
         * - %n$ → repetir o cambiar orden de argumentos
         * - Combinar todo permite tablas profesionales y listas complejas
         */
    }
}
