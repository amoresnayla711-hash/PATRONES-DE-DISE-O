/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author USER
 */
public class Restaurante implements Cliente {
    private String nombre;

    public Restaurante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibio: " + mensaje);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}