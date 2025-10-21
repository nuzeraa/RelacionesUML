/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainCuenta {
    public static void main(String[] args) {
        TitularCuenta titular1 = new TitularCuenta("Andrés Torres", "40111222");
        CuentaBancaria cuenta1 = new CuentaBancaria("1230007896543219870012", 250000.50, "ABX987", "2025-10-18", titular1);

        System.out.println(cuenta1);
        System.out.println("El titular accede a su cuenta: " + titular1.getCuenta());
    }
}