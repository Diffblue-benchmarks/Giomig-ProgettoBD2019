/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.sql.*;

/**
 *
 * @author Gerardo
 */
public class Persona {

    int id;
    String nomeAzienda;
    String nome;
    String cognome;
    String sesso;
    String titolo;
    String foto;
    boolean familiare;
    String sitoWeb;
    String telefono;
    String ruolo;
    Date dataInizio;

    public Persona(int id, String nomeAzienda, String nome, String cognome, String sesso, String titolo, String foto, boolean familiare, String sitoWeb, String telefono, String ruolo, Date dataInizio) {
        this.id = id;
        this.nomeAzienda = nomeAzienda;
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
        this.titolo = titolo;
        this.foto = foto;
        this.familiare = familiare;
        this.sitoWeb = sitoWeb;
        this.telefono = telefono;
        this.ruolo = ruolo;
        this.dataInizio = dataInizio;
    }

    public int getId() {
        return id;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSesso() {
        return sesso;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getFoto() {
        return foto;
    }

    public boolean getFamiliare() {
        return familiare;
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

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String Cognome) {
        this.cognome = Cognome;
    }

    public void setSesso(String Sesso) {
        this.sesso = Sesso;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setFamiliare(boolean familiare) {
        this.familiare = familiare;
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

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", nomeAzienda=" + nomeAzienda + ", Cognome="
                + cognome + ", Sesso=" + sesso + ", sitoWeb=" + sitoWeb + ", telefono=" + telefono
                + ", titolo=" + titolo + ", ruolo=" + ruolo + ", id=" + id + ", foto=" + foto + ", dataInizio="
                + dataInizio + '}';
    }

}
