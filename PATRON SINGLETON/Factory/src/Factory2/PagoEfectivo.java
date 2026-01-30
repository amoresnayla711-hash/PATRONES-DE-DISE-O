/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory2;

/**
 *
 * @author USER
 */
public class PagoEfectivo implements Pagos{
double totalEfectivo;

    @Override
    public void procesarPagos(double monto) {
        totalEfectivo = totalEfectivo + monto;
        System.out.println("Se paga con efectivo la cantidad de $" + monto);
        System.out.println("Total efectivo: " + totalEfectivo);
    }
    
}
