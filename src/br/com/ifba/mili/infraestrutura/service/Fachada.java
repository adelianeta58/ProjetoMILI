package br.com.ifba.mili.infraestrutura.service;

import br.com.ifba.mili.cliente.model.Cliente;
import br.com.ifba.mili.cliente.service.IServiceCliente;
import br.com.ifba.mili.cliente.service.ServiceCliente;
import br.com.ifba.mili.fornecedor.model.Fornecedor;
import br.com.ifba.mili.fornecedor.service.IServiceFornecedor;
import br.com.ifba.mili.fornecedor.service.ServiceFornecedor;
import br.com.ifba.mili.funcionario.model.Funcionario;
import br.com.ifba.mili.funcionario.service.IServiceFuncionario;
import br.com.ifba.mili.funcionario.service.ServiceFuncionario;
import br.com.ifba.mili.produto.model.Produto;
import br.com.ifba.mili.produto.service.IServiceProduto;
import br.com.ifba.mili.produto.service.ServiceProduto;
import java.util.List;

/**
 *
 * @author adelianeta
 * A fachada direciona os objetos para os metodos da regra de negocio 
 */

public class Fachada implements IFachada {
    private volatile static Fachada instance; 
    
    /* Padrão Singleton que tem a vantagem de permitir que se faça mais de uma intancia do objeto*/
    
    public static Fachada getInstance() {
        if (instance == null) {
            synchronized (Fachada.class) {
                if (instance == null) {
                    instance = new Fachada();
                }
            }
        }
        
        return instance;
    }
    
    /* -------------------------------- CLIENTE -------------------------------- */

    private final IServiceCliente serviceCliente = new ServiceCliente();
    
    /* Busca e retorna a todos os dados de um cliente com base no id do proprio */
    
    @Override
    public Cliente findByIdCliente(long id) {
        return serviceCliente.findById(id);
    }

    /* Busca e retorna todos os dados de um cliente com base no CPF do mesmo */
    
    @Override
    public Cliente findByCPFCliente(String cpf) {
        return serviceCliente.findByCPF(cpf);
    
    }
    
    /* Busca e retorna todos os dados de todos os clientes que foram salvos no banco.*/
    
    @Override
    public List<Cliente> findAllCliente() {
        return serviceCliente.findAll();
    }
    
    /* Salva um cliente no banco de dados */
    
    @Override
    public Cliente saveCliente(Cliente cliente) {
        return serviceCliente.save(cliente);
    }

    /* Método que atualiza os dados de um cliente no banco de dados */
    
    @Override
    public Cliente updateCliente(Cliente cliente) {
        return serviceCliente.update(cliente);
    }
    
    /* Método que exclui um cliente do banco*/
    
    @Override
    public void deleteCliente(Cliente cliente) {
        serviceCliente.delete(cliente);
    }
    
    /* -------------------------------- FORNECEDOR -------------------------------- */
    
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    /* Busca e retorna todos os dados de um fornecedor com base no id do mesmo */
    
    @Override
    public Fornecedor findByIdFornecedor(long id) {
        return serviceFornecedor.findById(id);
    }

    /* Busca e retorna todos os dados de um fornecedor com base no CNPJ do mesmo */
    
    @Override
    public Fornecedor findByCNPJFornecedor(String cnpj) {
        return serviceFornecedor.findByCNPJ(cnpj);
    }
    
    /* Busca e retorna todos os dados de todos os fornecedores que estão salvos no banco*/
    
    @Override
    public List<Fornecedor> findAllFornecedor() {
        return serviceFornecedor.findAll();
    }

    /* Salva um fornecedor no banco de dados */
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return serviceFornecedor.save(fornecedor);
    }

    /* Atualiza os dados de um fornecedor no banco */
    
    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        return serviceFornecedor.update(fornecedor);
    }
    
    /* Exclui um fornecedor do banco*/
    
    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        serviceFornecedor.delete(fornecedor);
    }
    
    /* -------------------------------- FUNCIONÁRIO -------------------------------- */
    
    private final IServiceFuncionario serviceFuncionario = new ServiceFuncionario();
   
    /* Busca e retorna todos os dados de um funcionário com base no id do mesmo */
    
    @Override
    public Funcionario findByIdFuncionario (long id) {
        return serviceFuncionario.findById(id);
    }

    /* Busca e retorna todos os dados de um funcionário com base no CPF do mesmo */
    
    @Override
    public Funcionario findByCPFFuncionario(String cpf) {
        return serviceFuncionario.findByCPF(cpf);
    }
    
    /* Busca e retorna todos os dados de todos os funcionários salvos no banco de dados  */
    
    @Override
    public List<Funcionario> findAllFuncionario () {
        return serviceFuncionario.findAll();
    }
    
    /* Salva um funcionário no banco */
    
    @Override
    public Funcionario saveFuncionario (Funcionario funcionario) {
        return serviceFuncionario.save(funcionario);
    }
    
    /* Atualiza os dados de um funcionário no banco */
    
    @Override
    public Funcionario updateFuncionario (Funcionario funcionario) {
        return serviceFuncionario.update(funcionario);
    }
    
    /* Exclui um funcionário do banco*/
    
    @Override
    public void deleteFuncionario (Funcionario funcionario) {
        serviceFuncionario.delete(funcionario);
    }

    /* Realiza o login de um funcionário no sistema baseado no CPF e senha que foram informados */
    
    @Override
    public int loginFuncionario(Funcionario funcionario) {
        return serviceFuncionario.login(funcionario);
    }
    
    /* -------------------------------- PRODUTO -------------------------------- */
    
    private final IServiceProduto serviceProduto = new ServiceProduto();
    
    /* Ele busca  e retorna todos os dados de um produto com base no id do mesmo */
    
    @Override
    public Produto findByIdProduto(long id) {
        return serviceProduto.findById(id);
    }

    /* Busca e retorna todos os dados que um produto contém com base no código de barras */
    
    @Override
    public Produto findByCodigoBarras(String codigo) {
        return serviceProduto.findByCodigoBarras(codigo);
    }

    /*Busca e retorna todos os dados de um produto com base no nome dele */
    
    @Override
    public List<Produto> findByName(String nome) {
        return serviceProduto.findByName(nome);
    }
    
    /* Busca e retorna todos os dados de todos os produtos salvos no banco*/
    
    @Override
    public List<Produto> findAllProduto() {
        return serviceProduto.findAll();
    }
    
    /* Salva um produto no banco */
    
    @Override
    public Produto saveProduto (Produto produto){
        return serviceProduto.save(produto);
    }

    /* Atualiza os dados de um produto no banco */
    
    @Override
    public Produto updateProduto(Produto produto) {
        return serviceProduto.update(produto);
    }
    
    @Override
    public void deleteProduto(Produto produto) {
        serviceProduto.delete(produto);
    }
}