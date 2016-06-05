/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio15;

import br.ufms.exercicio14.*;
import br.ufms.exercicio11.*;
import br.ufms.exercicio10.*;

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
        FatorialQuadruplo fatorial = new FatorialQuadruplo();

        int n = Integer.parseInt(leia.readLine());
        double x = fatorial.chamafatorial(n)/fatorial.fatorial(n);
        System.out.println(x);
    }

}
