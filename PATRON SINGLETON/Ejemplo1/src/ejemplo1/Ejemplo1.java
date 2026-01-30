/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        RecepcionHotel recepcion = new RecepcionHotel();
        AdministracionHotel administracion = new AdministracionHotel();
        HotelCentral hotel = HotelCentral.getInstancia();
        
        int op;
        
        do {
            System.out.println("\n=== SISTEMA DE HOTEL ===");
            System.out.println("1. Hacer Reserva");
            System.out.println("2. Ver Habitaciones Disponibles");
            System.out.println("3. Ver Estado del Hotel");
            System.out.println("4. Ver Reporte Financiero");
            System.out.println("5. Salir");
            System.out.print("Ingrese una Opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch(op) {
                case 1:
                    recepcion.hacerReserva();
                    break;                    
                case 2:
                    System.out.println("Habitaciones disponibles: " + hotel.getDisponibles());
                    break;                    
                case 3:
                    hotel.mostrarEstado();
                    break;
                    
                case 4:
                    administracion.verReporteFinanciero();
                    break;
                case 5:break;
                default: System.out.println("Opcion no valida!");    
            }
        } while(op != 5);
        sc.close();
    }   
}
