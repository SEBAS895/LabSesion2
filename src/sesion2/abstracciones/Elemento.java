/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2.abstracciones;

/**
 *
 * @author Estudiante
 */
public class Elemento {
    private int nivel;
    
    
    public Elemento(){}
    
    public Elemento(int nivel){
        this.nivel=nivel;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
}
