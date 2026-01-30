/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorjuego;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class decoradorjuago {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        //Bebida cafe = new CafeSimple();
        do{
            System.out.println("=====CRASH=====");
            System.out.println("1. Personaje Basico");
            System.out.println("2. Agregar Espada");
            System.out.println("3. Agregar Escudo");
            System.out.println("4. Agregar ");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            Personaje personaje = new PersonajeBase();
            switch(opcion){
                case 1: 
                    personaje = new PersonajeBase();
                    System.out.println(personaje.getDescripcion()+ " = $" );
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa());break;
                case 2:
                    personaje = new Espada(personaje);
                    System.out.println("");
                    System.out.println(personaje.getDescripcion()+ " = $");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa());break;
                case 3:
                    personaje = new Escudo(personaje);
                    System.out.println(personaje.getDescripcion()+ " = $");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa());break;
                case 4:
                    personaje = new Armadura(personaje);
                    System.out.println(personaje.getDescripcion()+ " = $");
                    System.out.println("Ataque: " + personaje.getAtaque());
                    System.out.println("Defensa: " + personaje.getDefensa());break;
                case 5:break;
                default: System.out.println("No existe esa opcion...");
            }
        }while(opcion!=6);
        sc.close();
    }
}
