
import javax.swing.JOptionPane;

public class FormCC extends javax.swing.JFrame {
    funcionario cc = new funcionario();
 
    public FormCC() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        Cargos = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        Salario = new javax.swing.JLabel();
        setor = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        BotaoExibir = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        salario = new javax.swing.JTextField();
        Salario1 = new javax.swing.JLabel();
        IR_Value = new javax.swing.JTextField();
        IR = new javax.swing.JLabel();
        faltas_Value = new javax.swing.JTextField();
        faltas = new javax.swing.JLabel();
        salarioIFinal = new javax.swing.JTextField();
        SalarioRecebido = new javax.swing.JLabel();
        calcularSal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Recursos humanos JSL");

        name.setText("Nome");

        Cargos.setText("Cargo");

        Salario.setText("Salario");

        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });

        BotaoCadastrar.setText("CADASTRAR");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        BotaoExibir.setText("EXIBIR");
        BotaoExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExibirActionPerformed(evt);
            }
        });

        BotaoSair.setText("SAIR");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        Salario1.setText("Setor");

        IR_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IR_ValueActionPerformed(evt);
            }
        });

        IR.setText("IR cobrado");

        faltas_Value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faltas_ValueActionPerformed(evt);
            }
        });

        faltas.setText("Faltas");

        salarioIFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioIFinalActionPerformed(evt);
            }
        });

        SalarioRecebido.setText("Salario recebido");

        calcularSal.setText("Calcular?");
        calcularSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularSalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cargos)
                                    .addComponent(name))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cargo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(nome))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotaoCadastrar)
                                    .addComponent(calcularSal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SalarioRecebido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(salarioIFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(faltas)
                                        .addGap(33, 33, 33)
                                        .addComponent(faltas_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(IR_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Salario)
                                            .addComponent(Salario1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(setor, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                            .addComponent(salario)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(name)
                                .addGap(28, 28, 28)
                                .addComponent(Cargos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoExibir)
                            .addComponent(BotaoCadastrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoSair)
                            .addComponent(calcularSal))
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salario)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salario1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IR_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faltas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faltas_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalarioRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salarioIFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExibirActionPerformed

       this.nome.setText(cc.nome);
       this.cargo.setText(cc.cargo);
       this.setor.setText(cc.setor);
       this.salario.setText(String.valueOf(cc.salario));
    }//GEN-LAST:event_BotaoExibirActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        // alocar os dados dos campos de texto nos atributos
        cc.nome = this.nome.getText();
        cc.cargo =(this.cargo.getText());
        cc.salario = Double.parseDouble(this.salario.getText());    
        cc.setor=this.setor.getText(); 
        
        JOptionPane.showMessageDialog(null,"Colaborador cadastrado Cadastrados !!!");
            
       this.nome.setText(" ");
       this.cargo.setText(" ");
       this.salario.setText(" ");
       this.setor.setText(" ");
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorActionPerformed

    private void faltas_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faltas_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faltas_ValueActionPerformed

    private void salarioIFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioIFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioIFinalActionPerformed

    private void IR_ValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IR_ValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IR_ValueActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void calcularSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularSalActionPerformed
                                               
        try {
            // Pergunta as faltas
            String inputFaltas = JOptionPane.showInputDialog(null, "Quantas faltas o funcionário teve?", "0");
            int qtdFaltas = Integer.parseInt(inputFaltas);
            
            // Faz os cálculos (usando os métodos da sua classe funcionario)
            double inss = cc.CalcINSS();
            double ir = cc.calcIR();
            double descFaltas = cc.calcDescFaltas(qtdFaltas);
            double liquido = cc.SalarioReal(qtdFaltas);
            
            // Preenche os campos na tela (IR_Value, faltas_Value e salarioIFinal)
            this.IR_Value.setText(String.format("%.2f", ir));
            this.faltas_Value.setText(String.format("%.2f", descFaltas));
            this.salarioIFinal.setText(String.format("%.2f", liquido));
            
            JOptionPane.showMessageDialog(null, "Desconto do INSS: R$ " + String.format("%.2f", inss));
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao calcular! Cadastre o funcionário primeiro.");
        }      
    }//GEN-LAST:event_calcularSalActionPerformed

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
            java.util.logging.Logger.getLogger(FormCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExibir;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel Cargos;
    private javax.swing.JLabel IR;
    private javax.swing.JTextField IR_Value;
    private javax.swing.JLabel Salario;
    private javax.swing.JLabel Salario1;
    private javax.swing.JLabel SalarioRecebido;
    private javax.swing.JButton calcularSal;
    private javax.swing.JTextField cargo;
    private javax.swing.JLabel faltas;
    private javax.swing.JTextField faltas_Value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField salarioIFinal;
    private javax.swing.JTextField setor;
    // End of variables declaration//GEN-END:variables
}
