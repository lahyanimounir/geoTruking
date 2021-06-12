/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.Camion;
import javaapplication1.connection;
import javax.swing.JFrame;

/**
 *
 * @author Pc
 */
public class Add_camion extends javax.swing.JFrame {
              static JFrame f;
    /**
     * Creates new form Add_camion1
     */
    public Add_camion() {
        initComponents();
         try {
            connection connect = new connection();
            connect.connectionDb();
           
              
        connect.myRes = connect.myst.executeQuery("select * from camion");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String immatriculation = String.valueOf(connect.myRes.getString("immatriculation"));
                
                String tbData[] = {id,immatriculation};
           
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Matricule = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Précédent");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 20);

        jLabel3.setText("Matricule");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 60, 14);

        Matricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatriculeActionPerformed(evt);
            }
        });
        jPanel1.add(Matricule);
        Matricule.setBounds(120, 90, 210, 30);

        jButton1.setText("Ajouter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 170, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bg3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatriculeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
         try {
                 connection connect = new connection();
                    connect.connectionDb();
                    String sql = "INSERT INTO `camion`(`immatriculation`) VALUES (?)";
 
                    PreparedStatement statement = connect.myconnection.prepareStatement(sql);
                    statement.setString(1, Matricule.getText());
                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        Camion camion = new Camion();
                        double height = camion.getHeight();
                             double width = camion.getWidth();
                             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                                double widthscreen = screenSize.getWidth();               
                                double heightscreen = screenSize.getHeight();



                             int north =  (int)((widthscreen - width)/2);             
                             int heightMiddel =  (int)((heightscreen - height)/2);

                             camion.setLocation(north, heightMiddel);

                        camion.setVisible(true);
                        this.dispose();
                    }
            
              
            } catch (SQLException ex) {
                Logger.getLogger(Add_camion.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
          Camion camion = new Camion();
        double height = camion.getHeight();
             double width = camion.getWidth();
             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                double widthscreen = screenSize.getWidth();               
                double heightscreen = screenSize.getHeight();

             
            
             int north =  (int)((widthscreen - width)/2);             
             int heightMiddel =  (int)((heightscreen - height)/2);

             camion.setLocation(north, heightMiddel);
        
        camion.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Matricule;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
