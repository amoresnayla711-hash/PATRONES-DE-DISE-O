/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class observer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        Producto producto = null;
        do{
            System.out.println("======NOTIFICACIONES LENIN FASHION=====");
            System.out.println("1. Agregrar Producto");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Ver Clientes Notificados");
            System.out.println("4. Salir, ");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.print("Ingrese nombre del producto:");
                    String nproducto = sc.nextLine();
                    producto = new Producto(nproducto);break;
                case 2:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String ncliente = sc.nextLine();
                    producto.agregarCliente(new Tienda(ncliente));break;
                case 3:
                    producto.mostrasrClientesNotificados();break;
                case 4:break;
                default: System.out.println("No existe esa opcion!");                  
            }
        }while(op!=4);
    }
    
}
