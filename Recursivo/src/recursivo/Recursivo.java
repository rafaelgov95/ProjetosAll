/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class Recursivo {

    /**
     * @param args the command line arguments
     */
    public int funcaoA(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Nao existe fatorial de numero negativo");

        } else {
            return n;
        }
        
    }

    public static void main(String[] args) {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    }

}
