/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();
        int op;
        do{
        System.out.println("======MENU======");
        System.out.println("1. PayPal");
        System.out.println("2. Tarjeta");
        System.out.println("3. Transferencia");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion");
        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1:
                compra.setMetodoPago(new PagoPayPal());
                compra.realizarPago(200);
                break;
            case 2:
                compra.setMetodoPago(new PagoTarjeta());
                compra.realizarPago(100);
                break;
            case 3:
                compra.setMetodoPago(new PagoTransferencia());
                compra.realizarPago(300);
                break;
            case 4: break;
            default: System.out.println("Opcion invalida!");
        }
        
        }while(op!=4);
        sc.close();
    }
    
}
