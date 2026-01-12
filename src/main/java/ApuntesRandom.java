/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

/**
 * Apuntes COMPLETOS: CLASE java.util.Random - NÚMEROS ALEATORIOS
 * =============================================================
 * 
 * IMPORT: import java.util.Random;
 * 
 * ¿PARA QUÉ? Simulaciones, tests, juegos, datos aleatorios.
 * 
 * DIFERENCIA CON Math.random():
 * - Math.random(): double [0.0, 1.0) - SIMPLE
 * - Random: Objeto reutilizable + MÁS métodos
 * 
 * Compila: javac ApuntesRandom.java && java ApuntesRandom
 */

import java.util.Random;

public class ApuntesRandom {
    public static void main(String[] args) {
        
        // ===== 1. CREACIÓN Y SEMILLA =====
        System.out.println("=== CREACIÓN Random ===");
        
        // Sin semilla: aleatorio "verdadero" (sistema)
        Random rnd1 = new Random();
        
        // Con semilla: SIEMPRE misma secuencia (tests/debug)
        Random rnd2 = new Random(12345);  // ¡Siempre igual!
        
        // Desde tiempo actual
        Random rnd3 = new Random(System.currentTimeMillis());
        
        System.out.printf("Usando rnd1: %.3f%n", rnd1.nextDouble());
        
        
        // ===== 2. MÉTODOS BÁSICOS =====
        System.out.println("\n=== BÁSICOS ===");
        
        // nextDouble(): [0.0, 1.0)
        double d1 = rnd1.nextDouble();
        System.out.printf("nextDouble(): %.3f%n", d1);
        
        // nextFloat(): [0.0, 1.0)
        System.out.printf("nextFloat(): %.3f%n", rnd1.nextFloat());
        
        // nextBoolean()
        System.out.printf("nextBoolean(): %b%n", rnd1.nextBoolean());
        
        // nextInt(): int completo (-2^31 a 2^31-1)
        System.out.printf("nextInt(): %d%n", rnd1.nextInt());
        
        
        // ===== 3. RANGOS ESPECÍFICOS (IMPORTANTE) =====
        System.out.println("\n=== RANGOS 0 a N-1 ===");
        // Fórmula universal: nextInt(max - min + 1) + min
        
        // nextInt(N): 0 ≤ x < N  (¡NO incluye N!)
        int dado = rnd1.nextInt(6) + 1;  // 1 a 6
        System.out.printf("Dado 1-6: %d%n", dado);
        
        // 5 a 10
        int num = rnd1.nextInt(6) + 5;  // 0-5 + 5 = 5-10
        System.out.printf("5-10: %d%n", num);
        
        // Decimales 0 a 10.0
        double dec = rnd1.nextDouble() * 10.0;
        System.out.printf("0-10.0: %.2f%n", dec);
        
        // Enteros negativos: -5 a 5
        int neg = rnd1.nextInt(11) - 5;  // 0-10 menos 5
        System.out.printf("-5 a 5: %d%n", neg);
        
        
        // ===== 4. MÉTODOS ESPECÍFICOS POR TIPO =====
        System.out.println("\n=== TIPOS ESPECÍFICOS ===");
        
        // nextInt(), nextLong(), nextFloat(), nextDouble()
        System.out.printf("nextLong(): %d%n", rnd1.nextLong());
        
        // nextGaussian(): distribución normal (media=0, desv=1)
        System.out.printf("nextGaussian(): %.2f%n", rnd1.nextGaussian());
        
        // nextBytes(): array de bytes aleatorios
        byte[] bytes = new byte[5];
        rnd1.nextBytes(bytes);
        System.out.printf("nextBytes(): %s%n", new String(bytes));
        
        
        // ===== 5. EJEMPLO PRÁCTICO: SIMULACIÓN DADOS =====
        System.out.println("\n=== SIMULACIÓN 100 DADOS ===");
        int[] conteo = new int[6];  // 0-5 (dado 1-6)
        
        for(int i = 0; i < 100; i++) {
            int dado2 = rnd1.nextInt(6) + 1;
            conteo[dado2 - 1]++;
        }
        
        // Tabla resultados
        System.out.printf("%-5s %s%n", "Dado", "Veces");
        for(int d = 1; d <= 6; d++) {
            System.out.printf("%-5d %d%n", d, conteo[d-1]);
        }
        
        
        // ===== 6. Math.random() vs Random =====
        System.out.println("\n=== Math.random() vs Random ===");
        System.out.printf("Math.random(): %.3f%n", Math.random());
        System.out.printf("rnd.nextDouble(): %.3f%n", rnd1.nextDouble());
        
        // FÓRMULA equivalente:
        // Math.random() * 10 → 0.0 a 9.999...
        // rnd.nextDouble() * 10 → igual
        
        int dadoMath = (int)(Math.random() * 6) + 1;
        System.out.printf("Dado Math.random(): %d%n", dadoMath);
        
        
        // ===== 7. MULTIPLE Random (NO RECOMENDADO) =====
        System.out.println("\n=== ⚠️ BUENAS PRÁCTICAS ===");
        // ❌ MAL: nuevo Random cada vez
        // int malo = new Random().nextInt(6) + 1;
        
        // ✅ BIEN: UN SOLO Random reutilizable
        Random global = new Random();
        for(int i = 0; i < 3; i++) {
            System.out.printf("Global dado %d: %d%n", i+1, global.nextInt(6)+1);
        }
        
        
        // ===== 8. NOTAS Y ERRORES =====
        System.out.println("\n=== ⚠️ CUIDADO ===");
        // 1. nextInt(0) → IllegalArgumentException
        // 2. nextInt(6) = 0,1,2,3,4,5 → +1 para 1-6
        // 3. nextDouble() NUNCA = 1.0, máximo 0.999...
        // 4. Usa SEMILLA para reproducir resultados (tests)
        
        System.out.println("\n¡PERFECTO para ejercicios Tema 3-4! Simulaciones, estadística.");
    }
}

/**
1-N:        rnd.nextInt(N) + 1
M-N:        rnd.nextInt(N-M+1) + M
0.0-X:      rnd.nextDouble() * X
Decimales:  (int)(rnd.nextDouble() * 100) / 100.0
 */