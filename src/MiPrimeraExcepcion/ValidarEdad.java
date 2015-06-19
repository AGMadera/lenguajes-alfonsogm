/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


En JAVA existen 3 tipos de clases:
* Entidades o POJO'S: Cualquier objeto (objetos de tu appp)
* Model: Contien logica aplicada a entidades (logica entre esos objetos)
* Ejecucion -> Main: Aqui normalmente se crean objetos de las entidades  y de los Model (son el conjunto de las anteriores)

>>>>>>>>>> Examen 2 de Julio <<<<<<<<<<<<<<<<<<<<<<<<<<<<

 */
package MiPrimeraExcepcion;

/**
 *
 * @author alfonsogalvanmadera
 */
public class ValidarEdad {
    
    public static void validar(int edad) throws MenordeEdadException{
        if (edad<18)throw new MenordeEdadException();
        
    }
    
    
}
