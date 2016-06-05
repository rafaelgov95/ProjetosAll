/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio8;

/**
 *
 * @author rafael
 */
public class DivComun {

    public int divisorComun(int i, int y) {
        if (i > y) {
            if (i % y == 0) {
                return y;
            } else {
                int resto = y % i;
                return divisorComun(resto, i);
            }
        } else if (y % i == 0) {
            return i;
        } else {
            int resto = y % i;
            return divisorComun(resto, y);
        }

    }

}
    