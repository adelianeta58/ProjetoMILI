package br.com.ifba.mili.fornecedor.service;

import br.com.ifba.mili.fornecedor.model.Fornecedor;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IServiceFornecedor {
    
    /** Busca no banco um fornecedor com base no parâmetro que foi informado.
     * 
     * @param id é o ID do fornecedor que foi utilizado durante a consulta no banco.
     * @return  Retorna ao objeto Fornecedor caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Fornecedor findById (long id);
    
    /** Busca no banco um fornecedor com base no parâmetro que foi informado.
     * 
     * @param cnpj é o CNPJ do fornecedor que foi utilizado durante a consulta no banco.
     * @return  retorna um objeto Fornecedor caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Fornecedor findByCNPJ (String cnpj);
    
    /** Busca no banco todos os fornecedores que foram salvos.
     * 
     * @return retorna uma lista com os dados de todos os fornecedores que estão salvos no banco.
     */
    public abstract List<Fornecedor> findAll ();
    
    /** Salva no banco um fornecedor.
     * 
     * @param fornecedor é o objeto que vai ser salvo no banco de dados.
     * @return retorna ao objeto que foi salvo no banco de dados.
     */
    public abstract Fornecedor save (Fornecedor fornecedor);
    
    /** Atualiza no banco os dados de um fornecedor.
     * 
     * @param fornecedor é o objeto que contém os novos dados dos fornecedores. 
     * @return retorna ao objeto que foi salvo no banco.
     */
    public abstract Fornecedor update (Fornecedor fornecedor);
    
    /** Exclui do banco um fornecedor.
     * 
     * @param fornecedor é o objeto que contém os dados do fornecedores que serão excluídos do banco.
     */
    public abstract void delete (Fornecedor fornecedor);
}