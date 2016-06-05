/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio19;

/**
 *
 * @author rafael
 */
public class BubleSort {

    private void troca(int array[], int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }

    public int[] bubbleSort(int array[]) {
        int i;

        for (i = 0; i < array.length; i++) {
            for (int j =array.length-1; j>0 ; j--) {
                if (array[j] > array[j-1]) {
                    int a = j;
                    int b = j - 1;
                    troca(array, a, b);
                }
            }
        }

        return array;

    }
}
