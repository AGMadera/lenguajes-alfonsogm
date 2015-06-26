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
public class Bebida {
     private String tipo;
     private String[] bebidas;
     
     
     public String[] ObtenerRecomendaciones(){
        if(tipo.equals("Alcoholicas")){
        String[] alcoliholicas=new String[]{"Vodka","Ron","Tequila","Whisky","Pulque"};
        return alcoliholicas; 
        }
        else {
         String[] noalcoholicas=new String[]{"Coca-cola","Agua","Pepsi","Agua mineral","Red bull"};
        return noalcoholicas;
        }
     }
       
             
     
    

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
