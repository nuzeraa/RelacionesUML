/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;       // Agregación
    private Cliente cliente;   // Asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        cliente.setTarjeta(this); // vínculo bidireccional
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +
               ", " + banco + ", Cliente=" + cliente + "]";
    }
}