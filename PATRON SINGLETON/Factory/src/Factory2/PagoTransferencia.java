/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author USER
 */
public class PagoTransferencia implements Pagos{
    double totalTransferencia = 0;
    @Override
    public void procesarPagos(double monto) {
        totalTransferencia = totalTransferencia + monto;
        System.out.println("Se paga con transferencia la cantidad de $" + monto);
        System.out.println("Total transferencias: " + totalTransferencia);
    }
    
}
