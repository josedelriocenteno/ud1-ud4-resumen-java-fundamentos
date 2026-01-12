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
 * Archivo: 05b_Ancho_y_Justificacion.java
 *
 * OBJETIVO
 * --------
 * Aprender a usar:
 *  - Ancho fijo de campo
 *  - Justificación a la derecha o izquierda
 *
 * Muy útil para listas, tablas, facturas, informes, etc.
 */

public class _05b_Ancho_y_Justificacion {

    public static void main(String[] args) {

        int numero = 93;
        String texto = "Java";

        /*
         * 1. ANCHO FIJO
         * -------------
         * Se indica un número después del %:
         *  %10d → campo de 10 caracteres, derecha por defecto
         */

        System.out.printf("|%10d|%n", numero); // espacios a la izquierda

        /*
         * 2. JUSTIFICACIÓN A LA IZQUIERDA
         * -------------------------------
         * Se añade el signo -:
         *  %-10d → campo de 10 caracteres, izquierda
         */

        System.out.printf("|%-10d|%n", numero); // espacios a la derecha

        /*
         * 3. ANCHO CON STRINGS
         * -------------------
         * Funciona igual con texto
         */

        System.out.printf("|%10s|%n", texto);  // derecha
        System.out.printf("|%-10s|%n", texto); // izquierda

        /*
         * 4. COMBINAR ANCHO + DECIMALES
         * -----------------------------
         * Para números decimales:
         *  %8.2f → ancho 8, 2 decimales
         */

        double pi = 3.14159;
        System.out.printf("|%8.2f|%n", pi); // espacios + 2 decimales

        /*
         * 5. EJEMPLO PRÁCTICO: TABLA
         * --------------------------
         */

        System.out.printf("|%-10s|%10s|%n", "Producto", "Precio");
        System.out.printf("|%-10s|%10.2f|%n", "Café", 1.5);
        System.out.printf("|%-10s|%10.2f|%n", "Té", 2.75);
        System.out.printf("|%-10s|%10.2f|%n", "Leche", 0.99);

        /*
         * 6. RESUMEN
         * ----------
         * - Ancho fijo → número después de %
         * - Justificación a la izquierda → -
         * - Justificación a la derecha → por defecto
         * - Funciona con números y texto
         */
    }
}
