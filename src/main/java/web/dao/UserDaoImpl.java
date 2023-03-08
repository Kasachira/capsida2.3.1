package web.dao;

import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public User getUserById(Long id) {
        User user = entityManager.find(User.class, id);
        return user;
    }
    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("select u from User as u").getResultList();
    }
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }
    @Override
    public void del(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
}
