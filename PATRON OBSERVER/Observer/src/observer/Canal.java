/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;
import java.util.*;
/**
 *
 * @author USER
 */
public class Canal {
    private List<Notificaciones> usuarios = new ArrayList<>();
    private List<String> videos = new ArrayList<>();
    
    public void suscribir (Notificaciones notificacion){
        usuarios.add(notificacion);
    }
    
    public void subir(String titulo){
        System.out.println("Nuevo video de Chisag Comunica" + titulo );
        notificar(titulo);
    }
    
    public void notificar (String mensaje){
        for(Notificaciones notifica : usuarios){
            notifica.atualizar(mensaje);
        }
    }
}
