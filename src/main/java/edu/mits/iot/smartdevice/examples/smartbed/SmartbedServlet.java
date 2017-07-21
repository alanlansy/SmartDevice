/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice.examples.smartbed;
import java.io.IOException;
	import org.eclipse.jetty.http.HttpStatus;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author mits
 */
public class SmartbedServlet extends HttpServlet {
//      @Override
            @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	 
	        resp.setStatus(HttpStatus.OK_200);
	        resp.getWriter().println("EmbeddedJetty");}
    
}
