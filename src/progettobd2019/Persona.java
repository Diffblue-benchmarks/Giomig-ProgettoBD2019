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
public class Persona {
    String nome;
    String nomeAzienda;
    String Cognome;
    String Sesso;
    String sitoWeb;
    String telefono;
    String titolo;
    String ruolo;
    int id;
    LocalDate dataInizio;
    
    
    public Persona(String nome, String nomeAzienda, String Cognome, String Sesso, String sitoWeb, String telefono, String ruolo, int id) {
        this.nome = nome;
        this.nomeAzienda = nomeAzienda;
        this.Cognome = Cognome;
        this.Sesso = Sesso;
        this.sitoWeb = sitoWeb;
        this.telefono = telefono;
        this.ruolo = ruolo;
        this.id = id;
        this.titolo=titolo;
        this.dataInizio=dataInizio;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public String getCognome() {
        return Cognome;
    }

    public String getSesso() {
        return Sesso;
    }

    public String getSitoWeb() {
        return sitoWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRuolo() {
        return ruolo;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    public void setSesso(String Sesso) {
        this.Sesso = Sesso;
    }

    public void setSitoWeb(String sitoWeb) {
        this.sitoWeb = sitoWeb;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nomeAzienda, other.nomeAzienda)) {
            return false;
        }
        if (!Objects.equals(this.ruolo, other.ruolo)) {
            return false;
        }
        if (!Objects.equals(this.dataInizio, other.dataInizio)) {
            return false;
        }
        return true;
    }
    
    
    

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", nomeAzienda=" + nomeAzienda 
                + ", Cognome=" + Cognome + ", Sesso=" + Sesso + ", sitoWeb=" + sitoWeb 
                + ", telefono=" + telefono + ", titolo=" + titolo + ", ruolo=" 
                + ruolo + ", id=" + id + '}';
    }
    
}
