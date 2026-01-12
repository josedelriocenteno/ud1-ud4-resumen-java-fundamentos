/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormateoCadenas._04_Formateo_Fechas_Horas;

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * VIII – Formateo de cadenas
 *
 * Archivo: 04c_Ejemplos_Fechas.java
 *
 * OBJETIVO
 * --------
 * Mostrar ejemplos prácticos de formateo de fechas y horas
 * usando %t con Date, Calendar y LocalDateTime.
 */

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;

public class _04c_Ejemplos_Fechas {

    public static void main(String[] args) {

        // 1. Crear fechas
        Date fecha = new Date();
        Calendar cal = Calendar.getInstance();
        LocalDateTime local = LocalDateTime.now();

        // 2. Mostrar fecha completa con %tc
        System.out.printf("Fecha completa (Date): %tc%n", fecha);

        // 3. Mostrar fecha en ISO (YYYY-MM-DD)
        System.out.printf("ISO 8601 (Date): %tF%n", fecha);

        // 4. Mostrar fecha en formato clásico (MM/DD/YY)
        System.out.printf("Formato clásico (Date): %tD%n", fecha);

        // 5. Día de la semana y mes abreviado
        System.out.printf("Hoy es %ta, %tb%n", fecha, fecha);

        // 6. Hora 24h y minuto
        System.out.printf("Hora actual: %tH:%tM%n", fecha, fecha);

        // 7. Hora 12h con AM/PM
        System.out.printf("Hora 12h: %tI:%tM %tp%n", fecha, fecha, fecha);

        // 8. Día del año
        System.out.printf("Hoy es el día %tj del año%n", fecha);

        // 9. Milisegundos desde epoch
        long millis = System.currentTimeMillis();
        System.out.printf("Milisegundos desde 1970: %tQ%n", millis);

        // 10. Ejemplo con Calendar
        System.out.printf("Calendar: %tA %tB %td %tT %tZ %tY%n",
                cal, cal, cal, cal, cal, cal);

        // 11. Ejemplo con LocalDateTime (Java 8+)
        // Convertimos LocalDateTime a java.time.format.DateTimeFormatter si se quiere más control
        // Aquí usamos printf solo con LocalDateTime.toString()
        System.out.printf("LocalDateTime: %s%n", local);

        /*
         * RESUMEN:
         * - %tc → fecha y hora completa
         * - %tF → YYYY-MM-DD
         * - %tD → MM/DD/YY
         * - %tH:%tM → hora y minuto 24h
         * - %tI:%tM %tp → hora 12h con am/pm
         * - %tj → día del año
         * - %tQ → milisegundos epoch
         * - Para Calendar y Date → todos los flags anteriores funcionan
         */
    }
}
