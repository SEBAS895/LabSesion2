/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.abstracciones;

/**
 *
 * @author Estudiante
 */
public class Personaje extends Elemento {
    private int vidas;
    
    public Personaje(){}
    public Personaje(int nivel, int vidas){
        super(nivel);
        this.vidas=vidas;
    }
    public int getVida(){
        return this.vidas;
    }
    public void setVida(){
        this.vidas=vidas;
    }
}
