/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.GerenciarProduto;
import model.Produto;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author João Bassi
 */
public class EditarProdutoGUI extends javax.swing.JFrame {

    GerenciarProduto gerPrd = new GerenciarProduto();
    Produto e;
    /**
     * Creates new form EditarProdutoGUI
     */
    public EditarProdutoGUI(int codigo) {
        initComponents();
    
        //seleciona o produto com o código igual ao passado
        e = gerPrd.selecionarProduto(codigo);
        
        //preenche os campos com os dados do produto.
        textProdCod.setText(Integer.toString(e.getCodigoProduto()));
        textProdNome.setText(e.getNomeProduto());
        textProdQTD.setText(Integer.toString(e.getQtdProduto()));
        textProdComp.setText(Double.toString(e.getValor()).replace(".", ","));
        textProdVend.setText(Double.toString(e.getPrecoProduto()).replace(".", ","));
        
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
        ProdCod = new javax.swing.JLabel();
        ProdNom = new javax.swing.JLabel();
        ProdQTD = new javax.swing.JLabel();
        ProdVen = new javax.swing.JLabel();
        textProdCod = new javax.swing.JTextField();
        textProdQTD = new javax.swing.JTextField();
        textProdNome = new javax.swing.JTextField();
        buttonApresentar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        textProdComp = new javax.swing.JFormattedTextField();
        textProdVend = new javax.swing.JFormattedTextField();
        ProdCom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Empregado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Editar"), "Editar Produto"));

        ProdCod.setText("Código do Produto");
        ProdCod.setToolTipText("Código de identificação do produto");

        ProdNom.setText("Nome do Produto");
        ProdNom.setToolTipText("Nome do Produto para cadastrar");

        ProdQTD.setText("Quantidade");
        ProdQTD.setToolTipText("Quantidade do produto em estoque");

        ProdVen.setText("Valor de Venda");
        ProdVen.setToolTipText("Valor para venda do produto");
        /*
        textProdCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdCodActionPerformed(evt);
            }
        });*/

        buttonApresentar.setText("Voltar");
        buttonApresentar.setToolTipText("Volta para o estoque sem salvar");
        buttonApresentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApresentarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.setToolTipText("Salva as alterações");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        ProdCom.setText("Valor de Compra");
        ProdCom.setToolTipText("Custo de aquisição do produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProdNom)
                    .addComponent(ProdCod)
                    .addComponent(ProdQTD)
                    .addComponent(ProdCom)
                    .addComponent(ProdVen))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textProdCod, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textProdQTD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textProdNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonApresentar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(buttonSalvar))
                    .addComponent(textProdVend)
                    .addComponent(textProdComp))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdCod, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProdCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdNom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProdQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProdQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProdComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProdCom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textProdVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProdVen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonApresentar)
                    .addComponent(buttonSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        try {
            //Envia pedido para cadastro de Uusuário

            e.setCodigoProduto(Integer.parseInt(textProdCod.getText()));
            e.setNomeProduto(textProdNome.getText());
            
            String temp = textProdComp.getText().replace(".", "");
            temp = temp.replace(",", ".");
            String temp2 = textProdVend.getText().replace(".", "");
            temp2 = temp2.replace(",", ".");
            
            e.setQtdProduto(Integer.parseInt(textProdQTD.getText()));
            e.setValor(Float.parseFloat(temp));
            e.setPrecoProduto(Float.parseFloat(temp2));
            
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Produto atualizado com sucesso!");

            GerenciarEstoqueGUI gerPrd = new GerenciarEstoqueGUI();
            gerPrd.setVisible(true);
            dispose();

        } catch (Exception e) {
            JOptionPane optionPane = new JOptionPane("Erro! Confira os dados e tente novamente!", 
                    JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Erro");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonApresentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApresentarActionPerformed
        GerenciarEstoqueGUI prdGUI = new GerenciarEstoqueGUI();
        prdGUI.setVisible(true);
        dispose();

    }//GEN-LAST:event_buttonApresentarActionPerformed


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
            java.util.logging.Logger.getLogger(EditarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProdutoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProdCod;
    private javax.swing.JLabel ProdCom;
    private javax.swing.JLabel ProdNom;
    private javax.swing.JLabel ProdQTD;
    private javax.swing.JLabel ProdVen;
    private javax.swing.JButton buttonApresentar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textProdCod;
    private javax.swing.JFormattedTextField textProdComp;
    private javax.swing.JTextField textProdNome;
    private javax.swing.JTextField textProdQTD;
    private javax.swing.JFormattedTextField textProdVend;
    // End of variables declaration//GEN-END:variables
}