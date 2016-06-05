/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio4;

/**
 *
 * @author rafael
 */
public class SomaInteiros {

    int cont = 0;
    int total;

    public int SomaVetor(int[] a) {

        if (cont < a.length) {
            total += a[cont];
            cont++;
            SomaVetor(a);
        }
        return total;
    }
}
