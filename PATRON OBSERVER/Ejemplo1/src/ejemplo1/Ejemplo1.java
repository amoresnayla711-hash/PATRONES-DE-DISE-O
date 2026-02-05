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
        Scanner sc = new Scanner(System.in);
        Correo correo = null;

        int opcion;
        
        do {
            System.out.println("\n=== SISTEMA DE CORREO ELECTRONICO ===");
            System.out.println("1. Ingresar el asunto");
            System.out.println("2. Ingresar el correo:  ");
            System.out.println("3. Ver usuarios notificados:");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el asunto del correo: ");
                     String asunto = sc.nextLine();
                     correo = new Correo(asunto);break;
                    
                case 2:
                    System.out.print("Ingrese el correo del usuario: ");
                    String nombre = sc.nextLine();
                   correo.agregarCliente(new UsuarioCorreo(nombre));break;
                    
                case 3:
                      correo.mostrarNotificaciones();break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Opcion no válida");
            }
        } while (opcion != 4);
        
        sc.close();
    }
}