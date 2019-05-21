/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Gerardo
 */
public interface PersonaDAO {
    
    public void insertPersona(Persona p)throws SQLException;
    public void updatePersona(Persona p)throws SQLException;
    public void deletePersona(Persona p)throws SQLException;
    public ArrayList<Persona> selectPersona(Persona p)throws SQLException;
}
