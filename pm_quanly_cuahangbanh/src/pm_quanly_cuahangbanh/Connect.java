/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm_quanly_cuahangbanh;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.ByteArrayInputStream;
import java.util.Base64;
/**
 *
 * @author lyhoa
 */
public class Connect {
    public Connection getConnection(){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=quanlybanhang_cuahangbanhngot;user=sa;password=12345");
            if (conn != null){
            }
        }catch(Exception ex){
            System.out.print(ex.toString());
        } 
       return conn;
    }
    
    
}
