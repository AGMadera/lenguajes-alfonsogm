/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author T-107
 */
public class Usuario {
    ///Primer regla
    private String nombre;
    private int edad;
    
    public void setNombre(String nombre){
          this.nombre= nombre;
    
    }
    public void setEdad (int edad){
         this.edad= edad;
    
    }
    
    public String getNombre(){
       return nombre;
    }
    public int getEdad(){
       return edad;
    }
    
}
