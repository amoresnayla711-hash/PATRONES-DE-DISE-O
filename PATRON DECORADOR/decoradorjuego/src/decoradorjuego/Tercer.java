/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorjuego;

/**
 *
 * @author USER
 */
public class Tercer extends PersonajeDecorador{

    public Tercer(Personaje personaje) {
        super(personaje);
    }


    @Override
    public String gerDescripcion() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.gerDescripcion()+" // Immortal Shieldbow //";
    }

    @Override
    public int getDefensa() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getDefensa()+25;
    }

    @Override
    public int getAtque() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getAtque()+20;
    }

    @Override
    public int getVida() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getVida()+100;
    }

    @Override
    public int getVelcidad() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getVelcidad();
    }
    
}
