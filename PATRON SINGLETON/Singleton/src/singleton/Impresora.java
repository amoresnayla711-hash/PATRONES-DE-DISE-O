/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author USER
 */
public class Impresora {
    private int totalImpresiones;
    
    /*  1. Definir una variable estática*/
    private static Impresora instancia;
    /*  2. Crear un constructor privado*/
    private Impresora()  {
        System.out.println("Impresora Lista para Imprimir");
    }
    /*  3. Agregar un método público está tico*/
    public static Impresora getInstancia(){
        if(instancia == null){
            instancia = new Impresora();
        }
        return instancia;
    }
    //Metodo para imprimir
    public void imprimir(String documento){
        totalImpresiones ++;
        System.out.println("Documento impreso: " + documento);
    }
    
    public int getTotalImpresiones(){
        return totalImpresiones;
    }
}
