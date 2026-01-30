/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton2;

/**
 *
 * @author USER
 */
public class ModuloFcturacion {
    public void facturar(double monto){
        CajaRegistradora caja = CajaRegistradora.getInstancia();
        caja.registrarFactura(monto);
    }
    
}
