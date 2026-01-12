/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.math.RoundingMode;

public class ApuntesDecimalFormat {
    public static void main(String[] args) {
        double precio = 1234567.8912;
        
        // ===== 1. SÍMBOLOS PATRONES =====
        /*
        0 = Dígito OBLIGATORIO (rellena ceros)
        # = Dígito OPCIONAL
        , = Separador miles
        . = Punto decimal
        % = ×100 + %
        E = Notación científica
        */
        
        // 2 DECIMALES (precios)
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("€" + df.format(precio));           // 1234567.89
        
        // ENTEROS sin decimales
        df = new DecimalFormat("0");
        System.out.println("Entero: " + df.format(precio));    // 1234568
        
        // MILES + 2 decimales
        df = new DecimalFormat("#,##0.00");
        System.out.println("Miles: " + df.format(precio));     // 1.234.567,89
        
        // PORCENTAJE
        df = new DecimalFormat("0.00%");
        System.out.println("76%: " + df.format(0.756));        // 75,60%
        
        // € SIMBOLO personalizado
        df = new DecimalFormat("€ #,##0.00");
        System.out.println("Factura: " + df.format(precio));   // € 1.234.567,89
        
        // CEROS relleno
        df = new DecimalFormat("00.000");                      
        System.out.println("Ceros: " + df.format(5.123));      // 05.123
        
        // NOTACIÓN CIENTÍFICA
        df = new DecimalFormat("0.00E0");
        System.out.println("Científico: " + df.format(precio)); // 1.23E6
        
        // ===== 2. DecimalFormatSymbols (personalizar) =====
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');    // Coma decimal
        symbols.setGroupingSeparator('.');   // Punto miles
        symbols.setCurrencySymbol("€");      // Símbolo €
        
        df = new DecimalFormat("#,##0.00", symbols);
        System.out.println("Custom: " + df.format(precio));    // 1.234.567,89
        
        // ===== 3. ROUNDING (redondeo) =====
        df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.UP);     // Siempre ARRIBA
        System.out.println("UP: " + df.format(1.234));         // 1.24
        
        df.setRoundingMode(RoundingMode.DOWN);    // Siempre ABAJO
        System.out.println("DOWN: " + df.format(1.236));       // 1.23
        
        df.setRoundingMode(RoundingMode.HALF_UP); // Normal (estándar)
        System.out.println("Normal: " + df.format(1.235));     // 1.24
        
        // ===== 4. PATRONES DAM PRO =====
        System.out.println("\n=== PATRONES FACTURA ===");
        String[] patrones = {
            "#,##0.00",           // 1.234.567,89
            "€ #,##0.00",         // € 1.234.567,89
            "0.00%",              // 75,60%
            "(#,##0.00)",         // (1.234.567,89)
            "*#,##0.00€",         // 1.234.567,89€ (relleno *)
        };
        
        for(String patron : patrones) {
            df = new DecimalFormat(patron);
            System.out.println(patron + ": " + df.format(precio));
        }
    }
}
