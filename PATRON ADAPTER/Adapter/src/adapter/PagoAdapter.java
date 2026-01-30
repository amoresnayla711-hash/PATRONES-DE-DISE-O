/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author USER
 */
public class PagoAdapter implements Pago {
    private PagoMonedas pagogeneral;

    public PagoAdapter(PagoMonedas pagogeneral) {
        this.pagogeneral = pagogeneral;
    }


    @Override
    public void pagarEuros(double monto) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    double euros = monto * 0.84;
    pagogeneral.PagarEuros(euros);
    }

 
    public void pagarRealB(double monto) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double Real = monto * 5.75;
    pagogeneral.PagarEuros(Real);
    }

  
    public void PagarPesoC(double monto) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        double  Peso = monto * 3665;
    pagogeneral.PagarEuros(Peso);
    }
    
}
