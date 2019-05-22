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
public class EmailDAO implements DAO<Email> {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = UI.url;
    ArrayList<Email> ema = new ArrayList<>();

    @Override
    public void insert(Email em) throws SQLException {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "INSERT INTO email (indirizzoEmail, idPersona)"
                    + "VALUES(?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, em.getIndirizzoEmail());
            st.setInt(2, em.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Email em) {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "UPDATE email SET indirizzoEmail=? WHERE idPersona=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, em.getIndirizzoEmail());
            st.setInt(2, em.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Email em) {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "DELETE FROM email WHERE idPersona=? ";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, em.getIdPersona());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Email> getAll() {
        try {
            Class.forName(UI.driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (indirizzoEmail, idPersona) FROM email";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                ema.add(new Email(res.getString(1), res.getInt(2)));
            }
            con.close();
            return ema;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updateKey(Email ev, Email en) {
    }
}
