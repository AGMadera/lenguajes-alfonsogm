/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

/**
 *
 * @author alfonsogalvanmadera
 */
public class ComprobarLetras {
    
    public static void comprobar(String mensaje) throws MenordeCuatroException, MayordeDiezException,NulosException{
        
        byte[] caracter=mensaje.getBytes();
        
        if(mensaje.trim().length()==0)throw new NulosException();
        if(caracter.length<4)throw new MenordeCuatroException();
        if(caracter.length>10)throw new MayordeDiezException();
         
        
        
    }
    
}
