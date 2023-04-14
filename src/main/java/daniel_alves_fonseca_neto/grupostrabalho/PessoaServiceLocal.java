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

    List<Pessoa> findAllPessoaQuerry();

    List<Pessoa> findAllPessoaTypedQuery();

    List<Pessoa> findAllPessoaNamedQuery();

    List<String> findNomeQuery();

    List<String> findNomeTypedQuery();

    List<String> findNomeNamedQuery();
    
    List<Object[]> fiindNomeEnderecoQuery();

    List<Object[]> fiindNomeEnderecoTypedQuery();

    List<Object[]> fiindNomeEnderecoNamedQuery();
    
    List<Pessoa> findPessoaQueMoramEmAvenidaQuery();

    List<Pessoa> findPessoaQueMoramEmAvenidaTypedQuery();

    List<Pessoa> findPessoaQueMoramEmAvenidaNamedQuery();

    List<Pessoa> findPessoasQueNaoMoramEmPracaQuery();

    List<Pessoa> findPessoasQueNaoMoramEmPracaTypedQuery();

    List<Pessoa> findPessoasQueNaoMoramEmPracaNamedQuery();
    
    List<Object[]> findNomeTelefoneQuery();

    List<Object[]> findNomeTelefoneTypedQuery();

    List<Object[]> findNomeTelefoneNamedQuery();


}

