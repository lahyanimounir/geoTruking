/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Add_mission extends javax.swing.JFrame {

    /**
     * Creates new form Add_mission
     */
    public Add_mission() {
        initComponents();
        
        
         try {
            connection connect = new connection();
            connect.connectionDb();
          
            
              
        connect.myRes = connect.myst.executeQuery("select * from persone where role = 0");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String nom = String.valueOf(connect.myRes.getString("nom"));
                
                conducteur.addItem(id+","+nom);
                
            }
             } catch (SQLException e) {
            System.out.println(e);
        }
         
         
         
         
           try {
            connection connect = new connection();
            connect.connectionDb();
          
            
              
        connect.myRes = connect.myst.executeQuery("select * from ville");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String nom = String.valueOf(connect.myRes.getString("nom"));
                
                ville_depart.addItem(id+","+nom);
                
            }
             } catch (SQLException e) {
            System.out.println(e);
        }
           
              try {
            connection connect = new connection();
            connect.connectionDb();
          
            
              
        connect.myRes = connect.myst.executeQuery("select * from ville");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String nom = String.valueOf(connect.myRes.getString("nom"));
                
                ville_arriver.addItem(id+","+nom);
                
            }
             } catch (SQLException e) {
            System.out.println(e);
        }
       try {
            connection connect = new connection();
            connect.connectionDb();
          
            
              
        connect.myRes = connect.myst.executeQuery("select * from camion ");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("id"));
                String immatriculation = String.valueOf(connect.myRes.getString("immatriculation"));
                
                camion_s.addItem(id+","+immatriculation);
                
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date_depart = new javax.swing.JTextField();
        date_arriver = new javax.swing.JTextField();
        conducteur = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ville_depart = new javax.swing.JComboBox<>();
        ville_arriver = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        camion_s = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("précédent");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setText("Conducteur");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 330, 70, 20);

        jLabel3.setText("Date départ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 90, 70, 20);

        jLabel4.setText("Date Arriver");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 140, 70, 20);

        jLabel5.setText("Ville départ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 200, 70, 20);

        jLabel6.setText("Ville arriver");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 260, 70, 20);
        jPanel1.add(date_depart);
        date_depart.setBounds(220, 90, 350, 30);
        jPanel1.add(date_arriver);
        date_arriver.setBounds(220, 140, 350, 30);

        jPanel1.add(conducteur);
        conducteur.setBounds(220, 320, 350, 30);

        jLabel8.setText("Précedent");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 20, 70, 30);

        jButton1.setText("Ajouter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(490, 460, 73, 23);

        jPanel1.add(ville_depart);
        ville_depart.setBounds(220, 200, 350, 30);

        jPanel1.add(ville_arriver);
        ville_arriver.setBounds(220, 260, 350, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Camion");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(120, 380, 50, 14);

        camion_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camion_sActionPerformed(evt);
            }
        });
        jPanel1.add(camion_s);
        camion_s.setBounds(220, 370, 350, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bg3.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
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
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
              Mission mission = new Mission();
        double height = mission.getHeight();
             double width = mission.getWidth();
             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                double widthscreen = screenSize.getWidth();               
                double heightscreen = screenSize.getHeight();

             
            
             int north =  (int)((widthscreen - width)/2);             
             int heightMiddel =  (int)((heightscreen - height)/2);

             mission.setLocation(north, heightMiddel);
        
        mission.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String ville_arriver_s = ville_arriver.getSelectedItem().toString();        
        String ville_depart_s = ville_depart.getSelectedItem().toString();        
        String conducteur_s = conducteur.getSelectedItem().toString();        
        String date_depart_s = date_depart.getText().toString();        
        String date_arriver_s = date_arriver.getText().toString();
        String  mat = camion_s.getSelectedItem().toString();
        
            //conducteur_s.split(",")[0]
            try {
                 connection connect = new connection();
                    connect.connectionDb();
String sql = "INSERT INTO `mission`(`date_depart`,`date_arriver`,`id_conducteur`,`id_ville_depart`,`id_ville_arriver`) VALUES (?,?,?,?,?)";
    System.out.println(sql);    
    System.out.println(conducteur_s);
    System.out.println(date_depart_s);    
    System.out.println(date_arriver_s);
    System.out.println(mat);

                    PreparedStatement statement = connect.myconnection.prepareStatement(sql);
                     statement.setString(1, date_depart_s);
                    statement.setString(2, date_arriver_s);
                    statement.setString(3, conducteur_s.split(",")[0]);
                    statement.setString(4, ville_depart_s.split(",")[0]);       
                    statement.setString(5, ville_arriver_s.split(",")[0]);
                    
                    int rowsInserted = statement.executeUpdate();
                  
                   
                
                    if (rowsInserted > 0) {
                        this.insert_suivi(mat.split(",")[0]);
                        
                        Mission mission = new Mission();
                        double height = mission.getHeight();
                             double width = mission.getWidth();
                             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                                double widthscreen = screenSize.getWidth();               
                                double heightscreen = screenSize.getHeight();



                             int north =  (int)((widthscreen - width)/2);             
                             int heightMiddel =  (int)((heightscreen - height)/2);

                             mission.setLocation(north, heightMiddel);

                        mission.setVisible(true);
                        this.dispose();
                    }
            
              
            } catch (SQLException ex) {
                Logger.getLogger(Add_mission.class.getName()).log(Level.SEVERE, null, ex);
            }

        
    }//GEN-LAST:event_jButton1MouseClicked
private void insert_suivi(String id_camion){
   System.out.println("dkhoul"+id_camion);    
    String id_mission = null;
 try {   connection connect = new connection();
            connect.connectionDb();
             

        connect.myRes = connect.myst.executeQuery("SELECT MAX(id) AS id FROM mission");
             while(connect.myRes.next()){
                 id_mission= String.valueOf(connect.myRes.getString("id"));
               
            }
               System.out.print("l3boo 3lih"+id_mission);    
         String sql="INSERT INTO `suivi`(`id_camion`, `id_mission`) VALUES (?,?)";
         System.out.println(sql);
         PreparedStatement statement = connect.myconnection.prepareStatement(sql);
                  statement.setString(1, id_camion);
                    statement.setString(2, id_mission);
                 int rowsInserted = statement.executeUpdate();
             } catch (SQLException e) {
            System.out.println(e);
        }  


}
    
    
    
    
    private void camion_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camion_sActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camion_sActionPerformed

    /**
     * @param args the command line arguments
     */
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> camion_s;
    private javax.swing.JComboBox<String> conducteur;
    private javax.swing.JTextField date_arriver;
    private javax.swing.JTextField date_depart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> ville_arriver;
    private javax.swing.JComboBox<String> ville_depart;
    // End of variables declaration//GEN-END:variables
}
