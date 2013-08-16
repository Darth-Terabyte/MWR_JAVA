/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.DeviceFacade;
import session.DevicenotregisteredFacade;
import session.EmployeeFacade;
import session.RegistrationManager;
import session.ScanManager;
import session.ScanresultsFacade;
import session.TechnicianFacade;
//import session.DeviceFacade;

/**
 *
 * @author madenem
 */
@WebServlet(name="ControllerServlet",
            loadOnStartup = 1,
            urlPatterns = {"/technicians","/employees","/register","/registerDevice","/admin_Navigation","/admin_Overview","/admin_Employees_List","/admin_Technicians_List","/admin_home",
            "/blacklisted_Apps_Add","/blacklisted_Apps_List",  "/device_Blacklisted_Apps","/device_Log","/device_Register_New","/device_Scan_Log","/emp_device_Summary","/tech_Home",
            "/tech_Navigation","/tech_Overview","/tech_content","/tech_login","/tech_register_User","/technicianDetails","/devices","/requestRegistration","/devRegister","/waitingList","/scanResults","/scans"})
//,,,,
//             ,
//,,
//            "blacklisted_Apps_Add","blacklisted_Apps_List","device_Blacklisted_Apps","device_Log","device_Register_New","device_Scan_Log",
//             "emp_device_Summary","tech_Home","tech_Navigation","tech_Overview","tech_content","tech_login","tech_register_User","technicianDetails"

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
    @EJB
    private DeviceFacade devFacade;
    @EJB
    private DevicenotregisteredFacade devNotRegisteredFacade;
    @EJB
    private ScanManager scanMan;
    @EJB
    private ScanresultsFacade scanFacade;
    @Override
    public void init() throws ServletException {
        
        // store category list in servlet context
        getServletContext().setAttribute("technicians", techFacade.findAll());
        
       
        
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
            getServletContext().setAttribute("employees", empFacade.findAll());
            userPath = "/admin_Employees_List";
        // if cart page is requested
        }
        
        else if (userPath.equals("/register")) {

            // TODO: Implement category request
            userPath = "/devRegister";
        // if cart page is requested
        }
         else if (userPath.equals("/devices"))
        {
             getServletContext().setAttribute("devices", devFacade.findAll());
        }
        else if (userPath.equals("/waitingList")) 
        {
            getServletContext().setAttribute("waitinglist", devNotRegisteredFacade.findAll());
        }
        else if (userPath.equals("/scans")) 
        {
            getServletContext().setAttribute("scans", scanFacade.findAll());
            userPath = "/device_Log";
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

           String id = request.getParameter("id");
           regMan.addDevice(id);
           userPath = "/devices";
        }
        else if(userPath.equals("/requestRegistration")) 
        {
           String mac = request.getParameter("mac");
           String serial = request.getParameter("serial");
           String androidID = request.getParameter("android");
           String make = request.getParameter("make");
           String model = request.getParameter("model");
           String username = request.getParameter("username");
           String password = request.getParameter("password");
           String name = request.getParameter("name");
           String surname = request.getParameter("surname");
           String id = request.getParameter("id");
            try {
                regMan.addToList(make, model, mac, androidID, serial, username, password,name,surname,id);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(ControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
           userPath = "/devices";
           
        }
        else if (userPath.equals(("/scanResults")))
        {
            boolean rooted = Boolean.parseBoolean(request.getParameter("rooted"));
            boolean debug = Boolean.parseBoolean(request.getParameter("debug"));
            boolean unknown = Boolean.parseBoolean(request.getParameter("unknown"));
            String apps = request.getParameter("apps");
            scanMan.addScan(rooted, debug, unknown, apps);
            
            
            userPath = "/devices";
            
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
