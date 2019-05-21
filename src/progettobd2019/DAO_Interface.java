/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author vince
 */
public interface DAO_Interface {

    public interface DAO {

        public void insert() throws SQLException;

        public void update() throws SQLException;

        public void delete() throws SQLException;

        public ArrayList<> select() throws SQLException;
    }

}