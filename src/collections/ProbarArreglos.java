/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author alfonsogalvanmadera
 */
public class ProbarArreglos {
    public static void main(String[] args) {
        GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();
                            generadora.agregarUsuario("Chana", 18, "chana@yomera.com");
        
        
          ArrayList<Usuario> usuarios = (ArrayList<Usuario>)generadora.getUsuarios();
               System.out.println(usuarios.size());
          for(Usuario u:usuarios){
              System.out.println(u.getNombre()+" Edad: "+u.getEdad()+" email: "+u.getMail());
          }
          
        
    }
}
