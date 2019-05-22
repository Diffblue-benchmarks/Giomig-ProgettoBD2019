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
public class Email {

    String indirizzoEmail;
    int idPersona;

    public Email(String indirizzoEmail, int idPersona) {
        this.indirizzoEmail = indirizzoEmail;
        this.idPersona = idPersona;
    }

    public void setIndirizzoEmail(String indirizzoEmail) {
        this.indirizzoEmail = indirizzoEmail;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getIndirizzoEmail() {
        return indirizzoEmail;
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "IndirizzoEmail=" + indirizzoEmail + ", IdPersona=" + idPersona;
    }

}
