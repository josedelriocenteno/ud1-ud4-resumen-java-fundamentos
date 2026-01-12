package Wrappers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

/**
 * Apuntes COMPLETOS: CLASES WRAPPER (Envoltorios Primitivos)
 * ========================================================
 * 
 * ¿PARA QUÉ? 
 * - Primitivos (int, double...) NO son objetos → no van en colecciones (ArrayList), genéricos, etc.
 * - Wrappers SÍ son objetos que "envuelven" un primitivo: Integer envuelve int.
 * 
 * Pares principales:
 * | Primitivo | Wrapper     |
 * |-----------|-------------|
 * | byte      | Byte        |
 * | short     | Short       |
 * | int       | Integer     |
 * | long      | Long        |
 * | float     | Float       |
 * | double    | Double      |
 * | char      | Character   |
 * | boolean   | Boolean     |
 * 
 * Auto-boxing (Java 5+): int → Integer AUTOMÁTICO.
 * Auto-unboxing: Integer → int AUTOMÁTICO.
 * 
 * Compila: javac ApuntesWrappers.java && java ApuntesWrappers
 */

import java.util.ArrayList;

public class ApuntesWrappers1 {
    public static void main(String[] args) {
        
        // ===== 1. CREACIÓN DE WRAPPERS =====
        System.out.println("=== CREACIÓN ===");
        
        // 1. Constructores (ANTIGUO, usa valueOf mejor)
        Integer i1 = new Integer(42);     // DEPRECATED en Java 9+
        Double d1 = new Double(3.14);
        
        // 2. valueOf() - RECOMENDADO (pool para -128 a 127 en Integer)
        Integer i2 = Integer.valueOf(42);
        Integer i3 = Integer.valueOf("123");  // Desde String
        Double d2 = Double.valueOf("3.14");
        
        // 3. AUTO-BOXING: primitivo → wrapper AUTOMÁTICO
        Integer i4 = 100;  // ¡Automático!
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(200);    // Auto-boxing
        
        System.out.printf("i2 = %d, lista: %s%n", i2, lista);
        
        
        // ===== 2. OBTENER VALOR PRIMITIVO (UNBOXING) =====
        System.out.println("\n=== UNBOXING ===");
        
        Integer i5 = 50;
        int prim = i5;       // Automático: Integer → int
        System.out.printf("i5=%d → prim=%d%n", i5, prim);
        
        // Explícito:
        int prim2 = i5.intValue();
        double dbl = i5.doubleValue();  // Convierte a double
        
        // CUIDADO: null → NullPointerException en unboxing
        // Integer nulo = null;
        // int error = nulo;  // ¡EXCEPCIÓN!
        
        
        // ===== 3. MÉTODOS parseXXX() Y valueOf() DESDE STRING =====
        System.out.println("\n=== DESDE STRING ===");
        
        // parseInt(): String → primitivo (¡lanza NumberFormatException si falla!)
        int p1 = Integer.parseInt("123");
        System.out.printf("parseInt('123') = %d%n", p1);
        
        // HEXADECIMAL siempre base 16
        int ff = Integer.parseInt("FF", 16);     // **255**
        int a1 = Integer.parseInt("A1", 16);     // **161**
        System.out.printf("FF₁₆=%d | A1₁₆=%d%n", ff, a1);

        // DECIMAL base 10 (por defecto)
        int diez = Integer.parseInt("255", 10);  // **255**
        System.out.printf("\"255\"₁₀=%d%n", diez);

        // BINARIO base 2
        int binario = Integer.parseInt("11111111", 2);  // **255**
        System.out.printf("11111111₂=%d%n", binario);
        
        // valueOf() → wrapper
        Integer i6 = Integer.valueOf("456");
        
        // DECIMALES:
        double d3 = Double.parseDouble("3.1416");
        System.out.printf("parseDouble= %.4f%n", d3);
        
        
        // ===== 4. MÉTODOS compare() Y compareTo() =====
        System.out.println("\n=== COMPARACIONES ===");
        
        // Integer.compare(a,b): -1 si a<b, 0 igual, 1 si a>b
        System.out.printf("compare(5,10)= %d%n", Integer.compare(5,10));  // -1
        
        // compareTo() en objetos
        Integer a = 20, b = 10;
        System.out.printf("a.compareTo(b)= %d%n", a.compareTo(b));  // 1
        
        // Boolean.compare()
        System.out.printf("Boolean.compare(true,false)= %d%n", 
                         Boolean.compare(true, false));  // 1
        
        
        // ===== 5. MÉTODOS ESPECÍFICOS POR WRAPPER =====
        System.out.println("\n=== MÉTODOS ESPECÍFICOS ===");
        
        // Integer:
        System.out.printf("Integer.MAX_VALUE= %d%n", Integer.MAX_VALUE);  // 2147483647
        System.out.printf("Integer.MIN_VALUE= %d%n", Integer.MIN_VALUE);  // -2147483648
        System.out.printf("toHexString(255)= %s%n", Integer.toHexString(255));  // ff
        System.out.printf("toBinaryString(6)= %s%n", Integer.toBinaryString(6)); // 110
        
        // Double:
        System.out.printf("Double.isNaN(0/0)= %b%n", Double.isNaN(0.0/0.0));  // true
        System.out.printf("Double.isInfinite(1/0)= %b%n", Double.isInfinite(1.0/0.0)); // true
        
        // Character (útil para validar):
        System.out.printf("isDigit('5')= %b%n", Character.isDigit('5'));   // true
        System.out.printf("isLetter('A')= %b%n", Character.isLetter('A')); // true
        System.out.printf("isUpperCase('A')= %b%n", Character.isUpperCase('A')); // true
        System.out.printf("toLowerCase('A')= %c%n", Character.toLowerCase('A')); // a
        
        // Boolean:
        System.out.printf("Boolean.parseBoolean('true')= %b%n", Boolean.parseBoolean("true")); // true
        // parseBoolean solo "true" → true, resto false
        
        
        // ===== 6. POOL DE OBJETOS (OPTIMIZACIÓN) =====
        System.out.println("\n=== POOL (-128 a 127) ===");
        
        Integer x = 100;  // Pool
        Integer y = 100;
        Integer z = 200;  // Nuevo objeto
        
        System.out.printf("x==y (pool): %b%n", x == y);     // true (mismo objeto)
        System.out.printf("z==200: %b%n", z == 200);         // true (unboxing)
        System.out.printf("x.equals(y): %b%n", x.equals(y)); // Siempre true por valor
        
        // CUIDADO con >127:
        Integer w1 = 130;
        Integer w2 = 130;
        System.out.printf("w1==w2: %b%n", w1 == w2);  // false (nuevos objetos)
        
        
        // ===== 7. EJEMPLO PRÁCTICO: ArrayList + Wrappers =====
        System.out.println("\n=== ArrayList CON Wrappers ===");
        
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);  // boxing
        nums.add(2);
        nums.add(3);
        
        int suma = 0;
        for(Integer n : nums) {  // unboxing
            suma += n;
        }
        System.out.printf("Suma lista: %d%n", suma);  // 6
        
        
        // ===== 8. ERRORES COMUNES Y NOTAS =====
        System.out.println("\n=== ERRORES ===");
        // 1. NumberFormatException: Integer.parseInt("abc")
        // 2. NullPointerException: unboxing null
        // 3. Overflow: 2147483647 +1 → negativo (int)
        // 4. Usa BigInteger para números MUY grandes
        // 5. Boolean.valueOf("false")=false, pero "False"=false
        
        System.out.println("\n¡FIN! Perfecto para colecciones y validaciones en DAM.");
    }
}

