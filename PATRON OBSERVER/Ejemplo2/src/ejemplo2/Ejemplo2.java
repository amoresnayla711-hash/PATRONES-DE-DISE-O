/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Mesa mesa = new Mesa();
        String ultimoCliente = ""; 
        
        do{
            System.out.println("\n====== SISTEMA DE RESERVAS =======");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Reservar Mesa");
            System.out.println("3. Ver Clientes Notificados");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    ultimoCliente = sc.nextLine(); 
                    mesa.agregarCliente(new Restaurante(ultimoCliente));
                    System.out.println("Cliente agregado: " + ultimoCliente);
                    break;
                    
                case 2:
                    if (!ultimoCliente.isEmpty()) {
                        mesa.reservarMesa(ultimoCliente); 
                    } else {
                        System.out.println("Primero agregue un cliente");
                    }
                    break;
                    
                case 3:
                    mesa.mostrarClientesNotificados();
                    break;
                    
                case 4:
                    break;
                    
                default: 
                    System.out.println("No existe esa opcion!");
            }
            
        } while(op != 4);
    }
}
