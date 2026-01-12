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
 * 05-EjemplosPrácticos.java - FECHAS REALES DAM
 * ============================================
 * Aplica TODO: LocalDateTime + Zoned + Format + Period + Duration
 * 
 * IMPORTS completos práctica:
 * import java.time.*;
 * import java.time.format.DateTimeFormatter;
 * import java.time.temporal.ChronoUnit;
 * 
 * Compila: javac 05-EjemplosPrácticos.java && java 05_EjemplosPrácticos
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _05_EjemplosPrácticos {
    public static void main(String[] args) {
        
        DateTimeFormatter fmtESP = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmtLarga = DateTimeFormatter.ofPattern("dd 'de' MMMM yyyy");
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        
        // ===== 1. CUMPLEAÑOS - DÍAS RESTANTES =====
        System.out.println("=== 1. CUMPLEAÑOS ===");
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(2006, 5, 15);  // Tu cumple?
        
        Period hastaCumple = Period.between(hoy, cumple);
        long diasCumple = ChronoUnit.DAYS.between(hoy, cumple);
        System.out.printf("Hasta cumple %s: %d días (%s)%n", 
                         cumple.format(fmtLarga), diasCumple, hastaCumple);
        
        
        // ===== 2. JORNADA LABORAL DAM =====
        System.out.println("\n=== 2. JORNADA DAM ===");
        LocalDateTime entrada = LocalDateTime.of(2026, 1, 12, 9, 0);  // Lunes
        LocalDateTime salida = LocalDateTime.of(2026, 1, 12, 17, 30);
        
        Duration jornada = Duration.between(entrada, salida);
        System.out.printf("Entrada: %s%nSalida: %s%nJornada: %s (%.1f h)%n",
                         entrada.format(fmtESP), salida.format(fmtESP),
                         jornada, jornada.toHours() + jornada.toMinutesPart()/60.0);
        
        
        // ===== 3. VACACIONES (ZONAS) =====
        System.out.println("\n=== 3. VACACIONES Madrid-NY ===");
        ZonedDateTime salidaMadrid = ZonedDateTime.of(2026, 7, 15, 12, 0, 0, 0, madrid);
        ZonedDateTime llegadaNY = salidaMadrid.withZoneSameInstant(ZoneId.of("America/New_York"));
        
        System.out.printf("Vuelo Madrid: %s%nLlegada NY: %s%n",
                         salidaMadrid.format(fmtESP), llegadaNY.format(fmtESP));
        
        
        // ===== 4. CERTIFICACIÓN AWS (Period + Format) =====
        System.out.println("\n=== 4. AWS Certificación ===");
        LocalDate examenAWS = LocalDate.of(2026, 6, 30);
        Period prepAWS = Period.between(hoy, examenAWS);
        long diasEstudio = ChronoUnit.DAYS.between(hoy, examenAWS);
        System.out.printf("Examen AWS %s → %d días (%s)%n",
                         examenAWS.format(fmtLarga), diasEstudio, prepAWS);
        
        
        // ===== 5. LOGS (Parse + Format) =====
        System.out.println("\n=== 5. Logs (Parse) ===");
        DateTimeFormatter logFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime logInicio = LocalDateTime.parse("10/01/2026 09:00", logFmt);
        LocalDateTime logFin = LocalDateTime.parse("10/01/2026 18:00", logFmt);
        
        Duration diaLog = Duration.between(logInicio, logFin);
        System.out.printf("Log inicio: %s → %s = %s%n",
                         logInicio.format(logFmt), logFin.format(logFmt), diaLog);
        
        
        // ===== 6. SEMANA PROGRAMACIÓN =====
        System.out.println("\n=== 6. Semana laboral ===");
        LocalDateTime lunes = LocalDateTime.of(2026, 1, 12, 9, 0);
        LocalDateTime viernes = LocalDateTime.of(2026, 1, 16, 18, 0);
        
        Period dias = Period.between(lunes.toLocalDate(), viernes.toLocalDate());
        Duration horas = Duration.between(lunes, viernes);
        System.out.printf("Lun-Vie: %s días calendario, %s horas%n", dias, horas);
        
        
        System.out.println("\n🎉 ¡FECHAS COMPLETAS! Copia ejemplos profe.");
    }
}
