/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class RecepcionHotel {
    public void hacerReserva() {
        Scanner sc = new Scanner(System.in);
        HotelCentral hotel = HotelCentral.getInstancia();
        double precioPorNoche = 85.50;
        System.out.print("Nombre del cliente: ");
        String cliente = sc.nextLine();
        System.out.print("Numero de habitaciones: ");
        int habitaciones = sc.nextInt();
        System.out.print("Numero de noches: ");
        int noches = sc.nextInt();        
        boolean reservado = hotel.reservarHabitacion(habitaciones, precioPorNoche, noches);
        
        if (reservado) {
            System.out.println("Reserva confirmada para " + cliente);
        }
    } 
}
