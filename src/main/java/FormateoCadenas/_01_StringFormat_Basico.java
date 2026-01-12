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
 * Archivo: 01_StringFormat_Basico.java
 *
 * OBJETIVO
 * --------
 * Aprender a usar el método String.format():
 *  - Qué hace
 *  - Cómo se usa
 *  - Cuál es su sintaxis
 *  - Cómo se relacionan la cadena de formato y los argumentos
 */

public class _01_StringFormat_Basico {

    public static void main(String[] args) {

        /*
         * 1. ¿QUÉ ES String.format()?
         * ---------------------------
         * String.format() es un método estático de la clase String
         * que devuelve una cadena ya formateada.
         *
         * NO imprime nada por consola.
         * Devuelve un String.
         */

        /*
         * 2. SINTAXIS GENERAL
         * ------------------
         *
         * String resultado = String.format("cadena de formato", argumentos);
         *
         * - La "cadena de formato" contiene texto normal + especificadores (%)
         * - Los "argumentos" son los valores que sustituyen a esos especificadores
         */

        /*
         * 3. EJEMPLO BÁSICO CON UN ENTERO
         * -------------------------------
         */

        int edad = 18;

        String textoEdad = String.format("La edad es %d años", edad);

        System.out.println(textoEdad);

        /*
         * %d  → especificador de formato para enteros (int, short, long, etc.)
         *
         * IMPORTANTE:
         *  - El orden de los especificadores importa
         *  - Cada % necesita un argumento
         */

        /*
         * 4. EJEMPLO CON VARIOS ARGUMENTOS
         * --------------------------------
         */

        String nombre = "Carlos";
        double nota = 8.5;

        String textoCompleto =
                String.format("El alumno %s tiene una nota media de %.1f",
                        nombre, nota);

        System.out.println(textoCompleto);

        /*
         * %s   → String
         * %.1f → número decimal con 1 cifra decimal
         */

        /*
         * 5. ORDEN DE LOS ARGUMENTOS
         * --------------------------
         * Los argumentos se sustituyen en el orden en el que aparecen
         * los especificadores en la cadena.
         */

        String orden =
                String.format("%s tiene %d años", nombre, edad);

        System.out.println(orden);

        /*
         * 6. ERROR TÍPICO
         * ---------------
         * Si el tipo del argumento NO coincide con el especificador,
         * el programa compila, pero falla en ejecución.
         *
         * Ejemplo INCORRECTO (NO hacerlo):
         *
         * String error = String.format("Edad: %d", "dieciocho");
         */

        /*
         * 7. String.format() NO IMPRIME
         * -----------------------------
         * Si quieres mostrar el resultado:
         *  - Usa System.out.println()
         *  - O System.out.printf() (lo veremos después)
         */

        /*
         * 8. RESUMEN MENTAL
         * -----------------
         * String.format():
         *  - Devuelve un String
         *  - Usa especificadores (%)
         *  - Es más limpio que concatenar
         *  - Es la base de todo el formateo en Java
         */
    }
}
