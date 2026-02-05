/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Strategy2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Venta venta = new Venta();
        System.out.print("Ingrese el monto de la venta: ");
        double monto = sc.nextDouble();
        sc.nextLine();
        int op;
        do{
        System.out.println("======MENU======");
        System.out.println("1. Descuento Normal");
        System.out.println("2. Descuento Estudiantil");
        System.out.println("3. Descuento VIP");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opcion: ");
        op = sc.nextInt();
        sc.nextLine();
        switch(op){
            case 1:
                System.out.println("Descuento Normal");
                venta.setDescuento(new DescuentoNormal());
                System.out.println(monto - venta.calcularTotal(100));
                break;
            case 2:
                System.out.println("Descuento Estudiantil");
                venta.setDescuento(new DescuentoEstudiantil());
                System.out.println(monto - venta.calcularTotal(100));
                break;
            case 3:
                System.out.println("Descuento VIP");
                venta.setDescuento(new DescuentoVIP());
                System.out.println(monto - venta.calcularTotal(100));
                break;
            case 4: break;
            default: System.out.println("Opcion invalida!");
        }
        
        }while(op!=4);
        sc.close();
        
       
    }
    
}
