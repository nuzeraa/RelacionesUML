/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainComputadora {
    public static void main(String[] args) {
        Propietario propietario1 = new Propietario("Carlos Gómez", "39234567");
        Computadora compu1 = new Computadora("HP", "SN12345", "ASUS B550", "AMD B550", propietario1);

        System.out.println(compu1);
        System.out.println("El propietario accede a su computadora: " + propietario1.getComputadora());
    }
}
