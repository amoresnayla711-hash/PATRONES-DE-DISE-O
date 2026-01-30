/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoradorpizza;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Decoradorpizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        PizzaBase pizzaBase = new PizzaBase();
            Pizza pz = pizzaBase;
        do{
            System.out.println("====PIZZERIA=====");
            System.out.println("1. Base de la Pizza");
            System.out.println("2. Agregar Queso");
            System.out.println("3. Agregar Pepperoni");
            System.out.println("4. Agregar Champinones");
            System.out.println("5. Agregar Jamon");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opicion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1: 
                    pz = new PizzaBase();
                    System.out.println(pz.getDescripcion()+ " = $" + pz.getCosto());break;
                case 2:
                    pz = new Queso(pz);
                    System.out.println(pz.getDescripcion()+ " = $" + pz.getCosto());break;
                case 3:
                    pz = new Pepperoni(pz);
                    System.out.println(pz.getDescripcion()+ " = $" + pz.getCosto());break;
                case 4:
                    pz = new Champinones(pz);
                    System.out.println(pz.getDescripcion()+ " = $" + pz.getCosto());break;
                case 5:
                    pz = new Jamon(pz);
                    System.out.println(pz.getDescripcion()+ " = $" + pz.getCosto());break;
                case 6:;break;
                default: System.out.println("No existe esa opcion...");
            }
        }while(opcion!=6);
        sc.close();
    }
}
