/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.pkg1c;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Combo  implements ComponenteComida {
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
        System.out.println("\n" + nombre + " = $" + precioCombo);
        System.out.println("Contiene:");
        for (ComponenteComida item : items) {
            System.out.print("  = ");
            item.mostrar();
        }
    }

    @Override
    public double getPrecio() {
        return precioCombo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}