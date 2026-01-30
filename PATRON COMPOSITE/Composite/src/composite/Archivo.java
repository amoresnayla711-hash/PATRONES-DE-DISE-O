/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author USER
 */
public class Archivo implements ComponenteArchivo{
    private String nombre;
    private int tamano;

    public Archivo(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public void mostrar() {
        System.out.println("Archivo: " + nombre + " - Tamano" + tamano + "Kb");
    }

    @Override
    public int getTamano() {
        return tamano;
    }
    
    
    
}
