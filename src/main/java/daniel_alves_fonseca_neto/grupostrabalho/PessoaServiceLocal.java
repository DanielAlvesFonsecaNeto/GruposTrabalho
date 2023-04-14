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
public interface PessoaServiceLocal {

    void save(Pessoa pessoa);
    
    //Consulta 01 
    List<Pessoa> findAllPessoaQuerry();
    
    //Consulta 01
    List<Pessoa> findAllPessoaTypedQuery();
    
    //Consulta 01
    List<Pessoa> findAllPessoaNamedQuery();
    
    //Consulta 02
    List<String> findNomeQuery();
    
    //Consulta 02
    List<String> findNomeTypedQuery();
    
    //Consulta 02
    List<String> findNomeNamedQuery();
    
    //Consulta 03
    List<Object[]> fiindNomeEnderecoQuery();
    
    //Consulta 03
    List<Object[]> fiindNomeEnderecoTypedQuery();
    
    //Consulta 03
    List<Object[]> fiindNomeEnderecoNamedQuery();
    
    //Consulta 04
    List<Pessoa> findPessoaQueMoramEmAvenidaQuery();
    
    //Consulta 04
    List<Pessoa> findPessoaQueMoramEmAvenidaTypedQuery();
    
    //Consulta 04
    List<Pessoa> findPessoaQueMoramEmAvenidaNamedQuery();
    
    //Consulta 05
    List<Pessoa> findPessoasQueNaoMoramEmPracaQuery();
    
    //Consulta 05
    List<Pessoa> findPessoasQueNaoMoramEmPracaTypedQuery();
    
    //Consulta 05
    List<Pessoa> findPessoasQueNaoMoramEmPracaNamedQuery();
    
    //Consulta 06
    List<Object[]> findNomeTelefoneQuery();
    
    //Consulta 06
    List<Object[]> findNomeTelefoneTypedQuery();
    
    //Consulta 06
    List<Object[]> findNomeTelefoneNamedQuery();
    
    //Consulta 07
    List<Pessoa> consulta7(LocalDate beginDate, LocalDate endDate);
    
    //Consulta 09
    List<Pessoa> consulta9();
    
    //Consulta 10
    List<Object[]> consulta10();
    
    //Consulta 11
    List<Grupo> findGruposNaoAtivos();
    
    //Consulta 12
    List<Object[]> findLiderENomeGrupo();
    
    //Consulta 13
    List<String> consulta13(String nomeGrupo);
    
    //Consulta 14
    List<Grupo> consulta14(String nomeLider);

}

