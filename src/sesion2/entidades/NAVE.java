/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.entidades;

import sesion2.abstracciones.Personaje;

/**
 *
 * @author Estudiante
 */
public class NAVE extends Personaje{

    
    private int puntaje;
    
    public NAVE(){}

    public NAVE(int vidas, int puntaje, int nivel) {
        super(nivel, vidas);
        this.puntaje = puntaje;
        
    }
    

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    
    
}
