/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaNotificacion sistema = new SistemaNotificacion();
        
        System.out.println("Ingrese el mensaje a enviar: ");
        String mensaje = sc.nextLine();
        
        int op;
        do {
            System.out.println("======SISTEMA DE NOTIFICACIONES======");
            System.out.println("1. Enviar por Email");
            System.out.println("2. Enviar por SMS");
            System.out.println("3. Enviar por Notificacion Push");
            System.out.println("4. Enviar por WhatsApp");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();  
            
            switch(op) {
                case 1:
                    sistema.setNotificacion(new NotificacionEmail());
                    sistema.enviarNotificacion(mensaje);
                    break;
                case 2:
                    sistema.setNotificacion(new NotificacionSMS());
                    sistema.enviarNotificacion(mensaje);
                    break;
                case 3:
                    sistema.setNotificacion(new NotificacionDiscord());
                    sistema.enviarNotificacion(mensaje);
                    break;
                case 4:
                    sistema.setNotificacion(new NotificacionWhatsApp());
                    sistema.enviarNotificacion(mensaje);
                    break;
                case 5: break;
                default: 
                    System.out.println("Opcion inválida!");
            }
            System.out.println();
        } while(op != 5);
        
        sc.close();
    }
}