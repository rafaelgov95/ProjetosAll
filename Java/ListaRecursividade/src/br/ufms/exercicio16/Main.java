/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio16;

import br.ufms.exercicio1.*;
import br.ufms.exercicio2.fibronacci;
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
        fatorial fat = new fatorial();
        int a = Integer.parseInt(leia.readLine());
        System.out.println(fat.sfat(a));
    }
    
}
