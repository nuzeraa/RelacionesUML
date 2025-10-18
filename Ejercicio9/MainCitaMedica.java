/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relacionesuml;

public class MainCitaMedica {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Carolina López", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Martín Pérez", "Cardiología");
        CitaMedica cita1 = new CitaMedica("2025-10-22", "15:30", paciente1, profesional1);

        System.out.println(cita1);
    }
}
