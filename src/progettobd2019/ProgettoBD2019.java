/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;
import java.io.IOException;
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
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here
        Connection con = null;
        Accesso a = new Accesso();
        a = a.Accesso_utente();
        String user = a.username;
        String psw = a.psw;
        String hostname = a.hostname;
        String database = a.database;
        String url = "jdbc:postgresql://hostname/database";
        try {
            Class.forName(("org.postgresql.Driver"));
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
