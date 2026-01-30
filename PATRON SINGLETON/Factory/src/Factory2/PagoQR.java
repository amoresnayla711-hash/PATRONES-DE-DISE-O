/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author USER
 */
public class PagoQR implements Pagos{
double totalQR = 0;
    @Override
    public void procesarPagos(double monto) {
        totalQR = totalQR + monto;
        System.out.println("Se paga mediante un QR la cantidad de $" + monto);
        System.out.println("Total pagos con QR: " + totalQR);
    }
    
}
