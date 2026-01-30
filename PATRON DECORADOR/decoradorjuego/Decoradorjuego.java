/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoradorjuego;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Decoradorjuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        int opcion ;
        Personaje personaje = new PersonajeBase();
        
        
       do{
        
          System.out.println("=========LEGUE OF LEGENDS=========");
          System.out.println("1.Aphelios ");
            System.out.println("2.Agregar primer objeto ");
               System.out.println("3.Agregar segundo objeto  ");
                  System.out.println("4.Agregar tercer objeto ");
                     System.out.println("5.Agregar cuarto objetvo  ");
                        System.out.println("6.Salir ");
                           System.out.print("Ingrese una opcion : ");
                           opcion = sc.nextInt();
                           sc.nextLine();
                           switch (opcion ){
                               case 1 : 
                                   personaje = new PersonajeBase();
                                   System.out.println(personaje.gerDescripcion()); 
                                   System.out.println("Estadisticas ");
                                   System.out.println("Vida : "+personaje.getVida());
                                   System.out.println("Velocidad: "+ personaje.getVelcidad());
                                   System.out.println("Ataque : "+ personaje.getAtque());
                                   System.out.println("Defensa : "+personaje.getDefensa());
                                   break;
                               case 2 :
                                   personaje = new Primer(personaje);
                                   System.out.println(personaje.gerDescripcion()); 
                                   System.out.println("Primer objeto");
                                    System.out.println("Estadisticas ");
                                   System.out.println("Vida : "+personaje.getVida());
                                   System.out.println("Velocidad: "+ personaje.getVelcidad());
                                   System.out.println("Ataque : "+ personaje.getAtque());
                                   System.out.println("Defensa : "+personaje.getDefensa());
                                   break;
                               case 3 : 
                                   personaje = new Segundo (personaje);
                                    System.out.println(personaje.gerDescripcion()); 
                                   System.out.println("Segundo objeto");  
                                   System.out.println("Estadisticas ");
                                   System.out.println("Vida : "+personaje.getVida());
                                   System.out.println("Velocidad: "+ personaje.getVelcidad());
                                   System.out.println("Ataque : "+ personaje.getAtque());
                                   System.out.println("Defensa : "+personaje.getDefensa());
                                   break;
                               case 4 : 
                                   personaje = new Tercer (personaje);
                                    System.out.println(personaje.gerDescripcion()); 
                                    System.out.println("Tercer objeto"); 
                                   System.out.println("Estadisticas ");
                                   System.out.println("Vida : "+personaje.getVida());
                                   System.out.println("Velocidad: "+ personaje.getVelcidad());
                                   System.out.println("Ataque : "+ personaje.getAtque());
                                   System.out.println("Defensa : "+personaje.getDefensa());
                                   break;
                               case 5 : 
                                   personaje = new Quinto (personaje);
                                    System.out.println(personaje.gerDescripcion()); 
                                     System.out.println("Cuarto objeto ");
                                    System.out.println("Estadisticas ");
                                   System.out.println("Vida : "+personaje.getVida());
                                   System.out.println("Velocidad: "+ personaje.getVelcidad());
                                   System.out.println("Ataque : "+ personaje.getAtque());
                                   System.out.println("Defensa : "+personaje.getDefensa());
                                   break;
                               case 6 : break;
                               default : System.out.println("No existe esa opcion ");
                           
                           }
                     
    }while (opcion != 6);
        sc.close();  
    }
    }
    

