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
public  class  Direccion {
    private String calle;
    private int nuemero;
    private String colonia;
    private int CP;
    private String municipio;

 
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNuemero() {
        return nuemero;
    }

    public void setNuemero(int nuemero) {
        this.nuemero = nuemero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    
    
    public Direccion(int CP,String municipio){
        this.CP=CP;
        this.municipio=municipio;
    }
    
    
    
}
