/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainLibro {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial1 = new Editorial("Sudamericana", "Buenos Aires, Argentina");
        Libro libro1 = new Libro("Cien años de soledad", "978-950-07-1234-5", autor1, editorial1);

        System.out.println(libro1);
    }
}
