/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter2;

/**
 *
 * @author USER
 */
public class ReproductorAdapter implements Reproducir {
    private ReproductorMP4 mp4;

    public ReproductorAdapter(ReproductorMP4 mp4) {
        this.mp4 = mp4;
    }

    @Override
    public void reproducir(String archivo) {
        mp4.playMP4(archivo);
    }
    
}
