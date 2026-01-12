/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wrappers;

/**
 *
 * @author delcenjo
 */

public class ApuntesBoolean {
    public static void main(String[] args) {
        // ===== 1. CREAR Boolean =====
        boolean primitivo = true;
        Boolean wrapper = Boolean.TRUE;              // **Constante TRUE**
        Boolean falso = Boolean.FALSE;               // **Constante FALSE**
        Boolean desdeString = Boolean.valueOf("true"); // String → Boolean
        
        // ===== 2. String → boolean =====
        boolean b1 = Boolean.parseBoolean("true");   // **true**
        boolean b2 = Boolean.parseBoolean("TRUE");   // **false** (case-sensitive)
        boolean b3 = Boolean.parseBoolean("false");  // **false**
        boolean b4 = Boolean.parseBoolean("YES");    // **false** (¡solo "true"!)
        
        // ===== 3. MÉTODOS ESENCIALES =====
        System.out.println("parseBoolean(\"true\"): " + b1);
        System.out.println("parseBoolean(\"YES\"): " + b4);
        System.out.println("valueOf(true): " + Boolean.valueOf(true));
        
        // ===== 4. booleanValue() =====
        Boolean obj = true;
        boolean prim = obj.booleanValue();           // **Wrapper → primitivo**
        
        // ===== 5. LÓGICAS (recordar) =====
        boolean a = true, b = false;
        System.out.println("a && b: " + (a && b));   // false
        System.out.println("a || b: " + (a || b));   // true
        System.out.println("!a: " + !a);             // false
        
        // ===== 6. TERNARIO (DAM TOP) =====
        int edad = 20;
        String acceso = (edad >= 18) ? "Permitido" : "Prohibido";
        System.out.println("Ternario: " + acceso);
        
        // ===== 7. VALIDAR entrada usuario =====
        String input = "TrUe";
        boolean login = Boolean.parseBoolean(input.toLowerCase()); // false-safe
        System.out.println("Input seguro: " + login);
    }
}
/*
Boolean.TRUE / FALSE    → Constantes
parseBoolean("true")    → **Único** String que da true
valueOf(boolean)        → Wrapper
booleanValue()          → Primitivo
&& || !                 → Lógicas
ternario ? :            → Compacto
*/