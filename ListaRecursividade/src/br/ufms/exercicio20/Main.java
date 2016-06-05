/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio20;

import br.ufms.exercicio18.Birnario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        InsertiSortRec rec = new InsertiSortRec();
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(leia.readLine());

        }
        rec.InsertionSort(0, a, a.length);
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");

        }

    }

}
