/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */
/**
 * Apuntes: Maneras de imprimir con formato en Java
 * ===============================================
 * 
 * 1. System.out.printf() - Imprime directamente formateado.
 * 2. String.format() - Crea un String formateado (no imprime).
 * 3. System.out.print() / println() con String.format().
 * 
 * Sintaxis básica: %[flags][width][.precision]conversion
 * - %d: int/byte/short/long (enteros)
 * - %f: float/double (decimales)
 * - %s: String
 * - %c: char
 * - %b: boolean
 * 
 * Flags comunes:
 * - -: izquierda (izq.)
 * - 0: relleno con 0
 * - +: signo siempre (+/-)
 * - espacio: espacio si positivo
 * - ,: separadores miles
 * 
 * Width: ancho mínimo total
 * Precision: decimales (.2f = 2 decimales)
 * 
 * Compila y ejecuta: javac ApuntesImprimir.java && java ApuntesImprimir
 */

public class ApuntesImprimir {
    public static void main(String[] args) {
        
        // ===== 1. EJEMPLOS BÁSICOS CON printf =====
        System.out.println("=== BÁSICOS printf ===");
        
        // %d para enteros
        int num = 42;
        System.out.printf("Entero: %d%n", num);  // 42
        
        // %f para decimales (por defecto 6 decimales)
        double pi = 3.1415926535;
        System.out.printf("PI completo: %f%n", pi);  // 3.141593
        
        // Precision: %.2f = 2 decimales
        System.out.printf("PI 2 decimales: %.2f%n", pi);  // 3.14
        
        // %s para String
        String nombre = "Ana";
        System.out.printf("Hola %s%n", nombre);  // Hola Ana
        
        // %c para char
        char letra = 'A';
        System.out.printf("Letra: %c%n", letra);  // A
        
        // %b para boolean
        boolean activo = true;
        System.out.printf("Activo: %b%n", activo);  // true
        
        // Múltiples argumentos
        System.out.printf("%s tiene %d años y nota %.2f%n", nombre, 20, 8.75);
        // Ana tiene 20 años y nota 8.75
        
        // %n para salto de línea (portable)
        System.out.printf("Línea 1%nLínea 2%n");
        
        
        // ===== 2. FLAGS Y ANCHO =====
        System.out.println("\n=== FLAGS Y ANCHO ===");
        
        // Ancho fijo: %10d (10 espacios total)
        System.out.printf("Num derecho: |%10d|%n", 123);  // |     123|
        
        // Izquierda: %-10d
        System.out.printf("Num izq: |%-10d|%n", 123);  // |123     |
        
        // Relleno 0: %010d
        System.out.printf("Con ceros: |%010d|%n", 123);  // |000000123|
        
        // Signo siempre: %+d
        System.out.printf("Positivo: |%+d|%n", 42);   // |+42|
        System.out.printf("Negativo: |%+d|%n", -42);  // |-42|
        
        // Espacio si positivo: % d
        System.out.printf("Espacio: |% d|%n", 42);    // | 42|
        System.out.printf("Neg: |% d|%n", -42);       // |-42|
        
        // Separadores miles: %,d
        System.out.printf("Miles: %,.2f%n", 1234.56);  // 1,234.56
        
        // Decimales con miles
        System.out.printf("Grande: %,.2f%n", 1234567.89);  // 1,234,567.89
        
        
        // ===== 3. EJEMPLOS AVANZADOS =====
        System.out.println("\n=== TABLA CON FORMATO ===");
        
        // Tabla alineada
        System.out.printf("%-10s %10s %10s%n", "Producto", "Cantidad", "Precio");
        System.out.printf("%-10s %10d %10.2f%n", "Manzana", 5, 1.25);
        System.out.printf("%-10s %10d %10.2f%n", "Banana", 3, 0.75);
        System.out.printf("%-10s %10d %10.2f%n", "Naranja", 2, 2.00);
        /*
        Producto   Cantidad    Precio
        Manzana           5      1.25
        Banana            3      0.75
        Naranja           2      2.00
        */
        
        
        // ===== 4. String.format() - NO IMPRIME, CREA STRING =====
        System.out.println("\n=== String.format() ===");
        
        String linea1 = String.format("Hola %s (%.2f)", nombre, pi);
        System.out.println(linea1);  // Hola Ana (3.14)
        
        String tabla = String.format("%-10s %10.2f%n", "Total", 10.50);
        System.out.print(tabla);  // Total     10.50
        
        
        // ===== 5. print() + format() =====
        System.out.println("\n=== print + format ===");
        System.out.print(String.format("Sin salto: %s |", nombre));  // Sin salto: Ana |
        System.out.println();  // Salto manual
        
        
        // ===== 6. ERRORES COMUNES (para que veas) =====
        System.out.println("\n=== ERRORES ===");
        // System.out.printf("%d", "texto");  // ERROR: tipos no coinciden
        // System.out.printf("Solo %");       // ERROR: % sin argumento
        // CORRECTO: siempre argumentos = %s
        
        System.out.println("\n¡FIN! Copia, compila y prueba cada sección.");
    }
}
