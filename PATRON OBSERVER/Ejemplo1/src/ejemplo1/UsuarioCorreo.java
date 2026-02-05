/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author USER
 */
public class UsuarioCorreo implements Notificaciones {
    private String nombre;

    public UsuarioCorreo(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Nuevo correo para " + nombre + ": " + mensaje);
    }

    @Override
    public String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return nombre;
    }
}