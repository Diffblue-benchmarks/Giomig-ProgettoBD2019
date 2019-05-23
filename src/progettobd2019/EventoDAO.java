/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import home.UI;
import java.sql.*;
import java.util.*;

/**
 *
 * @author vince
 */
public class EventoDAO implements DAO<Evento> {

    ArrayList<Evento> event = new ArrayList<>();

    @Override
    public void insert(Evento eve) throws SQLException {
        try {
            String query = "INSERT INTO evento (id, capCitta, tipo, data, descrizione) "
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, eve.getId());
            st.setString(2, eve.getCapCitta());
            st.setString(3, eve.getTipo());
            st.setDate(4, eve.getData());
            st.setString(5, eve.getDescrizione());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Evento eve) {
        try {
            String query = "UPDATE evento "
                    + "SET capCitta=?, tipo=?, data=?, descrizione=? "
                    + "WHERE id=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, eve.getCapCitta());
            st.setString(2, eve.getTipo());
            st.setDate(3, eve.getData());
            st.setString(4, eve.getDescrizione());
            st.setInt(5, eve.getId());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Evento eve) {
        try {
            String query = "DELETE "
                    + "FROM evento "
                    + "WHERE id=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, eve.getId());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Evento> getAll() {
        try {
            String query = "SELECT id, capCitta, tipo, data, descrizione "
                    + "FROM evento";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                event.add(new Evento(res.getInt(1), res.getString(2), res.getString(3), res.getDate(4), res.getString(5)));
            }
            return event;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updateKey(Evento evev, Evento even) {
    }
}
