/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author alfonsogalvanmadera
 */
public class ModeloEvaluacion {
    
    public float evaluar(ExamenParcial cParcial, ExamenFinal cFinal)throws CalificacionException{
        
        float pParacial=cParcial.getPorcentaje();
        float pFinal=cFinal.getPorcentaje();
        if((pFinal+pParacial)!=1.0f)throw new CalificacionException();
        float calificacionFinal=cParcial.getCalificacion()*cParcial.getPorcentaje()+cFinal.getCalificacion()*cFinal.getPorcentaje();
        if(calificacionFinal>=10.1f)throw new CalificacionException();
        return calificacionFinal;
    }
}
