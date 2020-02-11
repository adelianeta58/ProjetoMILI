//Interface Produto
package br.com.ifba.mili.produto.service;

import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IServiceProduto {
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param id esse ID é do produto que será utilizado durante a consulta que for feita no banco .
     * @return  vai retornar a um objeto chamado Produto caso a busca tenha sucesso ou null falhe.
     */
    public abstract Produto findById (long id);
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param codigo é o código de barras do produto que vai ser utilizado durante a consulta no banco.
     * @return vai retornar para um objeto chamado Produto caso a busca tenha sucesso ou null caso falhe.
     */
    public abstract Produto findByCodigoBarras (String codigo);
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param name é o nome do produto que vai ser utilizado durante a consulta feita no banco.
     * @return ele vai retornar a uma lista de produtos com todos os dados que tenha 
     * nome parecido ou igual ao que foi informado.
     */
    public abstract List<Produto> findByName (String name);
    
    /** Busca no banco todos os produtos que foram salvos.
     * 
     * @return vai retornar a uma lista com todos os dados dos
     * produtos que foram salvos no banco.
     */
    public abstract List<Produto> findAll ();
    
    /** O método save , salva no banco um produto.
     * 
     * @param produto é o objeto vai ser salvo no banco.
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Produto save (Produto produto);
    
    /** Atualiza no banco os dados de um produto.
     * 
     * @param produto é o objeto que contém os dados do produto. 
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Produto update (Produto produto);
    
    /** O método delete exclui do banco um produto.
     * 
     * @param produto é o objeto que contém os dados do 
     * produto que vai ser excluído.
     */
    public abstract void delete (Produto produto);
}