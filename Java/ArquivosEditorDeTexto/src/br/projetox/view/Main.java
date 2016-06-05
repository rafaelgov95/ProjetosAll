/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projetox.view;

import br.projetox.controller.Arquivos;
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
        Arquivos arquivos = new Arquivos();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dir = System.getProperty("user.home");
        boolean Salvar = false;
        boolean flag = true;
        String verifica;
        String caminho;
        System.out.println("Digita Seu Documento");
        while (flag) {
            String linha = reader.readLine();
            char[] linhaverificar = linha.toCharArray();
            verifica = "";
            caminho = "";
            if (linhaverificar.length >= 6) {
                for (int x = 0; x < 6; x++) {
                    verifica += linhaverificar[x];

                }
                if (verifica.equalsIgnoreCase("salvar")) {
                    for (int x = 7; x < linhaverificar.length; x++) {
                        caminho += linhaverificar[x];

                    }
                    System.out.println("Escolha o nome do Arquivo: ");
                    String nomedoarquivo = reader.readLine();
                    arquivos.CriarArquioX(nomedoarquivo, caminho);
                    System.out.println("Arquivo salvo");
                    break;
                }
            }

            arquivos.setLinha(linha);
        }

        if (Salvar) {
        } else {
            System.out.println("saiu sem salvar");
        }
    }

}

//            if (linha.equalsIgnoreCase("sair") || linha.equalsIgnoreCase("salvar")) {
//                flag = false;
//
//                if (linha.equalsIgnoreCase("salvar")) {
//                    Salvar = true;
//                    break;
//                } else {
//                    break;
//                }
//            }
