/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package daniel_alves_fonseca_neto.grupostrabalho;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
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
    private PessoaServiceLocal pessoaBean;


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

            StringBuilder sb = new StringBuilder();

            sb.append("<!DOCTYPE html>");
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>Servlet Relatorios</title>");
            sb.append("</head>");
            sb.append("<body>");
            sb.append("<h1>Estudo Dirigido: Jakarta Persistence Query Language</h1>");
            sb.append("<a href=\"index.html\">Voltar</a>");

            //<editor-fold defaultstate="collapsed" desc="Consulta 1">
            sb.append("<h2>Consulta 1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findAllPessoaQuerry()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findAllPessoaTypedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findAllPessoaNamedQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 2">
            sb.append("<h2>Consulta 2.A: Quais os nomes das pessoas? Por meio de Query </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findNomeQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 2.B: Quais os nomes das pessoas? Por meio de TypedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findNomeTypedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 2.C: Quais os nomes das pessoas? Por meio de NamedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findNomeNamedQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 3">
            sb.append("<h2>Consulta 3.A: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de Query </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.fiindNomeEnderecoQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 3.B: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de TypedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.fiindNomeEnderecoTypedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 3.C: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de NamedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.fiindNomeEnderecoNamedQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 4">
            sb.append("<h2>Consulta 4.A: Quais pessoas (dados completos) moram em avenidas? Por meio de Query </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findPessoaQueMoramEmAvenidaQuery()));
            sb.append("</pre>");

            sb.append("<h2> Consulta 4.B: Quais pessoas (dados completos) moram em avenidas? Por meio de TypedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findPessoaQueMoramEmAvenidaTypedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 4.C: Quais pessoas (dados completos) moram em avenidas? Por meio de NamedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findPessoaQueMoramEmAvenidaNamedQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 5">
            sb.append("<h2>Consulta 5.A: Quais pessoas (dados completos) não moram em praças? Por meio de Query</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findPessoasQueNaoMoramEmPracaNamedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 5.B: Quais pessoas (dados completos) não moram em praças? Por meio de TypedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findPessoasQueNaoMoramEmPracaTypedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 5.C: Quais pessoas (dados completos) não moram em praças? Por meio de NamedQuery</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findPessoasQueNaoMoramEmPracaNamedQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 6">
            sb.append("<h2>Consulta 6.A: Quais os nomes das pessoas e seus respectivos telefones (dados completos)? Por meio de Query </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findNomeTelefoneQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 6.B: Quais os nomes das pessoas e seus respectivos telefones (dados completos)? Por meio de TypedQuery</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findNomeTelefoneTypedQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 6.C: Quais os nomes das pessoas e seus respectivos telefones (dados completos)? Por meio de NamedQuery </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.findNomeTelefoneNamedQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 7">
            sb.append("<h2>Consulta 7: Quais as pessoas (dados completos) que nasceram entre abril de 2001 e abril de 2004?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.consulta7ByQuery(LocalDate.of(2001, Month.APRIL, 1), LocalDate.of(2004, Month.APRIL, 30))));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 8">
            sb.append("<h2>Consulta 8.A: Quais pessoas (dados completos) têm telefone do estado do Paraná?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.consulta8AByQuery()));
            sb.append("</pre>");

            sb.append("<h2>Consulta 8.B: Quais pessoas (dados completos) têm telefone do estado do Rio de Janeiro?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.consulta8BByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 9">
            sb.append("<h2>Consulta 9: Quais pessoas (dados completos) não possuem telefone?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.consulta9ByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 10">
            sb.append("<h2>Consulta 10: Quantos telefones cada pessoa (nome) tem?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.Consulta10ByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 11">
            sb.append("<h2>Consulta 11: Quais grupos (dados completos) não estão ativos? </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.findGruposNaoAtivosByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 12">
            sb.append("<h2>Consulta 12: Quais são os líderes (nomes) dos grupos (nomes)? </h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.findLiderENomeGrupoByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 13">
            sb.append("<h2>Consulta 13: Quais são os membros (nomes) do grupo com nome \"Estudo IV\" com ordenação alfabética inversa?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(pessoaBean.consulta13ByQuery("Estudo IV")));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 14">
            sb.append("<h2>Consulta 14: Quais são os grupos (dados completos) liderados por \"Beatriz Yana\"?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consuta14ByQuery("Beatriz Yana")));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 15">
            sb.append("<h2>Consulta 15: Quais são as datas de início e de término da atuação e os grupos (nomes) nos quais \"Cecília Xerxes\" é membro?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta15ByQuery("Cecília Xerxes")));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 16">
            sb.append("<h2>Consulta 16: Quais são os grupos (dados completos) que contêm \"II\" em seus nomes?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta16ByQuery("II")));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 17">
            sb.append("<h2>Consulta 17: Quais são os grupos (nomes) e os respectivos totais de membros distintos já alocados?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta17ByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 18">
            sb.append("<h2>Consulta 18: Quais grupos (nomes) têm 3 ou mais atuações de membros e quanto são esses totais de atuações?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta18ByQuery(3L)));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 19">
            sb.append("<h2>Consulta 19: Quais membros (nomes) entraram a partir de 2012 no primeiro grupo?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta19ByQuery("Estudo I", LocalDate.of(2012, Month.JANUARY, 1))));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 20">
            sb.append("<h2>Consulta 20: Quais os grupos (nomes), membros (nomes) e as respectivas datas de entrada daqueles que entraram a partir de 2012 em qualquer grupo?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta20ByQuery(LocalDate.of(2012, Month.JANUARY, 1))));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 21">
            sb.append("<h2>Consulta 21: Quais os grupos (nomes) e respectivos membros (nomes) que não possuem data de término de atuação em seus grupos?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta21ByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Consulta 22">
            sb.append("<h2>Consulta 22: Quais são os grupos (nomes) e líderes (nomes) com respectivos membros(nomes)?</h>");
            sb.append("<pre>");
            sb.append(Util.toJson(grupoBean.consulta22ByQuery()));
            sb.append("</pre>");
            //</editor-fold>

            sb.append("<a href=\"index.html\">Voltar</a>");
            sb.append("</body>");
            sb.append("</html>");

            out.print(sb.toString());

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