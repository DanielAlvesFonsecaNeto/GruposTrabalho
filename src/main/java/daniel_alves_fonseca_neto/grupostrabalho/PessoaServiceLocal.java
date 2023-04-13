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

    List<Object[]> findNomeQuery();

    List<Object[]> findNomeTypedQuery();

    List<Object[]> findNomeNamedQuery();

    List<Pessoa> fiindNomeEnderecoQuery();

    List<Object[]> fiindNomeEnderecoTypedQuery();

    List<Object[]> fiindNomeEnderecoNamedQuery();

    List<Object[]> findNomeTelefoneQuery();

    List<Object[]> findNomeTelefoneTypedQuery();

    List<Object[]> findNomeTelefoneNamedQuery();

    List<Pessoa> findPessoaQueMoramEmAvenidaQuery();

    List<Pessoa> findPessoaQueMoramEmAvenidaTypedQuery();

    List<Pessoa> findPessoaQueMoramEmAvenidaNamedQuery();

    List<Pessoa> findPessoasQueNaoMoramEmPracaQuery();

    List<Pessoa> findPessoasQueNaoMoramEmPracaTypedQuery();

    List<Pessoa> findPessoasQueNaoMoramEmPracaNamedQuery();

    List<Pessoa> consulta7ByQuery(LocalDate beginDate, LocalDate endDate);

    List<Pessoa> consulta8AByQuery();

    List<Pessoa> consulta8BByQuery();

    List<Pessoa> consulta9ByQuery();

    List<Pessoa> Consulta10ByQuery();

    List<Pessoa> consulta13ByQuery(String nomeGrupo);

}

