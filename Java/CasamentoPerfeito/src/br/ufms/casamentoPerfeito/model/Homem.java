/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.casamentoPerfeito.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class Homem extends Pessoa {

   public List<Mulher> pref;
   public List<Mulher>Copiapref;
   
   public Mulher mulhercasada;
    public Homem(String nome, int ind) {
        this.nome = nome;
        this.ind = ind;
    }
    
}
