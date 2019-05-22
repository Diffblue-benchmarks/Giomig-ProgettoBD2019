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
public class Azienda {

    String nome;
    String nomeSettore;

    public Azienda(String nome, String nomeSettore) {
        this.nome = nome;
        this.nomeSettore = nomeSettore;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeSettore() {
        return nomeSettore;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeSettore(String nomeSettore) {
        this.nomeSettore = nomeSettore;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", NomeSettore=" + nomeSettore;
    }

}
