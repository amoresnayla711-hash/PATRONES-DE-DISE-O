/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author USER
 */
public class PagoTarjeta implements Pagos{
double totalTarjeta = 0;
    @Override
    public void procesarPagos(double monto) {
        totalTarjeta = totalTarjeta + monto;
        System.out.println("Se paga con tarjeta debito/credito la cantidad de $" + monto);
        System.out.println("Total pagos con Tarjeta: " + totalTarjeta);
    }
    
}
