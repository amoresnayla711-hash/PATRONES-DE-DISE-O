/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        EntradaParqueadero entrada = new EntradaParqueadero();
        SalidaParqueadero salida = new SalidaParqueadero();
        ParqueaderoCentral parqueadero = ParqueaderoCentral.getInstancia();
        
        int op;
        
        do {
            System.out.println("\n=== PARQUEADERO ===");
            System.out.println("1. Entrada carro");
            System.out.println("2. Salida carro");
            System.out.println("3. Ver estado");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch(op) {
                case 1:
                    entrada.registrarEntrada();
                    break; 
                case 2:
                    salida.registrarSalida();
                    break;     
                case 3:
                    parqueadero.verEstado();
                    break;             
                case 4:
                    System.out.println("Reporte final:");
                    parqueadero.verEstado();
                    break;             
                default:
                    System.out.println("Opción no válida");
            }     
        } while(op != 4);
        sc.close();
    }
}
