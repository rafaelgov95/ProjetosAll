/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.tiposdesort.sortController;

/**
 *
 * @author rafael
 */
public class Sort {

    private void troca(int array[], int a, int b) {
        int aux = array[a];
        array[a] = array[b];
        array[b] = aux;
    }

    private void troca2(int array[], int a, int b) {
        array[a] = b;
    }

    public int[] bubbleSort(int array[]) {
        int i;

        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = j;
                    int b = j + 1;
                    troca(array, a, b);
                }
            }
        }

        return array;

    }

    public int[] selectionSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int indMenor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indMenor]) {
                    indMenor = j;
                }
            }
            if (i != indMenor) {
                troca(array, i, indMenor);
            }
        }
        return array;

    }

    public int[] insertSort(int array[]) {
        int i, j, aux;

        for (i = 1; i < array.length; i++) {

            aux = array[i];

            j = i;

            while (j > 0 && array[j - 1] > aux) {

                array[j] = array[j - 1];

                j--;

            }

            troca2(array, j, aux);

        }

        return array;
    }
    //começo do mager

    public int[] mergeSort(int[] array, int inicio, int fim) {
        if (fim <= inicio) {
            return array;
        }
        int meio = (inicio + fim) / 2;
        mergeSort(array, inicio, meio);
        mergeSort(array, meio + 1, fim);
        int[] A = new int[meio - inicio + 1];
        int[] B = new int[fim - meio];
        for (int i = 0; i <= meio - inicio; i++) {
            A[i] = array[inicio + i];
        }
        for (int i = 0; i <= fim - meio - 1; i++) {
            B[i] = array[meio + 1 + i];
        }
        int i = 0;
        int j = 0;
        for (int k = inicio; k <= fim; k++) {
            if (i < A.length && j < B.length) {
                if (A[i] < B[j]) {
                    array[k] = A[i++];
                } else {
                    array[k] = B[j++];
                }
            } else if (i < A.length) {
                array[k] = A[i++];
            } else if (j < B.length) {
                array[k] = B[j++];
            }
        }
        return array;
    }

}
