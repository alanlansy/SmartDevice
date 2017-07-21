/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;

import edu.mits.iot.smartdevice.Actuator;

/**
 *
 * @author mits
 */
public class BedOccupiedIndicator implements Actuator {

    @Override
    public void setId() {
    
    }

    @Override
    public char getId() {
    return 0;
    }

    @Override
    public void write() {
       System.out.println("bed occupied!!!!");
    }

    @Override
    public char status() {
        return 0;
    }
    
}
