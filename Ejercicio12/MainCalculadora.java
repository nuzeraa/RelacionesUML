/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainCalculadora {
    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Laura García", "27-40123456-8");
        Impuesto impuesto1 = new Impuesto(10000, contribuyente1);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto1);
    }
}