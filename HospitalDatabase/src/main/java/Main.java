import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hospital_db");
        EntityManager entityManager = factory.createEntityManager();
//Hello Mate! Dont forget to change your server properties in persistence.xml
    }
}


