/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Factory2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class factorypagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        Scanner sc = new Scanner (System.in);
        int opcion = 0 ;
        double monto;
        do {
            
            System.out.println("=======FABRICA DE JUGUETES ========");
                System.out.println("1.Pago Efectivo");
                System.out.println("2.Pago Transferencia");
                System.out.println("3.Pago Tarjeta");
                System.out.println("4.Pago Wallet");
                System.out.println("5.Pago QR");
                System.out.print("Seleccione una opcion:");
                opcion = sc.nextInt();
                sc.nextLine();
                
                Pagos pagos = PagosFactory.crearPago(opcion);
                System.out.print("Ingrese el monto: ");
                monto = sc.nextDouble();
                if (pagos != null){
                pagos.procesarPagos(monto);
                }else{
                    System.out.println("No se ha podido realizar el pago");
                }
                
        }while (opcion != 6 );
        sc.close();
    }
    
}
