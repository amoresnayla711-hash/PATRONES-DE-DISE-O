/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplostrategy;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class EjemploSTRATEGY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        SistemaEvaluacion sistema = new SistemaEvaluacion ();
        System.out.println("*******EVALUACION*******");
        System.out.print("Ingrese la puntuacion del empleado: ");
        double puntuacion = sc.nextDouble();   
         int op;
        do{
        System.out.println("======SISTEMA DE EVALUACION======");
        System.out.println("1. Evaluacion Baja");
        System.out.println("2. Evaluacion Excelente");
        System.out.println("3. Evaluacion Media");
        System.out.println("4. Evaluacion Alta");
        System.out.println("5.Salir");
        System.out.print("Ingrese una opcion : ");
        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1:
                System.out.println("Evaluacion Baja : ");
             sistema.setEvaluacion(new EvaluacionBaja());
            System.out.println("Bonificacion: " + sistema.calcularBonificacion(puntuacion));
                break;
            case 2:
                System.out.println("Evaluacion Excelente : " );
                sistema.setEvaluacion(new EvaluacionBuena());
            System.out.println("Bonificacion: " + sistema.calcularBonificacion(puntuacion));
                break;
            case 3:
                System.out.println("Evaluacion Media");
                sistema.setEvaluacion(new EvaluacionMedia());
            System.out.println("Bonificacion: " + sistema.calcularBonificacion(puntuacion));
                break;
            case 4:
                System.out.println("Evaluacion Alta : ");
                sistema.setEvaluacion(new EvaluacionAlta());
             System.out.println("Bonificacion: " + sistema.calcularBonificacion(puntuacion));
                break;
            case 5: break;
            default: System.out.println("Opcion invalida!");
        }
        
        }while(op!=5);
    }   
}
