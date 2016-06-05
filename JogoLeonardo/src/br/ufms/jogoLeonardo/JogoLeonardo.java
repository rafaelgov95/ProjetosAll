    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.jogoLeonardo;

import java.util.Scanner;

/**
 *
 * @author rafaelgov
 */
class Jogo {

    String nome;
    int clas;
}

public class JogoLeonardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String saida = "";
        boolean flag = true;
        while (flag) {
            String linha = leia.nextLine();
            if (linha.isEmpty()) {
                System.out.println("saida");
                System.exit(0);
            }

            String[] info = linha.split(" ");
            int n = Integer.parseInt(info[0]);
            int g = Integer.parseInt(info[1]);
            int c = Integer.parseInt(info[2]);
            Jogo[] jogos = new Jogo[n];
            Jogo[][] gavetas = new Jogo[g][c];

            for (int i = 0; i < n; i++) {
                info = leia.nextLine().split(" ");
                Jogo jogo = new Jogo();
                jogo.nome = info[0];
                jogo.clas = Integer.parseInt(info[1]);
                jogos[i] = jogo;
            }
            for (Jogo j : jogos) {
                boolean h = true, a = true;
                int i = 0;

                while (a) { 
                    if (i < c) {
                        if (gavetas[g - j.clas][i] == null) {
                            gavetas[g - j.clas][i] = j;
                            a = false;
                        }
                    }
                    if (i >= c) {
                        int w = 0, posicao = 1;
                        boolean k = true;
                        while (h) {
                            do {
                                 
                                if (((posicao - (g - j.clas))) >= 0 && ((posicao - (g - j.clas))) < g && k==true) {
                                    if (gavetas[(posicao - (g - j.clas))][w] == null) {
                                        gavetas[(posicao - (g - j.clas))][w] = j;
                                        h = false;
                                        k = false;
                                        a = false;
                                    }
                                }else if ((posicao + (g - j.clas)) >= 0 && (posicao + (g - j.clas) < g && k==true)) {

                                    if (gavetas[(posicao + (g - j.clas))][w] == null) {
                                        gavetas[(posicao + (g - j.clas))][w] = j;
                                        h = false;
                                        k = false;
                                        a = false;
                                    }
                                }
                                w++;
                                if (w >= c) {
                                    k = false;
                                }
                            } while (k==true);
                            posicao++;
                        }
                    }
                    i++;
                }

            }
            int i, j;
            for (i = 0; i < gavetas.length; i++) {
                System.out.printf("Gaveta '%d':\n", (i + 1));
                for (j = 0; j < gavetas[i].length; j++) {
                    if (gavetas[i][j] != null) {
                        System.out.println("Nome do GAME (" + (j + 1) + "): " + gavetas[i][j].nome);
                    }
                }

            }

        }
    }
}
