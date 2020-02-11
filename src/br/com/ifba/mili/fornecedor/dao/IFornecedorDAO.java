package br.com.ifba.mili.fornecedor.dao;

import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.infraestrutura.dao.IGenericDAO;

/**
 *
 * @author adelianeta
 */

public interface IFornecedorDAO extends IGenericDAO<Fornecedor>{
    
    /** Busca no banco um fornecedor com base no parâmetro que foi informado.
     * 
     * @param cnpj é o CNPJ do fornecedor que é utilizado durante a consulta no banco.
     * @return  Retorna ao objeto Fornecedor caso a busca tenha sucesso, ou null falhe.
     */
    public abstract Fornecedor findByCNPJ (String cnpj);
}