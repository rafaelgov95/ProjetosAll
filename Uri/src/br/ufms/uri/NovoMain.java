/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class NovoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        double[][] m = new double[12][12];
        double soma = 0;
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(leia.readLine());
        String op = leia.readLine();
        for (int i = 0; i < 11; i++) {
            m[n][i] = Double.parseDouble(leia.readLine());
            soma += m[n][i];
        }
        if (op.equalsIgnoreCase("S")) {
            System.out.printf("%f",soma);
        } else {
            System.out.printf("%f",soma/11);
        }
    }

}
