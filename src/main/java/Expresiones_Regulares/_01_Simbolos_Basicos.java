/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones_Regulares;

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * IX – Expresiones Regulares
 *
 * Archivo: 01_Simbolos_Basicos.java
 *
 * OBJETIVO
 * --------
 * Explicar los símbolos básicos de las expresiones regulares y cómo combinarlos.
 * Ejemplos en Java usando Pattern y Matcher.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _01_Simbolos_Basicos {

    public static void main(String[] args) {

        // Ejemplo de String de prueba
        String texto = "abc123XYZ";

        /*
         * 1. . (punto) → cualquier carácter
         * -----------------------------
         * Ejemplo: patrón de longitud 3 con cualquier carácter
         */
        Pattern p1 = Pattern.compile("...");
        Matcher m1 = p1.matcher(texto);
        System.out.println("Patrón '...': " + m1.find()); // true, encuentra 'abc'

        /*
         * 2. ^expresión → inicio del String
         */
        Pattern p2 = Pattern.compile("^abc");
        Matcher m2 = p2.matcher(texto);
        System.out.println("Patrón '^abc': " + m2.find()); // true

        /*
         * 3. expresión$ → final del String
         */
        Pattern p3 = Pattern.compile("XYZ$");
        Matcher m3 = p3.matcher(texto);
        System.out.println("Patrón 'XYZ$': " + m3.find()); // true

        /*
         * 4. [abc] → conjunto
         * Indica que cualquiera de los caracteres a,b,c es válido en esa posición
         */
        Pattern p4 = Pattern.compile("[abc]");
        Matcher m4 = p4.matcher(texto);
        System.out.println("Patrón '[abc]': " + m4.find()); // true

        /*
         * 5. [^abc] → negación
         * Cualquier carácter excepto a,b,c
         */
        Pattern p5 = Pattern.compile("[^abc]");
        Matcher m5 = p5.matcher(texto);
        System.out.println("Patrón '[^abc]': " + m5.find()); // true, '1'

        /*
         * 6. [a-z1-9] → rango
         * Letras minúsculas de a a z y dígitos del 1 al 9
         */
        Pattern p6 = Pattern.compile("[a-z1-9]");
        Matcher m6 = p6.matcher(texto);
        System.out.println("Patrón '[a-z1-9]': " + m6.find()); // true

        /*
         * 7. A|B → OR
         * Coincide con A o B
         */
        Pattern p7 = Pattern.compile("abc|XYZ");
        Matcher m7 = p7.matcher(texto);
        System.out.println("Patrón 'abc|XYZ': " + m7.find()); // true

        /*
         * 8. AB → concatenación
         * Coincide con A seguida de B
         */
        Pattern p8 = Pattern.compile("abc123");
        Matcher m8 = p8.matcher(texto);
        System.out.println("Patrón 'abc123': " + m8.find()); // true
    }
}
