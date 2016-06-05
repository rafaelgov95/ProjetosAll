/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio18;

import br.ufms.exercicio17.*;
import br.ufms.exercicio10.*;
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
            Birnario binario = new Birnario();
            int a = Integer.parseInt(leia.readLine());

            System.out.println(binario.Decimanl(a));

     
      
    }

}
