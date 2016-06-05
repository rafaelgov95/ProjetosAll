/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaemprofundidade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class BuscaEmProfundidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        StringBuilder saida = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int entrada1;

        String[] entrada = br.readLine().split(" ");

        entrada1 = Integer.parseInt(entrada[0]);

        saida.append(entrada1 + "\n");
        System.out.print(saida.toString());
    }

}
