/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_ {
    public static void main(String[] args) {
        double precio = 1234.5678;
        double porcentaje = 0.756;
        
        // ===== 1. DecimalFormat PATRONES =====
        DecimalFormat df = new DecimalFormat();
        
        // 2 DECIMALES (PRECIOS)
        df = new DecimalFormat("0.00");                  // **1234.57**
        System.out.println("€" + df.format(precio));
        
        // SIN DECIMALES
        df = new DecimalFormat("0");                     // **1235**
        System.out.println("Entero: " + df.format(precio));
        
        // SEPARADORES miles (€1.234,57)
        df = new DecimalFormat("#,##0.00");              // **1.234,57**
        System.out.println("Con miles: " + df.format(precio));
        
        // PORCENTAJE (75,60%)
        df = new DecimalFormat("0.00%");                 // **75,60%**
        System.out.println("Porcentaje: " + df.format(porcentaje));
        
        // ===== 2. SÍMBOLOS PATRONES =====
        /*
        0 = dígito (obligatorio)
        # = dígito (opcional)
        , = separador miles
        . = decimales
        % = ×100 + %
        */
        
        // EJEMPLOS PATRONES:
        df = new DecimalFormat("€ #,##0.00");            // **€ 1.234,57**
        System.out.println(df.format(precio));
        
        df = new DecimalFormat("00.000");                // **1234.568**
        System.out.println("Ceros: " + df.format(precio));
        
        // ===== 3. NumberFormat (LOCALIZADO) =====
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("USD: " + nf.format(precio));     // $1,234.57
        
        nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println("EUR: " + nf.format(precio));     // 1.234,57 €
        
        nf = NumberFormat.getPercentInstance();
        System.out.println("%%: " + nf.format(porcentaje));  // 76 %
        
        // ===== 4. DAM PRO - Factura =====
        double[] precios = {19.99, 29.50, 150.75};
        double total = 0;
        for(double p : precios) total += p;
        
        DecimalFormat factura = new DecimalFormat("€ #,##0.00");
        System.out.println("\n=== FACTURA ===");
        for(double p : precios) {
            System.out.println(factura.format(p));
        }
        System.out.println("TOTAL: " + factura.format(total));  // **€ 200,24**
        
        // ===== 5. ROUNDING (redondeo) =====
        df = new DecimalFormat("0.00");
        df.setRoundingMode(java.math.RoundingMode.UP);    // Siempre arriba
        System.out.println("UP: " + df.format(1.234));    // 1.24
        
        df.setRoundingMode(java.math.RoundingMode.DOWN);   // Siempre abajo
        System.out.println("DOWN: " + df.format(1.236));  // 1.23
    }
}

/*
PATRÓNES DAM:
"0.00"          → **19.95**
"#,##0.00"      → **1.234,57**
"€ #,##0.00"    → **€ 1.234,57**
"0.00%"         → **75,60%**
"00.000"        → **1234.568**
*/

/*
NumberFormat Locale:
getCurrencyInstance()    → **€ / $** automático
getPercentInstance()     → **76 %**
Locale.US / Locale.SPAIN → **Formato país**

**¡FACTURAS, INFORMES, PDF!** DecimalFormat = **profesionalidad**. 💶
*/