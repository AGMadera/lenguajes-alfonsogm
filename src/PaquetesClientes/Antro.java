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
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Direccion direccion=new Direccion(55130, "Ecatepec");
        Usuario usuario= new Usuario("juan", 42, "jcampos@gmail.com", direccion);
        
        Usuario u= new Usuario("juan", 42, "jcampos@gmail.com", new Direccion(55130, "Ecatepec"));
        
        
        System.out.println(usuario.getDireccion().getMunicipio());
        
    }
    
}
