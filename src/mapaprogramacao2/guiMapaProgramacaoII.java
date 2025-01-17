/*  André Luiz Dalazen
    ADS
    RA: 1984330-5

    Meus agradecimentos ao professor Rafael Alves Florindo que me respodneu no
    chat tão prontamente.
*/


package mapaprogramacao2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Aldalazen
 */
public class guiMapaProgramacaoII extends javax.swing.JFrame {

    int numero;
    List filaDeAtendimento;
    

    
    public guiMapaProgramacaoII() {
        initComponents();
        numero = 0;
        filaDeAtendimento = new ArrayList<Atendimento>();
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
        painelCaixa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelSenha = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        atendimentoCaixa2 = new javax.swing.JButton();
        atendimentoCaixa3 = new javax.swing.JButton();
        atendimentoCaixa4 = new javax.swing.JButton();
        atendimentoCaixa1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        senhaCaixaRapido = new javax.swing.JButton();
        senhaCaixaPreferencial = new javax.swing.JButton();
        senhaCaixaNormal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelCaixa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        painelCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        painelSenha.setColumns(20);
        painelSenha.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        painelSenha.setRows(5);
        jScrollPane1.setViewportView(painelSenha);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Caixa:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(painelCaixa)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        atendimentoCaixa2.setText("Caixa2");
        atendimentoCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendimentoCaixa2ActionPerformed(evt);
            }
        });

        atendimentoCaixa3.setText("Caixa3");
        atendimentoCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendimentoCaixa3ActionPerformed(evt);
            }
        });

        atendimentoCaixa4.setText("Caixa4");
        atendimentoCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendimentoCaixa4ActionPerformed(evt);
            }
        });

        atendimentoCaixa1.setText("Caixa1");
        atendimentoCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendimentoCaixa1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Atendimento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(atendimentoCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atendimentoCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atendimentoCaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(atendimentoCaixa4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atendimentoCaixa2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(atendimentoCaixa3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(atendimentoCaixa4, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(atendimentoCaixa1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        senhaCaixaRapido.setText("Caixa Rápido");
        senhaCaixaRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCaixaRapidoActionPerformed(evt);
            }
        });

        senhaCaixaPreferencial.setText("Caixa Preferencial");
        senhaCaixaPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCaixaPreferencialActionPerformed(evt);
            }
        });

        senhaCaixaNormal.setText("Caixa Normal");
        senhaCaixaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCaixaNormalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Pegar Senha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaCaixaRapido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senhaCaixaPreferencial, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(senhaCaixaNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(senhaCaixaRapido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaCaixaPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaCaixaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaCaixaRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCaixaRapidoActionPerformed
        // TODO add your handling code here:
        numero++;
        Atendimento atendimento = new Atendimento("R",numero);
        filaDeAtendimento.add(atendimento);
        
    }//GEN-LAST:event_senhaCaixaRapidoActionPerformed
    
    private void senhaCaixaPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCaixaPreferencialActionPerformed
        numero++;
        Atendimento atendimento = new Atendimento("P",numero);
        filaDeAtendimento.add(atendimento);
        
    }//GEN-LAST:event_senhaCaixaPreferencialActionPerformed
    
    private void senhaCaixaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCaixaNormalActionPerformed
        numero++;
        Atendimento atendimento = new Atendimento("C",numero);
        filaDeAtendimento.add(atendimento);
        /* painelCaixa.setText(String.valueOf(atendimento.getTipo())+"-"+String.valueOf(atendimento.getNumero())); */
    }//GEN-LAST:event_senhaCaixaNormalActionPerformed

    private void atendimentoCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendimentoCaixa1ActionPerformed
        Iterator<Atendimento> itr = filaDeAtendimento.iterator();
        
        boolean senhaEncontrada = false;
        while(itr.hasNext()) {
            Atendimento atnd = itr.next();
            if(atnd.getTipo() == "P"){
                painelCaixa.setText("Caixa 1");
                painelSenha.setText(String.valueOf(atnd.getTipo())+"-"+String.valueOf(atnd.getNumero()));
                itr.remove();
                senhaEncontrada = true;
                break;  
            }
                      
        }
        
        if (senhaEncontrada==false){
            Atendimento s = new Atendimento();
            s = (Atendimento) filaDeAtendimento.get(0);
            painelCaixa.setText("Caixa 1");
            painelSenha.setText(String.valueOf(s.getTipo())+"-"+String.valueOf(s.getNumero())); 
            filaDeAtendimento.remove(0);
            
        
        }
    }//GEN-LAST:event_atendimentoCaixa1ActionPerformed

    private void atendimentoCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendimentoCaixa2ActionPerformed
        Iterator<Atendimento> itr = filaDeAtendimento.iterator();
        
        boolean senhaEncontrada = false;
        while(itr.hasNext()) {
            Atendimento atnd = itr.next();
            if(atnd.getTipo() == "R"){
                painelCaixa.setText("Caixa 2");
                painelSenha.setText(String.valueOf(atnd.getTipo())+"-"+String.valueOf(atnd.getNumero()));
                itr.remove();
                senhaEncontrada = true;
                break;
            }
                        
        }
        
            if (senhaEncontrada==false){
            Atendimento s = new Atendimento();
            s = (Atendimento) filaDeAtendimento.get(0);
            painelCaixa.setText("Caixa 2");
            painelSenha.setText(String.valueOf(s.getTipo())+"-"+String.valueOf(s.getNumero())); 
            filaDeAtendimento.remove(0);
            
        
        }
    
    }//GEN-LAST:event_atendimentoCaixa2ActionPerformed

    private void atendimentoCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendimentoCaixa3ActionPerformed
        Iterator<Atendimento> itr = filaDeAtendimento.iterator();
        
        boolean senhaEncontrada = false;
        while(itr.hasNext()) {
            Atendimento atnd = itr.next();
            if(atnd.getTipo() == "R"){
                painelCaixa.setText("Caixa 3");
                painelSenha.setText(String.valueOf(atnd.getTipo())+"-"+String.valueOf(atnd.getNumero()));
                itr.remove();
                senhaEncontrada = true;
                break;
            }
                        
        }
        
            if (senhaEncontrada==false){
            Atendimento s = new Atendimento();
            s = (Atendimento) filaDeAtendimento.get(0);
            painelCaixa.setText("Caixa 3");
            painelSenha.setText(String.valueOf(s.getTipo())+"-"+String.valueOf(s.getNumero())); 
            filaDeAtendimento.remove(0);
            
        
        }

    }//GEN-LAST:event_atendimentoCaixa3ActionPerformed

    private void atendimentoCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendimentoCaixa4ActionPerformed
                Iterator<Atendimento> itr = filaDeAtendimento.iterator();
        
        boolean senhaEncontrada = false;
        while(itr.hasNext()) {
            Atendimento atnd = itr.next();
            if(atnd.getTipo() == "C"){
                painelCaixa.setText("Caixa 4");
                painelSenha.setText(String.valueOf(atnd.getTipo())+"-"+String.valueOf(atnd.getNumero()));
                itr.remove();
                senhaEncontrada = true;
                break; 
            }
                       
        }
        
            if (senhaEncontrada==false){
            Atendimento s = new Atendimento();
            s = (Atendimento) filaDeAtendimento.get(0);
            painelCaixa.setText("Caixa 4");
            painelSenha.setText(String.valueOf(s.getTipo())+"-"+String.valueOf(s.getNumero())); 
            filaDeAtendimento.remove(0);
            
        
        }

    }//GEN-LAST:event_atendimentoCaixa4ActionPerformed
   
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
            java.util.logging.Logger.getLogger(guiMapaProgramacaoII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiMapaProgramacaoII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiMapaProgramacaoII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiMapaProgramacaoII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiMapaProgramacaoII().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atendimentoCaixa1;
    private javax.swing.JButton atendimentoCaixa2;
    private javax.swing.JButton atendimentoCaixa3;
    private javax.swing.JButton atendimentoCaixa4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField painelCaixa;
    private javax.swing.JTextArea painelSenha;
    private javax.swing.JButton senhaCaixaNormal;
    private javax.swing.JButton senhaCaixaPreferencial;
    private javax.swing.JButton senhaCaixaRapido;
    // End of variables declaration//GEN-END:variables
}
