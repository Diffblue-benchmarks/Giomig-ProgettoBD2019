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
public class Cellulare {

    String numero;
    int idPersona;

    public Cellulare(String numero, int idPersona) {
        this.numero = numero;
        this.idPersona = idPersona;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumero() {
        return numero;
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Numero=" + numero + ", IdPersona=" + idPersona;
    }

}
