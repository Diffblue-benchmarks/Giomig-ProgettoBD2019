/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.*;
import java.util.*;

/**
 *
 * @author vince
 */
public class AziendaDAO implements DAO<Azienda> {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = "jdbc:postgresql://hostname//database";
    ArrayList<Azienda> az = new ArrayList<>();

    @Override
    public void insert(Azienda az) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "INSERT INTO Azienda (nome, nomeSettore) "
                    + "VALUES(?,?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, az.getNome());
            st.setString(2, az.getNomeSettore());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateKey(Azienda av, Azienda an) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "UPDATE Azineda SET nome=?, nomeSettore=?,"
                    + "WHERE nome=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, an.getNome());
            st.setString(2, an.getNomeSettore());
            st.setString(3, av.getNome());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Azienda az) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "DELETE FROM lavoroPrecedente WHERE nome=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, az.getNome());
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Azienda> getAll() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            con = DriverManager.getConnection(url, user, psw);
            String query = "SELECT (nome,nomeAzienda) FROM  Azienda";
            PreparedStatement st = con.prepareStatement(query);
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                az.add(new Azienda(res.getString(1), res.getString(2)));
            }
            con.close();
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
