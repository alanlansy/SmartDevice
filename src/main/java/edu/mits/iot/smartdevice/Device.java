/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice;

import edu.mits.iot.smartdevice.rules.Rules;
import java.util.Collection;

public interface Device<T> {

    
    public Collection<Sensor<T>> getSensorList();

    public Collection<Actuator> getActuatorList();
    
    public Sensor<T> getSensor(String name);
    
    /**
     *
     * @param name
     * @param s
     */
    public void addSensor(String name, Sensor<T> s);

    public void addActuator(String name, Actuator a);

    public Actuator getActuator(String name);
    
    public void setRules(Rules r);
    
}
