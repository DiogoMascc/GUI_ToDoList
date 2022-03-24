package main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaToDoList extends javax.swing.JFrame {

    public TelaToDoList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTarefa = new javax.swing.JTextField();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrioridade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTarefas = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimparTabela = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 420));

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 420));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(228, 230));

        jBSair.setBackground(new java.awt.Color(255, 255, 255));
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-sign-out-28.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.setPreferredSize(new java.awt.Dimension(100, 33));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-to-do-list-100.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("To Do List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tarefa:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Categoria:");

        jTextFieldTarefa.setBorder(null);

        jTextFieldCategoria.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Prioridade:");

        jTextFieldPrioridade.setBorder(null);

        jTableTarefas.setBackground(new java.awt.Color(255, 255, 255));
        jTableTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarefa", "Categoria", "Prioridade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTarefasMouseClicked(evt);
            }
        });
        jTableTarefas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableTarefasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTarefas);
        if (jTableTarefas.getColumnModel().getColumnCount() > 0) {
            jTableTarefas.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jButtonAdicionar.setBackground(new java.awt.Color(51, 102, 255));
        jButtonAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-18.png"))); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(51, 102, 255));
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-remove-18.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setBackground(new java.awt.Color(51, 102, 255));
        jButtonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-18.png"))); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonLimparTabela.setBackground(new java.awt.Color(51, 102, 255));
        jButtonLimparTabela.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimparTabela.setText("Limpar Tarefas");
        jButtonLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jTextFieldTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(jTextFieldPrioridade, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimparTabela)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonLimparTabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAdicionar, jButtonAtualizar, jButtonExcluir, jButtonLimparTabela});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        JOptionPane.showMessageDialog(null, "Saindo...");
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
        if(jTextFieldTarefa.getText().equals("")){;
            JOptionPane.showMessageDialog(this, "Digite a tarefa!");
        }else{
            String tarefa = jTextFieldTarefa.getText();
            String categoria = jTextFieldCategoria.getText();
            String prioridade = jTextFieldPrioridade.getText();
            
            DefaultTableModel tblModel = (DefaultTableModel)jTableTarefas.getModel();           
            
            Object[] NovaTarefa = new Object[]{tarefa, categoria, prioridade};
            
            tblModel.addRow(NovaTarefa);
                    
            JOptionPane.showMessageDialog(this, "Tarefa adicionada com sucesso!");
            
            jTextFieldTarefa.setText("");
            jTextFieldCategoria.setText("");
            jTextFieldPrioridade.setText("");
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        int LinhaSelecionada = jTableTarefas.getSelectedRow();
        
        if(LinhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para excluir!");
        }else{
            DefaultTableModel tblModel = (DefaultTableModel)jTableTarefas.getModel();
            tblModel.removeRow(LinhaSelecionada);
            JOptionPane.showMessageDialog(this, "Tarefa excluída!");
        }
        
        jTextFieldTarefa.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldPrioridade.setText(""); 
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarefasMouseClicked
        
        if(jTableTarefas.getSelectedRow() != -1){
            jTextFieldTarefa.setText(jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0).toString());
            jTextFieldCategoria.setText(jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 1).toString());
            jTextFieldPrioridade.setText(jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jTableTarefasMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        
        int LinhaSelecionada = jTableTarefas.getSelectedRow();
        
        if(LinhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para atualizar!");
        }else{
            jTableTarefas.setValueAt(jTextFieldTarefa.getText(), jTableTarefas.getSelectedRow(), 0);
            jTableTarefas.setValueAt(jTextFieldCategoria.getText(), jTableTarefas.getSelectedRow(), 1);
            jTableTarefas.setValueAt(jTextFieldPrioridade.getText(), jTableTarefas.getSelectedRow(), 2);  
            
            JOptionPane.showMessageDialog(this, "Tarefa atualizada!");
            
            jTextFieldTarefa.setText("");
            jTextFieldCategoria.setText("");
            jTextFieldPrioridade.setText(""); 
        }       
            
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTableTarefasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTarefasKeyReleased
        
        if(jTableTarefas.getSelectedRow() != -1){
            jTextFieldTarefa.setText(jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 0).toString());
            jTextFieldCategoria.setText(jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 1).toString());
            jTextFieldPrioridade.setText(jTableTarefas.getValueAt(jTableTarefas.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jTableTarefasKeyReleased

    private void jButtonLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparTabelaActionPerformed
        
        DefaultTableModel tblRemove = (DefaultTableModel)jTableTarefas.getModel();
        
        while (jTableTarefas.getModel().getRowCount() > 0){
            tblRemove.removeRow(0);
        }
        
        JOptionPane.showMessageDialog(this, "Tarefas apagadas!");
        jTextFieldTarefa.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldPrioridade.setText(""); 
        
    }//GEN-LAST:event_jButtonLimparTabelaActionPerformed

    public static void main(String args[]) {     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaToDoList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimparTabela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableTarefas;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldPrioridade;
    private javax.swing.JTextField jTextFieldTarefa;
    // End of variables declaration//GEN-END:variables
}
