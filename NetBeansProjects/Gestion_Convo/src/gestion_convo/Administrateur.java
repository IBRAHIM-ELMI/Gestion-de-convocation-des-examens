/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_convo;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;


public class Administrateur extends javax.swing.JFrame {

    /**
     * Creates new form Administrateur
     */
    public Administrateur() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        connect = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btConnecter = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        connect.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        connect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/cadena.png"))); // NOI18N
        connect.setText("CONNECTION");
        getContentPane().add(connect);
        connect.setBounds(280, 100, 330, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("  Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 220, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 270, 120, 30);

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(290, 220, 270, 30);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(290, 270, 270, 30);

        btConnecter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btConnecter.setText("Connexion");
        btConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConnecterActionPerformed(evt);
            }
        });
        getContentPane().add(btConnecter);
        btConnecter.setBounds(600, 350, 150, 37);

        message.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(message);
        message.setBounds(290, 360, 200, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/ibro2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 210, 110, 100);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestion de Convocation des Examens");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 10, 710, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/uu.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 0, 110, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/F.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 910, 60);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 10, 10);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Copyright MI3-Info juin 2015");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(310, 480, 400, 40);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/F.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 480, 910, 50);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_convo/VRAI.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 60, 910, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void btConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConnecterActionPerformed
        // TODO add your handling code here:
         message.setText("");
       String sql=" SELECT * FROM user where Login='"+login.getText()+"' and password='"+password.getText()+"'";
         try{
		
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/gestionconvo"; 
		Connection con = DriverManager.getConnection(url,"root",""); 
       
               
       
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       if(rs.next()){ 
           
             Menuform AN =new Menuform();
                 AN.setSize(927, 556);
                AN.setVisible(true);
                this.setVisible(false);
           message.setText("test reussi !!");
          
          
           
       }
       else{
           JOptionPane.showMessageDialog(null,"Mot de passe incorrect ou Login incorrect");
           login.setText("");
           password.setText("");
       }
                st.close();
		con.close();
                
       
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                        
       }
    }//GEN-LAST:event_btConnecterActionPerformed

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
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrateur A =new Administrateur();
                A.setSize(927, 556);
                A.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConnecter;
    private javax.swing.JLabel connect;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
