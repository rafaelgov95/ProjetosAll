/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.tiposdesort.sortApp;

import br.ufms.tiposdesort.sortController.Sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Sort sort = new Sort();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Informe um Vetor:");

        String[] info = reader.readLine().split(" ");
        int[] arraytroca = new int[info.length];
        abasteceArray(info, arraytroca, 0);
       
        
        System.out.println("Escolha a ordenacao:\n" + "1 - Select\n" + "2 - Insert\n" + "3 - Bubble");
        String escolha = reader.readLine();
        switch (escolha) {
            case "1":
                arraytroca = sort.selectionSort(arraytroca);
                break;
            case "2":
                arraytroca = sort.insertSort(arraytroca);
                break;
            case "3":
                arraytroca = sort.bubbleSort(arraytroca);
                break;
            case "4":
                arraytroca = sort.mergeSort(arraytroca,0,arraytroca.length);
                break;
        }
        imprimirArray(arraytroca, 0);

    }

    public static void abasteceArray(String array[], int arraytroca[], int i) {
        arraytroca[i] = Integer.parseInt(array[i]);

        if (i == array.length - 1) {
            return;
        }
        abasteceArray(array, arraytroca, i + 1);
    }

    public static void imprimirArray(int array[], int i) {
        System.out.print(array[i] + " ");
        if (i == array.length - 1) {
            return;
        }
        imprimirArray(array, i + 1);
    }
}
