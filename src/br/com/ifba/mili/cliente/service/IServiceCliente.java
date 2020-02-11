package br.com.ifba.mili.cliente.service;

import br.com.ifba.mili.cliente.model.Cliente;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IServiceCliente {
    
    /** Busca no banco de dados um cliente com base no parâmetro que foi informado.
     * 
     * @param id è o ID do cliente  utilizado durante a consulta realizada no banco de dados.
     * @return vai retornar ao objeto Cliente onde vai conter todos os seus dados caso o mesmo seja encontrado. 
     */
    public abstract Cliente findById (long id);
    
    /** Busca no banco de dados um cliente com base no parâmetro que foi informado.
     * 
     * @param cpf é o CPF do cliente que foi utilizado durante a consulta no banco de dados.
     * @return retorna ao objeto Cliente que vai conter todos os seus dados caso o mesmo seja encontrado.
     */
    public abstract Cliente findByCPF (String cpf);
    
    /** Busca no banco de dados todos os cliente salvos.
     * 
     * @return retorna uma lista com  os dados de todos os clientes que foram salvos no banco de dados.
     */
    public abstract List<Cliente> findAll ();
    
    /** Este método salva no banco de dados um cliente.
     * 
     * @param cliente é o objeto que devera ser salvo no banco de dados.
     * @return retorna ao objeto que foi salvo no banco de dados.
     */
    public abstract Cliente save (Cliente cliente);
    
    /** Método para atualizar, no banco de dados, os dados de um cliente.
     * 
     * @param cliente Objeto contendo o(s) novo(s) dado(s) do cliente.
     * @return Retorna o objeto que foi salvo no banco de dados.
     */
    public abstract Cliente update (Cliente cliente);
    
    /** Exclui do banco de dados um cliente.
     * 
     * @param cliente contém os dados dos clientes que serão excluídos do banco.
     */
    public abstract void delete (Cliente cliente);
     /** 
      * .........
     */
}