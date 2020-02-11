package br.com.ifba.mili.cliente.service;

import br.com.ifba.mili.cliente.dao.ClienteDAO;
import br.com.ifba.mili.cliente.dao.IClienteDAO;
import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.infraestrutura.exception.BusinessException;
import br.com.ifba.mili.infraestrutura.suport.StringUtil;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public class ServiceCliente implements IServiceCliente {
    public final static String CLIENTE_NULL = "O cliente é nulo!";
    public final static String CLIENTE_EXISTE = "O cliente já existe!";
    public final static String CLIENTE_NAO_EXISTE = "O cliente não existe!";
    public final static String CLIENTE_INVALIDO = "Cliente inválido!";
    
    private final IClienteDAO clienteDAO = new ClienteDAO();
    
    /* Este método busca um cliente no banco de dados com base no id que foi informado */
    
    @Override
    public Cliente findById(long id) {
        return clienteDAO.findById(id);
    }
    
    /*  Busca um cliente no banco de dados com base no CPF que foi informado */
    
    @Override
    public Cliente findByCPF(String cpf) {
        return clienteDAO.findByCPF(cpf);
    }
    
    /* Lista todos os cliente que estão no banco de dados */
    
    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }
    
    /*  Salva um cliente no banco de dados */
    
    @Override
    public Cliente save(Cliente cliente) {
        
        /* Verifica se o objeto é nulo */
        
        if (cliente == null) {
            return null;
            
        }
        
        /* Verifica se  existe um cliente no banco de dados com o mesmo CPF */
        
        else if (findByCPF(cliente.getCPF()) != null) {
            return null;
            //throw new BusinessException (CLIENTE_EXISTE);
        }
        
        /* Verifica se os dados do cliente são válidos */
        
        else if (!validarCliente(cliente)) {
            return null;
            //throw new BusinessException (CLIENTE_INVALIDO);
        }
        
        /* Salva o cliente no banco de dados */
        
        else {
            return clienteDAO.save(cliente);
        }
    }

    /* Atualiza os dados do cliente no banco de dados */
    
    @Override
    public Cliente update(Cliente cliente) {
        
        /* Verifica se o objeto é nulo */
        
        if (cliente == null) {
            return null;
            //throw new BusinessException (CLIENTE_NULL);
        }
        
        /* Verifica se o cliente realmente existe no banco de dados */
        
        else if (findById(cliente.getId()) == null) {
            return null;
            //throw new BusinessException (CLIENTE_NAO_EXISTE);
        }
        
        /* Verifica se os dados do cliente realmente são validos */
        
        else if (!validarCliente(cliente)){
            return null;
            //throw new BusinessException (CLIENTE_INVALIDO);
        }
        
        /* Atualiza os dados do cliente no banco de dados */
        
        else {
            return clienteDAO.update(cliente);
        }
    }

    /* Exlui um cliente do banco de dados */
    
    @Override
    public void delete(Cliente cliente) {
        
        /* Verifica se o objeto é nulo */
        
        if (cliente == null) {
            throw new BusinessException (CLIENTE_NULL);
        }
        
        /* Verifica  o cliente relamente existe no banco de dados */
        
        else if (clienteDAO.findById(cliente.getId()) == null) {
            throw new BusinessException (CLIENTE_NAO_EXISTE);
        }
        
        /* Exclui os dados do cliente que está no banco de dados */
        
        else {
            clienteDAO.delete(cliente);
        }
    }
    
    /*Verifica se os dados do cliente são validos */
    
    private boolean validarCliente (Cliente cliente) {
        
        StringUtil util = new StringUtil();
        
        /* Verifica se o objeto é nulo */
        
        if (cliente == null) {
            return false;
        }
        
        /* Verifica se o nome do cliente é nulo ou se não tem nada */
        
        if (util.isNullOrEmpty(cliente.getNome())){
            return false;
        }
        
        /* Verifica se o sexo do cliente é nulo ou se não tem nada */
        
        if (util.isNullOrEmpty(cliente.getSexo())) {
            return false;
        }
        
        /* Verifica se o CPF do cliente é nulo ou se não tem nada */
        
        if (util.isNullOrEmpty(cliente.getCPF())) {
            return false;
        }
        
        return true;
    }
}