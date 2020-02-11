//Essa classe serve como repositorio generico de manipulação dos dados
package br.com.ifba.mili.infraestrutura.dao;


import br.com.ifba.mili.infraestrutura.model.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author adelianeta
 * @param <Entity>
 * Entidy é uma entidade do banco de dados
 *
 */

public class GenericDAO<Entity extends AbstractEntity> implements IGenericDAO<Entity> {
    
    protected static EntityManager entityManager;
    
    static {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("MILI");// Usado pra criar uma fabrica de instancia chamada EntityManager que passa o nome que eu definir no persistence xml
        entityManager = fac.createEntityManager();// Instacia o  EntidyManeger para a aplicação se comunicar com o banco 
    }
    
    @Override
    public Entity save(Entity obj) {
        entityManager.getTransaction().begin();//metodos para iniciar uma transação
        entityManager.persist(obj);// persiste os dados
        entityManager.getTransaction().commit();//realiza o commit
        return obj;
    }

    @Override
    public Entity update(Entity obj) {
        entityManager.getTransaction().begin();
        entityManager.merge(obj);
        entityManager.getTransaction().commit();
        return obj;
    }

    @Override
    public void delete(Entity obj) {
        obj = findById(obj.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(obj);
        entityManager.getTransaction().commit(); 
    }

    @Override
    public List<Entity> findAll() {
        return entityManager.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }

    @Override
    public Entity findById(Long id) {
        return (Entity) entityManager.find(getTypeClass(), id);
    }
    
    protected Class<?> getTypeClass(){
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
}