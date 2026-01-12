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
 * Archivo: 04_Clases_Pattern_Matcher.java
 *
 * OBJETIVO
 * --------
 * Enseñar el uso de las clases Pattern y Matcher en Java.
 * Permite validar y buscar patrones dentro de Strings.
 * Incluye manejo de PatternSyntaxException.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class _04_Clases_Pattern_Matcher {

    public static void main(String[] args) {

        String texto = "Mi correo es ejemplo@dominio.com y mi DNI 12345678Z";

        try {
            // 1. Crear un patrón con Pattern.compile()
            Pattern patronEmail = Pattern.compile("\\w+@\\w+\\.\\w+");
            Pattern patronDNI = Pattern.compile("\\d{8}[A-Z]");

            // 2. Crear un Matcher que compare el String con el patrón
            Matcher matcherEmail = patronEmail.matcher(texto);
            Matcher matcherDNI = patronDNI.matcher(texto);

            // 3. Validar coincidencias completas con matches()
            boolean emailCompleto = matcherEmail.matches(); // valida TODO el String
            System.out.println("matches() para email: " + emailCompleto); // false, porque el String completo no es solo el email

            // 4. Buscar patrón dentro del String con find()
            while (matcherEmail.find()) {
                System.out.println("find() email encontrado: " + matcherEmail.group()); // 'ejemplo@dominio.com'
            }

            while (matcherDNI.find()) {
                System.out.println("find() DNI encontrado: " + matcherDNI.group()); // '12345678Z'
            }

        } catch (PatternSyntaxException e) {
            System.out.println("Error en la expresión regular: " + e.getDescription());
        }

        /*
         * Resumen:
         * - Pattern.compile(String regex) → crea un patrón
         * - Matcher.matches() → valida si TODO el String coincide
         * - Matcher.find() → busca si existe el patrón en cualquier parte del String
         * - Matcher.group() → devuelve la coincidencia encontrada
         * - PatternSyntaxException → captura errores de sintaxis del patrón
         */
    }
}
