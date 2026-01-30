/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter2;

/**
 *
 * @author USER
 */
public class adapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reproducir reproduce = new ReproductorAdapter(new ReproductorMP4());
        reproduce.reproducir("Video musical.mp4");
    }
    
}
