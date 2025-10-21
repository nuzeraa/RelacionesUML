/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainReproductor {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Coldplay", "Rock Alternativo");
        Cancion cancion1 = new Cancion("Viva la Vida", artista1);

        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
    }
}