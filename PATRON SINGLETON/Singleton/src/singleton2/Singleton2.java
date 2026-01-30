/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Singleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ModuloVentas ventas = new ModuloVentas();
        ModuloFcturacion facturacion = new ModuloFcturacion();
        int op;
        double monto ;
        double montof;
        do{
            System.out.println("======SISTEMA CAJA REGISTRADORA=====");
            System.out.println("Opcion 1: Registrar Venta");
            System.out.println("Opcion 2: Registrar Factura");
            System.out.println("Opcion 3: Ver total ventas");
            System.out.println("Opcion 4: Ver total facturas");
            System.out.println("Opcion 5: Salir");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Ingrese el monto de la venta: ");
                    monto = sc.nextDouble();
                    facturacion.facturar(monto);
                    ventas.vender(monto);
                    break;
                case 2: 
                    System.out.println("Total de venta con facturacion: ");
                    montof = sc.nextDouble();
                    ventas.vender(montof);
                    facturacion.facturar(montof);
                    break;
                case 3:
                    CajaRegistradora caja = CajaRegistradora.getInstancia();
                    System.out.println("Total de venta sin factura: " + caja.getTotalVentas());
                    break;
                case 4:
                    CajaRegistradora cajaf = CajaRegistradora.getInstancia();
                    System.out.println("Total facturado: " + cajaf.getTotalVentas());
                    break;
                case 5:
                    CajaRegistradora cajat = CajaRegistradora.getInstancia();
                    System.out.println("Total de la caja registradora: " + cajat.getTotalVentas());
                    break;
                case 6:break;
                default: System.out.println("Opcion no valida!");
                    
            }
        }while(op!=0);
    }
    
}
