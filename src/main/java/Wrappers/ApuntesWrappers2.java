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
 * Apuntes COMPLETOS: WRAPPERS + BOXING/UNBOXING/AUTOBOXING + DIAGRAMA
 * ===================================================================
 * 
 * ACTUALIZADO con BOXING, UNBOXING, AUTOBOXING [file:41]
 * 
 * FLUJO COMPLETO (tu diagrama):
 * String  ←→ Wrapper ←→ Primitivo
 *   ↑         ↑           ↑
 * parse()  valueOf()   value()/unboxing
 * toString()         auto-boxing
 * 
 * CONCEPTOS CLAVE:
 * - BOXING: primitivo → Wrapper (Integer i = new Integer(5))
 * - UNBOXING: Wrapper → primitivo (int x = i.intValue())
 * - AUTOBOXING: Java 5+ lo hace AUTOMÁTICO (Integer i = 5;)
 * 
 * Pares: int↔Integer, double↔Double, char↔Character, etc.
 */

import java.util.ArrayList;

public class ApuntesWrappers2 {
    public static void main(String[] args) {
        
        // ===== 0. FLUJO COMPLETO (TU DIAGRAMA) =====
        System.out.println("=== FLUJO COMPLETO [file:41] ===");
        String s1 = "123";
        int prim1 = Integer.parseInt(s1);           // String → PRIMITIVO
        Integer wrap1 = Integer.valueOf(prim1);     // PRIMITIVO → WRAPPER (BOXING)
        int prim2 = wrap1;                          // WRAPPER → PRIMITIVO (UNBOXING)
        String s2 = wrap1.toString();               // WRAPPER → String
        System.out.printf("'123'→%d→%s→%d→'%s'%n", prim1, wrap1, prim2, s2);
        
        
        // ===== 1. BOXING vs AUTOBOXING =====
        System.out.println("\n=== BOXING vs AUTOBOXING ===");
        
        // BOXING MANUAL (ANTIGUO)
        int num1 = 10;
        Integer i1 = Integer.valueOf(num1);  // BOXING explícito
        System.out.printf("MANUAL: int %d → %s%n", num1, i1);
        
        // AUTOBOXING (Java 5+ AUTOMÁTICO)
        Integer i2 = 20;  // ¡AUTOBOXING! int → Integer
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(30);    // ¡AUTOBOXING en método!
        System.out.printf("AUTO: %d, lista=%s%n", i2, lista);
        
        
        // ===== 2. UNBOXING AUTOMÁTICO =====
        System.out.println("\n=== UNBOXING ===");
        
        Integer i3 = 40;
        int num2 = i3;        // ¡AUTO-UNBOXING! Integer → int
        int suma = i3 + 50;   // ¡UNBOXING + operación!
        System.out.printf("i3=%s → num2=%d → suma=%d%n", i3, num2, suma);
        
        
        // ===== 3. DEMO VISUAL: ¿Qué hace Java AUTOMÁTICO? =====
        System.out.println("\n=== ¿QUÉ HACE JAVA POR TI? ===");
        
        Integer a = 100;     // AUTOBOXING: int → Integer
        int b = a + 200;     // AUTO-UNBOXING: Integer → int
        ArrayList<Integer> l = new ArrayList<>();
        l.add(300);          // AUTOBOXING
        int total = l.get(0); // AUTO-UNBOXING
        
        System.out.printf("a=%s b=%d total=%d%n", a, b, total);
        
        
        // ===== 4. parseXXX() DESDE STRING =====
        System.out.println("\n=== DESDE STRING ===");
        int p1 = Integer.parseInt("456");  // → PRIMITIVO directo
        Integer i4 = Integer.valueOf("789"); // → WRAPPER
        System.out.printf("parseInt='456'→%d | valueOf='789'→%s%n", p1, i4);
        
        
        // ===== 5. POOL OPTIMIZACIÓN (-128 a 127) =====
        System.out.println("\n=== POOL DE ENTEROS ===");
        Integer x = 100; Integer y = 100;  // MISMO objeto (pool)
        Integer z = 200; Integer w = 200;  // OBJETOS diferentes
        System.out.printf("x==y: %b | z==w: %b | x.equals(y): %b%n", 
                         x==y, z==w, x.equals(y));
        
        
        // ===== 6. MÉTODOS ÚTILES =====
        System.out.println("\n=== MÉTODOS ===");
        System.out.printf("MAX_INT= %d%n", Integer.MAX_VALUE);
        System.out.printf("isDigit('5')= %b%n", Character.isDigit('5'));
        
        
        // ===== 7. PELIGROS COMUNES =====
        System.out.println("\n=== ⚠️ CUIDADO ⚠️ ===");
        // 1. NullPointerException
        // Integer nulo = null;
        // int boom = nulo;  // ¡EXPLOTA!
        
        // 2. Pool solo pequeños números
        // 3. NumberFormatException: parseInt("abc")
        
        System.out.println("\n¡APUNTES COMPLETOS CON BOXING/AUTOBOXING! [file:41]");
    }
}

/** Resumen visual de los 3 conceptos:
 * 
 * 
PRIMITIVO  ➜ AUTOBOXING ➜ WRAPPER
   5              =             Integer(5)

WRAPPER   ➜ AUTO-UNBOXING ➜ PRIMITIVO  
Integer(5)           =              5

ArrayList.add(10)  ➜  boxing automático
lista.get(0)       ➜ unboxing automático
* 
* 
 */