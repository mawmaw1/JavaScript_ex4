/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import domain.Person;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Magnus
 */
@WebServlet(name = "UIServlet", urlPatterns = {"/UIServlet"})
public class UIServlet extends HttpServlet {

    String q1 = "C-3PO: R2 says that the chances of survival are 725 to 1. Actually R2 has been known to make mistakes - from time to time... Oh dear... ";
    String q2 = "Luke Skywalker: What a piece of junk! Han Solo: She'll make point five past lightspeed. She may not look like much but she's got it where it counts, kid. I've made a lot of special modifications myself. ";
    String q3 = "C-3PO: I do believe they think I am some kind of god. Han Solo: Well, why don't you use your divine influence and get us out of this? C-3PO: I beg your pardon General Solo, but that just wouldn't be proper. Han Solo: Proper??? C-3PO: It's against my programming to impersonate a deity. ";
    String q4 = "Jabba the Hutt: Bring me Solo and the Wookiee! They will all suffer for this outrage. ";
    String q5 = "Princess Leia: Darth Vader. Only you could be so bold. ";

    private String getQuote() {
        String res = "";
        int randomNum = 1 + (int) (Math.random() * 5);
        if (randomNum == 1) {
            res = q1;
        }
        if (randomNum == 2) {
            res = q2;
        }
        if (randomNum == 3) {
            res = q3;
        }
        if (randomNum == 4) {
            res = q4;
        }
        if (randomNum == 5) {
            res = q5;
        }
        return res;
    }
    static List<Person> persons = new ArrayList();
    Person p1 = new Person("Morten", 19);
    Person p2 = new Person("Astrid", 25);
    Person p3 = new Person("Carsten", 25);
   
    Gson gson = new Gson();

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      Date date = new Date();
//        persons.add(p1);
//        persons.add(p2);
//        persons.add(p3);
//        String name = request.getParameter("name");
//        int age = Integer.parseInt(request.getParameter("age"));
//        Person p4 = new Person(name,age);
//        persons.add(p4);
//        
        try (PrintWriter out = response.getWriter()) {
//           
//            for(Person p : persons){
//                out.print(p);
//            }
//            
//            //
//
              out.print(date);
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
