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
 * 04-PeriodDuration.java - INTERVALOS y DIFERENCIAS
 * =================================================
 * Period (días/meses) vs Duration (horas/segundos) ⭐
 * 
 * IMPORTS:
 * import java.time.LocalDate;
 * import java.time.LocalDateTime;
 * import java.time.Period;
 * import java.time.Duration;
 * import java.time.temporal.ChronoUnit;
 * 
 * Compila: javac 04-PeriodDuration.java && java 04_PeriodDuration
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class _04_PeriodDuration {
    public static void main(String[] args) {
        
        // ===== 1. Period (FECHAS: años/meses/días) ⭐ =====
        System.out.println("=== Period (días/meses/años) ⭐ ===");
        
        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(2006, 5, 15);
        
        // Diferencia entre dos fechas
        Period hastaCumple = Period.between(hoy, cumple);
        System.out.printf("Hasta cumple: %s%n", hastaCumple);
        // P0Y-4M-5D (negativo → pasado)
        
        LocalDate futuro = hoy.plusYears(1);
        Period unAnno = Period.between(hoy, futuro);
        System.out.printf("1 año: %s (%d días)%n", unAnno, unAnno.getDays());
        // P1Y0M0D
        
        // Partes
        System.out.printf("años: %d, meses: %d, días: %d%n",
                         hastaCumple.getYears(), hastaCumple.getMonths(), hastaCumple.getDays());
        
        // Period específico
        Period semestre = Period.of(0, 6, 0);
        LocalDate seisMeses = hoy.plus(semestre);
        System.out.printf("6 meses: %s%n", seisMeses);
        
        
        // ===== 2. Duration (HORAS/MINUTOS/SEGUNDOS) ⭐ =====
        System.out.println("\n=== Duration (tiempo) ⭐ ===");
        
        LocalDateTime inicio = LocalDateTime.of(2026, 1, 10, 9, 0);
        LocalDateTime fin = LocalDateTime.of(2026, 1, 10, 17, 30);
        
        Duration jornada = Duration.between(inicio, fin);
        System.out.printf("Jornada: %s (%d horas)%n", jornada, jornada.toHours());
        // PT8H30M → 8 horas 30 min
        
        // Partes
        System.out.printf("horas: %d, mins: %d, segs: %d%n",
                         jornada.toHours(), jornada.toMinutesPart(), jornada.getSeconds());
        
        // Duration específica
        Duration pausa = Duration.ofHours(1).plusMinutes(15);
        System.out.printf("pausa: %s%n", pausa);  // PT1H15M
        
        
        // ===== 3. ChronoUnit (Unidades precisas) =====
        System.out.println("\n=== ChronoUnit (entre/unidades) ===");
        
        long dias = ChronoUnit.DAYS.between(hoy, futuro);
        System.out.printf("días exactos: %d%n", dias);  // 365
        
        long horas = ChronoUnit.HOURS.between(inicio, fin);
        System.out.printf("horas jornada: %d%n", horas);  // 510 (8.5h)
        
        long minutos = ChronoUnit.MINUTES.between(inicio, fin);
        System.out.printf("minutos: %d%n", minutos);  // 510
        
        // Segundos/millis
        long segs = ChronoUnit.SECONDS.between(inicio, fin);
        System.out.printf("segundos: %d%n", segs);
        
        
        // ===== 4. EJEMPLO: Trabajo DAM =====
        System.out.println("\n=== Ejemplo: Semana laboral ===");
        LocalDateTime lunes9 = LocalDateTime.of(2026, 1, 12, 9, 0);
        LocalDateTime viernes18 = LocalDateTime.of(2026, 1, 16, 18, 0);
        
        Duration semana = Duration.between(lunes9, viernes18);
        long horasSemana = semana.toHours();
        System.out.printf("Semana laboral: %d horas (%s)%n", horasSemana, semana);
        // ~69 horas
        
        Period diasSemana = Period.between(lunes9.toLocalDate(), viernes18.toLocalDate());
        System.out.printf("Días calendario: %s%n", diasSemana);  // P0Y0M4D
        
        
        // ===== 5. NOTAS/ERRORES =====
        System.out.println("\n=== ⚠️ CUIDADO ===");
        // 1. Period NO mezcla fecha/hora → usa .toLocalDate()
        // 2. between(futuro,pasado) → negativo OK
        // 3. ChronoUnit para precisión
        
        System.out.println("\n¡Diferencias listas! → Ejemplos prácticos final.");
    }
}
