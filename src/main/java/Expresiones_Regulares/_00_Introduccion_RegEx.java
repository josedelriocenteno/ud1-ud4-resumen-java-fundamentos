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
 * Archivo: 00_Introduccion_RegEx.java
 *
 * OBJETIVO
 * --------
 * Introducir el concepto de expresiones regulares (RegEx) y su uso en Java.
 * Explicar cómo buscar patrones dentro de un String de izquierda a derecha.
 *
 * Muy útil para:
 * - Validar DNI
 * - Validar correo electrónico
 * - Validar números de teléfono
 */

public class _00_Introduccion_RegEx {

    public static void main(String[] args) {

        String ejemplo = "Mi DNI es 12345678Z y mi correo es usuario@ejemplo.com";

        /*
         * Idea conceptual:
         * Queremos comprobar si hay un patrón concreto dentro del String.
         * La búsqueda es de izquierda a derecha, y cada carácter se evalúa una vez.
         *
         * Patrón simple: buscar la cadena "123"
         */
        boolean contiene = ejemplo.contains("123"); 
        System.out.println("Contiene '123': " + contiene); // true

        /*
         * Otro ejemplo conceptual:
         * ¿Contiene un número de 8 dígitos seguido de una letra? 
         * Esto sería el patrón de un DNI. 
         * Expresiones regulares permiten representarlo de forma compacta.
         *
         * Patrón conceptual: "\\d{8}[A-Z]"
         */
        System.out.println("Ejemplo de patrón de DNI: '\\d{8}[A-Z]'");
        System.out.println("Se evaluará usando Pattern y Matcher en archivos posteriores.");

        /*
         * Resumen:
         * - RegEx = patrón de búsqueda dentro de un String
         * - Validaciones comunes: DNI, email, teléfono
         * - La evaluación recorre el String de izquierda a derecha
         * - Cada carácter participa solo una vez en la validación
         */
    }
}
