/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.Date;

/**
 *
 * @author Gerardo
 */
public class lavoroPrecedente {

    int id;
    String nomeAzienda;
    Date dataInizio;
    Date dataFine;
    String ruolo;

    public lavoroPrecedente(int id, String nomeAzienda, Date dataInizio, Date dataFine, String ruolo) {
        this.id = id;
        this.nomeAzienda = nomeAzienda;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.ruolo = ruolo;
    }

    public int getId() {
        return id;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "lavoroPrecedente{" + "nomeAzienda=" + nomeAzienda + ", id=" + id + ", ruolo=" + ruolo + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + '}';
    }

}
