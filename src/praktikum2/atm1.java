/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import javax.swing.JOptionPane;

/**
 *
 * @author A455L
 */
public class atm1 extends javax.swing.JFrame {

    /**
     * Creates new form atm1
     */
    public atm1() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtpin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Enter your PIN!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 120, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Welcome to ONE PIECE Banking Application!");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 30, 380, 70);

        jtpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtpinActionPerformed(evt);
            }
        });
        getContentPane().add(jtpin);
        jtpin.setBounds(150, 160, 190, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\44f3ed6f2d1f2a6a3fe82ee58a045134.jpg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-6, -6, 410, 260);

        setBounds(0, 0, 416, 291);
    }// </editor-fold>//GEN-END:initComponents

    private void jtpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtpinActionPerformed
    int pin= Integer.parseInt(jtpin.getText().toString());

        if(pin==1234){
            new atm2().setVisible(true);
            dispose();
        } else{
            JOptionPane.showMessageDialog(null, "Silahkan ulangi!","Pin Salah", 0);
        }
    }//GEN-LAST:event_jtpinActionPerformed

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
            java.util.logging.Logger.getLogger(atm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtpin;
    // End of variables declaration//GEN-END:variables
}
