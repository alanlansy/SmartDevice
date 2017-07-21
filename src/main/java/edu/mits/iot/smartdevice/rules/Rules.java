/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.rules;
/**
 * 
 * @author mits
 */
import java.util.*;
public class Rules {
    HashMap<Integer,Rule> rules=new HashMap<>();
    int count=0;
    
    public void setrule(int prio, Rule s){
          rules.put(prio, s);
          count++;
    }
    public Rule getrule(int prio){
        return rules.get(prio);
    }
    
    public void executerules(){
        int i=1;
        while(rules.containsKey(i)){
            Rule r=rules.get(i);
            r.execute();
            i++;
        }
    }

}

