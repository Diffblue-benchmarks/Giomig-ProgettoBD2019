/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.*;
import java.util.*;

/**
 *
 * @author vince
 */
public class lavoroPrecedenteDAOimplements implements DAO_Interface {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = "jdbc:postgresql://hostname//database";
    ArrayList<lavoroPrecedente> per = new ArrayList<>();


    public void insert(lavoroPrecedente lp) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "INSERT INTO lavoroPrecedente (idPersona, nomeAzienda, dataInizio, dataFine, ruolo) "
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, lp.getIdPersona());
            st.setString(2, lp.getNomeAzienda());
            st.setDate(3, lp.getDataInizio());
            st.setDate(4, lp.getDataFine());
            st.setString(5, lp.getRuolo());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void update(lavoroPrecedente lp) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "UPDATE lavoroPrecedente SET nomeAzienda=?, dataInizio=?, dataFine=?, ruolo=? "
                    + "WHERE id=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, lp.getNomeAzienda());
            st.setDate(2, lp.getDataInizio());
            st.setDate(3, lp.getDataFine());
            st.setString(4, lp.getRuolo());
            st.setInt(5, lp.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void delete(lavoroPrecedente lp) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "DELETE FROM lavoroPrecedente WHERE id=? ";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, lp.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public ArrayList<lavoroPrecedente> select(lavoroPrecedente lp) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (idPersona,nomeAzienda,dataInizio,dataFine,ruolo) FROM lavoroPrecedente";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                per.add(new lavoroPrecedente(res.getInt(1), res.getString(2), res.getDate(3), res.getDate(4), res.getString(5)));
            }
            con.close();
            return per;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void insert(Object e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList select() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
