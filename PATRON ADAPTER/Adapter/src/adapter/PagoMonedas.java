/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author USER
 */
public class PagoMonedas {
        public void PagarEuros(double monto){
        System.out.println("Pago realizado en euros : € " + monto);
    }
        public void PagarReal(double monto){
        System.out.println("Pago realizado en Real brasileño:  " + monto);
    }
            public void PagarPeso(double monto){
        System.out.println("Pago realizado en Peso colombiano :  " + monto);
    }
}
