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
 * 03-DateTimeFormatter.java - FORMATEO y PARSE
 * ============================================
 * Convierte fecha → String legible y viceversa ⭐
 * 
 * IMPORTS:
 * import java.time.LocalDate;
 * import java.time.LocalDateTime;
 * import java.time.format.DateTimeFormatter;
 * 
 * Compila: javac 03-DateTimeFormatter.java && java 03_DateTimeFormatter
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _03_DateTimeFormatter {
    public static void main(String[] args) {
        
        LocalDateTime ahora = LocalDateTime.now();
        LocalDate hoy = LocalDate.now();
        
        // ===== 1. Patrones PERSONALIZADOS ⭐ =====
        System.out.println("=== Patrones personalizados ===");
        
        // Español común
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaESP = hoy.format(fmt1);
        System.out.printf("dd/MM/yyyy: %s%n", fechaESP);  // 10/01/2026
        
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String fechaLarga = hoy.format(fmt2);
        System.out.printf("Larga: %s%n", fechaLarga);  // 10 de enero de 2026
        
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEEE dd MMM yyyy HH:mm");
        String completa = ahora.format(fmt3);
        System.out.printf("Completa: %s%n", completa);  // sábado 10 ene 2026 14:21
        
        DateTimeFormatter hora12 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.printf("12h: %s%n", ahora.format(hora12));  // 02:21:xx PM
        
        
        // ===== 2. PARSE (String → Objeto) ⭐ =====
        System.out.println("\n=== Parse (String → fecha) ===");
        
        LocalDate parsed1 = LocalDate.parse("10/01/2026", fmt1);
        System.out.printf("parse dd/MM: %s%n", parsed1);
        
        // Error si formato no coincide → DateTimeParseException
        // LocalDate error = LocalDate.parse("abc", fmt1); ❌
        
        DateTimeFormatter iso = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate isoParsed = LocalDate.parse("2026-01-10", iso);
        System.out.printf("ISO parse: %s%n", isoParsed);
        
        
        // ===== 3. FORMATOS PREDEFINIDOS =====
        System.out.println("\n=== Predefinidos ===");
        
        // ISO estándar
        System.out.printf("ISO fecha: %s%n", hoy.format(DateTimeFormatter.ISO_LOCAL_DATE));
        // 2026-01-10
        
        System.out.printf("ISO completo: %s%n", 
                         ahora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        // 2026-01-10T14:21:xx
        
        System.out.printf("ISO zona: %s%n", 
                         ahora.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        // 2026-01-10T14:21:xx+01:00[Europe/Madrid]
        
        
        // ===== 4. Locale Español (Opcional) =====
        System.out.println("\n=== Español completo ===");
        DateTimeFormatter espanol = DateTimeFormatter.ofPattern("EEEE, d 'de' MMMM 'de' yyyy", 
                                                               java.util.Locale.forLanguageTag("es"));
        System.out.printf("Locale ES: %s%n", hoy.format(espanol));
        // sábado, 10 de enero de 2026
        
        
        // ===== 5. ERRORES COMUNES =====
        System.out.println("\n=== ⚠️ CUIDADO ===");
        // 1. Formato no coincide → DateTimeParseException
        // 2. Mes 'ene' → usa MMM (abreviado)
        // 3. Thread-safe → reutiliza formatter
        
        System.out.println("\n¡Formateo listo! → Period/Duration siguiente.");
    }
}

