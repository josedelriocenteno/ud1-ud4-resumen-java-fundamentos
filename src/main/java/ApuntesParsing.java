/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

public class ApuntesParsing {
    public static void main(String[] args) {
        // ===== 1. String → PRIMITIVOS (WRAPPERS) =====
        String input = "123";
        
        // ENTEROS
        int entero = Integer.parseInt(input);                    // **String→int**
        long largo = Long.parseLong("1234567890123");            // **String→long**
        
        // DECIMALES
        double real = Double.parseDouble("3.14159");             // **String→double**
        float flotante = Float.parseFloat("2.718f");             // **String→float**
        
        // OTROS
        boolean flag = Boolean.parseBoolean("true");             // **Solo "true"**
        char letra = input.charAt(0);                            // **String→char**
        
        // BASES
        int hex = Integer.parseInt("FF", 16);                    // **255**
        int bin = Integer.parseInt("1010", 2);                   // **10**
        
        System.out.printf("int:%d | double:%.2f | hex:%d%n", entero, real, hex);
        
        // ===== 2. String → WRAPPERS (valueOf) =====
        Integer objInt = Integer.valueOf("123");                 // **String→Integer**
        Double objDouble = Double.valueOf("3.14");               // **String→Double**
        
        // ===== 3. PRIMITIVO → WRAPPER (Auto-boxing) =====
        int primInt = 42;
        Integer wrapperInt = primInt;                            // **Automático**
        
        // ===== 4. WRAPPER → PRIMITIVO (unboxing) =====
        Integer obj = 100;
        int backPrim = obj.intValue();                           // **Integer→int**
        int autoUnbox = obj;                                     // **Automático**
        
        // ===== 5. TRY-CATCH SEGURO (DAM OBLIGATORIO) =====
        String[] datos = {"123", "abc", "45.67", "true"};
        
        for(String dato : datos) {
            try {
                int num = Integer.parseInt(dato);
                System.out.println("OK: " + num);
            } catch(NumberFormatException e) {
                System.out.println("ERROR: " + dato + " no es entero");
            }
        }
        // OK: 123
        // ERROR: abc no es entero
        // ERROR: 45.67 no es entero
        // OK: 45
        
        // ===== 6. Double/Float especiales =====
        try {
            double d1 = Double.parseDouble("3.14");      // OK
            double d2 = Double.parseDouble("INF");       // ∞
            double nan = Double.parseDouble("NaN");      // NaN
            System.out.printf("d1:%.2f | d2:%.0f | nan:%s%n", d1, d2, Double.isNaN(nan));
        } catch(NumberFormatException e) {
            System.out.println("Error parsing double");
        }
        
        // ===== 7. Character parsing =====
        String codigo = "65";  // ASCII 'A'
        char asciiA = (char) Integer.parseInt(codigo);   // **65→'A'**
        System.out.println("ASCII 65: " + asciiA);       // A
        
        // ===== 8. Boolean TRUCO =====
        String[] bools = {"true", "TRUE", "yes", "1"};
        for(String b : bools) {
            System.out.println(b + " → " + Boolean.parseBoolean(b));  // false, false, false, false
        }
    }
}
