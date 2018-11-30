/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ProdutoJpaController;
import Modelo.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author euler
 */
public class Principal extends javax.swing.JFrame {

    ProdutoJpaController oProdutoJpaController = new ProdutoJpaController("TrabalhoFinalGerenciaConfigPU");

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMProduto = new javax.swing.JMenu();
        jMIConsulta = new javax.swing.JMenuItem();
        jMIInclusao = new javax.swing.JMenuItem();
        jMIAlteracao = new javax.swing.JMenuItem();
        jMIExclusao = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMProduto.setText("Produto");

        jMIConsulta.setText("Consulta");
        jMIConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultaActionPerformed(evt);
            }
        });
        jMProduto.add(jMIConsulta);

        jMIInclusao.setText("Inclusão");
        jMIInclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIInclusaoActionPerformed(evt);
            }
        });
        jMProduto.add(jMIInclusao);

        jMIAlteracao.setText("Alteração");
        jMIAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlteracaoActionPerformed(evt);
            }
        });
        jMProduto.add(jMIAlteracao);

        jMIExclusao.setText("Exclusão");
        jMIExclusao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIExclusaoActionPerformed(evt);
            }
        });
        jMProduto.add(jMIExclusao);

        jMenuBar1.add(jMProduto);

        jMenu1.setText("jMenu1");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void jMIInclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIInclusaoActionPerformed
        Produto oProduto = new Produto();
        String descricao = JOptionPane.showInputDialog(null, "Informe o nome do Produto:");
        String fabricante = JOptionPane.showInputDialog(null, "Informe o nome do fabricante do Produto:");
        oProduto.setDescricao(descricao);
        oProduto.setFabricante(fabricante);
        oProdutoJpaController.create(oProduto);
        JOptionPane.showMessageDialog(null, "Sucesso ao Cadastrar!\n"
                + oProduto.toString());
    }//GEN-LAST:event_jMIInclusaoActionPerformed

    private void jMIConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultaActionPerformed
        long id = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o id do seu produto para Consulta"));
        Produto oProduto = oProdutoJpaController.findProduto(id);
        if (oProduto != null) {
            JOptionPane.showMessageDialog(null, "Produto Encontrado!\n" + oProduto.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Produto não consta na base de dados!");
        }


    }//GEN-LAST:event_jMIConsultaActionPerformed

    private void jMIAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlteracaoActionPerformed
        long id = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o id do seu produto para Alteração:"));
        Produto oProduto = oProdutoJpaController.findProduto(id);
        if (oProduto != null) {
            String descricao = JOptionPane.showInputDialog(null, "Insira a nova descrição:");
            String fabricante = JOptionPane.showInputDialog(null, "Insira o novo fabricante:");
            oProduto.setDescricao(descricao);
            oProduto.setFabricante(fabricante);
            try {
                oProdutoJpaController.edit(oProduto);
                JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não consta na base de dados!");
        }

    }//GEN-LAST:event_jMIAlteracaoActionPerformed

    private void jMIExclusaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIExclusaoActionPerformed
        long id = Long.parseLong(JOptionPane.showInputDialog(null, "Insira o id do seu produto para Exclusão:"));
        Produto oProduto = oProdutoJpaController.findProduto(id);
        if (oProduto != null) {
            try {
                oProdutoJpaController.destroy(id);
                JOptionPane.showMessageDialog(null, "Produto Excluido!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não consta na base de dados!");
        }


    }//GEN-LAST:event_jMIExclusaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMIAlteracao;
    private javax.swing.JMenuItem jMIConsulta;
    private javax.swing.JMenuItem jMIExclusao;
    private javax.swing.JMenuItem jMIInclusao;
    private javax.swing.JMenu jMProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
