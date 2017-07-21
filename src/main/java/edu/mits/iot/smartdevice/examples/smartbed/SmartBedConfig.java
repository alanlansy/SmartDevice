/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 *
 * @author mits
 */
public class SmartBedConfig {
     private Properties prop = null;
     
    public SmartBedConfig() throws IOException{
         
        InputStream is = null;
        try {
            this.prop = new Properties();
            is = this.getClass().getResourceAsStream("/smartbed.config");
            prop.load(is);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException | NullPointerException e) {
            System.out.println(e);
        }
    }
     
    public String getPropertyValue(String key){
        return this.prop.getProperty(key);
    }
}