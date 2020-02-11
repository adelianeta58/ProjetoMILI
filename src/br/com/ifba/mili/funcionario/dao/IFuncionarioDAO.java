package br.com.ifba.mili.funcionario.dao;

import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.infraestrutura.dao.IGenericDAO;

/**
 *
 * @author adelianeta
 */

public interface IFuncionarioDAO extends IGenericDAO<Funcionario>{
    
    /** Este método realiza login no sistema
     * 
     * @param funcionario é o obejto que contém os dados de login do funcionário que vai fazer login no sistema.
     * @return retornar a um inteiro que foi informado no status do login e vai retornar a 0 caso o CPF 
     * e senha informados não pertença a nenhum funcionário que está cadastrado e 
     * retorna a 2 caso o CPF e senha informados esteja cadastrado.
     */
    public abstract int login (Funcionario funcionario);
    
    /** Busca no banco de dados um funcionário com base no parâmetro que foi informado.
     * 
     * @param cpf é o CPF do funcionário que vai ser utilizado durante a consulta que for feita no banco.
     * @return retorna a um objeto chamado Funcionario caso a busca tenha sucesso ou null falhe.
     */
    public abstract Funcionario findByCPF (String cpf);
}