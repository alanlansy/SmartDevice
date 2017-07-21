/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;

import edu.mits.iot.smartdevice.rules.Rules;
import edu.mits.iot.smartdevice.Actuator;
import edu.mits.iot.smartdevice.rules.Rule;
import edu.mits.iot.smartdevice.Device;
import edu.mits.iot.smartdevice.Sensor;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author mits
 */
public class Smartbed implements Device{
    HashMap<String, Sensor> sensors= new HashMap<>();
    HashMap<String, Actuator> actuators=new HashMap<>();
    Rules rule;

    /**
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException{
        System.out.println("Hello");
        Smartbed sm= new Smartbed();
        PressureSensor s=new PressureSensor();
        BedEmptyIndicator a=new BedEmptyIndicator();
        BedOccupiedIndicator a1=new BedOccupiedIndicator();
        String name = null; 
        Sensor s1=new PressureSensor();
       // Sensor s2=new PressureSensor();
        sm.addSensor("pressureSensor",s1);
        sm.addActuator("BedEmptyLight",a);
        sm.addActuator("BedOccupiedLight",a1);
        Rules r = new Rules();
        Rule r1=new EmptybedRule(sm);
        r.setrule(1, r1);
        sm.setRules(r);
        sm.startdevice();
    }  

   

    public void startdevice() throws IOException {
        PressureSensor s=(PressureSensor)this.getSensor("pressureSensor");
        //To change body of generated methods, choose Tools | Templates.
        while(true){
            System.out.println("Enter sensor input\n0.Zero pressure\n1.Non zero pressure");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            switch(x)
            {
                case 0:
                    s.write(x);
                    rule.executerules();
                    break;
                
                default:
                    s.write(x);
                   rule.executerules();
            }
            
        }    
    }

    /**
     *
     * @return
     */
    @Override
    public Collection<Sensor> getSensorList() {
        return sensors.values();
        
        //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public Collection getActuatorList() {
        return actuators.values();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sensor getSensor(String name) {
        return sensors.get(name);
       //To change body of generated methods, choose Tools | Templates.
    }

  /*  @Override
    public void addSensor(String name,Sensor<T> s) {
        sensors.put(name,s);
    }
*/
    @Override
    public void addActuator(String name, Actuator a) {
         //To change body of generated methods, choose Tools | Templates.
         actuators.put(name, a);
    }

    @Override
    public Actuator getActuator(String name) {
        return actuators.get(name);
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override    
    public void setRules(Rules r){
        this.rule=r;
    }

    @Override
    public void addSensor(String name, Sensor s) {
        sensors.put( name, s);
    }    
}