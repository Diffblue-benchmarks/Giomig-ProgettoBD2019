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
public class LavoroPrecedente {

    int idPersona;
    String nomeAzienda;
    Date dataInizio;
    Date dataFine;
    String ruolo;

    public LavoroPrecedente(int idPersona, String nomeAzienda, Date dataInizio, Date dataFine, String ruolo) {
        this.idPersona = idPersona;
        this.nomeAzienda = nomeAzienda;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.ruolo = ruolo;
    }

    public int getIdPersona() {
        return idPersona;
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

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
        return "IdPersona=" + idPersona + ", NomeAzienda=" + nomeAzienda + ", DataInizio=" + dataInizio + ", DataFine=" + dataFine + ", Ruolo=" + ruolo;
    }
}
