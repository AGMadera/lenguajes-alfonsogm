/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;





/**
 *
 * @author alfonsogalvanmadera
 */
public class Zoologico{
    public static void main(String[] args) throws Exception {
        ModeloPersistenciaAnimal m=new ModeloPersistenciaAnimal();
        //ArrayList<Animal> a=m.buscarTodos();
        //System.out.println(a.getNombre);
        Animal a=new Animal();
               a.setNombre("cuyo");
               a.setCarnivoro(false);
               m.guardar(a);
            
            for (Animal ani:m.buscarTodos()){
                System.out.println(ani.getNombre());
            }
               
        
    }
    
}
