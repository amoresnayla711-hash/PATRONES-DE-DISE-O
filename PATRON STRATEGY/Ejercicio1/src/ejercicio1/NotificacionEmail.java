/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author USER
 */
public class NotificacionEmail implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }
}
