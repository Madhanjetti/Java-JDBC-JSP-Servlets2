package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBaseDemo {
	
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","username","password");  
        }catch(Exception e){
        	System.out.println(e);
        }  
        return con;  
    }  
    public static void save(String a, int b){  
      
        try{  
            Connection con= getConnection();  
            PreparedStatement ps=con.prepareStatement("insert into employee values (?,?)");  
            ps.setString(1, a);  
            ps.setInt(2, b);
            int x = ps.executeUpdate();  
            con.close();  
        }catch(Exception ex){
        	ex.printStackTrace();
        }  
    }  
    
    
    public static void update(String a, int b){  
 
        try{  
            Connection con = getConnection();  
            //String query = "update employee set name="+"'"+a+"'"+ "where age="+b;
           // System.out.println(query);
            PreparedStatement ps=con.prepareStatement("update employee set name="+"'"+a+"'"+ "where age="+b);          
            ps.executeUpdate();  
            con.close();  
        }catch(Exception ex){
        	ex.printStackTrace();
        }  
    }  
    
    
    public static void delete(int b){  
     
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from employee where age="+b);  
            ps.executeUpdate();  
            con.close();  
        }catch(Exception e){
        	e.printStackTrace();
        }  
    } 
    
   
    public static ResultSet getAllEmployees(){  
        
        try{  
            Connection con = getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from employee");  
            ResultSet rs = ps.executeQuery(); 
            return rs;
        }catch(Exception e){
        	e.printStackTrace();
        	return null;
        }  
    }
}
