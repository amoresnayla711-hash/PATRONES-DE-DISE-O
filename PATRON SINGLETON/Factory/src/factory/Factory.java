/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc = new Scanner (System.in);
        int opcion = 0 ;
        do {
            
            System.out.println("=======FABRICA DE JUGUETES ========");
                System.out.println("1.Peluche");
                System.out.println("2.Carrito");
                System.out.println("3.Barbie");
                System.out.println("4.Salir");
                System.out.println("Seleccione una opcion:");
                opcion = sc.nextInt();
                sc.nextLine();
                
                Juguete juguete = JugueteFactory.crearJuguete(opcion);
                if (juguete != null){
                juguete.crear();
                }else{
                    System.out.println("No se ha podido crear el juguete");
                }
                
        }while (opcion != 4 );
        sc.close();
    }
    }
    

