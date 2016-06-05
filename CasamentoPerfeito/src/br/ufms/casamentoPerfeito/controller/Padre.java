/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.casamentoPerfeito.controller;

import br.ufms.casamentoPerfeito.model.Homem;
import br.ufms.casamentoPerfeito.model.Mulher;
import br.ufms.casamentoPerfeito.model.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class Padre {

    public List<Homem> listHome = new ArrayList<>();
    public List<Mulher> listMulher = new ArrayList<>();

    public void addHomem(Homem homem) {
        listHome.add(homem.ind - 1, homem);
    }

    public void addMulher(Mulher mulher) {
        listMulher.add(mulher.ind - 1, mulher);
    }

    public void add(Pessoa pessoa) {
        if (pessoa instanceof Homem) {
            addHomem((Homem) pessoa);
        } else if (pessoa instanceof Mulher) {
            addMulher((Mulher) pessoa);
        }
    }

    public Homem getHomem(int i) {
        return listHome.get(i - 1);
    }

    public Mulher getMulher(int i) {
        return listMulher.get(i - 1);
    }

    public void noivar() {
        List<Homem> solteiro = new ArrayList<>();

        solteiro.addAll(listHome);
        while (solteiro.size() > 0) {
            Homem h = solteiro.get(0);
            Mulher m = h.pref.get(0);
            if (m.homemcasado == null) {
                m.homemcasado = h;
                h.mulhercasada = m;
                solteiro.remove(h);
            } else if (m.amigoFuraZoio(h) == h) {
                Homem corno = m.homemcasado;
                m.homemcasado = h;
                h.mulhercasada = m;
                solteiro.remove(h);
                solteiro.add(corno);
            } else {
                h.pref.remove(m);
            }

        }

    }


    public int Pontos() {
        int ponto = 0;
        for (Homem homem : listHome) {
            Mulher mulher=homem.mulhercasada;
            ponto += homem.Copiapref.size() - homem.Copiapref.indexOf(mulher);
            ponto += mulher.pref.size() - mulher.pref.indexOf(homem);
        }
        return ponto;
    }
}
