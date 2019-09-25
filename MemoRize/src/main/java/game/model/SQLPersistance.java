package game.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SQLPersistance {

    private EntityManagerFactory emf;
    private EntityManager em;

    //megnyitja az entity managert
    public void openEntityManager(){
        this.emf = Persistence.createEntityManagerFactory("jpa-persistence-unit-1");
        this.em = emf.createEntityManager();
    }
    //bezárja az entity managert
    public void closeEntityManager(){
        em.close();
        emf.close();
    }
    //feltölti a játékos személyes adatait az adatbázis "felhasznalo_adatai" táblájába
    public void insertPlayerData(PlayerData playerData){
        em.getTransaction().begin();
        em.persist(playerData);
        em.getTransaction().commit();
    }
    //feltölti a játékos statisztikai adatait az adatbázis "statisztika" táblájába
    public void insertPlayerStat(PlayerStat playerStat){
        em.getTransaction().begin();
        em.persist(playerStat);
        em.getTransaction().commit();
    }
    //kiolvassa a legutóbb beillesztett sor id-ját a "felhasznalo_adatai" táblából
    public int readIdFromPlayerData(){
        Query q = em.createNativeQuery("SELECT fa.user_id FROM felhasznalo_adatai fa");
        return ((int) q.getResultList().get(q.getResultList().size() - 1));
    }

}
