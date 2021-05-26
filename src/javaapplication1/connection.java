/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;
/**
 *
 * @author user
 */
public  class connection {
    
    static ResultSet myRes;
    static Statement myst;
    static Connection myconnection;
    public void connectionDb(){
          try {
           
            this.myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/geotruking","root","");
        
            this.myst = myconnection.createStatement();
            
          
        
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    
    
}
