package br.com.ifba.mili.infraestrutura.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author adelianeta
 */
@MappedSuperclass
public class AbstractEntity {
    private long id;
        
    @Id @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}