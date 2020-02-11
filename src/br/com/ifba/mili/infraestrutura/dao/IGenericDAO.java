package br.com.ifba.mili.infraestrutura.dao;

import br.com.ifba.mili.infraestrutura.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IGenericDAO <Entity extends AbstractEntity>{
    
    Entity save(Entity obj);
    
    Entity update(Entity obj);
    
    void delete(Entity obj);
    
    List<Entity> findAll();
    
    Entity findById(Long id);
}