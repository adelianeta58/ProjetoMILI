package br.com.ifba.mili.cliente.dao;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.infraestrutura.dao.IGenericDAO;

/**
 *
 * @author adelianeta
 */

public interface IClienteDAO extends IGenericDAO<Cliente>{
    
    /** Esse método buscar no banco de dados um cliente com base no parâmetro que foi informado.
     * 
     * @param cpf é o CPF do cliente utilizado durante a consulta no banco de dados.
     * @return vai retornar ao objeto Cliente caso a busca aconteça com sucesso, ou null caso falhe. 
     */
    public abstract Cliente findByCPF (String cpf);
}