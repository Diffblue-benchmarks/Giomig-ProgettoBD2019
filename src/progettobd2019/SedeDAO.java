package progettobd2019;

import java.sql.*;
import java.util.*;
import home.UI;

/**
 *
 * @author vince
 */

public class SedeDAO implements DAO<Sede> {

    ArrayList<Sede> se = new ArrayList<>();

    @Override
    public void insert(Sede s) throws SQLException {
        try {
            String query = "INSERT INTO sede (capCitta, nomeAzienda, indirizzo)"
                    + " VALUES(?,?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, s.getCapCitta());
            st.setString(2, s.getNomeAzienda());
            st.setString(3, s.getIndirizzo());
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateKey(Sede sv, Sede sn) {
        try {
            String query = "UPDATE sede SET capCitta=?, nomeAzienda=?, indirizzo=? "
                    + "WHERE capCitta=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, sn.getCapCitta());
            st.setString(2, sn.getNomeAzienda());
            st.setString(3, sn.getIndirizzo());
            st.setString(4, sv.getCapCitta());
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Sede s) {
        try {
            String query = "DELETE FROM sede WHERE capCitta=? ";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, s.getCapCitta());
            st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Sede> getAll() {
        try {
            String query = "SELECT (capCitta, nomeAzienda, indirizzo)"
                    + "FROM sede";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                se.add(new Sede(res.getString(1), res.getString(2), res.getString(3)));
            }
            return se;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void update(Sede s) {
    }
}
