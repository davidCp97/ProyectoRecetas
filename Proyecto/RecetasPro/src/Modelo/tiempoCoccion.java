package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.Scanner;


public class tiempoCoccion {
   
    static Connection con;
    static Statement st;
    static PreparedStatement pst;
    static PreparedStatement pst2;
    static ResultSet rs;
    static ResultSet rs2;

public static void main(String[] args)throws SQLException{
Scanner input = new Scanner(System.in);

          int tC=0, op=0;
         System.out.println(tiempoCocc(tC));
         System.out.println(nombreReceta("Arroz Hindú"));
          
   
    }
    
    public static String tiempoCocc(int t){
          String a = "";
       Scanner input = new Scanner(System.in);
          try{

            String dbURL = "jdbc:ucanaccess://E:\\Nueva carpeta/Rest1.accdb";
            String username = "";
            String password = "";
           
            con = DriverManager.getConnection(dbURL, username, password);
            String query = "SELECT * FROM Receta WHERE tiempo = '"+t+"'";
            pst = con.prepareStatement(query);
            rs = null;
            
            try{
                rs = pst.executeQuery();
                while(rs.next())
                {
                    System.out.println(rs.getString("nombre"));
                    a+=rs.getString("nombre")+"\n";    
                }
                
            }catch(SQLException sql){}
            pst.close();
            con.close();
            
        }
        catch(SQLException e)
        {}
return a;
    }
    
    public static String nombreReceta(String q){

        Scanner input = new Scanner(System.in);
        String m="";
          try{

            String dbURL = "jdbc:ucanaccess://E:\\Nueva carpeta/Rest1.accdb";
            String username = "";
            String password = "";
   
            
            con = DriverManager.getConnection(dbURL, username, password);
            String query = "SELECT nombre FROM Receta WHERE  nombre like \""+q+"*\";";
            
            pst = con.prepareStatement(query);
            rs = null;
            rs2 = null;
         
            try{
                rs = pst.executeQuery();
                
                while(rs.next())
                {

                    m+=rs.getString("nombre")+"\n";
                }

                 
               
            }catch(SQLException sql){}
            pst.close();
        
            con.close();
             
        }
        catch(SQLException e)
        {}
          return m;
    }
    
    
   
}
