package com.sena.dao;

import com.sena.domain.User;
import jakarta.persistence.*;
import java.util.List;

public class UserDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UserDAO() {
        emf = Persistence.createEntityManagerFactory("HibernateWeb");
        em = emf.createEntityManager();
    }

    public List<User> listar() {
        String hql = "SELECT p FROM User p";
        Query query = em.createQuery(hql);
        List<User> listUsers = query.getResultList();
        /*for (User u : listUsers) {
            System.out.println("Usuario DAO: " + u);
        }*/
        return listUsers;
    }

    public void insertar(User user) {
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
        
    }
    
    public User consultarUserID (User user){
    return em.find(User.class, user.getIdUser());
    }
    
    public void modificar(User user){
       try {
            em.getTransaction().begin();
            em.merge(user);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }  
    }
    
      public void eliminar(User user){
      try {
            em.getTransaction().begin();
            em.remove(em.merge(user));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }  
      }
}
