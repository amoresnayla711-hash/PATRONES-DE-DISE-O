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
public class EntradaParqueadero {
    public void registrarEntrada() {
        Scanner sc = new Scanner(System.in);
        ParqueaderoCentral parqueadero = ParqueaderoCentral.getInstancia();
        System.out.println("--- ENTRADA ---");
        System.out.print("Ingrese la placa: ");
        String placa = sc.nextLine();
        parqueadero.entrarCarro(placa);
    }
}
