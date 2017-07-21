/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;

import edu.mits.iot.smartdevice.Sensor;
 

public class PressureSensor implements Sensor<Integer>{

    public Integer value;

    /**
     *
     */
    @Override
    public void setId() {
         //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public char getId() {
         //To change body of generated methods, choose Tools | Templates.
         return 0;
    }

    /**
     *
     * @param s
     * @return
     */
    /**
     *
     * @return
     */
    @Override
    public char status() {
        //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    @Override
    public Integer read() {
       // Random rand=new Random();
       // int randomNum = rand.nextInt((1 - 0) + 1) + 0;
        return value;
    }

    @Override
    public void write(Integer v) {
        this.value=v;
    }
    
}
