/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscabinaria;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
        String[] array = leia.readLine().split(" ");
        Arrays.sort(array);
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\n Escolha um numero para ser buscado nos indices do array: ");
        int n = Integer.parseInt(leia.readLine());
        System.out.println(BuscaBinaria.buscaBinariaRecursiva(array,0,array.length, n)+1);
    }

}
