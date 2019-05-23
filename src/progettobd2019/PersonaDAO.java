/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.*;
import java.util.*;
import home.UI;

/**
 *
 * @author Gerardo
 */
public class PersonaDAO implements DAO<Persona> {

    ArrayList<Persona> per = new ArrayList<>();

    @Override
    public void insert(Persona p) throws SQLException {
        try {
            String query = "INSERT INTO persona (nomeAzienda, nome, cognome, sesso,"
                    + "titolo, foto, familiare, sitoWeb, telefono, ruolo,dataInizio) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
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
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Persona p) {
        try {
            String query = "UPDATE persona "
                    + "SET nomeAzienda=?, nome=?, cognome=?, sesso=?, titolo=?, foto=?, familiare=?,"
                    + "sitoWeb=?, telefono=?, ruolo=?, dataInizio=? "
                    + "WHERE id=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
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
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Persona p) {
        try {
            String query = "DELETE "
                    + "FROM persona "
                    + "WHERE id=? ";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, p.getId());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Persona> getAll() {
        try {
            String query = "SELECT id,nomeAzienda, nome, cognome, sesso, titolo, foto, familiare, "
                    + " sitoWeb, telefono, ruolo,dataInizio "
                    + "FROM persona as p "
                    + "ORDER BY p.nome";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            per.clear();
            while (res.next()) {
                per.add(new Persona(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getBoolean(8), res.getString(9), res.getString(10), res.getString(11), res.getDate(12)));
            }
            return per;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public List<Persona> getFamily(){
        try {
            String query = "SELECT id,nomeAzienda, nome, cognome, sesso, titolo, foto, familiare,"
                    + "sitoWeb, telefono, ruolo,dataInizio "
                    + "FROM persona as p " 
                    + "WHERE p.familiare=true "
                    + "ORDER BY p.nome";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            per.clear();
            while (res.next()) {
                per.add(new Persona(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getBoolean(8), res.getString(9), res.getString(10), res.getString(11), res.getDate(12)));
            }
            return per;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    @Override
    public void updateKey(Persona pv, Persona pn) {
    }
}
