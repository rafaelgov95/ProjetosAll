/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.maratona;

import java.util.Scanner;

/**
 *
 * @author rafaelgov
 */
public class ConcursoContos {

    public void executar() {
        Scanner leia = new Scanner(System.in);
        String saida = "";
        while (true) {
            String linha = leia.nextLine();
            if (linha.isEmpty()) {
                System.out.println("saida");
                System.exit(0);
            }
            String[] info = linha.split(" ");
            int n = Integer.parseInt(info[0]);
            int l = Integer.parseInt(info[1]);
            int c = Integer.parseInt(info[2]);
            String conto = leia.nextLine();
            String[] palavras = conto.split(" ");
            int qtdLinhas = 1;
            int buffer = 0;
            for (int i = 0; i < palavras.length; i++) {
                String p = palavras[i];
                int gap = buffer == 0 ? 0 : 1;
                if (buffer + gap + p.length() <= c) {
                    buffer += gap + p.length();
                } else {
                    qtdLinhas++;
                    buffer = 0;
                    i--;
                }
            }
            int qtdPags = ((qtdLinhas - 1) / 1) + 1;
            saida += qtdPags + "\n";
        }
    }

}
