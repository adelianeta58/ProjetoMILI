package br.com.ifba.mili.funcionario.tableModel;

import br.com.ifba.mili.funcionario.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adelianeta
 */

public interface IFuncionarioTableModel {
    
    /* Lista dos funcionários que aparecerão na tabela */
    public List<Funcionario> funcionarios = new ArrayList<>();
    
    /* Colunas da tabela */
    public String[] colunas = {"Nome", "RG"};
}