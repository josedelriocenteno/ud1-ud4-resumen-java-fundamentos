
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

/**
 * API de Java
 * X – Colores en Consola
 *
 * Archivo: ConsoleColors.java
 *
 * OBJETIVO
 * --------
 * Proporcionar constantes para imprimir texto en colores y estilos en la consola.
 * Útil para resaltar información, errores, advertencias o logs de manera visual.
 *
 * NOTA
 * ----
 * Funciona en consolas que soporten ANSI (Linux, Mac, Windows 10+ con terminal compatible).
 */



public class ConsoleColors {

    // ====================================================
    // RESET → volver al color por defecto de la consola
    // ====================================================
    public static final String RESET = "\033[0m";  // Restablece estilo y color

    // ====================================================
    // COLORES REGULARES → texto normal
    // ====================================================
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";

    // ====================================================
    // BOLD → texto en negrita
    // ====================================================
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String WHITE_BOLD = "\033[1;37m";

    // ====================================================
    // UNDERLINE → texto subrayado
    // ====================================================
    public static final String BLACK_UNDERLINED = "\033[4;30m";
    public static final String RED_UNDERLINED = "\033[4;31m";
    public static final String GREEN_UNDERLINED = "\033[4;32m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String BLUE_UNDERLINED = "\033[4;34m";
    public static final String PURPLE_UNDERLINED = "\033[4;35m";
    public static final String CYAN_UNDERLINED = "\033[4;36m";
    public static final String WHITE_UNDERLINED = "\033[4;37m";

    // ====================================================
    // BACKGROUND → color de fondo
    // ====================================================
    public static final String BLACK_BACKGROUND = "\033[40m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String WHITE_BACKGROUND = "\033[47m";

    // ====================================================
    // HIGH INTENSITY → colores brillantes
    // ====================================================
    public static final String BLACK_BRIGHT = "\033[0;90m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String YELLOW_BRIGHT = "\033[0;93m";
    public static final String BLUE_BRIGHT = "\033[0;94m";
    public static final String PURPLE_BRIGHT = "\033[0;95m";
    public static final String CYAN_BRIGHT = "\033[0;96m";
    public static final String WHITE_BRIGHT = "\033[0;97m";

    // ====================================================
    // BOLD HIGH INTENSITY → negrita + brillante
    // ====================================================
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";

    // ====================================================
    // HIGH INTENSITY BACKGROUNDS → fondos brillantes
    // ====================================================
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m";
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";

    // ====================================================
    // EJEMPLOS DE USO
    // ====================================================
    public static void main(String[] args) {
        System.out.println(RED + "Este texto es rojo" + RESET);
        System.out.println(GREEN_BOLD + "Texto verde en negrita" + RESET);
        System.out.println(BLUE_UNDERLINED + "Texto azul subrayado" + RESET);
        System.out.println(YELLOW_BACKGROUND + "Texto con fondo amarillo" + RESET);
        System.out.println(PURPLE_BOLD_BRIGHT + "Texto púrpura negrita brillante" + RESET);
    }
    
    // ====================================================
    // APUNTES ADICIONALES SOBRE RESET
    // ====================================================

    /*
     * RESET → "\033[0m"
     *
     * OBJETIVO
     * --------
     * Restablecer el color y estilo de la consola al valor predeterminado.
     *
     * CONCEPTO CLAVE
     * ---------------
     * - No importa qué color o estilo estés usando: rojo, verde, negrita, subrayado...
     * - Cuando concatenas RESET al final de un texto coloreado, cualquier texto posterior
     *   se imprimirá en el color y estilo predeterminado de la terminal.
     * - Importante: importar la clase ConsoleColors NO aplica colores automáticamente.
     *
     * EJEMPLOS
     */

    // 1️⃣ Sin RESET → el siguiente println heredaría el color anterior (dependiendo de la consola)
    // System.out.println(ConsoleColors.RED + "ERROR sin RESET");
    // Esto puede aparecer también en rojo
    // System.out.println("Este texto podría heredar el color rojo");

    // 2️⃣ Con RESET → línea siguiente vuelve al color normal
    // System.out.println(ConsoleColors.RED + "ERROR con RESET" + ConsoleColors.RESET);
    // System.out.println("Este texto aparece en color normal");

    // 3️⃣ Varias líneas en rojo con un solo println
    // System.out.println(ConsoleColors.RED + "Línea 1\nLínea 2\nLínea 3" + ConsoleColors.RESET);

    // 4️⃣ Uso seguro recomendado → método auxiliar
    public static void printColor(String color, String texto) {
        System.out.println(color + texto + ConsoleColors.RESET);
    }

    // Uso del método auxiliar
    // printColor(ConsoleColors.GREEN_BOLD, "Éxito: operación completada");
    // printColor(ConsoleColors.YELLOW_UNDERLINED, "Aviso: datos incompletos");

    /*
     * REGLAS DE ORO
     * -------------
     * 1. Siempre concatena RESET al final de cualquier texto coloreado.
     * 2. Cada println es independiente; el color no se propaga automáticamente.
     * 3. RESET no cambia el color, solo "borra" cualquier estilo activo.
     * 4. Útil para logs, mensajes de error, advertencias o destacar información.
     */
  
}
