/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Correo {
    private String nombre;
   private List<UsuarioCorreo> usuarios = new ArrayList<>();
   
   
     public Correo(String nombre){
    this.nombre = nombre;
    }
    

    
 public void agregarCliente(UsuarioCorreo usuario){
    usuarios.add(usuario);
    }
    
    public void notificar(String asunto) {
        for (UsuarioCorreo usuario : usuarios ) {
        usuario.actualizar(asunto);
        }
    }
    
    public void mostrarNotificaciones(){
        System.out.println("Usuario notificados por " + nombre +" : ");
        for (UsuarioCorreo usuario : usuarios ) {
            System.out.println("-"+usuario.getNombre());
        }
    }
}