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
public class LavoroPrecedenteDAO implements DAO<LavoroPrecedente> {

    ArrayList<LavoroPrecedente> per = new ArrayList<>();

    @Override
    public void insert(LavoroPrecedente lp) {

        try {

            String query = "INSERT INTO lavoroPrecedente (idPersona, nomeAzienda, dataInizio, dataFine, ruolo) "
                    + "VALUES(?,?,?,?,?)";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, lp.getIdPersona());
            st.setString(2, lp.getNomeAzienda());
            st.setDate(3, lp.getDataInizio());
            st.setDate(4, lp.getDataFine());
            st.setString(5, lp.getRuolo());
            st.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(LavoroPrecedente lp) {

        try {

            String query = "UPDATE lavoroPrecedente SET nomeAzienda=?, dataInizio=?, dataFine=?, ruolo=? "
                    + "WHERE id=?";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setString(1, lp.getNomeAzienda());
            st.setDate(2, lp.getDataInizio());
            st.setDate(3, lp.getDataFine());
            st.setString(4, lp.getRuolo());
            st.setInt(5, lp.getIdPersona());
            st.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(LavoroPrecedente lp) {

        try {

            String query = "DELETE FROM lavoroPrecedente WHERE id=? ";
            PreparedStatement st = UI.conn.prepareStatement(query);
            st.setInt(1, lp.getIdPersona());
            st.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<LavoroPrecedente> getAll() {

        try {

            String query = "SELECT (idPersona,nomeAzienda,dataInizio,dataFine,ruolo) FROM lavoroPrecedente";
            PreparedStatement st = UI.conn.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                per.add(new LavoroPrecedente(res.getInt(1), res.getString(2), res.getDate(3), res.getDate(4), res.getString(5)));
            }

            return per;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void updateKey(LavoroPrecedente lpv, LavoroPrecedente lpn) {
    }
}
