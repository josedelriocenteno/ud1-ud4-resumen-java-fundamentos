/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Expresiones_Regulares;

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * IX – Expresiones Regulares
 *
 * Archivo: 99_Resumen_y_BuenasPracticas_RegEx.java
 *
 * OBJETIVO
 * --------
 * Resumir los conceptos clave de RegEx en Java.
 * Dar buenas prácticas y consejos frecuentes de examen.
 */

public class _99_Resumen_y_BuenasPracticas_RegEx {

    public static void main(String[] args) {

        /*
         * 1. Símbolos básicos
         * -------------------
         * .       → cualquier carácter
         * ^expres → inicio del String
         * expres$ → final del String
         * [abc]   → conjunto de caracteres
         * [^abc]  → negación
         * [a-z0-9]→ rango de caracteres
         * A|B     → OR
         * AB      → concatenación
         */

        /*
         * 2. Meta-caracteres
         * ------------------
         * \\d → dígito
         * \\D → no dígito
         * \\s → espacio
         * \\S → no espacio
         * \\w → letra, dígito o _
         * \\W → no \\w
         * \\b → límite de palabra
         */

        /*
         * 3. Cuantificadores
         * ------------------
         * {X}    → exactamente X veces
         * {X,Y}  → entre X y Y veces
         * {X,}   → al menos X veces
         * *      → 0 o más veces
         * +      → 1 o más veces
         * ?      → 0 o 1 vez
         */

        /*
         * 4. Clases Java
         * ---------------
         * Pattern.compile(String regex) → crea patrón
         * Matcher.matches()              → valida todo el String
         * Matcher.find()                 → busca coincidencia dentro del String
         * Matcher.group()                → devuelve la coincidencia encontrada
         * PatternSyntaxException         → captura errores de sintaxis del patrón
         */

        /*
         * 5. Validaciones comunes
         * ----------------------
         * - DNI: \\d{8}[A-Z]
         * - Email: \\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,})+
         * - Teléfono: (\\+34)?[6-7]\\d{8}
         */

        /*
         * 6. Buenas prácticas
         * ------------------
         * - Un concepto = un archivo
         * - Siempre comentar los ejemplos
         * - Usar matches() para validar completo y find() para buscar patrones dentro del texto
         * - Escapar correctamente los caracteres especiales (\\)
         * - Probar con casos válidos e inválidos
         * - Mantener expresiones legibles: dividir patrones complejos en partes
         * - Revisar límites de palabras \\b para evitar coincidencias parciales
         */

        /*
         * 7. Consejos DAM / examen
         * -------------------------
         * - Memorizar los símbolos básicos y meta-caracteres más frecuentes
         * - Practicar validaciones típicas: DNI, email, teléfono
         * - Saber cuándo usar matches() vs find()
         * - Siempre comprobar que la expresión regular es correcta para todos los casos de prueba
         */
        
        System.out.println("Resumen RegEx listo: repasar símbolos, cuantificadores y buenas prácticas.");
    }
}
