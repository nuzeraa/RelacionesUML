/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioFirma usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, UsuarioFirma usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", " + usuario + "]";
    }
}
