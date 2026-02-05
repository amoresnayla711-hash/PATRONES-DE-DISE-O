/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Canal canal = new Canal();
        int op;
        String titulo = "";
        do{
            System.out.println("======Canal Youtube=====");
            System.out.println("1. Suscribete");
            System.out.println("2. Subir Video");
            System.out.println("3. Vwenidficaciones");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.print("Ingrese su nombre:");
                    String nombre = sc.nextLine();
                    canal.suscribir(new Usuario(nombre));break;
                case 2:
                    System.out.print("Ingrese el nombre del video: ");
                    titulo = sc.nextLine();break;
                case 3:
                    canal.notificar(titulo);break;
                case 4:break;
                default: System.out.println("No existe esa opcion!");
                    
            }
        }while(op!=4);
        sc.close();
    }
    
}
