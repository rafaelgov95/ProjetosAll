/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;

/**
 *
 * @author rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
//    static public String removeAcentos(String str) {
//
//        str = Normalizer.normalize(str, Normalizer.Form.NFD);
//        str = str.replaceAll("[^\\p{ASCII}]", "");
//        return str;
//
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        Frase frase = new Frase();
        String n = leia.readLine();

        if (frase.Frase(n) == true) {
            System.out.println("'e palidromo");
        } else {
            System.out.println("'nao e palidromo");
        }

    }

}
