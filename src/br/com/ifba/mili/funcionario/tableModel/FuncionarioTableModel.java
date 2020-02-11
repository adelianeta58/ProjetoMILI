package br.com.ifba.mili.funcionario.tableModel;

import br.com.ifba.mili.funcionario.model.Funcionario;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adelianeta
 */

public class FuncionarioTableModel extends AbstractTableModel implements IFuncionarioTableModel {

    /* Retorna o nome das colunas da tabela */
    
    @Override
    public String getColumnName(int coluna) {
        return FuncionarioTableModel.colunas[coluna];
    }
    
    /* Retorna a quantidade de linhas que a tabela tem */
    
    @Override
    public int getRowCount() {
        return FuncionarioTableModel.funcionarios.size();
    }
    
    /* Retorna a quantidade de colunas que a tabela tem */
    
    @Override
    public int getColumnCount() {
        return FuncionarioTableModel.colunas.length;
    }

    /* Atribui um dado a uma célula da tabela */
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch (coluna) {
            case 0:
                return FuncionarioTableModel.funcionarios.get(linha).getNome();
            case 1:
                return FuncionarioTableModel.funcionarios.get(linha).getRG();
        }
        
        return null;
    }
    
    /* Adiciona um elemento a lista e por vez já adiciona uma linha a tabela */
    
    public void addElement (Funcionario funcionario) {
        FuncionarioTableModel.funcionarios.add(funcionario);
        fireTableDataChanged();
    }
    
    /* Remove um elemento da listae já remove uma linha da tabela, com base na posição que foi informada */
    
    public void removeElement (int posicao) {
        FuncionarioTableModel.funcionarios.remove(posicao);
        fireTableDataChanged();
    }
}