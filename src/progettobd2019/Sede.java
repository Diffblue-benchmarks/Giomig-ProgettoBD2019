/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

/**
 *
 * @author vince
 */
public class Sede {

    String capCitta;
    String nomeAzienda;
    String indirizzo;

    public Sede(String capCitta, String nomeAzienda, String indirizzo){
        this.capCitta=capCitta;
        this.nomeAzienda=nomeAzienda;
        this.indirizzo=indirizzo;
    }
    
    public void setCapCitta(String capCitta){
        this.capCitta=capCitta;
    }
    
    public void setNomeAzienda(String nomeAzienda){
        this.nomeAzienda=nomeAzienda;
    }
    
    public void setIndirizzo(String indirizzo){
        this.indirizzo=indirizzo;
    }
    
    public String getCapCitta(){
        return capCitta;
    }
    
    public String getNomeAzienda(){
        return nomeAzienda;
    }
    
    public String getIndirizzo(){
        return indirizzo;
    }
    
    @Override
    public String toString (){
        return "Cap Citta="+capCitta+", nomeAzienda="+nomeAzienda+", indirizzo="+indirizzo;
    }
    
}
