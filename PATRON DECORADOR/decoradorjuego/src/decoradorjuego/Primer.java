/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoradorjuego;

/**
 *
 * @author USER
 */
public class Primer extends PersonajeDecorador {

    public Primer(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String gerDescripcion() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.gerDescripcion()+"//Botas de velocidad//";
    }

    @Override
    public int getDefensa() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getDefensa()+10;
    }

    @Override
    public int getAtque() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return personaje.getAtque();
    }

    @Override
    public int getVida() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return personaje.getVida();
    }

    @Override
    public int getVelcidad() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return personaje.getVelcidad()+25;
    }
    
}
