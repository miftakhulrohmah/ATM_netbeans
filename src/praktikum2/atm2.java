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
public class atm2 extends javax.swing.JFrame {
String str, str1;
int saldo;
int choice,z,pin=1234,counter=0,a=3; 
int t,s,tab=1000000;
    /**
     * Creates new form atm2
     */
    public atm2() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Anjungan Tunai Mandiri");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 10, 320, 40);

        jButton1.setText("Transfer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 250, 90, 23);

        jButton2.setText("Cek Saldo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 190, 90, 23);

        jButton3.setText("Setor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 70, 90, 23);

        jButton4.setText("Tarik");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(150, 130, 90, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\44f3ed6f2d1f2a6a3fe82ee58a045134.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, 0, 410, 300);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
  JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab); //informasi saldo                    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
  str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran: " ); //menabung   
  s = Integer.parseInt(str1);   
  setor hasil = new setor();   
  hasil.setor(tab, s);   
  tab =hasil.getSaldo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " );
t = Integer.parseInt(str1);   
tarik mengambil = new tarik();   
mengambil.ambil(tab,t);   
tab =mengambil.getSaldo(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah uang yang akan ditransfer : ");
t = Integer.parseInt(str1);
transfer mengirim = new transfer();
mengirim.kirim(tab,t);
tab = mengirim.getSaldo();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atm2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atm2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private static class setor {
             private int saldo;
    public void setor (int bal, int s){
        if(s%100!=0)
            JOptionPane.showMessageDialog(null,
        "Mesin ATM BRI tidak menerima koin. Silakan ulangi!","Transaksi gagal",0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai Rp. 50000","ERROR",0);
        else if(s>=50000)
            saldo = bal+s;
        JOptionPane.showMessageDialog(null,"Saldo Anda sebesar: " +saldo);
    }
    public int getSaldo(){
    return saldo;
}
        }

    private static class tarik {
            private int saldo;
        public void ambil(int tab, int t){
            if(t%100!=0)
                JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima Anda","Transaksi gagal",0);
            else{
                if (t>tab)
                    JOptionPane.showMessageDialog(null, "Saldo minimal wajib Rp 50000,00. Segera lakukan penyetoran untuk menghindari blokir","CAUTION",2);
                else
                    saldo = tab-t;
                    JOptionPane.showMessageDialog(null,"Saldo Anda sebesar: " +saldo);
            }
        }
public int getSaldo(){
     return saldo;
    } 
        }

    private static class transfer {
            private int saldo;
        public void kirim (int tab, int t){
            if(t%100!=0)
                JOptionPane.showMessageDialog(null, "Jumlah minimal transfer Rp. 50.000,00","Transaksi gagal",0);
            else{
                if (t<tab)
                    saldo = tab-t;
                    JOptionPane.showMessageDialog(null,"Saldo Anda sebesar: " +saldo);
        }
   }
public int getSaldo(){
     return saldo;
    }
   }
}