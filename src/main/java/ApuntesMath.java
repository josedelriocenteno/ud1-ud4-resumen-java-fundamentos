/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

/**
 * Apuntes: Clase java.math - Funciones matemáticas esenciales
 * =========================================================
 * 
 * Import: import static java.lang.Math.*;  (para usar sin Math.)
 * 
 * Contiene métodos ESTÁTICOS (Math.PI, Math.sqrt(...))
 * NO se crea objeto: Math m = new Math(); ❌
 * 
 * Compila y ejecuta: javac ApuntesMath.java && java ApuntesMath
 * 
 * Principales constantes:
 * - PI: 3.141592653589793
 * - E: 2.718281828459045 (base log natural)
 */

import static java.lang.Math.*;  // Importa TODO sin prefijo Math.

public class ApuntesMath {
    public static void main(String[] args) {
        
        // ===== 1. VALORES ABSOLUTOS Y REDONDEO =====
        System.out.println("=== ABSOLUTOS Y REDONDEO ===");
        
        // abs(): valor absoluto
        System.out.printf("abs(-5): %d%n", abs(-5));     // 5
        System.out.printf("abs(-3.7): %.1f%n", abs(-3.7)); // 3.7
        
        // Redondeo COMPLETO - Diferencias claras:
        double x = 4.6;
        System.out.printf("round(%.1f): %.0f → Más cercano (≥0.5 arriba)%n", x, Math.round(x));  // 5
        System.out.printf("floor(%.1f): %.0f → Siempre ABAJO (-∞)%n", x, Math.floor(x));       // 4
        System.out.printf("ceil(%.1f): %.0f → Siempre ARRIBA (+∞)%n", x, Math.ceil(x));       // 5
        System.out.printf("rint(%.1f): %.0f → Par más cercano (.5→par)%n", x, Math.rint(x));   // 5

        // CASOS .5 que diferencian round vs rint:
        double medio = 4.5;
        System.out.printf("%.1f → round:%d rint:%.0f%n", medio, Math.round(medio), Math.rint(medio));  // 5 vs 4

        
        // trunc() no existe; usa floor/ceil para enteros negativos
        
        // ===== 2. POTENCIAS, RAÍCES Y EXPONENCIALES =====
        System.out.println("\n=== POTENCIAS Y RAÍCES ===");
        
        // pow(base, exp): base^exp
        System.out.printf("2^10 = %.0f%n", pow(2, 10));  // 1024
        
        // sqrt(): raíz cuadrada
        System.out.printf("sqrt(16) = %.1f%n", sqrt(16));  // 4.0
        
        // cbrt(): raíz cúbica
        System.out.printf("cbrt(27) = %.1f%n", cbrt(27));  // 3.0
        
        // exp(): e^x
        System.out.printf("exp(1) ≈ %.2f (E)%n", exp(1));  // 2.72
        
        // log(): log natural (ln)
        System.out.printf("ln(E) = %.2f%n", log(E));  // 1.0
        
        // log10(): log base 10
        System.out.printf("log10(100) = %.0f%n", log10(100));  // 2
        
        // ===== 3. TRIGONOMETRÍA (radianes!) =====
        System.out.println("\n=== TRIGONOMETRÍA ===");
        
        // sin, cos, tan (radianes)
        double rad = PI / 2;  // 90 grados
        System.out.printf("sin(PI/2) = %.2f%n", sin(rad));  // 1.0
        System.out.printf("cos(0) = %.2f%n", cos(0));        // 1.0
        
        // A grados: toDegrees()
        System.out.printf("PI rad = %.1f grados%n", toDegrees(PI));  // 180.0
        
        // A radianes: toRadians()
        System.out.printf("90 grados = %.2f rad%n", toRadians(90));  // 1.57
        
        // hypot(x,y): sqrt(x² + y²) sin overflow
        System.out.printf("hypot(3,4) = %.0f%n", hypot(3,4));  // 5
        
        // ===== 4. MÁXIMOS, MÍNIMOS Y ALEATORIOS =====
        System.out.println("\n=== MAX/MIN Y RANDOM ===");
        
        // max/min (dos números)
        System.out.printf("max(10,20) = %d%n", max(10,20));  // 20
        System.out.printf("min(3.2,1.9) = %.1f%n", min(3.2,1.9));  // 1.9
        
        // random(): [0.0, 1.0)
        System.out.printf("random(): %.3f%n", random());  // ej: 0.725
        
        // Entero aleatorio 0 a N-1
        int dado = (int)(random() * 6) + 1;
        System.out.printf("Dado: %d%n", dado);  // 1-6
        
        // ===== 5. SIGNO Y OTROS =====
        System.out.println("\n=== SIGNO Y MÁS ===");
        
        // signum(): -1, 0 o 1
        System.out.printf("signum(5) = %.0f%n", signum(5));   // 1.0
        System.out.printf("signum(-3) = %.0f%n", signum(-3)); // -1.0
        
        // IEEEremainder(a,b): resto con signo de a
        System.out.printf("remainder(10,3) = %.1f%n", IEEEremainder(10,3));  // 1.0
        
        // ===== 6. EJEMPLO PRÁCTICO: TRIÁNGULO =====
        System.out.println("\n=== EJEMPLO: LADOS TRIÁNGULO ===");
        double a = 3, b = 4, c = 5;
        double area = 0.25 * sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c));  // Herón
        System.out.printf("Área triángulo %.0f-%.0f-%.0f = %.2f%n", a,b,c, area);  // 6.00
        
        // ===== 7. ERRORES COMUNES =====
        System.out.println("\n=== NOTAS ===");
        // Math.sqrt(-1) → NaN (no error)
        System.out.printf("sqrt(-1): %s%n", sqrt(-1));  // NaN
        // Usa Double.isNaN() para chequear
        // random() NO incluye 1.0
        // Trigono SIEMPRE radianes, no grados!
        
        System.out.println("\n¡FIN! Úsalo en ejercicios de cálculos numéricos.");
    }
}

