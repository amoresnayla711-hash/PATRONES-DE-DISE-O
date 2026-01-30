/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author USER
 */
public class AdministracionHotel {
    public void agregarHabitaciones(int cantidad) {
        
        HotelCentral hotel = HotelCentral.getInstancia();
        System.out.println("Se agregaron " + cantidad + " habitaciones nuevas al sistema");
    }
    
    public void verReporteFinanciero() {
        HotelCentral hotel = HotelCentral.getInstancia();
        System.out.println("\n=== REPORTE FINANCIERO ===");
        System.out.println("Ingresos totales: $" + hotel.getIngresos());
        System.out.println("Ocupacion actual: " + hotel.getOcupadas() + "/20 habitaciones");
    }
}
