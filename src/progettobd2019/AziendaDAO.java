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
public class AziendaDAO implements DAO<Azienda> {

    ArrayList<Azienda> az = new ArrayList<>();

    @Override
    public void insert(Azienda az) throws SQLException {
        try {
            String query = "INSERT INTO azienda (nome, nomeSettore) "
                    + "VALUES(?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, az.getNome());
            st.setString(2, az.getNomeSettore());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateKey(Azienda av, Azienda an) {
        try {
            String query = "UPDATE azineda SET nome=?, nomeSettore=?,"
                    + "WHERE nome=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, an.getNome());
            st.setString(2, an.getNomeSettore());
            st.setString(3, av.getNome());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Azienda az) {
        try {
            String query = "DELETE FROM azienda WHERE nome=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, az.getNome());
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Azienda> getAll() {
        try {
            String query = "SELECT (nome,nomeAzienda) FROM  azienda";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery();
            while (res.next()) {
                az.add(new Azienda(res.getString(1), res.getString(2)));
            }
            return az;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void update(Azienda az) {
    }
}
