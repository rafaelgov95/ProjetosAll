/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio22;

/**
 *
 * @author rafael
 */
public class megerSort extends Main {

    public static void mergeSort(int[] array, int inicio, int fim) {
        if (fim <= inicio) {
            return;
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
    }

    public static void main(String[] args) {
        int[] vetor = {2, 4, 5, 6};
        mergeSort(vetor, 0, vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
