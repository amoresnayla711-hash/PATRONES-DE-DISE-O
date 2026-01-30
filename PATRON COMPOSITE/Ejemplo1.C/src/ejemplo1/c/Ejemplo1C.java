/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1.c;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ejemplo1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;
    ComponenteComida hamburguesa = new ItemMenu("Hamburguesa", 2.5);
    ComponenteComida gaseosa = new ItemMenu("Gaseosa", 1.0);
    ComponenteComida papas = new ItemMenu("Papas Fritas", 1.5);
    Combo comboSimple = new Combo("Combo Simple", 0);  
    comboSimple.agregar(papas);    
    comboSimple.agregar(gaseosa);   
    Combo comboCompleto = new Combo("Combo Completo", 0);  
    comboCompleto.agregar(hamburguesa);
    comboCompleto.agregar(gaseosa);
    comboCompleto.agregar(papas);
    do {
        System.out.println("=== MENU DE COMIDA ===");
        System.out.println("1. Hamburguesa = $2.5");
        System.out.println("2. Gaseosa = $1.0");
        System.out.println("3. Papas Fritas = $1.5");
        System.out.println("4. Combo Simple (Papas + Gaseosa) = $" + comboSimple.getPrecio());  
        System.out.println("5. Combo Completo = $" + comboCompleto.getPrecio());
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion (1-6): ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("=== SU PEDIDO ===");
                hamburguesa.mostrar();
                System.out.println("Total a pagar: $" + hamburguesa.getPrecio());
                System.out.println("===================");
                break;    
            case 2:
                System.out.println("=== SU PEDIDO ===");
                gaseosa.mostrar();
                System.out.println("Total a pagar: $" + gaseosa.getPrecio());
                System.out.println("===================");
                break;
            case 3:
                System.out.println("=== SU PEDIDO ===");
                papas.mostrar();
                System.out.println("Total a pagar: $" + papas.getPrecio());
                System.out.println("===================");
                break;
            case 4:
                System.out.println("=== SU PEDIDO ===");
                comboSimple.mostrar();
                System.out.println("Total a pagar: $" + comboSimple.getPrecio());
                System.out.println("===================");
                break;
            case 5:
                System.out.println("=== SU PEDIDO ===");
                comboCompleto.mostrar();
                System.out.println("Total a pagar: $" + comboCompleto.getPrecio());
                System.out.println("===================");
                break;
            case 6:
                System.out.println("\nGracias por su visita. ¡Vuelva pronto!");
                break;
            default:
                System.out.println("\nOpcion invalida. Por favor seleccione del 1 al 6.\n");
        }
    } while (opcion != 6);
    scanner.close();
}
}