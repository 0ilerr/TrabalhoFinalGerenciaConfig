/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.PedidoJpaController;
import Modelo.Pedido;
import javax.swing.DefaultListModel;

/**
 *
 * @author giova
 */
public class TelaPedido extends javax.swing.JFrame {
        
    
    private Pedido p;
    
    /**
     * Creates new form TelaPedido
     */
    public TelaPedido() {
        initComponents();
     
        
    }
     public void setaCampos(Pedido p ){
         this.p = p;
        idpedido.setText(p.getId().toString());
        idcliente.setText(p.getIdCliente().toString());
        valor.setText((p.getValorTotal()));
        DefaultListModel listModel = new DefaultListModel();
        p.getProdutos().forEach((percorrer) -> {
            listModel.addElement(percorrer);
        });
        produtos.setModel(listModel);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        novoproduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtos = new javax.swing.JList<>();
        idpedido = new javax.swing.JTextField();
        idcliente = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pedido");

        jLabel2.setText("Id");

        jLabel3.setText("Cliente");

        jLabel4.setText("Produtos");

        jLabel5.setText("Valor total: ");

        sair.setText("Salvar");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");

        novoproduto.setText("Novo");

        produtos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(produtos);

        idpedido.setText("jTextField1");

        idcliente.setText("jTextField2");

        valor.setText("jTextField4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(novoproduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir)
                    .addComponent(novoproduto)
                    .addComponent(jLabel5)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(sair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       String idPedido = idpedido.getText();
        String idCliente  = idcliente.getText();
        Double valorProdutos = Double.parseDouble(valor.getText());
        
        p.setId(Long.parseLong(idPedido));
        p.setIdCliente(Long.parseLong(idCliente));
        p.setValorTotal(valorProdutos);
        
        
        
        
    }//GEN-LAST:event_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton excluir;
    private javax.swing.JTextField idcliente;
    private javax.swing.JTextField idpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoproduto;
    private javax.swing.JList<String> produtos;
    private javax.swing.JButton sair;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
