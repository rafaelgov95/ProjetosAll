/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio10;

/**
 *
 * @author rafael
 */
public class Multiplo {

    public int mult(int i, int y) {
        if (y != 1) {
            i += i;
        } else {
            return i;
        }

        return mult(i, y - 1);
    }

}
