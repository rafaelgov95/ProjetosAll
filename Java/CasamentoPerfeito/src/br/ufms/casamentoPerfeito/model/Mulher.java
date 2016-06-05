/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.casamentoPerfeito.model;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.util.List;

/**
 *
 * @author rafael
 */
public class Mulher extends Pessoa {

    public List<Homem> pref;
    public Homem homemcasado;

    public Mulher(String nome, int ind) {
        this.nome = nome;
        this.ind = ind;

    }

    public Homem amigoFuraZoio(Homem h) {
        if (homemcasado == null) {
            return h;
        } else if (pref.indexOf(h) < pref.indexOf(homemcasado)) {
            return h;
        }
        return null;
    }

}
