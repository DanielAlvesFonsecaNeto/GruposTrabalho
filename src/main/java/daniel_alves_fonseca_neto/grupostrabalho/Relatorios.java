/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package daniel_alves_fonseca_neto.grupostrabalho;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author DER
 */
@Transactional
@WebServlet(name = "Relatorios", urlPatterns = {"/Relatorios"})
public class Relatorios extends HttpServlet {

    @Inject
    private PessoaServiceLocal pessoaService;


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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PessoaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>JPQL</h1>");

            
            
            
            //Questão 1
            
            List<Pessoa> pl;
            
            out.println("<h2>Consulta 1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query </h>");
            out.println("<ul>");
            pl = pessoaService.findAllPessoaQuerry();
            for (Pessoa p : pl) {
                out.println("<li>" + p + "</li>");
            }
            out.println("</ul>");

            out.println("<h2>Consulta 1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery </h>");
            out.println("<ul>");
            pl = pessoaService.findAllPessoaTypedQuery();
            for (Pessoa p : pl) {
                out.println("<li>" + p + "</li>");
            }
            out.println("</ul>");
            
            out.println("<h2>Consulta 1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery </h>");
            out.println("<ul>");
            pl = pessoaService.findAllPessoaNamedQuery();
            for (Pessoa p : pl) {
                out.println("<li>" + p + "</li>");
            }
            out.println("</ul>");
            
            
            //Questão 2
            ////esta dando alum erro 
            List<Object[]> ob; 
            
            out.println("<h2>Consulta 2.A: Quais os nomes das pessoas? Por meio de Query </h>");
            out.println("<ul>");
            ob = pessoaService.findNomeQuery();
            for (Object[] o : ob) {
                out.println("<li>" + o[1] + "</li>");
            }
            out.println("</ul>");
            
            out.println("<h2>Consulta 2.B: Quais os nomes das pessoas? Por meio de TypedQuery </h>");
            out.println("<ul>");
            ob = pessoaService.findNomeTypedQuery();
            for (Object[] o : ob) {
                out.println("<li>" + o[0] + "</li>");
            }
            out.println("</ul>");
            
            out.println("<h2>Consulta 2.C: Quais os nomes das pessoas? Por meio de NamedQuery </h>");
            out.println("<ul>");
            ob = pessoaService.findNomeNamedQuery();
            for (Object[] o : ob) {
                out.println("<li>" + o[0] + "</li>");
            }
            out.println("</ul>");
            


            out.println("</body>");
            out.println("</html>");

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
