package br.com.ifba.mili.produto.dao;

import br.com.ifba.mili.infraestrutura.dao.IGenericDAO;
import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IProdutoDAO extends IGenericDAO<Produto>{
    
    /** Busca no banco um produto com base no parâmetro  que foi informado.
     * 
     * @param codigo é o código de barras do produto que vai ser utilizado durante a consulta feita no banco.
     * @return vai retornar a um objeto chamado Produto caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Produto findByCodigoBarras (String codigo);
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param name é o nome do produto que vai ser utilizado durante a consulta no banco.
     * @return vai retorna a uma lista com  os dados dos produtos que possuirem um nome parecido ao que foi informado.
     */
    public abstract List<Produto> findByName (String name);
}