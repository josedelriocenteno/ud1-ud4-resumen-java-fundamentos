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
 * Archivo: 03d_Especificadores_Especiales.java
 *
 * OBJETIVO
 * --------
 * Estudiar los especificadores ESPECIALES:
 *  - %n → salto de línea portable
 *
 * Ver errores comunes y buenas prácticas.
 */

public class _03d_Especificadores_Especiales {

    public static void main(String[] args) {

        /*
         * 1. %n → SALTO DE LÍNEA PORTABLE
         * ------------------------------
         * - NO consume argumentos
         * - Inserta el salto de línea correcto según el sistema operativo
         * - Sustituye a \\n en formateo
         */

        System.out.printf("Primera línea%n");
        System.out.printf("Segunda línea%n");

        /*
         * 2. ¿POR QUÉ NO USAR \\n?
         * -----------------------
         * \\n depende del sistema:
         *  - Linux / macOS → \\n
         *  - Windows → \\r\\n
         *
         * %n se adapta automáticamente.
         */

        System.out.print("Línea con \\n\n");
        System.out.printf("Línea con %%n%n");

        /*
         * 3. ERROR MUY TÍPICO
         * -------------------
         * Intentar usar %n con println o print:
         *
         * System.out.print("Texto%n"); ❌
         *
         * %n SOLO funciona dentro de:
         *  - printf()
         *  - format()
         *  - String.format()
         */

        /*
         * 4. %n EN String.format()
         * ------------------------
         */

        String texto =
                String.format("Uno%nDos%nTres%n");

        System.out.print(texto);

        /*
         * 5. RESUMEN FINAL
         * ----------------
         * %n:
         *  - No lleva argumento
         *  - Es portable
         *  - Es buena práctica
         *  - Muy preguntable en examen
         */
    }
}
