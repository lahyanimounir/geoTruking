/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Add_conducteur extends javax.swing.JFrame {

    
        static JFrame f;
    /**
     * Creates new form acceuil
     */
    public Add_conducteur() {
        initComponents();
        try {
            connection connect = new connection();
            connect.connectionDb();
          
            connect.myRes = connect.myst.executeQuery("select * from persone where `role` = 0");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String nom = String.valueOf(connect.myRes.getString("nom"));                
                String prenom = String.valueOf(connect.myRes.getString("prenom"));                
                String login = String.valueOf(connect.myRes.getString("login"));                
                String password = String.valueOf(connect.myRes.getString("password"));
                String roleToShow = "Conducteur";
                



                
                String tbData[] = {id,nom,prenom,login,password,roleToShow};

            }
             } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        con_name = new javax.swing.JTextField();
        addcity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        con_pre = new javax.swing.JTextField();
        con_cin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Nom");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 80, 34, 14);

        con_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_nameActionPerformed(evt);
            }
        });
        jPanel2.add(con_name);
        con_name.setBounds(130, 70, 160, 30);

        addcity.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        addcity.setText("Ajouter");
        addcity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addcityMouseClicked(evt);
            }
        });
        jPanel2.add(addcity);
        addcity.setBounds(180, 260, 110, 27);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("pr??c??dent");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 80, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Pr??nom");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 130, 50, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Cin");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 180, 60, 30);

        con_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                con_preActionPerformed(evt);
            }
        });
        jPanel2.add(con_pre);
        con_pre.setBounds(130, 120, 160, 30);
        jPanel2.add(con_cin);
        con_cin.setBounds(130, 180, 160, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bg3.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setFocusable(false);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 590, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        Pesonne P = new Pesonne();
        double height = P.getHeight();
             double width = P.getWidth();
             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                double widthscreen = screenSize.getWidth();               
                double heightscreen = screenSize.getHeight();

             
            
             int north =  (int)((widthscreen - width)/2);             
             int heightMiddel =  (int)((heightscreen - height)/2);

             P.setLocation(north, heightMiddel);
        
        P.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void addcityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addcityMouseClicked

        // TODO add your handling code here:
        
      
            try {
                 connection connect = new connection();
                    connect.connectionDb();
                    String sql = "INSERT INTO `persone`(`nom`, `prenom`, `cin`,`role`) VALUES (?,?,?,0)";
 
                    PreparedStatement statement = connect.myconnection.prepareStatement(sql);
                    statement.setString(1, con_name.getText());
                    statement.setString(2, con_pre.getText());
                    statement.setString(3, con_cin.getText());
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        Pesonne p = new Pesonne();
                        double height = p.getHeight();
                             double width = p.getWidth();
                             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                                double widthscreen = screenSize.getWidth();               
                                double heightscreen = screenSize.getHeight();



                             int north =  (int)((widthscreen - width)/2);             
                             int heightMiddel =  (int)((heightscreen - height)/2);

                             p.setLocation(north, heightMiddel);

                        p.setVisible(true);
                        this.dispose();
                    }
            
              
            } catch (SQLException ex) {
                Logger.getLogger(Add_conducteur.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_addcityMouseClicked

    private void con_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_nameActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_con_nameActionPerformed

    private void con_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_con_preActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_con_preActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcity;
    private javax.swing.JTextField con_cin;
    private javax.swing.JTextField con_name;
    private javax.swing.JTextField con_pre;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
