/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class Calculadora {

    // Dependencia de uso: usa Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // aplica IVA 21%
        System.out.println("💰 Monto total con IVA: $" + total);
        System.out.println("Detalle: " + impuesto);
    }
}