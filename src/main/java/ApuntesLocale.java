/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author delcenjo
 */

import java.util.Locale;
import java.text.NumberFormat;
import java.text.DateFormat;

public class ApuntesLocale {
    public static void main(String[] args) {
        double precio = 1234.5678;
        
        // ===== 1. CREAR Locale =====
        Locale españa = new Locale("es", "ES");      // **español España**
        Locale mexico = new Locale("es", "MX");      // **español México**
        Locale usa = Locale.US;                      // **USA**
        Locale uk = Locale.UK;                       // **Reino Unido**
        
        // ===== 2. NÚMEROS por país =====
        NumberFormat nf;
        
        nf = NumberFormat.getInstance(españa);
        System.out.println("España: " + nf.format(precio));  // **1.234,57**
        
        nf = NumberFormat.getInstance(usa);
        System.out.println("USA: " + nf.format(precio));     // **1,234.57**
        
        nf = NumberFormat.getInstance(mexico);
        System.out.println("México: " + nf.format(precio));  // **1,234.57**
        
        // ===== 3. MONEDA AUTOMÁTICA =====
        nf = NumberFormat.getCurrencyInstance(españa);
        System.out.println("€ España: " + nf.format(precio)); // **1.234,57 €**
        
        nf = NumberFormat.getCurrencyInstance(usa);
        System.out.println("$ USA: " + nf.format(precio));    // **$1,234.57**
        
        // ===== 4. PORCENTAJE =====
        nf = NumberFormat.getPercentInstance(españa);
        System.out.println("% España: " + nf.format(0.756));  // **76 %**
        
        // ===== 5. FECHAS =====
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, españa);
        System.out.println("Fecha ES: " + df.format(new java.util.Date())); // **11/01/26**
        
        df = DateFormat.getDateInstance(DateFormat.SHORT, usa);
        System.out.println("Fecha US: " + df.format(new java.util.Date())); // **1/11/26**
        
        // ===== 6. Locale IDIOMA =====
        System.out.println("España: " + españa.getDisplayLanguage());  // **español**
        System.out.println("España país: " + españa.getDisplayCountry()); // **España**
        
        // ===== 7. DAM PRO - Factura internacional =====
        System.out.println("\n=== FACTURA MULTIPAÍS ===");
        String[] paises = {"es-ES", "en-US", "de-DE", "fr-FR"};
        
        for(String pais : paises) {
            Locale loc = Locale.forLanguageTag(pais);
            NumberFormat moneda = NumberFormat.getCurrencyInstance(loc);
            System.out.println(loc.getDisplayCountry() + ": " + moneda.format(precio));
        }
        // España: 1.234,57 €
        // Estados Unidos: $1,234.57
        // Alemania: 1.234,57 €
        // Francia: 1 234,57 €
    }
}

