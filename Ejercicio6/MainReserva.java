/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainReserva {
    public static void main(String[] args) {
        ClienteReserva cliente1 = new ClienteReserva("Laura Díaz", "1123456789");
        Mesa mesa1 = new Mesa(5, 4);
        Reserva reserva1 = new Reserva("2025-10-20", "21:00", cliente1, mesa1);

        System.out.println(reserva1);
    }
}