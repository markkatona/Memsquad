package game.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SQLPersistance {

    private static EntityManager em;

    public void insert(PlayerData playerData){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
        em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(playerData);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    /*public GameState read_table(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
        em = emf.createEntityManager();
        GameState gameState= em.find(GameState.class, 2);
        em.close();
        emf.close();
        return gameState;
    }*/

}
