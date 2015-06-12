/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Animal raro=new Animal();
               raro.setEdad(2);
               raro.setNombre("Rareza");
        */
        Tortuga animal1=new Tortuga();
                animal1.setNombre("Japonesa");
                animal1.setEdad(12);
        Leon animal2=new Leon();
             animal2.setNombre("Africano");
             animal2.setEdad(20);
         Delfin d1=new Delfin();
        d1.setNombre("flipper");
        //Toast.makeText(getApplicationContext(),"Hola mundo el animal es:"+d1.getNombre(),Toast.LENGTH_LONG).show();
        Pollo p1=new Pollo();
        p1.setNombre("Pollito pio");
        Leon l1=new Leon();
        l1.setNombre("Simba");
        Leon l2=new Leon();
        l2.setNombre("Mu-fa-sa");
        Tortuga t1=new Tortuga();
        t1.setNombre("Tortuguita");
        Pollo pollo2=new Pollo();
        pollo2.setNombre("Deshuesado");
        
        //SDA
        ComportamientoRuido animales[]=new ComportamientoRuido[5];
        animales[0]=p1;
        animales[1]=l1;
        animales[2]=l2;
        animales[3]=d1;
        animales[4]=pollo2;
        
        for (ComportamientoRuido n: animales){
            
            System.out.println(n.hacerRuido());
            
        
        }
        
                
    }
    
}
