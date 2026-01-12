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
 * Archivo: 05c_Validar_Telefono.java
 *
 * OBJETIVO
 * --------
 * Validar números de teléfono españoles usando expresiones regulares en Java.
 * Formato válido: 9 dígitos (opcional prefijo +34)
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _05c_Validar_Telefono {

    public static void main(String[] args) {

        // Ejemplos de teléfonos
        String tel1 = "612345678";       // válido
        String tel2 = "+34612345678";    // válido con prefijo internacional
        String tel3 = "71234567";        // inválido (solo 8 dígitos)
        String tel4 = "1234567890";      // inválido (10 dígitos)
        String tel5 = "+3451234567";     // inválido (prefijo correcto pero dígitos incorrectos)

        // Expresión regular para teléfono español
        String regexTelefono = "(\\+34)?[6-7]\\d{8}";

        // Compilar patrón
        Pattern patronTelefono = Pattern.compile(regexTelefono);

        // Validar cada ejemplo
        validarTelefono(tel1, patronTelefono);
        validarTelefono(tel2, patronTelefono);
        validarTelefono(tel3, patronTelefono);
        validarTelefono(tel4, patronTelefono);
        validarTelefono(tel5, patronTelefono);
    }

    private static void validarTelefono(String telefono, Pattern patron) {
        Matcher matcher = patron.matcher(telefono);

        if (matcher.matches()) { // matches() valida TODO el String
            System.out.println("Teléfono válido: " + telefono);
        } else {
            System.out.println("Teléfono inválido: " + telefono);
        }
    }
}
