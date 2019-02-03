package br.ifpb.dac.mapeamento.oficina;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Rodger
 */
public class DAO {

    private static EntityManager em = Persistence.createEntityManagerFactory("DACAM").createEntityManager();

    public static void NovoFuncionario(Funcionario funcionario) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(funcionario);
        transaction.commit();
        
    }
    
    public static void DeletarFuncionario(Funcionario funcionario) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(funcionario);
        transaction.commit();

    }

    public static void NovoConcerto(Concerto concerto) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(concerto);
        transaction.commit();

    }
    
    public static void DeletarConceto(Concerto concerto) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(concerto);
        transaction.commit();

    }
    
    public static void NovaOficina(Oficina oficina) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(oficina);
        transaction.commit();

    }
    
    public static void DeletarOficina(Oficina oficina) {

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(oficina);
        transaction.commit();

    }
}