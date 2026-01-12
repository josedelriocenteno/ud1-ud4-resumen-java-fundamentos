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
 * Archivo: 03b_Especificadores_Numericos.java
 *
 * OBJETIVO
 * --------
 * Estudiar los especificadores de formato NUMÉRICOS:
 *  - %d  → entero decimal
 *  - %f  → número decimal
 *  - %e  → notación científica
 *  - %g  → formato automático
 *  - %o  → octal
 *  - %x  → hexadecimal
 *  - %a  → hexadecimal en coma flotante
 */

public class _03b_Especificadores_Numericos {

    public static void main(String[] args) {

        /*
         * 1. %d → ENTEROS DECIMALES
         * -------------------------
         * Tipos compatibles:
         *  - byte, short, int, long
         *  - BigInteger
         */

        int numero = 93;

        System.out.printf("Número decimal: %d%n", numero);

        /*
         * 2. %f → NÚMEROS DECIMALES (coma flotante)
         * -----------------------------------------
         * Tipos compatibles:
         *  - float, double, BigDecimal
         *
         * Por defecto muestra 6 decimales
         */

        double pi = 3.1415926535;

        System.out.printf("PI sin formato: %f%n", pi);
        System.out.printf("PI con 2 decimales: %.2f%n", pi);

        /*
         * 3. %e → NOTACIÓN CIENTÍFICA
         * ---------------------------
         */

        System.out.printf("PI en notación científica: %e%n", pi);

        /*
         * 4. %g → FORMATO AUTOMÁTICO
         * --------------------------
         * Java decide entre %f o %e según el valor y la precisión
         */

        System.out.printf("PI con %%g: %g%n", pi);

        /*
         * 5. %o → OCTAL
         * -------------
         * Tipos compatibles:
         *  - byte, short, int, long
         */

        int valor = 64;

        System.out.printf("64 en decimal: %d%n", valor);
        System.out.printf("64 en octal: %o%n", valor);

        /*
         * 6. %x → HEXADECIMAL
         * -------------------
         * Se representa en minúsculas
         */

        System.out.printf("64 en hexadecimal: %x%n", valor);
        System.out.printf("64 en hexadecimal (mayúsculas): %X%n", valor);

        /*
         * 7. %a → HEXADECIMAL EN COMA FLOTANTE
         * -----------------------------------
         * Menos usado, pero entra en la API
         */

        double num = 10.5;

        System.out.printf("10.5 en hexadecimal flotante: %a%n", num);

        /*
         * 8. ERROR TÍPICO
         * ---------------
         * Usar un especificador incorrecto para el tipo:
         *
         * System.out.printf("%d", 3.14);  ❌
         *
         * Compila, pero lanza excepción en ejecución
         */

        /*
         * 9. RESUMEN RÁPIDO
         * -----------------
         * %d → entero
         * %f → decimal
         * %e → científico
         * %g → automático
         * %o → octal
         * %x / %X → hexadecimal
         * %a → hexadecimal flotante
         */
    }
}
