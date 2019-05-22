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
 * @author vince
 */
public class CellulareDAO implements DAO<Cellulare> {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = "jdbc:postgresql://hostname//database";
    ArrayList<Cellulare> ce = new ArrayList<>();

    @Override
    public void insert(Cellulare c) throws SQLException {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "INSERT INTO cellulare (numero, idPersona)"
                    + "VALUES(?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, c.getNumero());
            st.setInt(2, c.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Cellulare c) {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "UPDATE cellulare SET numero=? WHERE idPersona=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, c.getNumero());
            st.setInt(2, c.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Cellulare c) {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "DELETE FROM cellulare WHERE idPersona=? ";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, c.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Cellulare> getAll() {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (numero, idPersona) FROM cellulare";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                ce.add(new Cellulare(res.getString(1), res.getInt(2)));
            }
            con.close();
            return ce;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updateKey(Cellulare cv, Cellulare cn) {
    }
}
