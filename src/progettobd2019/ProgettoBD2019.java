/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;
import java.util.*;
import java.sql.*;
/**
 *
 * @author giomig
 */
public class ProgettoBD2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Connection con=null;
        String url= "jdbc:postgresql://localhost/progetto";
        String user="unisa";
        String psw="06127";
        
        try{
          Class.forName(("org.postgresql.Driver"));
        }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());}
        try{
            con=DriverManager.getConnection(url, user, psw);
           
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        
        
    }
    
    //public static ArrayList<Persona> Operazione3(Connection con){
     
        
        
    //}
}
