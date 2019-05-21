/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.util.*;


/**
 *
 * @author vince
 * @param <T>
 */
public interface DAO<T>{
    List<T> getAll();
    void insert(T t);
    void update(T t);
    void delete(T t);
}
