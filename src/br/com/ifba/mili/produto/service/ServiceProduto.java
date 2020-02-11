package br.com.ifba.mili.produto.service;

import br.com.ifba.mili.infraestrutura.exception.BusinessException;
import br.com.ifba.mili.infraestrutura.suport.StringUtil;
import br.com.ifba.mili.produto.dao.IProdutoDAO;
import br.com.ifba.mili.produto.dao.ProdutoDAO;
import br.com.ifba.mili.produto.model.Produto;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public class ServiceProduto implements IServiceProduto {
    public final static String PRODUTO_NULL = "O produto é nulo!";
    public final static String PRODUTO_EXISTE = "O produto já existe!";
    public final static String PRODUTO_NAO_EXISTE = "O produto não existe!";
    public final static String PRODUTO_INVALIDO = "Produto inválido!";
    
    private final IProdutoDAO produtoDAO = new ProdutoDAO();

    /* Aqui busca um produto com base no id que foi informado */
    
    @Override
    public Produto findById(long id) {
        return produtoDAO.findById(id);
    }

    /* Busca um produto com base no código que foi informado */
    
    @Override
    public Produto findByCodigoBarras(String codigo) {
        return produtoDAO.findByCodigoBarras(codigo);
    
    }
    
    @Override
    public List<Produto> findByName(String name) {
        return produtoDAO.findByName(name);
    
    }
    /* Esse método lista todos os produtos do banco */
    
    @Override
    public List<Produto> findAll() {
        return produtoDAO.findAll();
    }
    
    /* Salava um produto no banco */
    
    @Override
    public Produto save(Produto produto) {
        
        
        
        if (produto == null) {
            return null;
            //throw new BusinessException (PRODUTO_NULL);
        }
        
        
        else if (findByCodigoBarras(produto.getCodigoBarras()) != null) {
            return null;
            //throw new BusinessException (PRODUTO_EXISTE);
        }
        
        /* Verifica se os dados do produto são válidos */
        
        else if (!validarProduto(produto)) {
            return null;
            //throw new BusinessException (PRODUTO_INVALIDO);
        }
        
        /* Salva o produto no banco*/
        
        else {
            return produtoDAO.save(produto);
        }
    }

    /* Método para atualizar os dados de um produto no banco*/
    
    @Override
    public Produto update(Produto produto) {
        
        /* Verifica se o objeto é nulo */
        
        if (produto == null) {
            return null;
            //throw new BusinessException (PRODUTO_NULL);
        }
        
        /* Verifica se o produto existe no banco*/
        
        else if (findById(produto.getId()) == null) {
            return null;
            //throw new BusinessException (PRODUTO_NAO_EXISTE);
        }
        
        /* Verifica se os dados do produto são validos */
        
        else if (!validarProduto(produto)) {
            return null;
            //throw new BusinessException (PRODUTO_INVALIDO);
        }
        
        /* Atualiza os dados do produto no banco*/
        
        else {
            return produtoDAO.update(produto);
        }
    }

    /* Excluir um produto do banco */
    
    @Override
    public void delete(Produto produto) {
        
        /* Verifica se o objeto é nulo */
        
        if (produto == null) {
            throw new BusinessException (PRODUTO_NULL);
        }
        
        /* Verifica se o produto existe no banco*/
        
        else if (findById(produto.getId()) == null) {
            throw new BusinessException (PRODUTO_NAO_EXISTE);
        }
        
        /* Exclui os dados do produto do banco*/
        
        else {
            produtoDAO.delete(produto);
        }
    }
    
    /* Verifica se os dados do produto são validos */
    
    private boolean validarProduto (Produto produto) {
        
        StringUtil util = new StringUtil();
        
        /* Verifica se o objeto é nulo */
        
        if (produto == null) {
            return false;
        }
        
        /* Verifica se o nome do produto é nulo ou vazio */
        
        if (util.isNullOrEmpty(produto.getNome())){
            return false;
        }
        
        /* Verifica se o código de barras do produto é nulo ou vazio */
        
        if (util.isNullOrEmpty(produto.getCodigoBarras())) {
            return false;
        }
        
        /* Verifica se o preço do produto é inferior ou igual a zero */
        
        if (produto.getPreco() <= 0) {
            return false;
        }
        
        /* Verifica se o estoque do produto é inferior a zero */
        
        if (produto.getEstoque() < 0) {
            return false;
        }
        
        return true;
    }
}