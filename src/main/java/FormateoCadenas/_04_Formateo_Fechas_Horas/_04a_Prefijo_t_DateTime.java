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
 * Archivo: 04a_Prefijo_t_DateTime.java
 *
 * OBJETIVO
 * --------
 * Entender el prefijo %t para formateo de fechas y horas:
 *  - Qué significa
 *  - Qué tipos acepta
 *  - Cómo se usa
 *
 * IMPORTANTE:
 * %t SIEMPRE va seguido de otra letra (flag).
 */

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDateTime;

public class _04a_Prefijo_t_DateTime {

    public static void main(String[] args) {

        /*
         * 1. ¿QUÉ ES %t?
         * --------------
         * %t es el prefijo que indica a Java que vamos
         * a formatear una FECHA u HORA.
         *
         * NUNCA se usa solo.
         * Siempre necesita una letra detrás:
         *
         *  %tY, %tm, %td, %tH, etc.
         */

        /*
         * 2. TIPOS COMPATIBLES CON %t
         * ---------------------------
         * Java acepta varios tipos de fecha/hora:
         *
         * - java.util.Date
         * - java.util.Calendar
         * - java.time.LocalDateTime
         * - long (milisegundos desde epoch)
         */

        Date fechaDate = new Date();
        Calendar fechaCalendar = Calendar.getInstance();
        LocalDateTime fechaLocal = LocalDateTime.now();
        long millis = System.currentTimeMillis();

        /*
         * 3. EJEMPLO BÁSICO
         * -----------------
         * Usamos %t con distintas banderas
         */

        System.out.printf("Año actual (Date): %tY%n", fechaDate);
        System.out.printf("Mes actual (Calendar): %tm%n", fechaCalendar);
        System.out.printf("Día actual (LocalDateTime): %td%n", fechaLocal);

        /*
         * 4. USAR EL MISMO ARGUMENTO VARIAS VECES
         * --------------------------------------
         * Si usamos varios %t, podemos repetir el argumento
         */

        System.out.printf("Fecha completa: %tY-%tm-%td%n",
                fechaDate, fechaDate, fechaDate);

        /*
         * (Más adelante veremos cómo evitar repetir con índices)
         */

        /*
         * 5. EJEMPLO CON MILISEGUNDOS (long)
         * ----------------------------------
         */

        System.out.printf("Año (epoch): %tY%n", millis);

        /*
         * 6. ERROR TÍPICO
         * ---------------
         * Usar %t sin letra:
         *
         * System.out.printf("%t", fechaDate); ❌
         *
         * %t SOLO es un prefijo
         */

        /*
         * 7. IDEA CLAVE
         * -------------
         * %t indica fecha/hora
         * La letra siguiente define QUÉ parte mostrar
         * (%tY año, %tm mes, %td día, etc.)
         */
    }
}
