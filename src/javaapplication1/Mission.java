/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class Mission extends javax.swing.JFrame {
    
    
        
    //private boolean selected;
    static JFrame f;
        
        
   
  
       
    /**
     * Creates new form acceuil
     */
    public Mission() {
        initComponents();
        try {
            connection connect = new connection();
            connect.connectionDb();
          
            
            jTable.getTableHeader().setOpaque(false);
            jTable.getTableHeader().setBackground(new Color(32,136,203));
           
     
              // 0 condicteur 1 administrateur
        connect.myRes = connect.myst.executeQuery("select id,isArrived,date_depart,date_arriver,id_conducteur,id_ville_depart, id_ville_arriver from mission ");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String isArrived = String.valueOf(connect.myRes.getString("isArrived"));                
                String date_depart = String.valueOf(connect.myRes.getString("date_depart"));                
                String date_arriver = String.valueOf(connect.myRes.getString("date_arriver"));                
                String id_conducteur = String.valueOf(connect.myRes.getString("id_conducteur"));
                String id_ville_depart = String.valueOf(connect.myRes.getString("id_ville_depart"));
                String id_ville_arriver = String.valueOf(connect.myRes.getString("id_ville_arriver"));
                
                String tbData[] = {id,isArrived,date_depart,date_arriver,id_conducteur,id_ville_depart,id_ville_arriver};
                System.out.println(tbData);
                DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
                tblModel.addRow(tbData);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bg3.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jButton1.setText("Ajouter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(70, 80, 69, 23);

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "is-Arrived", "Date_départ", "Date_arriver", "Id_Conducteur", "ville_depart", "Ville_arriver"
            }
        ));
        jTable.setFocusable(false);
        jTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable.setOpaque(false);
        jTable.setRowHeight(30);
        jTable.setSelectionBackground(new java.awt.Color(116, 192, 238));
        jTable.setShowVerticalLines(false);
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(70, 130, 570, 200);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("précédent");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 20, 90, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/update.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 380, 70, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/trush.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(500, 380, 80, 100);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Suivre le conducteur");
        jPanel2.add(jButton2);
        jButton2.setBounds(700, 133, 180, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("consommation capter");
        jPanel2.add(jButton3);
        jButton3.setBounds(700, 200, 190, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       
            
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         acceuil a = new acceuil();
        
        
            double height = a.getHeight();
             double width = a.getWidth();
             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                double widthscreen = screenSize.getWidth();               
                double heightscreen = screenSize.getHeight();

             
            
             int north =  (int)((widthscreen - width)/2);             
             int heightMiddel =  (int)((heightscreen - height)/2);

             a.setLocation(north, heightMiddel);
        
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        
       
            
        
     
    }//GEN-LAST:event_jTableMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
