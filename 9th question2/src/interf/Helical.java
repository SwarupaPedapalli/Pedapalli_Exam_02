/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interf;

/**
 *
 * @author S542301
 */
public interface Helical {
    
    
    double pitch();
    
    
     default double gearratio(int outputSpeed, int inputSpeed){
         double gearRpm = (outputSpeed/inputSpeed) *120;
         return gearRpm;
       
    }


    
    

    
}
