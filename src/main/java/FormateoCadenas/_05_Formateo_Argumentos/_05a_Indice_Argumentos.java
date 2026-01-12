/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FormateoCadenas._05_Formateo_Argumentos;

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * VIII – Formateo de cadenas
 *
 * Archivo: 05a_Indice_Argumentos.java
 *
 * OBJETIVO
 * --------
 * Mostrar cómo seleccionar el argumento exacto que se quiere
 * formatear usando el índice con $.
 *
 * Muy útil cuando queremos:
 *  - Repetir argumentos
 *  - Cambiar el orden sin repetir variables
 */

public class _05a_Indice_Argumentos {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        /*
         * 1. FORMATEO NORMAL
         * ------------------
         * Los argumentos se sustituyen en orden
         */

        System.out.printf("a: %d, b: %d%n", a, b); // a=10, b=20

        /*
         * 2. USO DE ÍNDICE CON $
         * ----------------------
         * Sintaxis:
         *   %[n]$[especificador]
         * 
         * n → número del argumento (1-based)
         */

        System.out.printf("Segundo argumento: %2$d, primero: %1$d%n", a, b);
        // Resultado: "Segundo argumento: 20, primero: 10"

        /*
         * 3. REPETIR EL MISMO ARGUMENTO
         * -----------------------------
         */

        System.out.printf("b: %2$d, b de nuevo: %2$d%n", a, b);

        /*
         * 4. USO PRÁCTICO
         * ----------------
         * Muy útil en:
         *  - Listados tabulares
         *  - Mensajes complejos
         *  - Evitar duplicar variables
         */

        /*
         * 5. ERRORES TÍPICOS
         * ------------------
         * - Indice fuera de rango:
         *   System.out.printf("%3$d", a, b); ❌
         * 
         * - Mezclar índices y sin índice confunde:
         *   System.out.printf("%d %2$d", a, b); ❌
         *
         * Regla: usa **índice para todos o ninguno**.
         */
    }
}
