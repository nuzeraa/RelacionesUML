/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;     // Composición
    private TitularCuenta titular;    // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion, TitularCuenta titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion); // Composición
        this.titular = titular;
        titular.setCuenta(this); // vínculo bidireccional
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + ", " + clave + ", Titular=" + titular + "]";
    }
}