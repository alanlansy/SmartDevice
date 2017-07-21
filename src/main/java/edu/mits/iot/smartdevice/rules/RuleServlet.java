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
public class RuleServlet extends HttpServlet {
    /**
     *
     * @param req
     * @param resp 
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

            resp.setStatus(HttpStatus.OK_200);
            String val=req.getParameter("value");
            if(val.equals("0"))
            {
                resp.getWriter().println("EMPTY_BED");
            }
            else
            {
                resp.getWriter().println("BED_OCCUPIED");
            }
    }
}
