package org.lestergarcia.core.system;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lestergarcia.core.model.Carrera;

public class Principal {
    static EntityManager em = null;
    static EntityManagerFactory emf = null;
    static EntityTransaction tx = null;
    static Logger log = LogManager.getRootLogger();
  public static void main(String arg[]){
      try{
          emf = Persistence.createEntityManagerFactory("WSSGA");
          em = emf.createEntityManager();
          tx = em.getTransaction();
          log.debug("Iniciando text Entity Carrera con JPA");
          tx.begin();
          Carrera registro = new Carrera();
          registro.setDescripcion("Test Entity JPA");
          log.debug("Objeto a persistir " + registro);
          em.persist(registro);
          tx.commit();
          log.debug("Objeto persistido " + registro);
          log.debug("Fin text Carrera con JPA");
      }catch (Exception e){
            e.printStackTrace();
            tx.rollback();
        }
    }
}  
