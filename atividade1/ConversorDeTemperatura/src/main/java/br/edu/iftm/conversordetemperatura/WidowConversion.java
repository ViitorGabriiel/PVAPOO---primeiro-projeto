/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.iftm.conversordetemperatura;

/**
 *
 * @author IFTM
 */
public class WidowConversion extends javax.swing.JFrame {

    /**
     * Creates new form WidowConversion
     */
    public WidowConversion() {
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

        jTextResult = new javax.swing.JTextField();
        jButtonConvert = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxSection = new javax.swing.JComboBox<>();
        jTextValue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConvert.setText("Convert");
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose conversion");

        jComboBoxSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius for Fahrenheit", "Celsius for Kelvin", "Fahrenheit for Kelvin", "Fahrenheit for Celsius", "Kelvin for Fahrenheit", "Kelvin for Celsius" }));
        jComboBoxSection.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSectionActionPerformed(evt);
            }
        });

        jTextValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonConvert))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addComponent(jComboBoxSection, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextResult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConvert))
                .addGap(8, 8, 8)
                .addComponent(jTextResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
        // TODO add your handling code here:
        String opcaoSelecionada = (String)jComboBoxSection.getSelectedItem();

        float value = Float.parseFloat(jTextValue.getText());
        float result;

        if(opcaoSelecionada.equals("Celsius for Fahrenheit")){
            result = (float) (value * 1.8 + 32);
            jTextResult.setText("" + result);
        }

        if(opcaoSelecionada.equals("Celsius for Kelvin")){
            result = (float) (value + 273.15);
            jTextResult.setText("" + result);
        }

        if(opcaoSelecionada.equals("Fahrenheit for Kelvin")){
            //− 32) × 5/9 + 273,15
        result = (float) ((value - 32) * 5 / 9 + 273.15);
        jTextResult.setText("" + result);// parei aqui
        }

        if(opcaoSelecionada.equals("Fahrenheit for Celsius")){
            result = (float) ((value * 9/5) + 32);
            jTextResult.setText("" + result);
        }

        if(opcaoSelecionada.equals("Kelvin for Fahrenheit")){
            result = (float) ((value - 273.15) * 9/5 + 32);
            jTextResult.setText("" + result);
        }

        if(opcaoSelecionada.equals("Kelvin for Celsius")){
            result = (float) (value - 273.15);
            jTextResult.setText("" + result);
        }
    }//GEN-LAST:event_jButtonConvertActionPerformed

    private void jComboBoxSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSectionActionPerformed

    }//GEN-LAST:event_jComboBoxSectionActionPerformed

    private void jTextValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValueActionPerformed

    }//GEN-LAST:event_jTextValueActionPerformed

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
            java.util.logging.Logger.getLogger(WidowConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidowConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidowConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidowConversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WidowConversion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JComboBox<String> jComboBoxSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextResult;
    private javax.swing.JTextField jTextValue;
    // End of variables declaration//GEN-END:variables
}