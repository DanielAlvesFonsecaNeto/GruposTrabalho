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
            
            out.println("<h2 style=\"color: red;\">     Q1 - Quais as pessoas (dados completos) cadastradas?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findAllPessoaQuerry();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");

            out.println("<h3 style=\"color: blue;\">Por meio de TypedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findAllPessoaTypedQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de NamedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findAllPessoaNamedQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            
            
            //Questão 2
            
            List<String> str; 
            
            out.println("<h2 style=\"color: red;\">     Q2 - Quais os nomes das pessoas? </h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            str = pessoaService.findNomeQuery();
            for (String o : str) {
                out.println("<li style=\"color: green;\">" + o + "</li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de TypedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            str = pessoaService.findNomeTypedQuery();
            for (String o : str) {
                out.println("<li style=\"color: green;\">" + o + "</li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de NamedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            str = pessoaService.findNomeNamedQuery();
            for (String o : str) {
                out.println("<li style=\"color: green;\">" + o + "</li><br>");
            }
            out.println("</ul>");
            
            
            
            //Questão 3
            
            
            List<Object[]> obQ3;
            
            out.println("<h2 style=\"color: red;\">     Q3 - Quais as pessoas (nome) e seus respectivos endereços (dados completos)? </h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            obQ3 = pessoaService.fiindNomeEnderecoQuery();
            
            for (Object[] o : obQ3) {
                
                out.println("<li style=\"color: green;\"> nome : " + o[0] + " endereco :  " + o[1] + "</li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de TypedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            obQ3 = pessoaService.fiindNomeEnderecoTypedQuery();
            
            for (Object[] o : obQ3) {
                
                out.println("<li style=\"color: green;\"> nome : " + o[0] + " endereco :  " + o[1] + "</li><br>");
            }
            out.println("</ul>");
          
            
            out.println("<h3 style=\"color: blue;\">Por meio de NamedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            obQ3 = pessoaService.fiindNomeEnderecoNamedQuery();
            
            for (Object[] o : obQ3) {
                
                out.println("<li style=\"color: green;\"> nome : " + o[0] + " endereco :  " + o[1] + "</li><br>");
            }
            out.println("</ul>");
            
            
            
            //Questão 4
            
            
            out.println("<h2 style=\"color: red;\">     Q4 - Quais pessoas (dados completos) moram em avenidas?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findPessoaQueMoramEmAvenidaQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");

            out.println("<h3 style=\"color: blue;\">Por meio de TypedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findPessoaQueMoramEmAvenidaTypedQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de NamedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findPessoaQueMoramEmAvenidaNamedQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            
            
            
            //Questão 5
            
            
            out.println("<h2 style=\"color: red;\">     Q5 - Quais pessoas (dados completos) não moram em praças?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findPessoasQueNaoMoramEmPracaQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");

            out.println("<h3 style=\"color: blue;\">Por meio de TypedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findPessoasQueNaoMoramEmPracaTypedQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de NamedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.findPessoasQueNaoMoramEmPracaNamedQuery();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            
          
            
            //Questão 6
            
            
            List<Object[]> obQ6;
            
            out.println("<h2 style=\"color: red;\">     Q6 - Quais os nomes das pessoas e seus respectivos telefones (dados completos)? </h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            obQ6 = pessoaService.findNomeTelefoneQuery();
            
            for (Object[] o : obQ6) {
                
                out.println("<li style=\"color: green;\"> nome : " + o[0] + " Telefone : " + o[1] + " </li><br>");
            }
            out.println("</ul>");
            
            out.println("<h3 style=\"color: blue;\">Por meio de TypedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            obQ6 = pessoaService.findNomeTelefoneTypedQuery();
            
            for (Object[] o : obQ6) {
                
                out.println("<li style=\"color: green;\"> nome : " + o[0] + " Telefone : " + o[1] + " </li><br>");
            }
            out.println("</ul>");
          
            
            out.println("<h3 style=\"color: blue;\">Por meio de NamedQuery </h>");
            out.println("<ul style=\"color: green;\">");
            obQ6 = pessoaService.findNomeTelefoneNamedQuery();
            
            for (Object[] o : obQ6) {
                
                out.println("<li style=\"color: green;\"> nome : " + o[0] + " Telefone : " + o[1] + " </li><br>");
            }
            out.println("</ul>");


            
            
            //Questão 7
            
            out.println("<h2 style=\"color: red;\">     Q7 - Quais as pessoas (dados completos) que nasceram entre abril de 2001 e abril de 2004?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.consulta7(LocalDate.of(2001, Month.APRIL, 1), LocalDate.of(2004, Month.APRIL, 30));
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            

            
            
            //Questão 8
            
            out.println("<h2 style=\"color: red;\">     Q8 - Quais as pessoas (dados completos) que nasceram entre abril de 2001 e abril de 2004?</h>");
            out.println("<h3 style=\"color: red;\"><br>Professor falou que não precisa fazer !!!<br><br><br><br></h>");
            
            

            
            
            //Questão 9
            
            out.println("<h2 style=\"color: red;\">     Q9 - Quais pessoas (dados completos) não possuem telefone?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            pl = pessoaService.consulta9();
            for (Pessoa p : pl) {
                out.println("<li style=\"color: green;\">" + p + "</li><br>");
            }
            out.println("</ul>");
            

            
            
            //Questão 10
            
            List<Object[]> obQ10;
            
            out.println("<h2 style=\"color: red;\">     Q10 - Quantos telefones cada pessoa (nome) tem?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            obQ10 = pessoaService.consulta10();
            for (Object[] o : obQ10) {
                out.println("<li style=\"color: green;\">" + o[0] +" ---> : " +o[1] + " telefones </li><br>");
            }
            out.println("</ul>");
            

            
            
            //Questão 11
            
            List<Grupo> gl;
            
            out.println("<h2 style=\"color: red;\">     Q11 - Quais grupos (dados completos) não estão ativos?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            gl = pessoaService.findGruposNaoAtivos();
            for (Grupo g : gl) {
                out.println("<li style=\"color: green;\">" + g + "</li><br>");
            }
            out.println("</ul>");
            

            
            //Questão 12
            
            List<Object[]> obQ12;
            
            out.println("<h2 style=\"color: red;\">     Q12 - Quais são os líderes (nomes) dos grupos (nomes)? </h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            obQ12 = pessoaService.findLiderENomeGrupo();
            for (Object[] o : obQ12) {
                out.println("<li style=\"color: green;\"> Grupo : " + o[0] + " , Lider : "+ o[1] +"</li><br>");
            }
            out.println("</ul>");
            
            
            //Questão 13
            
            out.println("<h2 style=\"color: red;\">     Q13 - Quais são os membros (nomes) do grupo com nome \"Estudo IV\" com ordenação alfabética inversa?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            str = pessoaService.consulta13("Estudo IV");
            for (String s : str) {
                out.println("<li style=\"color: green;\">" + s + "</li><br>");
            }
            out.println("</ul>");
            

            
            
            //Questão 14
            
            out.println("<h2 style=\"color: red;\">     Q14 - Quais são os grupos (dados completos) liderados por \"Beatriz Yana\"?</h>");
            out.println("<h3 style=\"color: blue;\">Por meio de Query </h>");
            out.println("<ul style=\"color: green;\">");
            gl = pessoaService.consulta14("Beatriz Yana");
            for (Grupo g : gl) {
                out.println("<li style=\"color: green;\">" + g + "</li><br>");
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
