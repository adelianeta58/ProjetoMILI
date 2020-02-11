package br.com.ifba.mili.infraestrutura.view;

import br.com.ifba.mili.infraestrutura.service.Fachada;
import br.com.ifba.mili.produto.model.Produto;
import br.com.ifba.mili.produto.tableModel.ProdutoTableModel;
import java.util.List;

/**
 *
 * @author Icaro
 */

public class JDialogVerificarEstoque extends javax.swing.JDialog {
    private final Fachada fachada;
    private final ProdutoTableModel produtoTB;
    
    public JDialogVerificarEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        fachada = Fachada.getInstance();
        produtoTB = new ProdutoTableModel();
        
        jTListaProdutos.setModel(produtoTB);
        jTListaProdutos.getColumnModel().getColumn(0).setPreferredWidth(263);
        jTListaProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTListaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTListaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTListaProdutos.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBTBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaProdutos = new javax.swing.JTable();
        jTFNome = new javax.swing.JTextField();
        jBTSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificar Estoque");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 94));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Verificar Estoque");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VerificarEstoque.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nome do produto");

        jBTBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBTBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa.png"))); // NOI18N
        jBTBuscar.setText("Buscar");
        jBTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTBuscarActionPerformed(evt);
            }
        });

        jTListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Seção", "Data de Validade", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaProdutos);
        if (jTListaProdutos.getColumnModel().getColumnCount() > 0) {
            jTListaProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(0).setPreferredWidth(263);
            jTListaProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTListaProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTListaProdutos.getColumnModel().getColumn(3).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTListaProdutos.getColumnModel().getColumn(4).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jTFNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jBTSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBTSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        jBTSair.setText("Sair");
        jBTSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /* Evento para buscar um ou mais produtos salvos no banco de dados */
    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        buscar();
    }//GEN-LAST:event_jTFNomeActionPerformed

    /* Evento para buscar um ou mais produtos salvos no banco de dados */
    private void jBTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jBTBuscarActionPerformed

    /* Evento para fechar a janela */
    private void jBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBTSairActionPerformed
    
    /* Método solicita ao banco de dados os produtos que possuem nome semelhante ao informado e os adiciona na tabela */
    private void buscar () {
        String nome = jTFNome.getText();
        List<Produto> produtos = fachada.findByName(nome);
        
        if (produtos != null) {
            
            for (int i = 0; i < produtoTB.getRowCount(); i++) {
                produtoTB.removeElement(i);
            }
            
            for (Produto p : produtos) {
                produtoTB.addElement(p);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTBuscar;
    private javax.swing.JButton jBTSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTListaProdutos;
    // End of variables declaration//GEN-END:variables
}