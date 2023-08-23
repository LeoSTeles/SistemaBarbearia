/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author leona
 */
public class Cliente extends Pessoa{
    private String endereco,cep;

    public Cliente( int id, String nome, char sexo, String dataNascimento, String email, String endereco, String cep, String rg, String telefone) {
        super(id, nome, email, rg, telefone, sexo, dataNascimento);
        this.endereco = endereco;
        this.cep = cep;
    }
    
    public Cliente(String endereco, String cep, int id, String nome) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    

   
}
