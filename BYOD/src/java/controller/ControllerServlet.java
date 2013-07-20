/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.EmployeeFacade;
import session.RegistrationManager;
import session.TechnicianFacade;
//import session.DeviceFacade;

/**
 *
 * @author madenem
 */
@WebServlet(name="ControllerServlet",
            loadOnStartup = 1,
            urlPatterns = {"/technicians","/employees","/register","/registerDevice"})
public class ControllerServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @EJB
    private TechnicianFacade techFacade;
    @EJB
    private EmployeeFacade empFacade;
    @EJB
    private RegistrationManager regMan;
    

    @Override
    public void init() throws ServletException {
        
        // store category list in servlet context
        getServletContext().setAttribute("technicians", techFacade.findAll());
        getServletContext().setAttribute("employees", empFacade.findAll());
        
        //System.out.println(techFacade.findAll().size());

    }
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userPath = request.getServletPath();

       
        if (userPath.equals("/technicians")) {
           
            userPath = "/admin_Technicians_List";        
        } 
        
        else if (userPath.equals("/employees")) {

            // TODO: Implement category request
            userPath = "/admin_Employees_List";
        // if cart page is requested
        }
        
                else if (userPath.equals("/register")) {

            // TODO: Implement category request
            userPath = "/devRegister";
        // if cart page is requested
        }
        

        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String userPath = request.getServletPath();

        if (userPath.equals("/registerDevice")) {

            // TODO: Implement category request
           String mac = request.getParameter("mac");
           String serial = request.getParameter("serial");
           String uid = request.getParameter("uid");
           String make = request.getParameter("make");
           String model = request.getParameter("model");
           int id = Integer.parseInt(request.getParameter("emp"));
           Employee emp = empFacade.find(id);
           regMan.addDevice(make, model, emp, mac, uid, serial);
        // if cart page is requested
        }
        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
