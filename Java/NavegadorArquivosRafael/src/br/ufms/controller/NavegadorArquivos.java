/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.controller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javafx.util.converter.LocalDateTimeStringConverter;

/**
 *
 * @author Rafael
 */
public class NavegadorArquivos {

    private String caminhoAtual = System.getProperty("user.home");

    public void criarArquivoTxt(String narq, String texto) throws IOException {
        String narqmod = (narq + ".txt");
        Path path = Paths.get(narqmod);
        Charset charset = Charset.defaultCharset();
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
            int r = 0;
            String[] textoTrabalhado = texto.split("");
            for (int i = 0; i < textoTrabalhado.length; i++) {
                String TextoIns = textoTrabalhado[i] + textoTrabalhado[i - 1];
                if (textoTrabalhado[i].equals("n") && textoTrabalhado[i - 1].equals("\\")) {
                    writer.newLine();
                } else {
                    writer.write(textoTrabalhado[i]);
                }
            }

        }
    }
    
public void ping (String ip){
        String resposta="";
        String comando="ping -c 1 "+ip;
        try {
            Scanner S = new Scanner( Runtime.getRuntime().exec(comando).getInputStream());  
            while(S.hasNextLine()) {  
               resposta+=S.nextLine()+"\n";  
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(resposta);
    }    

//    public static void pingar(String host) {
//        try {
//            if (InetAddress.getByName(host).isReachable(5000)) {
//                System.out.println("Ping OK: " + host);
//            } else {
//                System.out.println("Ping FALHOU: " + host);
//            }
//        } catch (Exception e) {
//            System.err.println("Ping FALHOU: " + host + " - " + e);
//        }
//    }

    public void criarArquivoBat(String narq, String texto) throws IOException {
        String narqmod = (narq + ".bat");
        Path path = Paths.get(narqmod);
        Charset charset = Charset.defaultCharset();
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
            int r = 0;
            writer.append(texto);

        }
    }

    public String dataagora() {

        LocalDateTime data = LocalDateTime.now();
        String dataagora = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT));
        return dataagora;
    }

    public String mostraCaminho() {
        return this.caminhoAtual;
    }

    public String atualzaCaminho(String novoCaminho) {
        return this.caminhoAtual = novoCaminho;
    }

    public void voltaCaminho() {
        String[] voltacaminho = this.caminhoAtual.split("");
        for (int i = voltacaminho.length - 1; i > 0; i--) {
            if (voltacaminho[i].equals("/")) {
                this.caminhoAtual = caminhoAtual.substring(0, i);
                return;
            }
        }

    }

    public List<Path> listarArquivos() throws IOException {
        return listarArquivos(caminhoAtual);
    }

    public List<Path> listarArquivos(String directory) throws IOException {

        List<Path> arquivos = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(
                Paths.get(directory))) {
            for (Path path : directoryStream) {
                arquivos.add(path);
            }
        }
        this.caminhoAtual = directory;
        return arquivos;
    }
}
