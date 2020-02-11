package br.com.ifba.mili.fornecedor.service;

import br.com.ifba.mili.fornecedor.dao.FornecedorDAO;
import br.com.ifba.mili.fornecedor.dao.IFornecedorDAO;
import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.infraestrutura.exception.BusinessException;
import br.com.ifba.mili.infraestrutura.suport.StringUtil;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public class ServiceFornecedor implements IServiceFornecedor {
    public final static String FORNECEDOR_NULL = "O fornecedor é nulo!";
    public final static String FORNECEDOR_EXISTE = "O fornecedor já existe!";
    public final static String FORNECEDOR_NAO_EXISTE = "O fornecedor não existe!";
    public final static String FORNECEDOR_INVALIDO = "Fornecedor inválido!";
    
    private final IFornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    /* Busca um fornecedor com base no id que foi informado */
    
    @Override
    public Fornecedor findById(long id) {
        return fornecedorDAO.findById(id);
    }

    /* Busca um fornecedor com base no CNPJ que foi informado */
    
    @Override
    public Fornecedor findByCNPJ(String cnpj) {
        return fornecedorDAO.findByCNPJ(cnpj);
    }
    
    /* Lista todos os fornecedores que estão no banco */
    
    @Override
    public List<Fornecedor> findAll() {
        return fornecedorDAO.findAll();
    }

    /* Salva um fornecedor no banco */
    
    @Override
    public Fornecedor save(Fornecedor fornecedor) {
        
        /* Verifica se o objeto é nulo */
        
        if (fornecedor == null) {
            return null;
            //throw new BusinessException (FORNECEDOR_NULL);
        }
        
        /* Verifica se já existe um fornecedor no banco de dados com o mesmo CNPJ */
        
        else if (findByCNPJ(fornecedor.getCNPJ()) != null) {
            return null;
            //throw new BusinessException (FORNECEDOR_EXISTE);
        }
        
        /* Verifica se os dados do fornecedor são válidos */
        
        else if (!validarFornecedor(fornecedor)) {
            return null;
            //throw new BusinessException (FORNECEDOR_INVALIDO);
        }
        
        /* Salva o fornecedor no banco de dados */
        
        else {
            return fornecedorDAO.save(fornecedor);
        }
    }
    
    /* Atualiza os dados de um fornecedor no banco */
    
    @Override
    public Fornecedor update(Fornecedor fornecedor) {
        
        /* Verifica se o objeto é nulo */
        
        if (fornecedor == null) {
            return null;
            //throw new BusinessException (FORNECEDOR_NULL);
        }
        
        /* Verifica se o fornecedor existe no banco de dados */
        
        else if (findById(fornecedor.getId()) == null) {
            return null;
            //throw new BusinessException (FORNECEDOR_NAO_EXISTE);
        }
        
        /* Verifica se os dados do fornecedor são validos */
        
        else if (!validarFornecedor(fornecedor)) {
            return null;
            //throw new BusinessException (FORNECEDOR_INVALIDO);
        }
        
        /* Atualiza os dados do fornecedor no banco de dados */
        
        else {
            return fornecedorDAO.update(fornecedor);
        }
    }

    /* Exclui um fornecedor do banco */
    
    @Override
    public void delete(Fornecedor fornecedor) {
        
        /* Verifica se o objeto é nulo */
        
        if (fornecedor == null) {
            throw new BusinessException (FORNECEDOR_NULL);
        }
        
        /* Verifica se o fornecedor existe no banco */
        
        else if (fornecedorDAO.findById(fornecedor.getId()) == null) {
            throw new BusinessException (FORNECEDOR_NAO_EXISTE);
        }
        
        /* Exclui os dados do fornecedor do banco  */
        
        else {
            fornecedorDAO.delete(fornecedor);
        }
    }
    
    /*Verifica se os dados do fornecedor são validos */
    
    private boolean validarFornecedor (Fornecedor fornecedor) {
        
        StringUtil util = new StringUtil();
        
        /* Verifica se o objeto é nulo */
        
        if (fornecedor == null) {
            return false;
        }
        
        /* Verifica se a razão social do fornecedor é nula ou vazia */
        
        if (util.isNullOrEmpty(fornecedor.getRazaoSocial())) {
            return false;
        }
        
        /* Verifica se o CNPJ do fornecedor é nulo ou vazio */
        
        if (util.isNullOrEmpty(fornecedor.getCNPJ())) {
            return false;
        }
        
        return true;
    }
}