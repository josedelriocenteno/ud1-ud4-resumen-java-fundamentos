/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormateoCadenas;

/**
 *
 * @author delcenjo
 */


/**
 * API de Java
 * VIII – Formateo de cadenas
 *
 * Archivo: 00_Introduccion_Formateo.java
 *
 * OBJETIVO
 * --------
 * Introducir el concepto de formateo de cadenas en Java:
 *  - Qué es formatear cadenas
 *  - Por qué NO es buena idea concatenar con +
 *  - Cuándo se usa el formateo en la vida real
 *
 * Este archivo NO entra en detalles técnicos todavía.
 * Es contexto + motivación.
 */

public class _00_Introduccion_Formateo {

    public static void main(String[] args) {

        /*
         * 1. ¿QUÉ ES FORMATEAR CADENAS?
         * ----------------------------
         * Formatear una cadena consiste en construir un texto
         * a partir de una plantilla (cadena de formato) y unos valores.
         *
         * En lugar de unir textos con +, usamos marcadores (%d, %s, %f, etc.)
         * que luego se sustituyen por valores reales.
         */

        /*
         * 2. FORMA INCORRECTA (concatenación con +)
         * -----------------------------------------
         * Parece sencilla, pero tiene varios problemas:
         *  - Difícil de leer cuando crece
         *  - Poco mantenible
         *  - Propensa a errores
         */

        int edad = 18;
        double nota = 8.75;

        String mensajeConcatenado =
                "El alumno tiene " + edad + " años y una nota media de " + nota;

        System.out.println(mensajeConcatenado);

        /*
         * 3. FORMA CORRECTA (formateo de cadenas)
         * ---------------------------------------
         * Usamos una cadena de formato con especificadores:
         *  %d → entero
         *  %f → número decimal
         *
         * El resultado es más limpio y profesional.
         */

        String mensajeFormateado =
                String.format("El alumno tiene %d años y una nota media de %.2f",
                        edad, nota);

        System.out.println(mensajeFormateado);

        /*
         * 4. ¿POR QUÉ USAR FORMATEO?
         * --------------------------
         * Casos reales donde se usa constantemente:
         *
         *  - Salidas por consola bien alineadas
         *  - Informes
         *  - Logs
         *  - Facturas
         *  - Mensajes con datos variables
         *
         * En proyectos reales, concatenar con + es mala práctica.
         */

        /*
         * 5. IDEA CLAVE PARA EL RESTO DEL TEMA
         * ------------------------------------
         * El formateo SIEMPRE tiene:
         *
         *  1) Una cadena de formato
         *  2) Uno o varios argumentos
         *
         * Ejemplo general:
         *
         * String.format("cadena con %d y %s", numero, texto);
         *
         * A partir del siguiente archivo entraremos en detalle.
         */
    }
}
