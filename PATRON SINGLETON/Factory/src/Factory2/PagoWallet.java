/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author USER
 */
public class PagoWallet implements Pagos{
double totalWallet = 0;
    @Override
    public void procesarPagos(double monto) {
        totalWallet = totalWallet + monto;
        System.out.println("Se paga mediante billetera digital la cantidad de $" + monto);
        System.out.println("Total pagos con Tarjeta: " + totalWallet);
    }
    
}
