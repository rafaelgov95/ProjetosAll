package br.ufms.exercicio20;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafael
 */
public class InsertiSortRec {

    public void InsertionSort(int i, int array[], int size) {
        if (i < size) {
            int j;
            int temp = array[i];

            for (j = i; j > 0 && array[j - 1] > temp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp;

            InsertionSort(++i, array, size);
        }
    }
}
