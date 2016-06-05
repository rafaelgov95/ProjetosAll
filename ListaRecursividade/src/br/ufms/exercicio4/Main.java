/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio4;

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
        SomaInteiros soma = new SomaInteiros();
        String[] b = leia.readLine().split(" ");
        int[] a = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            a[i] = Integer.parseInt(b[i]);
        }
        System.out.println(soma.SomaVetor(a));
    }

}
