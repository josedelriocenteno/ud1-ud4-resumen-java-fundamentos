/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormateoCadenas;

/**
 *
 * @author delcenjo
 */


/**
 * API de Java
 * VIII – Formateo de cadenas
 *
 * Archivo: 02_Printf_y_Format.java
 *
 * OBJETIVO
 * --------
 * Entender las diferencias entre:
 *  - String.format()
 *  - System.out.printf()
 *  - System.out.format()
 *
 * Saber cuándo usar cada uno y evitar errores conceptuales.
 */

public class _02_Printf_y_Format {

    public static void main(String[] args) {

        /*
         * 1. String.format()
         * ------------------
         * - Devuelve un String
         * - NO imprime nada por consola
         * - Se usa cuando quieres guardar el resultado
         */

        int edad = 18;
        double nota = 8.75;

        String texto = String.format(
                "El alumno tiene %d años y una nota de %.2f",
                edad, nota
        );

        System.out.println(texto);

        /*
         * 2. System.out.printf()
         * ----------------------
         * - Imprime directamente por consola
         * - NO devuelve un String
         * - Usa la MISMA sintaxis de formato
         */

        System.out.printf(
                "El alumno tiene %d años y una nota de %.2f%n",
                edad, nota
        );

        /*
         * %n → salto de línea portable (mejor que \n)
         */

        /*
         * 3. System.out.format()
         * ----------------------
         * - Es EXACTAMENTE IGUAL que printf()
         * - Solo cambia el nombre
         * - Ambos pertenecen a PrintStream
         */

        System.out.format(
                "El alumno tiene %d años y una nota de %.2f%n",
                edad, nota
        );

        /*
         * 4. DIFERENCIA CLAVE (EXAMEN)
         * ----------------------------
         *
         * String.format() → devuelve String
         * printf()/format() → imprimen por consola
         *
         * TODOS usan:
         *  - Cadena de formato
         *  - Especificadores %
         *  - Argumentos
         */

        /*
         * 5. ¿CUÁL USAR?
         * --------------
         *
         * Usa String.format() cuando:
         *  - Necesitas guardar el texto
         *  - Lo vas a reutilizar
         *  - Lo devuelves desde un método
         *
         * Usa printf()/format() cuando:
         *  - Solo quieres mostrar información
         *  - Es salida directa por consola
         */

        /*
         * 6. ERROR TÍPICO
         * ---------------
         * Intentar hacer esto:
         *
         * String x = System.out.printf("Edad: %d", edad);
         *
         * ❌ ERROR: printf() no devuelve String
         */

        /*
         * 7. RESUMEN FINAL
         * ----------------
         * - La sintaxis de formato es la misma
         * - Cambia el destino del resultado
         * - Confusión típica de principiantes
         */
    }
}
