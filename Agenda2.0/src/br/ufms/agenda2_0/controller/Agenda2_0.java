package br.ufms.agenda2_0.controller;

import br.ufms.agenda2_0.model.Contato;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafaelgov
 */
public class Agenda2_0 {

    private static final int MAXIMO_CONTATOS = 5;
    public Contato contatos[];

    private int cont;

    Agenda2_0() throws Exception {
        this(MAXIMO_CONTATOS);
    }

    public Agenda2_0(int max) throws Exception {

        if (max <= 0) {
            throw new IllegalArgumentException("Não é permitido valores menores ou iguais a '0'.");
        }
        this.contatos = new Contato[max];
        
        lerDoArquivo();
    }

    public String hora() {
        LocalDateTime date = LocalDateTime.now();
        String text = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        return text;
    }

     public void salvar(Contato c) throws Exception {
        if (c == null) {
            throw new IllegalArgumentException("Contato não pode ser Nullo");
        }
        salvarNovetor(c);
        salvarNoArquivo();

    }

    public void remover(Contato contato) throws IOException, Exception {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == contato) {
                contatos[i] = null;
                cont--;
                salvarNoArquivo();
                System.out.println("Usuario: " + contato.nome + " removido com sucesso!");
                return;

            }
        }
        throw new Exception("Erro ao excluir Usuario");
    }

    public Contato buscarPorNome(String nome) {
        for (Contato c : contatos) {
            if (c != null && c.nome.equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public Contato buscarPorTelefone(String telefone) {
        for (Contato c : contatos) {
            if (c != null && c.telefone.equalsIgnoreCase(telefone)) {
                return c;
            }
        }
        return null;
    }

    public Contato buscarPorEmail(String email) {
        for (Contato c : contatos) {
            if (c != null && c.email.equalsIgnoreCase(email)) {
                return c;
            }
        }
        return null;
    }

    public Contato[] listar() {
        Contato[] aux = new Contato[cont];
        for (int i = 0, j = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                aux[j++] = contatos[i];
            }
        }

        return aux;
    }

    public void exibircontatos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {

            }
        }
    }

    private int procurarLugar() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private void salvarNovetor(Contato c) throws IOException, Exception {
        int index = procurarLugar();
        if (index == -1) {
            throw new Exception("A Agenda ja esta cheia");
        }
        contatos[index] = c;
        cont++;
    }

    private void salvarNoArquivo() throws IOException {

        Path path = Paths.get("agenda.txt");
        Charset charset = Charset.defaultCharset();
        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
            for (Contato c : listar()) {
                writer.write(c.nome + ";" + c.email + ";" + c.telefone);
                writer.newLine();
            }
        }
    }

    private void lerDoArquivo() throws IOException, Exception {

        Path path = Paths.get("agenda.txt");
        Charset charset = Charset.defaultCharset();
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {

            while (reader.ready()) {
                String linha = reader.readLine();
                String info[] = linha.split(";");
                Contato c = new Contato(info[0],info[1],info[2]);             
                salvarNovetor(c);

            }
        }

    }
}
