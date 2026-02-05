/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;
import java.util.*;
/**
 *
 * @author USER
 */
public class Mesa {
    private List<Cliente> clientes = new ArrayList<>();

    public Mesa() {
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void reservarMesa(String nombreCliente){
        for(Cliente cliente : clientes){
            if(cliente.getNombre().equals(nombreCliente)){
                cliente.actualizar("Ha reservado una mesa");
            }
        }
    }
    
    public void mostrarClientesNotificados(){
        System.out.println("Clientes registrados:");
        for(Cliente cliente : clientes){
            System.out.println("* " + cliente.getNombre());
        }
    }
}