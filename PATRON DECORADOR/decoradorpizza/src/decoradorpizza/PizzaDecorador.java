/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorpizza;

/**
 *
 * @author USER
 */
public abstract class PizzaDecorador implements Pizza{
    protected Pizza pizza;

    public PizzaDecorador(Pizza pizza) {
        this.pizza = pizza;
    }
    
}
