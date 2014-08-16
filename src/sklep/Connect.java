/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sklep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static sklep.log.loginField;
import static sklep.log.passwdField;

/**
 *
 * @author Ushuru
 */
public class Connect {
    static Statement stmt;
    static Connection con;
   
    
    public static int update(String sql, JTable table) throws SQLException{
        int changed = stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Dodano "+changed+" element.");
        
        return changed;
    }
    
    public static void finder(String field, JTable table){
        for(int i = 0; i < table.getRowCount(); i++){
            for(int j = 0; j < table.getColumnCount(); j++){
            if(table.getValueAt(i, j).equals(field)){
                table.addRowSelectionInterval(i, j);
            }
        }
        }
        
    }
    
     public static String findKID(String sql, JTable table) throws SQLException{
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        return Integer.toString(rs.getInt(1));
    }
     
    public static void refresh(String sql, JTable table)throws ClassNotFoundException{

        try{
            ResultSet rs = stmt.executeQuery(sql);
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            
            int colNo = rsmd.getColumnCount();
            String[] columns = new String[colNo];
            for(int i=0;i<colNo;i++){
                columns[i]=rsmd.getColumnName(i+1);
            }
            DefaultTableModel DTModel = new DefaultTableModel();
            DTModel.setColumnIdentifiers(columns);
            
            while (rs.next()){
                Object[] objects = new Object[colNo];
                for (int i = 0; i < colNo; i++){
                    objects[i] = rs.getObject(i + 1);
                }
                DTModel.addRow(objects);
                
                //stmt.close();
                //rs.close();
            }
            
            table.setModel(DTModel);
        }catch(SQLException ex){
            Logger.getLogger(Sklep.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }
 
    
    public static void connecting() throws ClassNotFoundException, SQLException{
        String login, password, url;
        
        login = loginField.getText();
        char[] passwordt = passwdField.getPassword();
        password = "";
        for (int i = 0; i<passwordt.length; i++)
        {
            password = password + passwordt[i];
        }
        url = "jdbc:oracle:thin:@localhost:1521:sklep";
        
        java.util.Properties properties = new java.util.Properties ();
        properties.setProperty("user",login);
        properties.setProperty("password", password);
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        System.out.println("Oracle JDBC Driver Registered!");
        
        Connection con = null;
        con = DriverManager.getConnection(url, properties);
        stmt = con.createStatement();
        
         if (con != null){System.out.println("You made it, take control your database now!");
                        Sklep glowneOkno = new Sklep();
                        glowneOkno.setVisible(true);
        }else {System.out.println("Failed to make connection!");
            }
    }
}
