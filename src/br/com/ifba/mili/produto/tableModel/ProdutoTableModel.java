package br.com.ifba.mili.produto.tableModel;

import br.com.ifba.mili.produto.model.Produto;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adelianeta
 */

public class ProdutoTableModel extends AbstractTableModel implements IProdutoTableModel {
    
    /* Vai retornar o nome das colunas da tabela */
    
    @Override
    public String getColumnName(int coluna) {
        return ProdutoTableModel.colunas[coluna];
    }
    
    /* Vai retornar a quantidade de linhas da tabela */
    
    @Override
    public int getRowCount() {
        return ProdutoTableModel.produtos.size();
    }
    
    /* Vai retornar a quantidade de colunas da tabela */
    
    @Override
    public int getColumnCount() {
        return ProdutoTableModel.colunas.length;
    }
    
    /* Vai atribuir um dado a uma célula da tabela */
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch (coluna) {
            case 0:
                return ProdutoTableModel.produtos.get(linha).getNome();
            case 1:
                return ProdutoTableModel.produtos.get(linha).getPreco();
            case 2:
                return ProdutoTableModel.produtos.get(linha).getSecao();
            case 3:
                return ProdutoTableModel.produtos.get(linha).getDataValidade();
            case 4:
                return ProdutoTableModel.produtos.get(linha).getEstoque();
        }
    
        return null;
    }
    
    /* Aqui adiciona um elemento a lista e por vez adiciona uma linha a tabela */
    
    public void addElement (Produto produto) {
        ProdutoTableModel.produtos.add(produto);
        fireTableDataChanged();
    }
    
    /* Aqui remove um elemento da lista e járemove uma linha da tabela
       com base na posição que foi informada */
    
    public void removeElement (int posicao) {
        ProdutoTableModel.produtos.remove(posicao);
        fireTableDataChanged();
    }
}