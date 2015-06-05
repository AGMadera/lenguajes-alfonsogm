/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

import java.util.Arrays;

/**
 *
 * @author T-107
 */
public class Mensajes {
    String texto;

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
        for(byte n:algo)
        {
        System.out.print("Este elemento tiene un valor de: "+n);
        System.out.println(" "+(char)n);
        }
        
        String mns=Arrays.toString(algo);
        return mns;
    
    }
    public String codificado(String mns)
    {
    return mns;
    }

}
     

