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
 * 02-ZonedDateTime.java - FECHAS CON ZONA HORARIA
 * ===============================================
 * Zonas reales: Madrid (+01:00 CET), UTC, Nueva York, etc.
 * 
 * IMPORTS específicos:
 * import java.time.ZonedDateTime;
 * import java.time.ZoneId;
 * 
 * Compila: javac 02-ZonedDateTime.java && java 02_ZonedDateTime
 * 
 * Madrid hoy: 2026-01-10 ~14:19 CET (+01:00)
 */

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.OffsetDateTime;


public class _02_ZonedDateTime {
    public static void main(String[] args) {
        
        // ===== 1. ZonedDateTime (FECHA+HORA+ZONA) ⭐ =====
        System.out.println("=== ZonedDateTime ⭐ ===");
        
        // Ahora Madrid (zona sistema)
        ZoneId madrid = ZoneId.systemDefault();  // Europe/Madrid
        ZonedDateTime ahoraMadrid = ZonedDateTime.now(madrid);
        System.out.printf("Madrid ahora: %s%n", ahoraMadrid);
        // 2026-01-10T14:19:xx+01:00[Europe/Madrid]
        
        // UTC
        ZonedDateTime ahoraUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.printf("UTC ahora: %s%n", ahoraUTC);
        // 2026-01-10T13:19:xxZ
        
        // Específica Madrid
        ZonedDateTime examen = ZonedDateTime.of(2026, 1, 20, 10, 0, 0, 0, 
                                               ZoneId.of("Europe/Madrid"));
        System.out.printf("examen Madrid: %s%n", examen);
        
        // Offset directo (+01:00)
        ZonedDateTime offset = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.printf("París: %s%n", offset);
        
        
        // ===== 2. ZoneId (LISTA ZONAS IMPORTANTES) =====
        System.out.println("\n=== ZoneId (Zonas) ===");
        
        // Zonas comunes España/Europa
        System.out.println("Madrid: " + ZoneId.of("Europe/Madrid"));
        System.out.println("Canarias: " + ZoneId.of("Atlantic/Canary"));  // -00:00
        System.out.println("Barcelona: " + ZoneId.of("Europe/Madrid"));    // Misma
        
        // Internacional
        System.out.println("Nueva York: " + ZoneId.of("America/New_York"));
        System.out.println("Tokio: " + ZoneId.of("Asia/Tokyo"));
        System.out.println("UTC: " + ZoneId.of("UTC"));
        
        // Sistema por defecto (tu PC)
        System.out.println("Tu zona: " + ZoneId.systemDefault());
        
        // Lista disponible (muchas)
        System.out.println("Zonas total: " + ZoneId.getAvailableZoneIds().size());
        
        
        // ===== 3. Manipular ZonedDateTime =====
        System.out.println("\n=== Manipular (Inmutable) ===");
        
        ZonedDateTime futuroMadrid = ahoraMadrid.plusDays(7).plusHours(2);
        System.out.printf("Madrid +7d+2h: %s%n", futuroMadrid);
        
        // Convertir zonas (ajusta hora)
        ZonedDateTime madridToNY = ahoraMadrid.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.printf("Mismo instante NY: %s%n", madridToNY);
        // ~8:19 AM (diferencia 6h invierno)
        
        // Cambiar zona sin ajustar hora
        ZonedDateTime madridToUTC = ahoraMadrid.withZoneSameLocal(ZoneId.of("UTC"));
        System.out.printf("Misma hora UTC: %s%n", madridToUTC);
        
        
        // ===== 4. OffsetDateTime (Menos común) =====
        System.out.println("\n=== OffsetDateTime ===");
        // Solo offset (+01:00), sin nombre zona
        
        OffsetDateTime offsetDT = ahoraMadrid.toOffsetDateTime();
        System.out.printf("Offset: %s%n", offsetDT);
        
        System.out.println("\n¡Zonas listas! → Siguiente: DateTimeFormatter");
    }
}
