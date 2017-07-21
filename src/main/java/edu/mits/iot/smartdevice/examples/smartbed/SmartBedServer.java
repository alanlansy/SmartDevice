/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
/**
 *
 * @author mits
 */
public class SmartBedServer {
    	    public static void main(String[] args) throws Exception {
	 
	        Server server = new Server(7070);
	        ServletContextHandler handler = new ServletContextHandler(server, "/smartbed");
	        handler.addServlet(SmartbedServlet.class, "/");
	        server.start();
	 
	    }
    
}
