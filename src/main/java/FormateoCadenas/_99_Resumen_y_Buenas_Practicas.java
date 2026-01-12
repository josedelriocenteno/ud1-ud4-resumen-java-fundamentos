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
 * Archivo: 99_Resumen_y_Buenas_Practicas.java
 *
 * OBJETIVO
 * --------
 * Cerrar el bloque de Formateo de Cadenas con:
 *  - Resumen de todos los especificadores
 *  - Consejos prácticos
 *  - Errores frecuentes
 *  - Buenas prácticas para DAM
 */

public class _99_Resumen_y_Buenas_Practicas {

    public static void main(String[] args) {

        /*
         * 1. Resumen de especificadores
         *
         * Generales:
         *  - %b → true/false según null
         *  - %h → hashCode en hexadecimal
         *  - %n → salto de línea portable
         *
         * Numéricos:
         *  - %d → enteros
         *  - %f → decimales
         *  - %e → notación científica
         *  - %g → automático (f/e)
         *  - %o → octal
         *  - %x / %X → hexadecimal
         *  - %a → hexadecimal coma flotante
         *
         * Texto:
         *  - %s → string / toString()
         *  - %c → carácter Unicode
         *
         * Fechas y horas (%t):
         *  - %tA, %ta → día semana
         *  - %tB, %tb → mes
         *  - %tY, %ty → año
         *  - %tH, %tI, %tk, %tl → hora
         *  - %tM, %tS, %tN → minuto, segundo, nanosegundo
         *  - %tp → am/pm
         *  - %tj → día del año
         *  - %tF, %tD, %tc → fechas completas / ISO
         *  - %tQ → milisegundos desde epoch
         *
         * Formateo de argumentos:
         *  - %n$ → elegir argumento
         *  - %width → ancho
         *  - %- → justificación izquierda
         *  - %0 → relleno con ceros
         */

        /*
         * 2. Buenas prácticas
         * ------------------
         * - Usa %n en lugar de \n
         * - Usa String.format() si necesitas guardar el resultado
         * - Usa printf()/format() solo para consola
         * - Combina flags para tablas y listas profesionales
         * - Usa índices para repetir argumentos o cambiar orden
         */

        /*
         * 3. Errores comunes
         * -----------------
         * - Confundir %d y %f
         * - %c con String >1 char
         * - %t sin letra
         * - Mezclar índices y no índices
         * - Esperar que printf devuelva String
         */

        /*
         * 4. Consejos DAM / examen
         * ------------------------
         * - Un concepto = un archivo (claridad)
         * - Siempre comentar ejemplos
         * - Practicar tablas con ancho, justificación y ceros
         * - Memorizar los principales flags de fechas (%tF, %tD, %tc, %tH, %tM, %tp)
         * - Revisar null y conversiones con %s y %b
         *
         * Esto te asegura un repaso rápido y sin errores de último momento.
         */
    }
}
