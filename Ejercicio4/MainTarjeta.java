/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainTarjeta {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente1 = new Cliente("María López", "40567890");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234-5678-9876-5432", "12/27", banco1, cliente1);

        System.out.println(tarjeta1);
        System.out.println("El cliente accede a su tarjeta: " + cliente1.getTarjeta());
    }
}