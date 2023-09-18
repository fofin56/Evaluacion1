/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author benjamin figueroa
 */
public class Servletindex1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int monto = Integer.parseInt(request.getParameter("dinero"));
            int años = Integer.parseInt(request.getParameter("select"));
           
            if(años==3){
            double interes=5;
            double total =monto * interes / 100 * años;
            out.println("el interes total por un credito de "+monto+" pesos"+" a "+años+" años"+" es de "+total+" pesos"+"<br>");
            out.println("a un interes anual de "+interes+"%");
            }if(años==5){
            double interes=4;
            double total =monto * interes / 100 * años;
            out.println("el interes total por un credito de "+monto+" pesos"+" a "+años+" años"+" es de "+total+" pesos"+"<br>");
            out.println("a un interes anual de "+interes+"%");
            }if(años==10){
            double interes=3;
            double total =monto * interes / 100 * años;
            out.println("el interes total por un credito de "+monto+" pesos"+" a "+años+" años"+" es de "+total+" pesos"+"<br>");
            out.println("a un interes anual de "+interes+"%");
            }if(años==30){
            double interes=2;
            double total =monto * interes / 100 * años;
            out.println("el interes total por un credito de "+monto+" pesos"+" a "+años+" años"+" es de "+total+" pesos"+"<br>");
            out.println("a un interes anual de "+interes+"%");
            }
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
