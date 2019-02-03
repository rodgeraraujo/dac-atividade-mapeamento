package br.ifpb.dac.mapeamento.materialdidatico;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Rodger
 */
public class DAO {

    private static EntityManager em = Persistence.createEntityManagerFactory("DACAM").createEntityManager();

    public static void Novo(MaterialDidatico matDidatico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(matDidatico);
        transaction.commit();
    }

    public void Deletar(MaterialDidatico matDidatico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(matDidatico);
        transaction.commit();
    }

    public void Atualizar(MaterialDidatico matDidatico) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(matDidatico);
        transaction.commit();
    }

}