/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.*;
import java.util.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerardo
 */
public class PersonaDAOimplements implements PersonaDAO {

    Connection con = null;
    Statement st = null;
    Accesso a = new Accesso();
    String user = a.username;
    String psw = a.psw;
    String hostname = a.hostname;
    String database = a.database;
    String url = "jdbc:postgresql://hostname//database";

    @Override
    public void insertPersona(Persona p) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            con = DriverManager.getConnection(url, user, psw);

            Statement st = con.createStatement();
            String query = "INSERT INTO persona (nomeAzienda, nome, cognome, sesso, titolo, foto, familiare, "
                    + " sitoWeb, telefono, ruolo,dataInizio) VALUES('" 
                    + p.getNomeAzienda() + "','" + p.getNome() + "','" + p.getCognome() + "','" 
                    + p.getSesso() + "','" + p.getTitolo() + "','" + p.getFoto() + "','" 
                    + p.getSitoWeb() + "','" 
                    + p.getTelefono() + "','" 
                    + p.getRuolo() + "','" + p.getDataInizio() + "');";
            st.executeQuery(query);
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void updatePersona(Persona p) {

    }

    @Override
    public void deletePersona(Persona p) {

    }

    @Override
    public ArrayList<Persona> selectPersona(Persona p) {

    }
}
