/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vince
 * @param <T>
 */
public interface DAO<T> {

    public void insert(T t) throws SQLException;

    public void update(T t) throws SQLException;

    public void delete(T t) throws SQLException;

    public List<T> getAll() throws SQLException;
}
