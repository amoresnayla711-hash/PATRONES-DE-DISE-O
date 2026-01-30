/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class SalidaParqueadero {
    public void registrarSalida() {
        Scanner sc = new Scanner(System.in);
        ParqueaderoCentral parqueadero = ParqueaderoCentral.getInstancia();
        System.out.println("--- SALIDA ---");
        System.out.print("Ingrese la placa: ");
        String placa = sc.nextLine();
        System.out.print("Ingrese las horas: ");
        int horas = sc.nextInt();
        sc.nextLine();
        parqueadero.salirCarro(placa, horas);
    }
}
