/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplostrategy;

/**
 *
 * @author USER
 */
public class SistemaEvaluacion {
     private Evaluacion evaluacion ;
    
    public void setEvaluacion(Evaluacion evaluacion){
    this.evaluacion = evaluacion;
    }
    public double calcularBonificacion(double puntuacion){
    return evaluacion.calcular(puntuacion);
    }
}
