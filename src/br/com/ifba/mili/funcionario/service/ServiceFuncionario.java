package br.com.ifba.mili.funcionario.service;

import br.com.ifba.mili.funcionario.dao.FuncionarioDAO;
import br.com.ifba.mili.funcionario.dao.IFuncionarioDAO;
import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.infraestrutura.exception.BusinessException;
import br.com.ifba.mili.infraestrutura.suport.StringUtil;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public class ServiceFuncionario implements IServiceFuncionario {
    public final static String FUNCIONARIO_NULL = "O funcionário é nulo!";
    public final static String FUNCIONARIO_EXISTE = "O funcionário já existe!";
    public final static String FUNCIONARIO_NAO_EXISTE = "O funcionário não existe!";
    public final static String FUNCIONARIO_INVALIDO = "Funcionário inválido!";
    
    private final IFuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    /* Busca um funcionário com base no id que foi informado */
    
    @Override
    public Funcionario findById(long id) {
        return funcionarioDAO.findById(id);
    }

    /* Busca um funcionário com base no CPF que foi informado */
    
    @Override
    public Funcionario findByCPF(String cpf) {
        return funcionarioDAO.findByCPF(cpf);
    }
    
    /* Lista todos os funcionários que estão no banco */
    
    @Override
    public List<Funcionario> findAll() {
        return funcionarioDAO.findAll();
    }
    
    /* Salva um funcionário no banco de dados */
    
    @Override
    public Funcionario save(Funcionario funcionario) {
        
        /* Verifica se o objeto é nulo */
        
        if (funcionario == null) {
            return null;
            //throw new BusinessException (FUNCIONARIO_NULL);
        }
        
        /* Verifica se já existe um funcionário no banco de dados com o mesmo CPF */
        
        else if (findByCPF(funcionario.getCPF()) != null) {
            return null;            
            //throw new BusinessException (FUNCIONARIO_EXISTE);
        }
        
        /* Verifica se os dados do funcionário são válidos */
        
        else if (!validarFuncionario(funcionario)) {
            return null;
            //throw new BusinessException (FUNCIONARIO_INVALIDO);
        }
        
        /* Salva o funcionário no banco de dados */
        
        else {
            return funcionarioDAO.save(funcionario);
        }
    }

    /* Atualiza os dados de um funcionário no banco */
    
    @Override
    public Funcionario update(Funcionario funcionario) {
        
        /* Verifica se o objeto é nulo */
        
        if (funcionario == null) {
            return null;
            //throw new BusinessException (FUNCIONARIO_NULL);
        }
        
        /* Verifica se o funcionário existe no banco de dados */
        
        else if (findById(funcionario.getId()) == null) {
            return null;
            //throw new BusinessException (FUNCIONARIO_NAO_EXISTE);
        }
        
        /* Verifica se os dados do funcionário são validos */
        
        else if (!validarFuncionario(funcionario)) {
            return null;
            //throw new BusinessException (FUNCIONARIO_INVALIDO);
        }
        
        /* Atualiza os dados do funcionário no banco de dados */
        
        else {
            return funcionarioDAO.update(funcionario);
        }
    }

    /* Exclui um funcionário do banco de dados */
    
    @Override
    public void delete(Funcionario funcionario) {
        
        /* Verifica se o objeto é nulo */
        
        if (funcionario == null) {
            throw new BusinessException (FUNCIONARIO_NULL);
        }
        
        /* Verifica se o funcionário existe no banco de dados */
        
        else if (funcionarioDAO.findById(funcionario.getId()) == null) {
            throw new BusinessException (FUNCIONARIO_NAO_EXISTE);
        }
        
        /* Exclui os dados do funcionário do banco de dados */
        
        else {
            funcionarioDAO.delete(funcionario);
        }
    }
    
    /* Verifica os dados de login e retorna a 0 caso não exista ou a 1 caso seja funcionário gerente ou a 2 caso seja funcionário normal*/
    
    @Override
    public int login(Funcionario funcionario) {
        
        /* Verifica se o objeto é nulo */
        
        if (funcionario == null) {
            throw new BusinessException (FUNCIONARIO_NULL);
        }
        
        /* Verifica se os dados informados são do funcionário gerente */
        
        else if(funcionario.getCPF().equals("12345678911") && funcionario.getSenha().equals("1221")){
            return 1;
        }
        
        /* Verifica no banco de dados se os dados informados pertencem a um funcionário cadastrado */
        
        else {
            return funcionarioDAO.login(funcionario);
        }
    }
    
    /* Verifica se os dados do funcionário são validos */
    
    public boolean validarFuncionario (Funcionario funcionario) {
        
        StringUtil util = StringUtil.getInstance();
        
        /* Verifica se o objeto é nulo */
        
        if (funcionario == null) {
            return false;
        }
        
        /* Verifica se o nome do funcionário é nulo ou vazio */
        
        if (util.isNullOrEmpty(funcionario.getNome())){
            return false;
        }
        
        /* Verifica se o sexo do funcionário é nulo ou vazio */
        
        if (util.isNullOrEmpty(funcionario.getSexo())){
            return false;
        }
        
        /* Verifica se o CPF do funcionário é nulo ou vazio */
        
        if (util.isNullOrEmpty(funcionario.getCPF())) {
            return false;
        }
        
        /* Verifica se a senha do funcionário é nula ou vazia */
        
        if (util.isNullOrEmpty(funcionario.getSenha())){
            return false;
        }
        
        return true;
    }
}