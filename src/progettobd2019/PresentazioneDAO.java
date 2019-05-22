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
 * @author Gerardo
 */
public class PresentazioneDAO implements DAO<Presentazione> {

    ArrayList<Presentazione> presentatori = new ArrayList<>();

    @Override
    public void insert(Presentazione pre) throws SQLException {
        try {
            String query = "INSERT INTO presentazione (idPresentato, idPresentatore, idEvento) "
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, pre.getIdPresentato());
            st.setInt(2, pre.getIdPresentatore());
            st.setInt(3, pre.getIdEvento());
            st.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateKey(Presentazione pv, Presentazione pn) {
        try {
            String query = "UPDATE presentazione SET idPresentato=?, idPresentatore=?, idEvento=? "
                    + "WHERE idPresentato=? AND idPresentatore=? AND idEvento=? ";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, pn.getIdPresentato());
            st.setInt(2, pn.getIdPresentatore());
            st.setInt(3, pn.getIdEvento());
            st.setInt(4, pv.getIdPresentato());
            st.setInt(5, pv.getIdPresentatore());
            st.setInt(6, pv.getIdEvento());
            st.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Presentazione pre) {

        try {
            String query = "DELETE FROM presentazione WHERE idPresentato=? AND idPresentatore=? AND idEvento=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, pre.getIdPresentato());
            st.setInt(2, pre.getIdPresentatore());
            st.setInt(3, pre.getIdEvento());
            st.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Presentazione> getAll() {
        try {
            String query = "SELECT (idPresentato,idPresentatore,idEvento) FROM  presentazione";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                presentatori.add(new Presentazione(res.getInt(1), res.getInt(2), res.getInt(3)));
            }

            return presentatori;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void update(Presentazione per) {
    }
}
