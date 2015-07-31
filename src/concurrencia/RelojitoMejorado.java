/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.Calendar;

/**
 *
 * @author alfonsogalvanmadera
 */
public class RelojitoMejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t1=new Thread(new Runnable() {

            @Override
            public void run() {
                while (true){
                try{
                Thread.sleep(1000);
                Calendar cal=Calendar.getInstance();
                int hora=cal.get(Calendar.HOUR);
                int minutos=cal.get(Calendar.MINUTE);
                int segundos=cal.get(Calendar.SECOND);
                System.out.println(hora+":"+minutos+":"+segundos);
                }catch(Exception e){
                
                }   
                }
                
            }
        });
        t1.start();
        
    }
    
}
