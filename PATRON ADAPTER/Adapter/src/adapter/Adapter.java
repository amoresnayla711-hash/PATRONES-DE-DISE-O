/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Pago pago = new PagoAdapter(new PagoMonedas());
        PagoAdapter pago1 = new PagoAdapter(new PagoMonedas());
        System.out.print("Cuanto desea tranferir : ");
        double dinero = sc.nextDouble();
        int opcion;
           do{
            System.out.println("===PAGOS====");
            System.out.println("1. EUROS");
            System.out.println("2. PESOS COLOMBIANOS");
            System.out.println("3. REALES");
            System.out.println("4. SALIR");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    pago.pagarEuros(dinero);break;
                case 2:
                    pago1.PagarPesoC(dinero);break;
                case 3: 
                    pago1.pagarRealB(dinero);break;
                case 4:break;
                default: System.out.println("Opcion invalida!");
            }
        }while(opcion!=4); 
    }
    
}