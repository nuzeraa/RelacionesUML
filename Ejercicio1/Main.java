
package relacionesuml;

public class Main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Juan Pérez", "40123456");
        Pasaporte pasaporte1 = new Pasaporte("AR123456", "2024-01-10", "foto_juan.jpg", "JPG", titular1);

        System.out.println(pasaporte1);
        System.out.println("El titular accede a su pasaporte: " + titular1.getPasaporte());
    }
}