/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorpizza;

/**
 *
 * @author USER
 */
public class Queso extends PizzaDecorador{

    public Queso(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + " + Queso";
    }

    @Override
    public double getCosto() {
        return pizza.getCosto() + 1.50;
    }
    
}
