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
 * Archivo: 05a_Validar_DNI.java
 *
 * OBJETIVO
 * --------
 * Validar un DNI español (8 números seguidos de una letra mayúscula) 
 * usando expresiones regulares en Java.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _05a_Validar_DNI {

    public static void main(String[] args) {

        // Ejemplos de DNIs
        String dni1 = "12345678Z"; // válido
        String dni2 = "87654321A"; // válido
        String dni3 = "1234567B";  // inválido (solo 7 dígitos)
        String dni4 = "12345678z"; // inválido (letra minúscula)

        // Expresión regular para DNI: 8 dígitos + letra mayúscula
        String regexDNI = "\\d{8}[A-Z]";

        // Compilar el patrón
        Pattern patronDNI = Pattern.compile(regexDNI);

        // Validar cada ejemplo
        validarDNI(dni1, patronDNI);
        validarDNI(dni2, patronDNI);
        validarDNI(dni3, patronDNI);
        validarDNI(dni4, patronDNI);
    }

    private static void validarDNI(String dni, Pattern patron) {
        Matcher matcher = patron.matcher(dni);

        if (matcher.matches()) { // matches() valida TODO el String
            System.out.println("DNI válido: " + dni);
        } else {
            System.out.println("DNI inválido: " + dni);
        }
    }
}
