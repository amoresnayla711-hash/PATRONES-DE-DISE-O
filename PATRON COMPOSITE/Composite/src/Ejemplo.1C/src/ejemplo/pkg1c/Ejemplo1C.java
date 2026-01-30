/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg1c;

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
        
        // Crear los items individuales del menú
        ComponenteComida hamburguesa = new ItemMenu("Hamburguesa", 2.5);
        ComponenteComida gaseosa = new ItemMenu("Gaseosa", 1.0);
        ComponenteComida papas = new ItemMenu("Papas Fritas", 1.5);
        
        // Crear el combo simple (hamburguesa + gaseosa)
        Combo comboSimple = new Combo("Combo Simple", 3.0);
        comboSimple.agregar(hamburguesa);
        comboSimple.agregar(gaseosa);
        
        // Crear el combo completo (hamburguesa + gaseosa + papas)
        Combo comboCompleto = new Combo("Combo Completo", 4.5);
        comboCompleto.agregar(hamburguesa);
        comboCompleto.agregar(gaseosa);
        comboCompleto.agregar(papas);
        
        ComponenteComida seleccion = null;
        boolean seleccionValida = false;
        
        System.out.println("=== MENU DE COMIDA ===");
        System.out.println("1. Hamburguesa = $2.5");
        System.out.println("2. Gaseosa = $1.0");
        System.out.println("3. Papas Fritas = $1.5");
        System.out.println("4. Combo Simple  = $3.0");
        System.out.println("5. Combo Completo  = $4.5");
        
        while (!seleccionValida) {
            System.out.print("\nSeleccione una opcion (1-5): ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    seleccion = hamburguesa;
                    seleccionValida = true;
                    break;
                case 2:
                    seleccion = gaseosa;
                    seleccionValida = true;
                    break;
                case 3:
                    seleccion = papas;
                    seleccionValida = true;
                    break;
                case 4:
                    seleccion = comboSimple;
                    seleccionValida = true;
                    break;
                case 5:
                    seleccion = comboCompleto;
                    seleccionValida = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor seleccione del 1 al 5.");
            }
        }
        
        System.out.println("\n=== SU PEDIDO ===");
        seleccion.mostrar();
        System.out.println("Total a pagar: $" + seleccion.getPrecio());
        
        scanner.close();
    }
}