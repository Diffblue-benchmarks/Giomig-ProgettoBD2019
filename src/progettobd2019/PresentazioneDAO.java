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

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = UI.url;
    ArrayList<Presentazione> pre = new ArrayList<>();

    @Override
    public void insert(Presentazione pre) throws SQLException {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "INSERT INTO presentazione (idPresentato, idPresentatore, idEvento) "
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pre.getIdPresentato());
            st.setInt(2, pre.getIdPresentatore());
            st.setInt(3, pre.getIdEvento());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Presentazione pre) {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "UPDATE presentazione SET idPresentato=?, idPresentatore=?, idEvento=? "
                    + "WHERE idPresentato=? AND idPresentatore=? AND idEvento=? ";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pre.getIdPresentato());
            st.setInt(2, pre.getIdPresentatore());
            st.setInt(3, pre.getIdEvento());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Presentazione pre) {

        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "DELETE FROM presentazione WHERE idPresentato=? AND idPresentatore=? AND idEvento=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pre.getIdPresentato());
            st.setInt(2, pre.getIdPresentatore());
            st.setInt(3, pre.getIdEvento());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Presentazione> getAll() {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (idPresentato,idPresentatore,idEvento) FROM  presentazione";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                pre.add(new Presentazione(res.getInt(1), res.getInt(2), res.getInt(3)));
            }
            con.close();
            return pre;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updateKey(Presentazione pv, Presentazione pn) {
    }
}
