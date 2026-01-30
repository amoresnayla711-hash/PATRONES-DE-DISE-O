/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author USER
 */
public class Miel extends BebidaDecorador{

    public Miel(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Miel";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.50;
    }
    
}
