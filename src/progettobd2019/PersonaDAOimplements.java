/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.*;
import java.util.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerardo
 */
public class PersonaDAOimplements implements PersonaDAO {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = "jdbc:postgresql://hostname//database";
    ArrayList<Persona> per = new ArrayList<>(); 

    @Override
    public void insertPersona(Persona p) {
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

    @Override
    public void updatePersona(Persona p) {
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

    @Override
    public void deletePersona(Persona p) {
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

    @Override
    public ArrayList<Persona> selectPersona(Persona p) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (nomeAzienda, nome, cognome, sesso, titolo, foto, familiare, "
                    + " sitoWeb, telefono, ruolo,dataInizio) FROM persona";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                per.add(new Persona(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getBoolean(7),res.getString(8),res.getString(9),res.getString(10),res.getDate(11)));
            }
            con.close();
            return per;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
