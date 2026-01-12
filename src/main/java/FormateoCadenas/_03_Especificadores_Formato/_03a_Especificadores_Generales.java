/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormateoCadenas._03_Especificadores_Formato;

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * VIII – Formateo de cadenas
 *
 * Archivo: 03a_Especificadores_Generales.java
 *
 * OBJETIVO
 * --------
 * Estudiar los especificadores de formato GENERALES:
 *  - %b
 *  - %h
 *  - %n
 *
 * Son especiales porque aceptan muchos tipos
 * o no necesitan argumento.
 */

public class _03a_Especificadores_Generales {

    public static void main(String[] args) {

        /*
         * 1. %b  → BOOLEAN
         * ----------------
         * - Acepta CUALQUIER tipo de objeto
         * - Resultado:
         *    * "true"  si el argumento NO es null
         *    * "false" si el argumento es null
         */

        Object obj1 = new Object();
        Object obj2 = null;

        System.out.printf("obj1 es %b%n", obj1);
        System.out.printf("obj2 es %b%n", obj2);

        /*
         * También funciona con boolean:
         */

        boolean activo = true;
        System.out.printf("activo: %b%n", activo);

        /*
         * 2. %h  → HASHCODE EN HEXADECIMAL
         * --------------------------------
         * - Acepta cualquier tipo
         * - Muestra el valor devuelto por hashCode()
         * - Se representa en hexadecimal
         */

        String texto = "Java";

        System.out.printf("Hash de texto: %h%n", texto);

        /*
         * Es equivalente a:
         * Integer.toHexString(texto.hashCode())
         */

        /*
         * 3. %n  → SALTO DE LÍNEA PORTABLE
         * --------------------------------
         * - NO necesita argumento
         * - Inserta el salto de línea correcto según el sistema operativo
         * - Es mejor práctica que usar \\n
         */

        System.out.print("Línea 1%n"); // ❌ INCORRECTO: %n solo funciona en format/printf

        System.out.printf("Línea 1%n");
        System.out.printf("Línea 2%n");

        /*
         * 4. DIFERENCIA %n vs \\n
         * -----------------------
         * \\n → depende del sistema
         * %n → portable (Windows, Linux, macOS)
         *
         * En exámenes y código profesional:
         * 👉 usa %n
         */

        /*
         * 5. RESUMEN
         * ----------
         * %b → true / false según null
         * %h → hashCode en hexadecimal
         * %n → salto de línea portable
         */
    }
}
