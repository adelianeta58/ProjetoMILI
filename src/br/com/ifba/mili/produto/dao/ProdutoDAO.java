package br.com.ifba.mili.produto.dao;

import br.com.ifba.mili.infraestrutura.dao.GenericDAO;
import br.com.ifba.mili.produto.model.Produto;
import java.util.List;
import javax.persistence.NoResultException;

/**
 *
 * @author adelianeta
 */

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {
    
    /*
        Vai buscar no banco um produto que possui o código de barras igual ao que foi 
        informado na consulta e retornará a um objeto chamado Produto caso 
        encontre, ou null caso não encontre.
    */
    
    @Override
    public Produto findByCodigoBarras(String codigo) {
        String sql = "FROM Produto WHERE codigoBarras = '" + codigo + "'";
        
        try {
            return (Produto) entityManager.createQuery(sql).getSingleResult();
        } catch (NoResultException ex) {}
        
        return null;
    }
    
    /*
        Vai buscar no banco os produtos que possuem nome igual ao que foi informado 
        durante a consulta e retorna a uma lista de produtos.
    */
    
    @Override
    public List<Produto> findByName(String name) {
        String sql = "FROM Produto WHERE nome LIKE '%" + name + "%'";
        
        try {
            return entityManager.createQuery(sql).getResultList();
        } catch (NoResultException ex) {}
        
        return null;
    }
}