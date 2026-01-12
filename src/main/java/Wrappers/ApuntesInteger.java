/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wrappers;

/**
 *
 * @author delcenjo
 */

public class ApuntesInteger {
    public static void main(String[] args) {
        // ===== 1. CREAR Integer =====
        int primitivo = 2026;
        Integer wrapper = Integer.valueOf("2026");       // **String → Integer**
        Integer desdeDouble = Integer.valueOf(42);       // double → Integer
        
        // ===== 2. String → int (DAM REY) =====
        int edad = Integer.parseInt("25");               // **"25" → 25**
        int id = Integer.parseInt("12345");              // **IDs**
        System.out.println("parseInt: " + edad);
        
        // ===== 3. Integer → int =====
        Integer obj = 100;
        int prim = obj.intValue();                       // **Wrapper → int**
        
        // ===== 4. BASES (HEX, BIN) =====
        int hex = Integer.parseInt("FF", 16);            // **255**
        int bin = Integer.parseInt("1010", 2);           // **10**
        System.out.printf("FF₁₆=%d | 1010₂=%d%n", hex, bin);
        
        // ===== 5. CONSTANTES =====
        System.out.println("MAX: " + Integer.MAX_VALUE);      // 2147483647
        System.out.println("MIN: " + Integer.MIN_VALUE);      // -2147483648
        
        // ===== 6. COMPARAR (IMPORTANTE) =====
        Integer a = 1000, b = 1000;
        System.out.println("a == b: " + (a == b));           // false (objetos)
        System.out.println("a.equals(b): " + a.equals(b));   // true
        
        // ===== 7. CONVERSIÓN BASES (PRO) =====
        System.out.println("toHex: " + Integer.toHexString(255));  // "ff"
        System.out.println("toBinary: " + Integer.toBinaryString(10)); // "1010"
        
        // ===== 8. TRY-CATCH SEGURO =====
        try {
            int num = Integer.parseInt("abc");               // ERROR
        } catch(NumberFormatException e) {
            System.out.println("✅ Capturado: No es número");
        }
    }
}

/*
parseInt(String)         → **String→int** (¡REY!)
parseInt(String, base)   → **Hex(16), Bin(2)**
valueOf(String/int)      → **Wrapper**
intValue()               → **Integer→int**
MAX_VALUE/MIN_VALUE      → Límites (2³¹-1)
toHexString()/toBinaryString() → **Exportar**
**SIEMPRE** try-catch parseInt()
*/