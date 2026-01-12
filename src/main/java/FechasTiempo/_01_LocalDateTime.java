/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FechasTiempo;

/**
 *
 * @author delcenjo
 */

/**
 * 01-LocalDateTime.java - BÁSICAS FECHAS (Sin wildcard imports)
 * ============================================================
 * Nueva API java.time - Import específico (profe OK)
 * 
 * IMPORTS individuales (copia):
 * import java.time.LocalDate;
 * import java.time.LocalTime;
 * import java.time.LocalDateTime;
 * import java.time.temporal.ChronoUnit;
 * 
 * Compila: javac 01-LocalDateTime.java && java 01_LocalDateTime
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class _01_LocalDateTime {
    public static void main(String[] args) {
        
        // ===== 1. LocalDate (FECHA SOLA) =====
        System.out.println("=== LocalDate (FECHA) ===");
        
        LocalDate hoy = LocalDate.now();
        System.out.printf("hoy: %s%n", hoy);  // 2026-01-10
        
        LocalDate cumple = LocalDate.of(2006, 5, 15);
        System.out.printf("cumpleaños: %s%n", cumple);
        
        System.out.printf("año: %d, mes: %d (%s), día: %d%n", 
                         hoy.getYear(), hoy.getMonthValue(), hoy.getMonth(), hoy.getDayOfMonth());
        
        LocalDate manana = hoy.plusDays(1);
        LocalDate ayer = hoy.minusDays(1);
        System.out.printf("mañana: %s, ayer: %s%n", manana, ayer);
        
        
        // ===== 2. LocalTime (HORA SOLA) =====
        System.out.println("\n=== LocalTime (HORA) ===");
        
        LocalTime ahora = LocalTime.now();
        System.out.printf("ahora: %s%n", ahora);  // 14:17:xx
        
        LocalTime clase = LocalTime.of(9, 30);
        System.out.printf("clase: %s%n", clase);
        
        System.out.printf("hora: %d:%02d:%02d%n", 
                         ahora.getHour(), ahora.getMinute(), ahora.getSecond());
        
        LocalTime cena = ahora.plusHours(8);
        System.out.printf("cena: %s%n", cena);
        
        
        // ===== 3. LocalDateTime (FECHA+HORA) ⭐ =====
        System.out.println("\n=== LocalDateTime ⭐ ===");
        
        LocalDateTime ahoraDT = LocalDateTime.now();
        System.out.printf("ahoraDT: %s%n", ahoraDT);  // 2026-01-10T14:17
        
        LocalDateTime inicioDAM = LocalDateTime.of(2026, 9, 1, 9, 0);
        System.out.printf("inicio DAM: %s%n", inicioDAM);
        
        LocalDateTime combinado = hoy.atTime(14, 30);
        System.out.printf("fecha+hora: %s%n", combinado);
        
        LocalDateTime futuro = ahoraDT.plusYears(1).plusMonths(1).plusDays(1);
        System.out.printf("futuro: %s%n", futuro);
        
        LocalDateTime soloFecha = ahoraDT.truncatedTo(ChronoUnit.DAYS);
        System.out.printf("solo fecha: %s%n", soloFecha);
        
        System.out.println("\n¡Básicas listas! → Importa ZoneId para siguiente.");
    }
}
