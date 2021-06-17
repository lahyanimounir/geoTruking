/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/*import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.dom.InputElement;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.frame.Frame;
import com.teamdev.jxbrowser.navigation.Navigation;
import com.teamdev.jxbrowser.navigation.event.FrameDocumentLoadFinished;
import com.teamdev.jxbrowser.view.swing.BrowserView;*/
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javaapplication1.Pesonne;
import javaapplication1.Ville;

/**
 *
 * @author user
 */
public class Mission extends javax.swing.JFrame {
    
    
    private String id ;
    private String isArrived ;
    private String datedepart;
    private String datearriver;
    private String nom;
     private String prenom;
     private String villedepart;
    private String villearriver;    
    
    String consomation;

    private boolean selected;
    static JFrame f;

        
      static ConfigSocket soc = new ConfigSocket();

       public void setId(String id) {
        this.id = id;
    }
       

 
      public void setisArrived(String isArrived) {
        this.isArrived = isArrived;
    }
       public void setdate_depart(String date_depart) {
        this.datedepart = datedepart;
    }
     public void setdate_arriver(String date_arriver) {
        this.datearriver = datearriver;
    }    
     public void setnom(String nom) {
        this.nom = nom;
    }    
       public void setprenom(String prenom) {
        this.prenom = prenom;
    }    
         public void setvilledepart(String villedepart) {
        this.villedepart = villedepart;
    }    
           public void setvillearriver(String villearriver) {
        this.villearriver = villearriver;
    }  

  
       
    /**
     * Creates new form acceuil
     */
    public Mission() {
        initComponents();
        jButton2.setEnabled(false);
        try {
            connection connect = new connection();
            connect.connectionDb();
          
            
            jTable.getTableHeader().setOpaque(false);
            jTable.getTableHeader().setBackground(new Color(32,136,203));
           
     
              // 0 condicteur 1 administrateur
        connect.myRes = connect.myst.executeQuery("SELECT mission.id, camion.immatriculation, persone.nom, persone.prenom, persone.login, persone.password, mission.id_conducteur, mission.date_depart, mission.date_arriver, suivi.id_camion, suivi.id_mission, mission.consommation_capter, persone.role, (SELECT ville.nom FROM ville WHERE mission.id_ville_depart = ville.id) AS ville_depart, (SELECT ville.nom FROM ville WHERE mission.id_ville_arriver = ville.id) AS ville_arriver,mission.id_ville_arriver FROM mission LEFT OUTER JOIN suivi ON (suivi.id_mission = mission.id) LEFT OUTER JOIN persone ON (mission.id_conducteur = persone.id) LEFT OUTER JOIN camion ON (camion.id = suivi.id_camion)");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("mission.id"));
                //String isArrived = String.valueOf(connect.myRes.getString("mission.isArrived"));                
                String date_depart = String.valueOf(connect.myRes.getString("mission.date_depart"));                
                String date_arriver = String.valueOf(connect.myRes.getString("mission.date_arriver"));                
                String nom = String.valueOf(connect.myRes.getString("persone.nom"));                
                String prenom = String.valueOf(connect.myRes.getString("persone.prenom"));
                String ville_depart = String.valueOf(connect.myRes.getString("ville_depart"));
                String ville_arriver = String.valueOf(connect.myRes.getString("ville_arriver"));                
                String immatriculation = String.valueOf(connect.myRes.getString("camion.immatriculation"));                
                String consommation_capter = String.valueOf(connect.myRes.getString("mission.consommation_capter"));


                

                String tbData[] = {id,date_depart,date_arriver,nom,prenom,ville_depart,ville_arriver,immatriculation,consommation_capter};
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
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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
                "Id", "Date_départ", "Date_arriver", "Nom", "Prenom", "ville_depart", "Ville_arriver", "matricule", "Consomation"
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
        jScrollPane1.setBounds(70, 130, 790, 200);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("précédent");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 20, 90, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/trush.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 350, 80, 100);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Suivre le conducteur");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(670, 80, 190, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bg3.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       Add_mission add = new Add_mission();
        
        
            double height = add.getHeight();
             double width = add.getWidth();
             Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                double widthscreen = screenSize.getWidth();               
                double heightscreen = screenSize.getHeight();

             
            
             int north =  (int)((widthscreen - width)/2);             
             int heightMiddel =  (int)((heightscreen - height)/2);

             add.setLocation(north, heightMiddel);
        
        add.setVisible(true);
        this.dispose();
            
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

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int selectedrow = jTable.getSelectedRow();
        
         this.setId(model.getValueAt(selectedrow, 0).toString());        
            
         
         jButton2.setEnabled(true);
       /* this.setdate_depart(model.getValueAt(selectedrow, 2).toString());        
        this.setdate_arriver( model.getValueAt(selectedrow,3).toString());
        this.setnom(model.getValueAt(selectedrow, 4).toString());        
        this.setprenom( model.getValueAt(selectedrow,5).toString());
        this.setvilledepart(model.getValueAt(selectedrow, 6).toString());        
        this.setvillearriver( model.getValueAt(selectedrow,7).toString());*/
        
        this.selected = true;
       
            
        
     
    }//GEN-LAST:event_jTableMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         try {
                 connection connect = new connection();
                    connect.connectionDb();
                    
                    
                    System.out.println(this.id);
                    String sql = "DELETE FROM `mission` WHERE `id`= ?";
 
                    PreparedStatement statement = connect.myconnection.prepareStatement(sql);
                    statement.setString(1, this.id);                      
                    

                    int rowsInserted = statement.executeUpdate();
                 
                      DefaultTableModel dm = (DefaultTableModel) this.jTable.getModel();
                      int rowCount = dm.getRowCount();
                      //Remove rows one by one from the end of the table
                      for (int i = rowCount - 1; i >= 0; i--) {
                          dm.removeRow(i);
                      }
                        connect.myRes = connect.myst.executeQuery("SELECT mission.id, camion.immatriculation, persone.nom, persone.prenom, persone.login, persone.password, mission.id_conducteur, mission.date_depart, mission.date_arriver, suivi.id_camion, suivi.id_mission, mission.consommation_capter, persone.role, (SELECT ville.nom FROM ville WHERE mission.id_ville_depart = ville.id) AS ville_depart, (SELECT ville.nom FROM ville WHERE mission.id_ville_arriver = ville.id) AS ville_arriver,mission.id_ville_arriver FROM mission LEFT OUTER JOIN suivi ON (suivi.id_mission = mission.id) LEFT OUTER JOIN persone ON (mission.id_conducteur = persone.id) LEFT OUTER JOIN camion ON (camion.id = suivi.id_camion)");
            while(connect.myRes.next()){
                String id = String.valueOf(connect.myRes.getString("mission.id"));
               // String isArrived = String.valueOf(connect.myRes.getString("mission.isArrived"));                
                String date_depart = String.valueOf(connect.myRes.getString("mission.date_depart"));                
                String date_arriver = String.valueOf(connect.myRes.getString("mission.date_arriver"));                
                String nom = String.valueOf(connect.myRes.getString("persone.nom"));                
                String prenom = String.valueOf(connect.myRes.getString("persone.prenom"));
                String ville_depart = String.valueOf(connect.myRes.getString("ville_depart"));
                String ville_arriver = String.valueOf(connect.myRes.getString("ville_arriver"));                
                String immatriculation = String.valueOf(connect.myRes.getString("camion.immatriculation"));                
                String consommation_capter = String.valueOf(connect.myRes.getString("mission.consommation_capter"));


                

                String tbData[] = {id,date_depart,date_arriver,nom,prenom,ville_depart,ville_arriver,immatriculation,consommation_capter};
                System.out.println(tbData);
                DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
                tblModel.addRow(tbData);
            }   
                       } catch (SQLException ex) {
                Logger.getLogger(Update_mission1.class.getName()).log(Level.SEVERE, null, ex);
            }    
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

/*
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        

        String consult = null;
        try {
            consult = soc.getSocket("getLocalisation");
       
      
         String lat  = consult.split(",")[0];        
         String lon = consult.split(",")[1];   
        // String lat = "35.757628";
         // String lon = "-5.837260";
         String consomation = consult.split(",")[2];
          
         
         
         updateConsomation(consomation);
         
         
         
         
         System.out.println(lat);         
         System.out.println(lon);


        // TODO add your handling code here:
        // Initialize Chromium.
        JButton button = new JButton("Test Button");
        Engine engine = Engine.newInstance(
                EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                        .licenseKey("6P830J66YB5V28GJ1XVTI3OY4A5QTIPYDTRXV6OVKJWD0GV4TIVLIHIAZC8BTZIQ6MAY")
                        .build());
// Create a Browser instance.
        Browser browser = engine.newBrowser();

        Navigation navigation = browser.navigation();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JxBrowser AWT/Swing");
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    // Shutdown Chromium and release allocated resources.
                    engine.close();
                }

            });
          
            // Create and embed Swing BrowserView component to display web content.
            frame.add(BrowserView.newInstance(browser));
            frame.setSize(900, 800);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            navigation.loadUrl("E:\\geoTruking\\tt.html");
            navigation.on(FrameDocumentLoadFinished.class, event -> {
                Frame frameb = event.frame();
              
                frameb.document().ifPresent(document -> {
                    
                    
                    
                     document.documentElement().ifPresent(documentElement ->{
                          
                         //System.out.println(documentElement.findElementsByCssSelector("#firstname"));
                        
                        /*  documentElement.findElementsByCssSelector("#lat").forEach(element -> {
                                System.out.println(element.attributeValue("value"));
                         });*/
                  /*
                         documentElement.findElementById("lat").ifPresent(element ->
                                ((InputElement) element).value(lat));
                         
                         documentElement.findElementById("lon").ifPresent(element ->
                                ((InputElement) element).value(lon));
                       
                     });
                });
            });
            //browser.navigation().loadUrl("C:\\Users\\user\\Desktop\\angularProject\\jenkis.html");

            // Load the required web page.
        });
       // this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Mission.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked
    */
    private void updateConsomation(String consomation){
    
        

    /**
     * @param args the command line arguments
     */
         try {
                 connection connect = new connection();
                    connect.connectionDb();
                    
                    String sql = "UPDATE `mission` SET `consommation_capter`=? WHERE `id`=?";
 
                    PreparedStatement statement = connect.myconnection.prepareStatement(sql);
                    statement.setString(1, consomation);                    
                    statement.setString(2, this.id);                    
                    

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                                  DefaultTableModel dm = (DefaultTableModel) this.jTable.getModel();
                      int rowCount = dm.getRowCount();
                      //Remove rows one by one from the end of the table
                      for (int i = rowCount - 1; i >= 0; i--) {
                          dm.removeRow(i);
                      }
                        connect.myRes = connect.myst.executeQuery("SELECT mission.id, camion.immatriculation, persone.nom, persone.prenom, persone.login, persone.password, mission.id_conducteur, mission.date_depart, mission.date_arriver, suivi.id_camion, suivi.id_mission, mission.consommation_capter, persone.role, (SELECT ville.nom FROM ville WHERE mission.id_ville_depart = ville.id) AS ville_depart, (SELECT ville.nom FROM ville WHERE mission.id_ville_arriver = ville.id) AS ville_arriver,mission.id_ville_arriver FROM mission LEFT OUTER JOIN suivi ON (suivi.id_mission = mission.id) LEFT OUTER JOIN persone ON (mission.id_conducteur = persone.id) LEFT OUTER JOIN camion ON (camion.id = suivi.id_camion)");
                            while(connect.myRes.next()){
                                String id = String.valueOf(connect.myRes.getString("mission.id"));
                                //String isArrived = String.valueOf(connect.myRes.getString("mission.isArrived"));                
                                String date_depart = String.valueOf(connect.myRes.getString("mission.date_depart"));                
                                String date_arriver = String.valueOf(connect.myRes.getString("mission.date_arriver"));                
                                String nom = String.valueOf(connect.myRes.getString("persone.nom"));                
                                String prenom = String.valueOf(connect.myRes.getString("persone.prenom"));
                                String ville_depart = String.valueOf(connect.myRes.getString("ville_depart"));
                                String ville_arriver = String.valueOf(connect.myRes.getString("ville_arriver"));                
                                String immatriculation = String.valueOf(connect.myRes.getString("camion.immatriculation"));                
                                String consommation_capter = String.valueOf(connect.myRes.getString("mission.consommation_capter"));




                                String tbData[] = {id,date_depart,date_arriver,nom,prenom,ville_depart,ville_arriver,immatriculation,consommation_capter};
                                System.out.println(tbData);
                                DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();
                                tblModel.addRow(tbData);
                    }
            
              
                            /*  } catch (SQLException ex) {
                            Logger.getLogger(Update_ville.class.getName()).log(Level.SEVERE, null, ex);
                            }*/
                    }
    }   catch (SQLException ex) {
            Logger.getLogger(Mission.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
