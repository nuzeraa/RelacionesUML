/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainDocumento {
    public static void main(String[] args) {
        UsuarioFirma usuario1 = new UsuarioFirma("Lucía Romero", "lucia.romero@mail.com");
        Documento documento1 = new Documento(
            "Contrato Laboral", 
            "Contenido del contrato...", 
            "HASH123ABC", 
            "2025-10-18", 
            usuario1
        );

        System.out.println(documento1);
    }
}