/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
  private float peso;
  private  float altura;
  private boolean flaco;
  
  public Imc(/*float p, float a*/){
  //peso=p;
  //altura=a;
  
  
  }


    public void setPeso(float peso) {
        this.peso = peso;
    }

 
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public float getAltura() {
        return altura;
    }
    /*
    public float calcularImc(float altura, float peso){
        return calculo=peso / (altura*altura);
    }*/
    
    public float calcular(){
        float calcular=peso/(altura*altura);
        return calcular;
    }
    
    public void setFlaco(boolean flaco){
        this.flaco=flaco;
    }
    
    public boolean isFlaco(){
        return flaco;
    }
    
}
