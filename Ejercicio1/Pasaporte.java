
package relacionesuml;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;        // Composición
    private Titular titular;  // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); // Composición: se crea dentro del constructor
        this.titular = titular;
        titular.setPasaporte(this); // Vinculo bidireccional
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision +
               ", " + foto + ", Titular=" + titular + "]";
    }
}
