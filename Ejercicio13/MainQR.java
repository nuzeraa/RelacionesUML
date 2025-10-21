/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainQR {
    public static void main(String[] args) {
        UsuarioQR usuario1 = new UsuarioQR("Sofía Ramos", "sofia.ramos@mail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("QR-123-XYZ", usuario1);
    }
}
