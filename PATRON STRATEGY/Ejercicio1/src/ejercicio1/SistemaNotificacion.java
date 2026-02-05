/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author USER
 */
public class SistemaNotificacion {
    private Notificacion notificacion;
    
    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }
    
    public void enviarNotificacion(String mensaje) {
        notificacion.enviar(mensaje);
    }
}

