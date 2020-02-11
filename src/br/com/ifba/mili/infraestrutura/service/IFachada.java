package br.com.ifba.mili.infraestrutura.service;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IFachada {
    
    /* -------------------------------- CLIENTE -------------------------------- */
    
    /**Este método busca no banco de dados um cliente com base no parâmetro que foi informado.
     * 
     * @param id é o ID do cliente que será utilizado durante a consulta no banco.
     * @return retorna a um objeto chamado cliente que contém todos os seus dados se for encontrado. 
     */
    public abstract Cliente findByIdCliente (long id);
    
    /** Busca no banco de dados um cliente com base no parâmetro que foi informado.
     * 
     * @param cpf é o CPF do cliente que é utilizado durante a consulta no banco de dados.
     * @return retorna a um objeto Cliente que contém todos os seus dados caso seja encontrado.
     */
    public abstract Cliente findByCPFCliente (String cpf);
    
    /** Busca no banco de dados todos os cliente que foram salvos.
     * 
     * @return retorna a uma lista com todos os dados de todos os clientes que estão salvos no banco.
     */
    public abstract List<Cliente> findAllCliente ();
    
    /**Salva no banco de dados novo um cliente.
     * 
     * @param cliente é o objeto que vai ser salvo no banco.
     * @return retorna ao objeto que foi salvo no banco.
     */
    public abstract Cliente saveCliente (Cliente cliente);
    
    /** Atualiza no banco os dados de um cliente.
     * 
     * @param cliente é o objeto que contém os novos dados do cliente.
     * @return deve retornar ao objeto que foi salvo no banco.
     */
    public abstract Cliente updateCliente (Cliente cliente);
    
    /** Exclui do banco um cliente.
     * 
     * @param cliente é o objeto que contém os dados do cliente que será excluído do banco.
     */
    public abstract void deleteCliente (Cliente cliente);
    
    /* -------------------------------- FORNECEDOR -------------------------------- */
    
    /** MBusca no banco um fornecedor com base no parâmetro que foi informado.
     * 
     * @param id é o ID do fornecedor que será utilizado durante a consulta no banco.
     * @return  ele retorna a um objeto chamdo Fornecedor caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Fornecedor findByIdFornecedor (long id);
    
    /** Busca no banco um fornecedor com base no parâmetro que foi informado.
     * 
     * @param cnpj é o CNPJ do fornecedor que será utilizado durante a consulta no banco.
     * @return  ele retorna ao objeto chamado Fornecedor caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Fornecedor findByCNPJFornecedor (String cnpj);
    
    /** Busca no banco todos os fornecedores salvos.
     * 
     * @return ele retorna uma lista com os dados de todos os fornecedores sque estão alvos no banco.
     */
    public abstract List<Fornecedor> findAllFornecedor ();
    
    /** Salva no banco um fornecedor.
     * 
     * @param fornecedor é o objeto que vai ser salvo no banco.
     * @return vai retorna ao objeto que foi salvo no banco.
     */
    public abstract Fornecedor saveFornecedor (Fornecedor fornecedor);
    
    /** Atualiza no banco os dados de um fornecedor.
     * 
     * @param fornecedor é o objeto que contém os novos dados do fornecedor. 
     * @return ele retorna ao objeto que foi salvo no banco.
     */
    public abstract Fornecedor updateFornecedor (Fornecedor fornecedor);
    
    /** Exclui do banco um fornecedor.
     * 
     * @param fornecedor é o objeto que contém os dados do fornecedor que será excluído do banco.
     */
    public abstract void deleteFornecedor (Fornecedor fornecedor);
    
    /* -------------------------------- FUNCIONÁRIO -------------------------------- */
    
    /** Busca no banco um funcionário com base no parâmetro que foi informado.
     * 
     * @param id é o ID do funcionário que será utilizado durante a consulta feita no banco.
     * @return  ele retorna ao objeto chamado Funcionario caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Funcionario findByIdFuncionario (long id);
    
    /** Busca no banco um funcionário com base no parâmetro que foi informado.
     * 
     * @param cpf é o CPF do funcionário será utilizado durante a consulta feita no banco.
     * @return  ele retorna a um objeto chamado Funcionario caso a busca tenha sucesso, ou null falhe.
     */
    public abstract Funcionario findByCPFFuncionario (String cpf);
    
    /** Busca no bancotodos os funcionários que foram salvos.
     * 
     * @return ele retorna uma lista comos dados de todos os funcionários que foram salvos no banco.
     */
    public abstract List<Funcionario> findAllFuncionario ();
    
    /** Salva no banco um funcionário.
     * 
     * @param funcionario é o objeto que vai ser salvo no banco.
     * @return ele retorna ao objeto que foi salvo no banco.
     */
    public abstract Funcionario saveFuncionario (Funcionario funcionario);
    
    /** Atualiza no banco os dados de um funcionário.
     * 
     * @param funcionario é o objeto que contém os novos dados do funcionário. 
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Funcionario updateFuncionario (Funcionario funcionario);
    
    /** Exclui do banco um funcionário.
     * 
     * @param funcionario é o objeto que contém os dados do funcionário que vão ser excluídos do bd.
     */
    public abstract void deleteFuncionario (Funcionario funcionario);
    
    /** Realiza login no sistema
     */
    public abstract int loginFuncionario (Funcionario funcionario);
    
    /* -------------------------------- PRODUTO -------------------------------- */
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param id é o ID do produto que será utilizado durante a consulta feita no banco.
     * @return  deve retornar a um objeto chamado Produto caso a busca tenha sucesso, ou null falhe.
     */
    public abstract Produto findByIdProduto (long id);
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param codigo aqui é o código de barras do produto que vai ser utilizado durante a consulta feita no banco.
     * @return vai retornar a um objeto chamado Produto caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Produto findByCodigoBarras (String codigo);
    
    /** Busca no banco um produto com base no parâmetro que foi informado.
     * 
     * @param name é o nome do produto que vai ser utilizado na consulta feita no banco.
     * @return vai retornar a uma lista contendo todos os dados dos produtos que tenham um nome parecido ao que foi informado.
     */
    public abstract List<Produto> findByName (String name);
    
    /** Busca no banco todos os produtos que foram salvos.
     * 
     * @return vai retornar uma lista contendo todos os dados dos produtos que foram salvos no banco.
     */
    public abstract List<Produto> findAllProduto ();
    
    /** Salva no banco de dados um produto.
     * 
     * @param produto é o objeto que vai ser salvo no banco.
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Produto saveProduto (Produto produto);
    
    /** Atualiza no banco os dados de um produto.
     * 
     * @param produto é o objeto que contém os novos dados dos produto. 
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Produto updateProduto (Produto produto);
    
    /** Exclui do banco um produto.
     * 
     * @param produto é o objeto que contém os dados dos produtos que vão ser excluídos.
     */
    public abstract void deleteProduto (Produto produto);
}