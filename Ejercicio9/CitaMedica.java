/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;       // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica [fecha=" + fecha + ", hora=" + hora +
               ", " + paciente + ", " + profesional + "]";
    }
}