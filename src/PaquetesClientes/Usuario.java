/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaquetesClientes;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Usuario{
     private String nombre;
     private int edad;
     private String email;
     private Direccion direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
/*
   public Usuario(){
   ////Constructor por defecto
       
   }*/
    public Usuario(String nombre, int edad, String email, Direccion direccion){
        //////inicializar todos los atributos
      this.nombre=nombre;
      this.edad=edad;
      this.email=email;
      this.direccion=direccion;
       
   }
   
   
    
    
}
