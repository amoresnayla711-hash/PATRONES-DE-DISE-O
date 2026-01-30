/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2.c;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Canasta implements ComponenteAlimento {
    private String nombre;
    private List<ComponenteAlimento> alimentos = new ArrayList<>();
    private double precioCanasta;

    public Canasta(String nombre, double precioCanasta) {
        this.nombre = nombre;
        this.precioCanasta = precioCanasta;
    }

    public void agregar(ComponenteAlimento alimento) {
        alimentos.add(alimento);
    }

    @Override
    public void mostrar() {
        System.out.println("\n" + nombre);
        System.out.println("Contiene:");
        for (ComponenteAlimento alimento : alimentos) {
            System.out.print("  - ");
            alimento.mostrar();
        }
        System.out.println("Total: $" + getPrecio());  // Cambiado para usar getPrecio() en lugar de precioCanasta
    }

    @Override
    public double getPrecio() {
        // CAMBIO MÍNIMO: Calcular suma automática
        double suma = 0;
        for (ComponenteAlimento alimento : alimentos) {
            suma += alimento.getPrecio();
        }
        return suma;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}