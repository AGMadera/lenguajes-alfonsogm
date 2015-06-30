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
public class FinDeCuatri {
    public static void main(String[] args) throws CalificacionException{
        
        //Creamos un objeto de tipo examen parcial
        ExamenParcial eParcial = new ExamenParcial();
                      eParcial.setCalificacion(11);
                      eParcial.setPorcentaje(0.4f);
        ExamenFinal eFinal =new ExamenFinal();
                    eFinal.setCalificacion(10);
                    eFinal.setPorcentaje(0.6f);
        ///Creamos el modelo de evaluacion
                    ModeloEvaluacion modelo=new ModeloEvaluacion();
                    
       
        System.out.println(modelo.evaluar(eParcial, eFinal));
                      
    }
}
