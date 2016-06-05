/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.agenda2_0.model;

/**
 *
 * @author rafaelgov
 */
public class Contato {

    public String nome;
    public String telefone;
    public String email;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
// public Integer id;

}
