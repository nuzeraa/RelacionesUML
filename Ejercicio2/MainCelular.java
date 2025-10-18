/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainCelular {
    public static void main(String[] args) {
        Bateria bateria1 = new Bateria("Samsung-EB-BG950", 4000);
        Usuario usuario1 = new Usuario("Lucía Fernández", "39876543");
        Celular celular1 = new Celular("356789451234567", "Samsung", "Galaxy S23", bateria1, usuario1);

        System.out.println(celular1);
        System.out.println("El usuario accede a su celular: " + usuario1.getCelular());
    }
}