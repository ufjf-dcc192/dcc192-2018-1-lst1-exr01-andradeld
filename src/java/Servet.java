/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.nio.file.Files.size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(urlPatterns = {"/index.html"})
public class Servet extends HttpServlet {

    
    private List <String> frutas = new ArrayList();
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        frutas.add("abacaxi");
        frutas.add("pera");
        frutas.add("mamao");
        frutas.add("lima");
        frutas.add("uva");
        frutas.add("morango");
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Lista padrão</p> ");
            for (int i = 0 ; i < frutas.size(); i++){
            out.println(frutas.get(i));
              }
            out.println("<p>Ordem alfabetica</p> ");            
            Collections.sort(frutas, String.CASE_INSENSITIVE_ORDER);
            for (int i = 0 ; i < frutas.size(); i++){
                 out.println(this.frutas.get(i));
                }
            out.println("<p>Ordem de tamanho</p> ");
            frutas.sort(Comparator.comparing(String::length));
            for (int i = 0 ; i < frutas.size(); i++){
              out.println(this.frutas.get(i));
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
    }