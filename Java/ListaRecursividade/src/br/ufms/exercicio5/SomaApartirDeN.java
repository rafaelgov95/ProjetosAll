/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio5;

import br.ufms.exercicio4.*;

/**
 *
 * @author rafael
 */
public  class SomaApartirDeN {

    int cont = 1;
    int total;

    public  int SomaApartirDeN(int a) {

        if (cont <= a) {
            total += cont;
            cont++;
            SomaApartirDeN(a);
        }
        return total;
    }
}
