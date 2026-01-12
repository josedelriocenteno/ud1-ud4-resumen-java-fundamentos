package Wrappers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

public class ApuntesDouble {
    public static void main(String[] args) {
        // ===== 1. CREAR Double =====
        double primitivo = 3.14159;
        Double wrapper = Double.valueOf("3.14159");      // String → Double
        Double desdeInt = Double.valueOf(42);            // int → Double
        
        // ===== 2. String → double (DAM TOP) =====
        double pi = Double.parseDouble("3.14159");       // **"3.14" → 3.14**
        double precio = Double.parseDouble("19.99");     // **Precios**
        System.out.println("parseDouble: " + pi);
        
        // ===== 3. Double → double =====
        Double obj = 2.718;
        double prim = obj.doubleValue();                 // **Wrapper → primitivo**
        
        // ===== 4. CONSTANTES =====
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);     // 1.79E308
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);     // 4.9E-324
        System.out.println("Double.NaN: " + Double.NaN);                 // NaN
        System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
        
        // ===== 5. ESPECIALES (VALIDAR) =====
        double ceroCero = 0.0 / 0.0;
        System.out.println("Es NaN? " + Double.isNaN(ceroCero));         // true
        System.out.println("Es Infinito? " + Double.isInfinite(1.0/0.0)); // true
        
        // ===== 6. FORMATO DECIMALES =====
        double euros = 19.999;
        System.out.printf("€%.2f%n", euros);                            // €20.00
        
        // ===== 7. PRÁCTICO - Precio seguro =====
        String input = "29.95";
        try {
            double precioSeguro = Double.parseDouble(input);
            System.out.println("Precio OK: €" + precioSeguro);
        } catch(NumberFormatException e) {
            System.out.println("ERROR: No es número");
        }
    }
}

/*
parseDouble(String)      → **String→double** (formularios)
valueOf(String/double)   → **Wrapper**
doubleValue()            → **Double→double**
Double.isNaN()           → **Validar NaN**
Double.parseDouble() + try-catch → **Input seguro**
MAX_VALUE/MIN_VALUE/NaN  → Límites
*/