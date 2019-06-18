/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package couchdb;

import org.ektorp.support.CouchDbDocument;

/**
 *
 * @author 11457936909
 */

//única coisa necessária é extends CouchDbDocument
public class Pessoa extends CouchDbDocument{

    private String Nome;
    private int Idade;
    private double Salario;
    private String[] Linguagens = {null, null, null, null, null, null, null, null, null, null};

    public Pessoa() {
    }
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String sNome) {
        this.Nome = sNome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int iIdade) {
        this.Idade = iIdade;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double iSalario) {
        this.Salario = iSalario;
    }

    public String[] getLinguagens() {
        return Linguagens;
    }

    public void setLinguagens(String[] aLinguagens) {
        this.Linguagens = aLinguagens;
    }
      
}
