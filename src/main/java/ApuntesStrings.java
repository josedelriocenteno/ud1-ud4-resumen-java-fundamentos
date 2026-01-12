/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

public class ApuntesStrings {
    public static void main(String[] args) {
        String texto = "  Hola DAM 2026!  ";
        
        /* ===== 1. BÁSICOS ===== */
        // 1. length() → **Devuelve número caracteres** | int length()
        System.out.println("1. length(): " + texto.length());           // 18
        
        // 2. charAt(int index) → **Carácter posición** (0-based) | char charAt(int)
        System.out.println("2. charAt(5): " + texto.charAt(5));         // 'H'
        
        /* ===== 2. EXTRACCIÓN ===== */
        // 3. substring(int inicio) → **Desde posición hasta final** | String substring(int)
        System.out.println("3. substring(3): " + texto.substring(3));   
        
        // 4. substring(int inicio, int fin) → **inicio INCLUIDO, fin NO** | String substring(int,int)
        System.out.println("4. substring(3,7): " + texto.substring(3,7)); 
        
        /* ===== 3. BUSCAR ===== */
        // 5. indexOf(char) → **1ª posición carácter** (-1 no encontrado) | int indexOf(char)
        System.out.println("5. indexOf('D'): " + texto.indexOf('D'));   
        
        // 6. lastIndexOf(char) → **ÚLTIMA posición** | int lastIndexOf(char)
        System.out.println("6. lastIndexOf(' '): " + texto.lastIndexOf(' ')); 
        
        // 7. contains(CharSequence) → **¿Contiene texto?** | boolean contains(String)
        System.out.println("7. contains(\"DAM\"): " + texto.contains("DAM")); 
        
        /* ===== 4. COMPARACIÓN ===== */
        String s1 = "hola", s2 = new String("hola");
        // 8. == → **Referencias memoria** (NO contenido) | boolean ==
        System.out.println("8. == : " + (s1 == s2));                    // false
        
        // 9. equals(String) → **Contenido IGUAL** | boolean equals(String)
        System.out.println("9. equals(): " + s1.equals(s2));             
        
        // 10. equalsIgnoreCase(String) → **Igual sin mayús/minús** | boolean equalsIgnoreCase(String)
        System.out.println("10. equalsIgnoreCase(): " + s1.equalsIgnoreCase("HOLA")); 
        
        /* ===== 5. MODIFICAR (CREA NUEVO String) ===== */
        // 11. toUpperCase() → **TODO mayúsculas** | String toUpperCase()
        System.out.println("11. toUpperCase(): " + texto.toUpperCase());
        
        // 12. toLowerCase() → **TODO minúsculas** | String toLowerCase()
        System.out.println("12. toLowerCase(): " + texto.toLowerCase());
        
        // 13. trim() → **Quita espacios inicio/final** | String trim()
        System.out.println("13. trim(): " + texto.trim());               
        
        // 14. replace(char,char) → **1 carácter por otro** | String replace(char,char)
        System.out.println("14. replace(' ', '_'): " + texto.replace(' ', '_'));
        
        // 15. replaceAll(String,String) → **Regex reemplaza** | String replaceAll(String,String)
        System.out.println("15. replaceAll(\"\\d+\", \"NUM\"): " + texto.replaceAll("\\d+", "NUM")); 
        
        /* ===== 6. DIVIDIR ===== */
        // 16. split(String) → **Array por separador** | String[] split(String)
        String[] palabras = texto.trim().split(" ");
        System.out.println("16. split()[0]: " + palabras[0]);            
        
        /* ===== 7. VALIDAR ===== */
        // 17. isEmpty() → **Longitud 0** | boolean isEmpty()
        System.out.println("17. isEmpty(): " + "".isEmpty());            
        
        // 18. isBlank() → **Solo espacios** (Java 11+) | boolean isBlank()
        System.out.println("18. isBlank(): " + "   ".isBlank());         
        
        // 19. startsWith(String) → **Empieza con** | boolean startsWith(String)
        System.out.println("19. startsWith(\"Hola\"): " + texto.trim().startsWith("Hola")); 
        
        // 20. endsWith(String) → **Termina con** | boolean endsWith(String)
        System.out.println("20. endsWith(\"!\"): " + texto.trim().endsWith("!")); 
        
        /* ===== 8. FORMATO ===== */
        // 21. String.format(String, Object...) → **printf String** | static String format(String,Object...)
        System.out.println("21. format(): " + String.format("Hola %s, %d años", "Juan", 20));
        
        /* ===== 9. JOIN ===== */
        // 22. String.join(CharSequence, String...) → **Une array** | static String join(CharSequence,String...)
        System.out.println("22. join(): " + String.join("-", "DAM", "2026", "Backend"));
    }
}
