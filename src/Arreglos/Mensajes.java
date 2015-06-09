/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;



/**
 *
 * @author T-107
 */
public class Mensajes {
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    public Mensajes(String m){
     texto=m;
    }
     public byte[] EnByte(String m){
       byte []algo= m.getBytes();
        return algo;
    }
     
    public String Encript(byte[] algo){
        
        StringBuilder builder=new StringBuilder();
        for(byte valor:algo)
        {
         builder.append(valor);
        }
        String a=builder.toString();
        
        
        return  a;
    
    }
    public StringBuilder codificado(StringBuilder b)
    {
       StringBuilder nb =b;
    return nb;
    }
    
    

}
     

