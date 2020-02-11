package br.com.ifba.mili.funcionario.view;

import br.com.ifba.mili.cliente.view.JDialogCadastrarCliente;
import br.com.ifba.mili.infraestrutura.view.JDialogVerificarEstoque;
import br.com.ifba.mili.produto.view.JDialogCadastrarProduto;

/**
 *
 * @author Icaro
 */

public class JFrameFuncionario extends javax.swing.JFrame {
    private final JDialogCadastrarCliente telaCadastrarCliente;
    private final JDialogVerificarEstoque telaVerificarEstoque;
    private final JDialogCadastrarProduto telaCadastrarProduto;
    
    public JFrameFuncionario() {
        initComponents();
    
        telaCadastrarCliente = new JDialogCadastrarCliente(this, true);
        telaVerificarEstoque = new JDialogVerificarEstoque(this, true);
        telaCadastrarProduto = new JDialogCadastrarProduto(this, true);
        
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBTNovoCliente = new javax.swing.JButton();
        jBTVerificarEstoque = new javax.swing.JButton();
        jBTCadastrarProduto = new javax.swing.JButton();
        jBTSair = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLTotal = new javax.swing.JLabel();
        jBTConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaProdutos = new javax.swing.JTable();
        jTFCodigoBarras = new javax.swing.JTextField();
        jFTFQuantidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jBTOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venda");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Módulo do Vendedor");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconeVendedor.png"))); // NOI18N

        jBTNovoCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBTNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/novoCliente.png"))); // NOI18N
        jBTNovoCliente.setText("Novo Cliente");
        jBTNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNovoClienteActionPerformed(evt);
            }
        });

        jBTVerificarEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBTVerificarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/VerEstoque.png"))); // NOI18N
        jBTVerificarEstoque.setText("Verificar Estoque");
        jBTVerificarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTVerificarEstoqueActionPerformed(evt);
            }
        });

        jBTCadastrarProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBTCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        jBTCadastrarProduto.setText("Cadastrar Produto");
        jBTCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCadastrarProdutoActionPerformed(evt);
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AberturaVenda.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Abertura de Venda");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("M.I.L.I Automação");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(jBTNovoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTVerificarEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTCadastrarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTSair))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBTNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTVerificarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTCadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBTSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLTotal.setText("SUBTOTAL: R$");

        jBTConfirmar.setBackground(new java.awt.Color(0, 153, 51));
        jBTConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jBTConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jBTConfirmar.setText("Confirmar");
        jBTConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBTConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jBTConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLTotal)
                        .addGap(29, 29, 29))))
        );

        jTListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaProdutos);
        if (jTListaProdutos.getColumnModel().getColumnCount() > 0) {
            jTListaProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTListaProdutos.getColumnModel().getColumn(2).setResizable(false);
        }

        jTFCodigoBarras.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoBarrasActionPerformed(evt);
            }
        });

        jFTFQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFQuantidade.setText("1");
        jFTFQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Código de Barras");

        jBTOK.setBackground(new java.awt.Color(0, 102, 255));
        jBTOK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBTOK.setText("OK");
        jBTOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFCodigoBarras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTOK)))
                .addGap(189, 189, 189))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCodigoBarras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                    .addComponent(jBTOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /* Evento que chama a tela cadastro de cliente */
    private void jBTNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNovoClienteActionPerformed
        telaCadastrarCliente.setLocationRelativeTo(null);
        telaCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jBTNovoClienteActionPerformed

    /* Evento que chama a tela que verifica o estoque dos produtos */
    private void jBTVerificarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTVerificarEstoqueActionPerformed
        telaVerificarEstoque.setLocationRelativeTo(null);
        telaVerificarEstoque.setVisible(true);
    }//GEN-LAST:event_jBTVerificarEstoqueActionPerformed

    /* Evento que chama a tela cadastro de produto */
    private void jBTCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCadastrarProdutoActionPerformed
        telaCadastrarProduto.setLocationRelativeTo(null);
        telaCadastrarProduto.setVisible(true);
    }//GEN-LAST:event_jBTCadastrarProdutoActionPerformed
    
    /* Evento para encerrar o sistema */
    private void jBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBTSairActionPerformed

    /* Evento para adicionar um produto ao carrinho de compras */
    private void jTFCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoBarrasActionPerformed
        adicionarProduto();
    }//GEN-LAST:event_jTFCodigoBarrasActionPerformed

    /* Evento para adicionar um produto ao carrinho de compras */
    private void jBTOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTOKActionPerformed
        adicionarProduto();
    }//GEN-LAST:event_jBTOKActionPerformed

    /* Evento para finalizar a compra */
    private void jBTConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTConfirmarActionPerformed
        /* 
        *   Lógica para confirmar a compra dos produtos 
        */
    }//GEN-LAST:event_jBTConfirmarActionPerformed
    
    /* Adiciona um produto ao carrinho de compras */
    private void adicionarProduto () {
        /*
        *   Lógica para adiconar um produto ao carrinho
        */
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCadastrarProduto;
    private javax.swing.JButton jBTConfirmar;
    private javax.swing.JButton jBTNovoCliente;
    private javax.swing.JButton jBTOK;
    private javax.swing.JButton jBTSair;
    private javax.swing.JButton jBTVerificarEstoque;
    private javax.swing.JFormattedTextField jFTFQuantidade;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigoBarras;
    private javax.swing.JTable jTListaProdutos;
    // End of variables declaration//GEN-END:variables
}