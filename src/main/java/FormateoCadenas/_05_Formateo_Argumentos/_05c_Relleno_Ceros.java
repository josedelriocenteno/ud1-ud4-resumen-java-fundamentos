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
 * Archivo: 05c_Relleno_Ceros.java
 *
 * OBJETIVO
 * --------
 * Aprender a rellenar números con ceros a la izquierda
 * usando formateo de Java.
 *
 * Muy útil en:
 *  - Números de serie
 *  - Facturas
 *  - IDs
 */

public class _05c_Relleno_Ceros {

    public static void main(String[] args) {

        int numero = 93;

        /*
         * 1. Relleno con ceros
         * --------------------
         * %0Nd → N = ancho total
         *
         * Se rellenan los espacios a la izquierda con 0
         */

        System.out.printf("|%05d|%n", numero); // |00093|

        /*
         * 2. Diferencia con espacio
         * -------------------------
         * %5d → derecha con espacios
         * %05d → derecha con ceros
         */

        System.out.printf("|%5d|%n", numero);   // |   93|
        System.out.printf("|%05d|%n", numero);  // |00093|

        /*
         * 3. Combinación con texto
         * ------------------------
         * Para cadenas, el relleno con ceros no aplica
         * pero se puede usar ancho fijo
         */

        String codigo = "A12";
        System.out.printf("|%05s|%n", codigo); // espacios, no ceros

        /*
         * 4. Ejemplo práctico: IDs
         * ------------------------
         */

        for (int i = 1; i <= 5; i++) {
            System.out.printf("ID: %03d%n", i); // ID: 001, ID: 002...
        }

        /*
         * 5. Resumen
         * ----------
         * - %0Nd → ancho N, relleno con ceros
         * - Funciona solo con números
         * - Útil para códigos, facturas, listas numeradas
         */
    }
}
