/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alfonsogalvanmadera
 */
public class ProbarLetras {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje= "hola";
        System.out.println("Vamos a ver cuantas letras metiste");
        try {
            ComprobarLetras.comprobar(mensaje);
            System.out.println("Mas de 4 letras y menos de 10");
            System.out.println(mensaje);
        } catch (MenordeCuatroException | MayordeDiezException | NulosException ex) {
            System.out.println(ex.getMessage());   
        }
        
    }
    
}
