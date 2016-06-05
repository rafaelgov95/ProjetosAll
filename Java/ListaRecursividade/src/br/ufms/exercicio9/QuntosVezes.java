/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio9;

/**
 *
 * @author rafael
 */
public class QuntosVezes {

    int cont = 0;

    public int repeteN(String[] array, int n, int tamanhoarray) {

        if (tamanhoarray >= 0) {
            if (array[tamanhoarray].equals(String.valueOf(n))) {
                cont++;
            }
        } else {
            return cont;
        }
        return repeteN(array, n, (tamanhoarray - 1));
    }
}
