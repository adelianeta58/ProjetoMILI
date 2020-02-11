package br.com.ifba.mili.cliente.dao;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.infraestrutura.dao.GenericDAO;
import javax.persistence.NoResultException;

/**
 *
 * @author adelianeta
 */

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {
    
    /*
        Deve buscar no banco de dados um cliente que possui um CPF identico ao que foi
        informado na hora da consulta e retornar um objeto chamado Cliente caso 
        caso o mesmo seja encontrado, ou null caso naão seja encontrado.
    */
    
    @Override
    public Cliente findByCPF(String cpf) {
        String sql = "FROM Cliente WHERE cpf = '" + cpf + "'";
        
        try {
            return (Cliente) entityManager.createQuery(sql).getSingleResult();
        } catch (NoResultException ex) {}
        
        return null;
    }
}