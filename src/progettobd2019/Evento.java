/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.Date;

/**
 *
 * @author vince
 */
public class Evento {
    
    int id;
    String capCitta;
    String tipo;
    Date data;
    String descrizione;
        
    public Evento(int id, String capCitta, String tipo, Date data, String descrizione){
        this.id=id;
        this.capCitta=capCitta;
        this.tipo=tipo;
        this.data=data;
        this.descrizione=descrizione;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public void setCapCitta(String capCitta){
        this.capCitta=capCitta;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public void setData(Date data){
        this.data=data;
    }
    
    public void setDescrizione(String Descrizione){
        this.descrizione=descrizione;
    }
    
    public int getId(){
        return id;
    }
    
    public String getCapCitta(){
        return capCitta;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public Date getData(){
        return data;
    }
    
    public String getDescrizione(){
        return descrizione;
    }
    
    @Override
    public String toString(){
        return "Id="+id+", cap citta="+capCitta+", tipo"+tipo+", data="+data+", descrizione="+descrizione;
    }
}
