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
 * Archivo: 04b_Fechas_Formato_Completo.java
 *
 * OBJETIVO
 * --------
 * Explicar TODOS los especificadores de fechas y horas con %t
 * y mostrar ejemplos prácticos de uso.
 */

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;

public class _04b_Fechas_Formato_Completo {

    public static void main(String[] args) {

        // 1. Crear fechas para los ejemplos
        Date fecha = new Date();
        Calendar cal = Calendar.getInstance();
        LocalDateTime local = LocalDateTime.now();

        // 2. DÍA DE LA SEMANA
        System.out.printf("Día completo (domingo): %tA%n", fecha);
        System.out.printf("Día abreviado: %ta%n", fecha);

        // 3. MES
        System.out.printf("Mes completo: %tB%n", fecha);
        System.out.printf("Mes abreviado: %tb%n", fecha);

        // 4. CENTENIO Y AÑO
        System.out.printf("Siglo: %tC%n", fecha);   // Dos dígitos del siglo
        System.out.printf("Año completo: %tY%n", fecha);
        System.out.printf("Año dos dígitos: %ty%n", fecha);

        // 5. DÍA DEL MES
        System.out.printf("Día del mes con 2 dígitos: %td%n", fecha);
        System.out.printf("Día del mes sin 0: %te%n", fecha);

        // 6. HORA
        System.out.printf("Hora 24h: %tH%n", fecha);
        System.out.printf("Hora 12h: %tI%n", fecha);
        System.out.printf("Hora 24h sin 0: %tk%n", fecha);
        System.out.printf("Hora 12h sin 0: %tl%n", fecha);

        // 7. MINUTO Y SEGUNDO
        System.out.printf("Minuto: %tM%n", fecha);
        System.out.printf("Segundo: %tS%n", fecha);

        // 8. NANOS
        System.out.printf("Nanosegundos: %tN%n", fecha);

        // 9. AM / PM
        System.out.printf("Marcador am/pm: %tp%n", fecha);

        // 10. DÍA DEL AÑO
        System.out.printf("Día del año: %tj%n", fecha);

        // 11. MILISEGUNDOS / EPOCH
        long millis = System.currentTimeMillis();
        System.out.printf("Segundos desde epoch: %tQ%n", millis);

        // 12. FORMATO COMPLETO
        System.out.printf("Formato ISO 8601: %tF%n", fecha); // YYYY-MM-DD
        System.out.printf("Formato clásico: %tD%n", fecha);  // MM/DD/YY
        System.out.printf("Fecha y hora completa: %tc%n", fecha);

        // 13. RESUMEN RÁPIDO
        /*
         * %tA → Día de la semana completo
         * %ta → Día de la semana abreviado
         * %tB → Mes completo
         * %tb → Mes abreviado
         * %tC → Siglo (2 dígitos)
         * %tY → Año completo (4 dígitos)
         * %ty → Año 2 dígitos
         * %td → Día del mes 2 dígitos
         * %te → Día del mes sin 0
         * %tH → Hora 24h
         * %tI → Hora 12h
         * %tk → Hora 24h sin 0
         * %tl → Hora 12h sin 0
         * %tM → Minuto
         * %tS → Segundo
         * %tN → Nanosegundo
         * %tp → am/pm
         * %tj → Día del año
         * %tQ → Milisegundos desde epoch
         * %tF → Fecha ISO (YYYY-MM-DD)
         * %tD → Fecha (MM/DD/YY)
         * %tc → Fecha y hora completa
         */
    }
}
