/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author USER
 */
public class HotelCentral {
    private int habitacionesDisponibles;
    private int habitacionesOcupadas;
    private double ingresosTotales;
    //1.Definir una variable estática
    private static HotelCentral instancia;
    //2. Crear un contructor privado
    private HotelCentral(){
        habitacionesDisponibles = 20;
        habitacionesOcupadas = 0;
        ingresosTotales = 0.0;
        System.out.println("Sistema Hotelero Iniciado");
        System.out.println("Habitaciones totales: 20");      
    }
    //3. Agregar un método público estático
    public static HotelCentral getInstancia(){
        if (instancia == null) {
            instancia = new HotelCentral();
        }
        return instancia;
    }
    
    //METODOS
    public boolean reservarHabitacion(int numHabitaciones, double precioNoche, int numNoches) {
        if (numHabitaciones <= habitacionesDisponibles) {
            habitacionesDisponibles = habitacionesDisponibles - numHabitaciones;
            habitacionesOcupadas = habitacionesOcupadas + numHabitaciones;
            double total = precioNoche * numNoches * numHabitaciones;
            ingresosTotales = ingresosTotales + total;
            System.out.println("Reserva exitosa: " + numHabitaciones + " habitaciones");
            System.out.println("Total a pagar: $" + total);
            return true;
        } else {
            System.out.println("No hay suficientes habitaciones disponibles");
            return false;
        }
    }
    
    public void desocuparHabitacion(int numHabitaciones) {
        if (numHabitaciones <= habitacionesOcupadas) {
            habitacionesDisponibles = habitacionesDisponibles + numHabitaciones;
            habitacionesOcupadas = habitacionesOcupadas - numHabitaciones;
            System.out.println(numHabitaciones + " habitaciones liberadas");
        } else {
            System.out.println("Error: No hay tantas habitaciones ocupadas");
        }
    }
    
    public void mostrarEstado() {
        System.out.println("=== ESTADO DEL HOTEL ===");
        System.out.println("Habitaciones disponibles: " + habitacionesDisponibles);
        System.out.println("Habitaciones ocupadas: " + habitacionesOcupadas);
        System.out.println("Ingresos totales: $" + ingresosTotales);

    }
     
    public int getDisponibles() {
        return habitacionesDisponibles;
    }
    
    public int getOcupadas() {
        return habitacionesOcupadas;
    }
    
    public double getIngresos() {
        return ingresosTotales;
    }
}
