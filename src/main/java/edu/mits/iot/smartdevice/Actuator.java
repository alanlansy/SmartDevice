/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice;


public interface Actuator {
       public void setId();
 
    /**
     *
     * @return
     */
    public char getId();

    /**
     *
     */
    public void write();

    /**
     *
     * @return
     */
    public char status();
}
