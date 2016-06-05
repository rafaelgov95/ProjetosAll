/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio19;

import br.ufms.exercicio20.*;
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
        BubleSort rec = new BubleSort();
        int b = Integer.parseInt(leia.readLine());
        int a[] = new int[b];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(leia.readLine());

        }
        rec.bubbleSort(a);
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");

        }

    }

}
