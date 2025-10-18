/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainVehiculo {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Nafta", "MTR-987654");
        Conductor conductor1 = new Conductor("Santiago Ruiz", "L1234567");
        Vehiculo vehiculo1 = new Vehiculo("AB123CD", "Toyota Corolla", motor1, conductor1);

        System.out.println(vehiculo1);
        System.out.println("El conductor accede a su vehículo: " + conductor1.getVehiculo());
    }
}