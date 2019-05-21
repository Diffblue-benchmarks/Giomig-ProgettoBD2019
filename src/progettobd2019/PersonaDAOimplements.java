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
 * @author Gerardo
 */
public class PersonaDAOimplements implements DAO_Interface {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = "jdbc:postgresql://hostname//database";
    ArrayList<Persona> per = new ArrayList<>();

    public void insert(Persona p) throws SQLException{
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "INSERT INTO persona (nomeAzienda, nome, cognome, sesso, titolo, foto, familiare, "
                    + " sitoWeb, telefono, ruolo,dataInizio) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, p.getNomeAzienda());
            st.setString(2, p.getNome());
            st.setString(3, p.getCognome());
            st.setString(4, p.getSesso());
            st.setString(5, p.getTitolo());
            st.setString(6, p.getFoto());
            st.setBoolean(7, p.getFamiliare());
            st.setString(8, p.getSitoWeb());
            st.setString(9, p.getTelefono());
            st.setString(10, p.getRuolo());
            st.setDate(11, p.getDataInizio());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Persona p) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "UPDATE persona SET nomeAzienda=?, nome=?, cognome=?, sesso=?, titolo=?, foto=?, familiare=?, "
                    + " sitoWeb=?, telefono=?, ruolo=?,dataInizio=? WHERE id=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, p.getNomeAzienda());
            st.setString(2, p.getNome());
            st.setString(3, p.getCognome());
            st.setString(4, p.getSesso());
            st.setString(5, p.getTitolo());
            st.setString(6, p.getFoto());
            st.setBoolean(7, p.getFamiliare());
            st.setString(8, p.getSitoWeb());
            st.setString(9, p.getTelefono());
            st.setString(10, p.getRuolo());
            st.setDate(11, p.getDataInizio());
            st.setInt(12, p.getId());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(Persona p) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "DELETE FROM persona WHERE id=? ";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, p.getId());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Persona> select(Persona p) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (id,nomeAzienda, nome, cognome, sesso, titolo, foto, familiare, "
                    + " sitoWeb, telefono, ruolo,dataInizio) FROM persona";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                per.add(new Persona(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getBoolean(8), res.getString(9), res.getString(10), res.getString(11), res.getDate(12)));
            }
            con.close();
            return per;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void insert() throws SQLException {
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

    @Override
    public void insert(Object e) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
