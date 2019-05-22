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

    ArrayList<Cellulare> ce = new ArrayList<>();

    @Override
    public void insert(Cellulare c) throws SQLException {

        try {
            String query = "INSERT INTO cellulare (numero, idPersona)"
                    + "VALUES(?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, c.getNumero());
            st.setInt(2, c.getIdPersona());
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(Cellulare c) {

        try {

            String query = "UPDATE cellulare SET numero=? WHERE idPersona=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, c.getNumero());
            st.setInt(2, c.getIdPersona());
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Cellulare c) {

        try {

            String query = "DELETE FROM cellulare WHERE idPersona=? ";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, c.getIdPersona());
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Cellulare> getAll() {

        try {

            String query = "SELECT (numero, idPersona) FROM cellulare";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                ce.add(new Cellulare(res.getString(1), res.getInt(2)));
            }

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
