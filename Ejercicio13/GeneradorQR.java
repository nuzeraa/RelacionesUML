/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class GeneradorQR {

    // Dependencia de creación: crea un CódigoQR dentro del método
    public void generar(String valor, UsuarioQR usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("✅ Código QR generado exitosamente:");
        System.out.println(codigo);
    }
}
