/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio10;

import br.ufms.exercicio8.DivComun;
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
        Multiplo mult = new Multiplo();
        int a = Integer.parseInt(leia.readLine());
        int b = Integer.parseInt(leia.readLine());
        if (a > b) {
            System.out.println(mult.mult(a, b));
        } else {
            System.out.println(mult.mult(b, a));
        }

    }

}
