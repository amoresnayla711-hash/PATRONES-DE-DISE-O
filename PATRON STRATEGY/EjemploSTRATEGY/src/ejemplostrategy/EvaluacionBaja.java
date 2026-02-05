/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplostrategy;

/**
 *
 * @author USER
 */
public class EvaluacionBaja implements Evaluacion {

    @Override
    public double calcular(double puntuacion) {
        return puntuacion * 0.1;
    }
    
}
