/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio15;

/**
 *
 * @author rafael
 */
public class FatorialQuadruplo {

    public  double fatorial(int n) {
        if (n < 0) {
        } else if (n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public double chamafatorial(int valor) {

        return fatorial(2 * valor);
    }
}
