/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1.c;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Combo implements ComponenteComida {
    private String nombre;
    private List<ComponenteComida> items = new ArrayList<>();
    private double precioCombo;  
    
    public Combo(String nombre, double precioCombo) {
        this.nombre = nombre;
        this.precioCombo = precioCombo;
    }

    public void agregar(ComponenteComida item) {
        items.add(item);
    }

    @Override
    public void mostrar() {
        System.out.println("\n" + nombre + " = $" + getPrecio());
        System.out.println("Contiene:");
        for (ComponenteComida item : items) {
            System.out.print("  = ");
            item.mostrar();
        }
    }

    @Override
    public double getPrecio() {
        // CAMBIO MÍNIMO: Calcular suma automática en lugar de usar precio fijo
        double suma = 0;
        for (ComponenteComida item : items) {
            suma += item.getPrecio();
        }
        return suma;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}