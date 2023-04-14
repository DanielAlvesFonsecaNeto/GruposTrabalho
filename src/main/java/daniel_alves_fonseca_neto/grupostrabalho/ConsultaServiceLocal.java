/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniel_alves_fonseca_neto.grupostrabalho;

import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author DER
 */
@Local
public interface ConsultaServiceLocal {

    /// usei a palavra consultaService pois usei buca por grupos e pessoas , entao achei que faria mais sentido
    void save(Pessoa pessoa);
    
    //////Consulta 01 
    List<Pessoa> findAllPessoaQuerry();
    
    List<Pessoa> findAllPessoaTypedQuery();
   
    List<Pessoa> findAllPessoaNamedQuery();
    
    //////Consulta 02
    List<String> findNomeQuery();
    
    List<String> findNomeTypedQuery();
    
    List<String> findNomeNamedQuery();
    
    //////Consulta 03
    List<Object[]> fiindNomeEnderecoQuery();
    
    List<Object[]> fiindNomeEnderecoTypedQuery();
    
    List<Object[]> fiindNomeEnderecoNamedQuery();
    
    //////Consulta 04
    List<Pessoa> findPessoaQueMoramEmAvenidaQuery();
    
    List<Pessoa> findPessoaQueMoramEmAvenidaTypedQuery();
    
    List<Pessoa> findPessoaQueMoramEmAvenidaNamedQuery();
    
    //////Consulta 05
    List<Pessoa> findPessoasQueNaoMoramEmPracaQuery();
    
    List<Pessoa> findPessoasQueNaoMoramEmPracaTypedQuery();
    
    List<Pessoa> findPessoasQueNaoMoramEmPracaNamedQuery();
    
    //////Consulta 06
    List<Object[]> findNomeTelefoneQuery();
    
    List<Object[]> findNomeTelefoneTypedQuery();
    
    List<Object[]> findNomeTelefoneNamedQuery();
    
    //////Consulta 07
    List<Pessoa> consulta7(LocalDate beginDate, LocalDate endDate);
    
    ////// Consulta 08 , Professor falou que nao precisa !!
    
    //////Consulta 09
    List<Pessoa> consulta9();
    
    //////Consulta 10
    List<Object[]> consulta10();
    
    //////Consulta 11
    List<Grupo> findGruposNaoAtivos();
    
    //////Consulta 12
    List<Object[]> findLiderENomeGrupo();
    
    //////Consulta 13
    List<String> consulta13(String nomeGrupo);
    
    //////Consulta 14
    List<Grupo> consulta14(String nomeLider);
    
    //////Consulta 15
    List<Object[]> consulta15(String nomeMembro);
    
    //////Consulta 16
    List<Grupo> consulta16(String str);
    
    //////Consulta 17
    List<Object[]> consulta17();
    
    //////Consulta 18
    List<Object[]> consulta18(long qtd);
    
    //////Consulta 19
    List<String> consulta19(String nomeGrupo, LocalDate data);
    
    //////Consulta 20
    List<Object[]> consulta20(LocalDate data);
    
    //////Consulta 21
    List<Object[]> consulta21();
    
    //////Consulta 22
    List<Object[]> consulta22();
}

