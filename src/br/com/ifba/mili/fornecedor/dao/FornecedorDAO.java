package br.com.ifba.mili.fornecedor.dao;

import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.infraestrutura.dao.GenericDAO;
import javax.persistence.NoResultException;

/**
 *
 * @author adelianeta
 */

public class FornecedorDAO extends GenericDAO<Fornecedor> implements IFornecedorDAO {
    
    /*
        Procura no banco  um fornecedor que possui o CNPJ igual ao que foi informado na consulta
        e retorna a um objeto chamado Fornecedor caso seja encontrado, ou null caso nao encontre.
    */
    
    @Override
    public Fornecedor findByCNPJ(String cnpj) {
        String sql = "FROM Fornecedor WHERE cnpj = '" + cnpj + "'";
        
        try {
            return (Fornecedor) entityManager.createQuery(sql).getSingleResult();
        } catch (NoResultException ex) {}
        
        return null;
    }
}