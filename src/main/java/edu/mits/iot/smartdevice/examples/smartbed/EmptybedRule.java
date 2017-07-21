/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;

import edu.mits.iot.smartdevice.Actuator;
import edu.mits.iot.smartdevice.Device;
import edu.mits.iot.smartdevice.rules.Rule;
import edu.mits.iot.smartdevice.Sensor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
 

public class EmptybedRule implements Rule
{  
    Integer s2;
    Sensor<Integer> se;
    Actuator a,ac;
    String name;
    int count;
    
    public EmptybedRule(Device d){
      
           se=d.getSensor("pressureSensor");
           a=d.getActuator("BedEmptyLight");
           ac=d.getActuator("BedOccupiedLight");
    }
    /**
     *
     */
    @Override
    public void execute(){
        try{
            SmartBedConfig config=new SmartBedConfig();
            String urlString=config.getPropertyValue("emptybedrule.url");
            URL url; 
            URLConnection urlConn; 
            url = new URL(urlString+se.read());

            urlConn = url.openConnection(); 
            urlConn.setDoInput(true); 
            urlConn.setUseCaches(false);
            if(urlConn instanceof HttpURLConnection)
            {
                HttpURLConnection httpConnection = (HttpURLConnection) urlConn;

                System.out.println(httpConnection.getResponseCode());
                System.out.println(httpConnection.getResponseMessage());
                BufferedReader in = new BufferedReader(
		        new InputStreamReader(httpConnection.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		//print result
		System.out.println(response.toString());            }
            else
            {
                System.err.println ("error!");
            }
        }
        catch(IOException e){
            
        }
    }
}