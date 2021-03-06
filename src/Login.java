

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MNArifin
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel2 = new javax.swing.JLabel();
        etUsername = new javax.swing.JTextField();
        etPassword = new javax.swing.JTextField();
        bExit = new javax.swing.JButton();
        bSignIn = new javax.swing.JButton();
        bSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 130, 70, 30);

        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 50, 70, 30);

        etUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(etUsername);
        etUsername.setBounds(120, 90, 140, 30);

        etPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(etPassword);
        etPassword.setBounds(120, 170, 140, 30);

        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        getContentPane().add(bExit);
        bExit.setBounds(150, 223, 80, 40);

        bSignIn.setText("Sign In");
        bSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignInActionPerformed(evt);
            }
        });
        getContentPane().add(bSignIn);
        bSignIn.setBounds(260, 220, 80, 40);

        bSignUp.setText("Sign Up");
        bSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(bSignUp);
        bSignUp.setBounds(40, 223, 80, 40);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void etUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etUsernameActionPerformed

    private void etPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etPasswordActionPerformed

    private void bSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignUpActionPerformed
        // TODO add your handling code here:
        String username = etUsername.getText();
        String password = etPassword.getText();
        
        try 
        {
            try (Statement statement = (Statement) file_koneksi.GetConnection().createStatement())
            {
                statement.executeUpdate("insert into tb_akun(username, password) VALUES('"+username+"','"+password+"')");
            }
            JOptionPane.showMessageDialog(null, "Selamat! anda berhasil sigh Up!");
        }
        catch (Exception t)
        {
            JOptionPane.showMessageDialog(null, "Mohon maaf, ulangi lagi prosedur");
        }
    }//GEN-LAST:event_bSignUpActionPerformed

    private void bSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignInActionPerformed
        // TODO add your handling code here:
        Connection connection;
        PreparedStatement ps;
        try 
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testkoneksi?zeroDateTimeBehavior=convertToNull", "root" , "");
            ps = connection.prepareStatement("SELECT username, password FROM tb_akun WHERE username = ? AND password = ?");
            ps.setString(1, etUsername.getText());
            ps.setString(2, etPassword.getText());
            ResultSet result = ps.executeQuery();
            if(result.next())
            {
                new Home().show();
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Salah!");
                etPassword.setText("");
                etUsername.requestFocus();
            }
        } 
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_bSignInActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bExitActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExit;
    private javax.swing.JButton bSignIn;
    private javax.swing.JButton bSignUp;
    private javax.swing.JTextField etPassword;
    private javax.swing.JTextField etUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
