package br.com.ifba.mili.funcionario.dao;

import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.infraestrutura.dao.GenericDAO;
import javax.persistence.NoResultException;

/**
 *
 * @author adelianeta
 */

public class FuncionarioDAO extends GenericDAO<Funcionario> implements IFuncionarioDAO {
    
    /* 
        Busca no banco  um funcionário que possui o CPF e a senha iguais aos que foram informados na consulta e 
        retorna a um inteiro que vai informar se o usuário existe no banco  ou não e retorna a zero caso não exista.
        E vai retornar a dois caso ele exista.
    */
    
    @Override
    public int login(Funcionario funcionario) {
        String sql = "FROM Funcionario WHERE cpf = '" + funcionario.getCPF() + "' AND senha = '" + funcionario.getSenha() + "'";
        
        try {
            return  entityManager.createQuery(sql).getSingleResult() != null ? 2 : 0;
        } catch (NoResultException ex) {}
        
        return 0;
    }

    /*
        Vai buscar no banco um funcionário que possui o CPF identico ao que foi informado na consulta e vai 
        retornar a um objeto chamado Funcionario caso encontre ou então retorna a null se não encontrar. 
    */
    
    @Override
    public Funcionario findByCPF(String cpf) {
        String sql = "FROM Funcionario WHERE cpf = '" + cpf + "'";
        
        try {
            return (Funcionario) entityManager.createQuery(sql).getSingleResult();
        } catch (NoResultException ex) {}
         
        return null;
    }
}