/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorador;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        //Bebida cafe = new CafeSimple();
        do{
            System.out.println("CAFETERIA ESPE");
            System.out.println("1. Cafe Simple");
            System.out.println("2. Agregar Azucar");
            System.out.println("3. Agregar Leche");
            System.out.println("4. Agregar Crema con canela");
            System.out.println("5. Agregar miel");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            Bebida cafe = new CafeSimple();
            switch(opcion){
                case 1: 
                    cafe = new CafeSimple();
                    System.out.println(cafe.getDescripcion()+ " = $" + cafe.getCosto());break;
                case 2:
                    cafe = new Azucar(cafe);
                    System.out.println(cafe.getDescripcion()+ " = $" + cafe.getCosto());break;
                case 3:
                    cafe = new Leche(cafe);
                    System.out.println(cafe.getDescripcion()+ " = $" + cafe.getCosto());break;
                case 4:
                    cafe = new Crema(cafe);
                    System.out.println(cafe.getDescripcion()+ " = $" + cafe.getCosto());break;
                case 5:
                    cafe = new Miel(cafe);
                    System.out.println(cafe.getDescripcion()+ " = $" + cafe.getCosto());break;
                case 6:break;
                default: System.out.println("No existe esa opcion...");
            }
        }while(opcion!=7);
        sc.close();
    }
    
}
