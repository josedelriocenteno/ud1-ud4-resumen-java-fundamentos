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
 * Archivo: 03_Cuantificadores.java
 *
 * OBJETIVO
 * --------
 * Explicar los cuantificadores de expresiones regulares y su uso en Java.
 * Permiten indicar cuántas veces puede aparecer un patrón.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _03_Cuantificadores {

    public static void main(String[] args) {

        String texto = "111 11 1234 abc abc abc abc";

        /*
         * 1. {X} → exactamente X veces
         * Coincide con dígito repetido exactamente 3 veces
         */
        Pattern p1 = Pattern.compile("\\d{3}");
        Matcher m1 = p1.matcher(texto);
        while (m1.find()) {
            System.out.println("\\d{3} encontrado: " + m1.group()); // '111', '123'
        }

        /*
         * 2. {X,Y} → entre X y Y veces
         * Coincide con dígito repetido entre 2 y 3 veces
         */
        Pattern p2 = Pattern.compile("\\d{2,3}");
        Matcher m2 = p2.matcher(texto);
        while (m2.find()) {
            System.out.println("\\d{2,3} encontrado: " + m2.group()); // '111', '11', '123', '4'
        }

        /*
         * 3. {X,} → al menos X veces
         * Coincide con letras repetidas al menos 2 veces
         */
        Pattern p3 = Pattern.compile("a{2,}");
        Matcher m3 = p3.matcher(texto);
        while (m3.find()) {
            System.out.println("a{2,} encontrado: " + m3.group()); // 'aa' en 'abc' si hubiese repetido
        }

        /*
         * 4. * → 0 o más veces (equivale a {0,})
         */
        Pattern p4 = Pattern.compile("a*");
        Matcher m4 = p4.matcher(texto);
        while (m4.find()) {
            System.out.println("a* encontrado: '" + m4.group() + "'");
        }

        /*
         * 5. + → 1 o más veces (equivale a {1,})
         */
        Pattern p5 = Pattern.compile("a+");
        Matcher m5 = p5.matcher(texto);
        while (m5.find()) {
            System.out.println("a+ encontrado: '" + m5.group() + "'");
        }

        /*
         * 6. ? → 0 o 1 vez (equivale a {0,1})
         */
        Pattern p6 = Pattern.compile("b?c");
        Matcher m6 = p6.matcher(texto);
        while (m6.find()) {
            System.out.println("b?c encontrado: '" + m6.group() + "'");
        }

        /*
         * RESUMEN CUANTIFICADORES
         * -----------------------
         * {X}    → exactamente X veces
         * {X,Y}  → entre X y Y veces
         * {X,}   → al menos X veces
         * *      → 0 o más veces
         * +      → 1 o más veces
         * ?      → 0 o 1 vez
         */
    }
}
