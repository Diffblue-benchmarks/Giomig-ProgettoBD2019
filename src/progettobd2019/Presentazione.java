/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

/**
 *
 * @author Gerardo
 */
public class Presentazione {

    int idPresentato;
    int idPresentatore;
    int idEvento;

    public Presentazione(int idPresentato, int idPresentatore, int idEvento) {
        this.idPresentato = idPresentato;
        this.idPresentatore = idPresentatore;
        this.idEvento = idEvento;
    }

    public int getIdPresentato() {
        return idPresentato;
    }

    public int getIdPresentatore() {
        return idPresentatore;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdPresentato(int idPresentato) {
        this.idPresentato = idPresentato;
    }

    public void setIdPresentatore(int idPresentatore) {
        this.idPresentatore = idPresentatore;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public String toString() {
        return "Presentazione{" + "idPresentato=" + idPresentato + ", idPresentatore=" + idPresentatore + ", idEvento=" + idEvento + '}';
    }

    void add(Presentazione presentazione) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
