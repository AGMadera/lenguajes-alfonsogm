/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alfonsogalvanmadera
 */
public class GeneradorDeUsuarios {
    
    private List<Usuario> usuarios; //Listas genericas
    
    public GeneradorDeUsuarios(){
        Usuario u1=new Usuario("alfonso", 22, "agmadera@protonmail.com");
        Usuario u2=new Usuario("juan", 42, "jc@gmail.com");
        Usuario u3=new Usuario("ana", 38, "ana@outlook.com");
        Usuario u4=new Usuario("pedro", 32, "pedro@yahoo.com");
        
        
        usuarios =new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public String agregarUsuario(String nombre, Integer edad, String email){
        Usuario u=new Usuario(nombre, edad, email);
        usuarios.add(u);
        
    return "usuario agragado con exito";
    }
    
    
    
}
