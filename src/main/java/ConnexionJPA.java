import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConnexionJPA {
    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-connect");
        EntityManager em = entityManagerFactory.createEntityManager();

        Livre livre = em.find(Livre.class, 2);
        if (livre != null) {
            System.out.println(livre);
        }
        Emprunt emprunt = em.find(Emprunt.class, 1);
        if (emprunt != null) {
            System.out.println(emprunt);
        }
        if (emprunt != null) {
            System.out.println(emprunt.getLivres());
        }


        Client client = em.find(Client.class, 1);
        TypedQuery<Emprunt> clientEmprunt = em.createQuery("from Emprunt e where e.client.id=:id",
                Emprunt.class).setParameter("id", 1);
        List<Emprunt> emprunts = clientEmprunt.getResultList();
       for (Emprunt emp:emprunts){
           System.out.println(emp);
       }

//        List<Emprunt> emprunts = em.createQuery("from Emprunt e where e.client.id=:id",
//                Emprunt.class).setParameter("id", 1).getResultList();
    }
}