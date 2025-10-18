/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class UsuarioFirma {
    private String nombre;
    private String email;

    public UsuarioFirma(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioFirma [nombre=" + nombre + ", email=" + email + "]";
    }
}