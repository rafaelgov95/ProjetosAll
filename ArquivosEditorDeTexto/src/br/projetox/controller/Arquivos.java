/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projetox.controller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author rafael
 */
public class Arquivos extends Linha {

    public void CriarArquioX(String nome, String caminho) throws IOException {
        String nomedoarquivo = (caminho + "/" + nome + ".txt");
        Path path = Paths.get(nomedoarquivo);
        try (BufferedWriter escritor = Files.newBufferedWriter(path, Charset.defaultCharset())) {
            for (int i = 0; i < getTamanhoDocumento(); i++) {
                escritor.append(String.valueOf(i + ": " + getListaComPosi(i)));
                escritor.newLine();
            }
        }
    }
}
