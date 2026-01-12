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
 * Archivo: 05b_Validar_Email.java
 *
 * OBJETIVO
 * --------
 * Validar correos electrónicos usando expresiones regulares en Java.
 * Se considera un formato básico: usuario@dominio.extension
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class _05b_Validar_Email {

    public static void main(String[] args) {

        // Ejemplos de emails
        String email1 = "usuario@ejemplo.com";    // válido
        String email2 = "nombre.apellido@dominio.es"; // válido
        String email3 = "usuario123@dominio";     // inválido (sin extensión)
        String email4 = "usuario@.com";           // inválido (dominio vacío)
        String email5 = "usuario@@dominio.com";   // inválido (doble @)

        // Expresión regular para email básico
        String regexEmail = "\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,})+";

        // Compilar patrón
        Pattern patronEmail = Pattern.compile(regexEmail);

        // Validar cada ejemplo
        validarEmail(email1, patronEmail);
        validarEmail(email2, patronEmail);
        validarEmail(email3, patronEmail);
        validarEmail(email4, patronEmail);
        validarEmail(email5, patronEmail);
    }

    private static void validarEmail(String email, Pattern patron) {
        Matcher matcher = patron.matcher(email);

        if (matcher.matches()) { // matches() valida TODO el String
            System.out.println("Email válido: " + email);
        } else {
            System.out.println("Email inválido: " + email);
        }
    }
}
