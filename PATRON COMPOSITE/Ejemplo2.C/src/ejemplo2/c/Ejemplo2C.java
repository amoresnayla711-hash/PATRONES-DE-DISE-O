/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2.c;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ejemplo2C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        ComponenteAlimento leche = new AlimentoIndividual("Leche", 1.20);
        ComponenteAlimento manzana = new AlimentoIndividual("Manzana", 0.50);
        ComponenteAlimento galletas = new AlimentoIndividual("Galletas", 0.80);
        ComponenteAlimento mortadela = new AlimentoIndividual("Mortadela", 1.50);
        ComponenteAlimento jamon = new AlimentoIndividual("Jamon", 1.80);
        ComponenteAlimento mermelada = new AlimentoIndividual("Mermelada", 1.00);
        Canasta canastaBasica = new Canasta("Canasta basica", 1.80);
        canastaBasica.agregar(leche);
        canastaBasica.agregar(galletas);
        Canasta canastaMedia = new Canasta("Canasta media", 4.00);
        canastaMedia.agregar(leche);
        canastaMedia.agregar(galletas);
        canastaMedia.agregar(mortadela);
        canastaMedia.agregar(mermelada);
        Canasta canastaLlena = new Canasta("Canasta llena", 6.50);
        canastaLlena.agregar(leche);
        canastaLlena.agregar(galletas);
        canastaLlena.agregar(mortadela);
        canastaLlena.agregar(mermelada);
        canastaLlena.agregar(jamon);
        canastaLlena.agregar(manzana);
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Leche: 1.20");
            System.out.println("2. Manzana: 0.50");
            System.out.println("3. Galletas: 0.80");
            System.out.println("4. Mortadela: 1.50");
            System.out.println("5. Jamon: 1.80");
            System.out.println("6. Mermelada: 1.00");
            System.out.println("7. Canasta basica");
            System.out.println("8. Canasta media");
            System.out.println("9. Canasta llena");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opcion (1-10): ");      
            opcion = scanner.nextInt();     
            switch (opcion) {
                case 1:
                    System.out.println("\n=== SU PEDIDO ===");
                    leche.mostrar();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\n=== SU PEDIDO ===");
                    manzana.mostrar();
                    System.out.println();
                    break; 
                case 3:
                    System.out.println("\n=== SU PEDIDO ===");
                    galletas.mostrar();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\n=== SU PEDIDO ===");
                    mortadela.mostrar();
                    System.out.println();
                    break;
                    
                case 5:
                    System.out.println("\n=== SU PEDIDO ===");
                    jamon.mostrar();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("\n=== SU PEDIDO ===");
                    mermelada.mostrar();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("\n=== SU PEDIDO ===");
                    canastaBasica.mostrar();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("\n=== SU PEDIDO ===");
                    canastaMedia.mostrar();
                    System.out.println();
                    break;
                case 9:
                    System.out.println("\n=== SU PEDIDO ===");
                    canastaLlena.mostrar();
                    System.out.println();
                    break;
                case 10:
                    System.out.println("\nGracias por su visita");
                    break;
                default:
                    System.out.println("\nOpcion invalida\n");
            }
        } while (opcion != 10);
        scanner.close();
    }  
}
