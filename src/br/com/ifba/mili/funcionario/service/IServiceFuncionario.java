package br.com.ifba.mili.funcionario.service;

import br.com.ifba.mili.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IServiceFuncionario {
    
    /** Busca no banco um funcionário com base no parâmetro que foi informado.
     * 
     * @param id é o ID do funcionário que será utilizado durante a consulta no banco.
     * @return  vai retornar a um objeto Funcionario caso a busca tenha sucesso, ou null falhe.
     */
    public abstract Funcionario findById (long id);
    
    /** Busca no banco de dados, um funcionário com base no parâmetro que foi informado.
     * 
     * @param cpf é o CPF do funcionário que será utilizado durante a consulta no banco.
     * @return  vai retornar a um objeto chamado Funcionario caso a busca tenha sucesso, ou null caso falhe.
     */
    public abstract Funcionario findByCPF (String cpf);
    
    /** Busca no banco de dados, todos os funcionários que foram salvos.
     * 
     * @return vai retornar a uma lista com todos os dados de todos os funcionários que foram salvos no banco.
     */
    public abstract List<Funcionario> findAll ();
    
    /** Este método salva no banco um funcionário.
     * 
     * @param funcionario é o objeto que vai ser salvo no banco de dados.
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Funcionario save (Funcionario funcionario);
    
    /** Atualiza no banco os dados de um funcionário.
     * 
     * @param funcionario é o objeto que contém os novos dados dos funcionário. 
     * @return vai retornar ao objeto que foi salvo no banco.
     */
    public abstract Funcionario update (Funcionario funcionario);
    
    /** Exclui do banco de dados um funcionário.
     * 
     * @param funcionario é o objeto que contém os dados do funcionário que serão excluídos.
     */
    public abstract void delete (Funcionario funcionario);
    
    /** Realiza login no sistema
     * 
     * @param funcionario é o objeto que contém os dados de login do funcionário que irá fazer login no sistema.
     * @return vai retornar a um inteiro que foi informando no status do login. 
     * Retorna a 0 caso o CPF e senha informados não pertença a nenhum funcionário que está cadastrado.
     * Retorna a 1 caso o CPF e senha informados sejam do funcionário (GERENTE).
     * E por ultimo retorna a 2 caso o CPF e senha que foram informados sejam de um funcionário cadastrado.
     */
    public abstract int login (Funcionario funcionario);
}