/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;
import java.time.*;
import java.util.Objects;

/**
 *
 * @author Gerardo
 */
public class lavoroPrecedente {
    String nomeAzienda;
    int id;
    String ruolo;
    LocalDate dataInizio;
    LocalDate dataFine;

    public lavoroPrecedente(String nomeAzienda, int id, String ruolo, LocalDate dataInizio, LocalDate dataFine) {
        this.nomeAzienda = nomeAzienda;
        this.id = id;
        this.ruolo = ruolo;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public int getId() {
        return id;
    }

    public String getRuolo() {
        return ruolo;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public LocalDate getDataFine() {
        return dataFine;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setDataFine(LocalDate dataFine) {
        this.dataFine = dataFine;
    }

    @Override
    public String toString() {
        return "lavoroPrecedente{" + "nomeAzienda=" + nomeAzienda + ", id=" + id + ", ruolo=" + ruolo + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final lavoroPrecedente other = (lavoroPrecedente) obj;
        if (!Objects.equals(this.dataInizio, other.dataInizio)) {
            return false;
        }
        if (!Objects.equals(this.dataFine, other.dataFine)) {
            return false;
        }
        return true;
    }
    
    
}
