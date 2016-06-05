/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio16;

import br.ufms.exercicio1.*;

/**
 *
 * @author rafael
 */
public class fatorial {
  
    public int sfat(int n) {
        return sfat2(1, n, 1);
    }

    public int sfat2(int inicio, int fim, int acumulador) {
        if (inicio > fim) {
            return acumulador;
        }
        return acumulador * sfat2(inicio + 1, fim, inicio * acumulador);
    }
}
