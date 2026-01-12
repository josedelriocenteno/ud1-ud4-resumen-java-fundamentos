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
 * Archivo: 02_MetaCaracteres.java
 *
 * OBJETIVO
 * --------
 * Explicar los meta-caracteres más usados en expresiones regulares.
 * Ejemplos prácticos en Java usando Pattern y Matcher.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _02_MetaCaracteres {

    public static void main(String[] args) {

        String texto = "abc 123 XYZ _-";

        /*
         * 1. \\d → dígito [0-9]
         */
        Pattern p1 = Pattern.compile("\\d");
        Matcher m1 = p1.matcher(texto);
        System.out.println("\\d (dígito): " + m1.find()); // true, '1'

        /*
         * 2. \\D → no dígito [^0-9]
         */
        Pattern p2 = Pattern.compile("\\D");
        Matcher m2 = p2.matcher(texto);
        System.out.println("\\D (no dígito): " + m2.find()); // true, 'a'

        /*
         * 3. \\s → espacio en blanco [ \\t\\n\\x0b\\r\\f]
         */
        Pattern p3 = Pattern.compile("\\s");
        Matcher m3 = p3.matcher(texto);
        System.out.println("\\s (espacio): " + m3.find()); // true, ' '

        /*
         * 4. \\S → no espacio en blanco [^\\s]
         */
        Pattern p4 = Pattern.compile("\\S");
        Matcher m4 = p4.matcher(texto);
        System.out.println("\\S (no espacio): " + m4.find()); // true, 'a'

        /*
         * 5. \\w → letra, dígito o _ [a-zA-Z0-9_]
         */
        Pattern p5 = Pattern.compile("\\w");
        Matcher m5 = p5.matcher(texto);
        System.out.println("\\w (word character): " + m5.find()); // true, 'a'

        /*
         * 6. \\W → no \\w [^a-zA-Z0-9_]
         */
        Pattern p6 = Pattern.compile("\\W");
        Matcher m6 = p6.matcher(texto);
        System.out.println("\\W (no word character): " + m6.find()); // true, ' '

        /*
         * 7. \\b → límite de palabra
         */
        Pattern p7 = Pattern.compile("\\babc\\b");
        Matcher m7 = p7.matcher(texto);
        System.out.println("\\b (límite palabra): " + m7.find()); // true, 'abc'

        /*
         * Resumen:
         * - \\d → dígito
         * - \\D → no dígito
         * - \\s → espacio
         * - \\S → no espacio
         * - \\w → letra/dígito/_ 
         * - \\W → no \\w
         * - \\b → límite de palabra
         */
    }
}
