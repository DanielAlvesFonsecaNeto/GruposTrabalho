/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daniel_alves_fonseca_neto.grupostrabalho;

import java.time.LocalDate;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author DER
 */
@Stateless
public class PessoaService implements PessoaServiceLocal {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }

    //<editor-fold defaultstate="collapsed" desc="Consulta 1">
    @Override
    public List<Pessoa> findAllPessoaQuerry() {
        Query q = entityManager.createQuery("SELECT p FROM Pessoa p");
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> findAllPessoaTypedQuery() {
        return entityManager.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
    }

    @Override
    public List<Pessoa> findAllPessoaNamedQuery() {
        return entityManager.createNamedQuery("Pessoa.findAll", Pessoa.class).getResultList();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Consulta 2">
    @Override
    public List<String> findNomeQuery() {
        Query q = entityManager.createQuery("SELECT p.nome FROM Pessoa p");
        return (List<String>) q.getResultList();
    }

    @Override
    public List<String> findNomeTypedQuery() {
        TypedQuery q = entityManager.createQuery("SELECT p.nome FROM Pessoa p", String.class);
        return q.getResultList();
    }

    @Override
    public List<String> findNomeNamedQuery() {
        return entityManager.createNamedQuery("Pessoa.findNome", String.class).getResultList();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta 3">
    @Override
    public List<Object[]> fiindNomeEnderecoQuery() {
        Query q = entityManager.createQuery("SELECT p.nome, p.endereco FROM Pessoa p");
        return (List<Object[]>) q.getResultList();
    }

    @Override
    public List<Object[]> fiindNomeEnderecoTypedQuery() {
        TypedQuery q = entityManager.createQuery("SELECT p.nome, p.endereco FROM Pessoa p", Object[].class);
        return q.getResultList();
    }

    @Override
    public List<Object[]> fiindNomeEnderecoNamedQuery() {
        return entityManager.createNamedQuery("Pessoa.findNomeEndereco", Object[].class).getResultList();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta 4">
    @Override
    public List<Pessoa> findPessoaQueMoramEmAvenidaQuery() {

        Query q = entityManager.createQuery("SELECT p from Pessoa p "
                + "WHERE p.endereco.tipoLogradouro = 1");
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoaQueMoramEmAvenidaTypedQuery() {
        TypedQuery q = entityManager.createQuery("SELECT p from Pessoa p "
                + "WHERE p.endereco.tipoLogradouro = 1", Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoaQueMoramEmAvenidaNamedQuery() {
        return entityManager.createNamedQuery("Pessoa.findPessoaQueMoramEmAvenida", Pessoa.class).getResultList();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta 5">
    @Override
    public List<Pessoa> findPessoasQueNaoMoramEmPracaQuery() {
        Query q = entityManager.createQuery("SELECT p from Pessoa p "
                + "WHERE NOT p.endereco.tipoLogradouro = 2");
        return (List<Pessoa>) q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasQueNaoMoramEmPracaTypedQuery() {
        TypedQuery q = entityManager.createQuery("SELECT p from Pessoa p "
                + "WHERE NOT p.endereco.tipoLogradouro = 2", Pessoa.class);
        return q.getResultList();
    }

    @Override
    public List<Pessoa> findPessoasQueNaoMoramEmPracaNamedQuery() {
        return entityManager.createNamedQuery("Pessoa.findPessoaQueNaoMoramEmPraca", Pessoa.class).getResultList();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consulta 6">
    @Override
    public List<Object[]> findNomeTelefoneQuery() {
        Query q = entityManager.createQuery("SELECT p.nome, t FROM Pessoa p "
                + "JOIN p.telefones t");
        return (List<Object[]>) q.getResultList();
    }

    @Override
    public List<Object[]> findNomeTelefoneTypedQuery() {
        TypedQuery q = entityManager.createQuery("SELECT p.nome, t FROM Pessoa p JOIN p.telefones t ", Object[].class);
        return q.getResultList();
    }

    @Override
    public List<Object[]> findNomeTelefoneNamedQuery() {
        return entityManager.createNamedQuery("Pessoa.findNomeTelefones", Object[].class).getResultList();
    }
    //</editor-fold>
    
}
