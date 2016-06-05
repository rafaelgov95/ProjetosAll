/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio6;

/**
 *
 * @author rafael
 */
public class Sobre {

    public int elevado(int i, int j) {
        if (j == 0) {

            return 1;

        } else {
            return i * elevado(i, (j - 1));

        }

    }
}
