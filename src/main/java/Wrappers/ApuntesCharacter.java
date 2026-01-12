/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Wrappers;

/**
 *
 * @author delcenjo
 */

public class ApuntesCharacter {
    public static void main(String[] args) {
        char letra = 'A';
        Character wrapper = 'Z';
        
        // ===== 1. VALIDACIONES (DAM TOP) =====
        System.out.println("¿Dígito? '5': " + Character.isDigit('5'));      // true
        System.out.println("¿Dígito? 'A': " + Character.isDigit('A'));      // false
        System.out.println("¿Letra?  'K': " + Character.isLetter('K'));     // true
        System.out.println("¿Espacio? ' ': " + Character.isWhitespace(' ')); // true
        
        // ===== 2. CASO =====
        System.out.println("¿Mayús? 'Z': " + Character.isUpperCase('Z'));   // true
        System.out.println("¿Minús? 'z': " + Character.isLowerCase('z'));   // true
        
        // ===== 3. CONVERTIR =====
        System.out.println("A → a: " + Character.toLowerCase('A'));         // 'a'
        System.out.println("z → Z: " + Character.toUpperCase('z'));         // 'Z'
        
        // ===== 4. VALIDAR FORMULARIOS =====
        char userInput = '7';
        if(Character.isDigit(userInput)) {
            System.out.println("✅ Número válido");
        }
        
        // ===== 5. ESPACIALES =====
        System.out.println("¿Control? '\\n': " + Character.isISOControl('\n')); // true
        System.out.println("Unicode: " + (int)'€');                           // 8364
        
        // ===== 6. PRÁCTICO - Contraseña segura =====
        char passChar = '!';
        boolean segura = Character.isLetterOrDigit(passChar) == false;
        System.out.println("¿Carácter especial? " + segura);                 // true
    }
}

/*
isDigit(char)        → **¿Número?** (0-9)
isLetter(char)       → **¿Letra?** (a-z A-Z)
isUpperCase(char)    → **¿Mayúscula?**
isLowerCase(char)    → **¿Minúscula?**
isWhitespace(char)   → **¿Espacio?**
toLowerCase(char)    → **minúscula**
toUpperCase(char)    → **mayúscula**
*/