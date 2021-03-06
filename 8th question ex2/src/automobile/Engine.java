/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobile;

/**
 *
 * @author S542301
 */
public abstract class Engine {
    private final double power;
    private final double acc;
    private final double rpm;
    private final double HP;

    public Engine(double power, double acc, double rpm, double HP) {
        this.power = power;
        this.acc = acc;
        this.rpm = rpm;
        this.HP = HP;
    }

    public double getHP() {
        return HP;
    }

   

    

    public double getPower() {
        return power;
    }

    public double getAcc() {
        return acc;
    }

    public double getRpm() {
        return rpm;
    }
    
    public abstract double intakeAir();
    public abstract double brakeMeanPressure();
    

    @Override
    public String toString() {
        return  "power of engine : " + power + 
                "\naccelaration of engine: " + acc;
                
    }


    
}
