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

    ArrayList<Email> ema = new ArrayList<>();

    @Override
    public void insert(Email em) throws SQLException {
        try {
            String query = "INSERT INTO email (indirizzoEmail, idPersona)"
                    + "VALUES(?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, em.getIndirizzoEmail());
            st.setInt(2, em.getIdPersona());
            st.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Email em) {
        try {
            String query = "UPDATE email SET indirizzoEmail=? WHERE idPersona=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, em.getIndirizzoEmail());
            st.setInt(2, em.getIdPersona());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Email em) {
        try {
            String query = "DELETE FROM email WHERE idPersona=? ";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, em.getIdPersona());
            st.executeQuery();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Email> getAll() {
        try {
            String query = "SELECT (indirizzoEmail, idPersona) FROM email";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                ema.add(new Email(res.getString(1), res.getInt(2)));
            }
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
