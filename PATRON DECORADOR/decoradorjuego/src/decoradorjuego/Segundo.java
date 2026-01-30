/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorjuego;

/**
 *
 * @author USER
 */
public class Segundo extends PersonajeDecorador{

    public Segundo(Personaje personaje) {
        super(personaje);
    }


    @Override
    public String gerDescripcion() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.gerDescripcion()+"// Stormrazor //";
    }

    @Override
    public int getDefensa() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getDefensa();
    }

    @Override
    public int getAtque() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getAtque()+45;
    }

    @Override
    public int getVida() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getVida();
    }

    @Override
    public int getVelcidad() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return personaje.getVelcidad()+25;
    }
    
}
