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
 * Archivo: 03c_Especificadores_Texto.java
 *
 * OBJETIVO
 * --------
 * Estudiar los especificadores de formato de TEXTO:
 *  - %s → String
 *  - %c → carácter
 *
 * Incluye conversión automática y Unicode.
 */

public class _03c_Especificadores_Texto {

    public static void main(String[] args) {

        /*
         * 1. %s → STRING
         * ---------------
         * - Acepta CUALQUIER tipo de objeto
         * - Llama internamente a toString()
         * - Si el argumento es null → imprime "null"
         */

        String nombre = "Java";
        int version = 21;
        Object obj = null;

        System.out.printf("Lenguaje: %s%n", nombre);
        System.out.printf("Versión: %s%n", version);
        System.out.printf("Objeto: %s%n", obj);

        /*
         * IMPORTANTE (examen):
         * %s NO exige que el argumento sea String
         */

        /*
         * 2. %c → CARÁCTER
         * ----------------
         * Tipos compatibles:
         *  - char
         *  - int (código Unicode)
         */

        char letra = 'A';
        int unicode = 66; // 'B'

        System.out.printf("Letra: %c%n", letra);
        System.out.printf("Unicode 66: %c%n", unicode);

        /*
         * 3. UNICODE
         * ----------
         * Java usa Unicode, por lo que %c puede mostrar:
         *  - Letras
         *  - Símbolos
         *  - Emojis (si el entorno lo permite)
         */

        int corazon = 0x2665; // ♥
        System.out.printf("Símbolo Unicode: %c%n", corazon);

        /*
         * 4. ERROR TÍPICO
         * ---------------
         * Usar %c con un String:
         *
         * System.out.printf("%c", "A"); ❌
         *
         * %c espera UN solo carácter
         */

        /*
         * 5. COMBINACIÓN CON ANCHO
         * ------------------------
         * %s y %c admiten ancho y justificación
         */

        System.out.printf("|%10s|%n", "Hola");
        System.out.printf("|%-10s|%n", "Hola");

        /*
         * 6. RESUMEN
         * ----------
         * %s → cualquier objeto (toString)
         * %c → carácter o Unicode
         * null → "null"
         * Admiten ancho y alineación
         */
    }
}
