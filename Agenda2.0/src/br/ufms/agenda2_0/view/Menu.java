/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.agenda2_0.view;

import br.ufms.agenda2_0.controller.Agenda2_0;
import br.ufms.agenda2_0.model.Contato;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafaelgov
 */
public class Menu {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Agenda2_0 agenda;

    public Menu(Agenda2_0 agenda) {
        this.agenda = agenda;
    }

    public void iniciar() throws IOException, Exception {
        menuPrincipal();
    }

    private void menuPrincipal() throws IOException, Exception {

        String escolha;
        boolean flag=true;
        while (flag) {

            System.out.println("Agenda Telefonica (2_0 Beta Sorce )Data: " + agenda.hora() + "\n"
                    + "         1 - cadastrar contato\n"
                    + "         2 - remover contato\n"
                    + "         3 - exibir contato de uma lista\n"
                    + "         4- Sair"
            );
            escolha = br.readLine();
            switch (escolha) {
                case "1":
                    menuCriarContato();
                    break;
                case "2":
                    menuRemoverContato();
                    break;
                case "3":
                    menuListar();
                    break;
                case "4":
                    flag=false;
                    break;

            }

        }

    }

    private void menuCriarContato() throws IOException {
        System.out.println("Nome do contato: ");
        String nome = br.readLine();
        System.out.println("Email do contato: ");
        String email = br.readLine();
        System.out.println("Telefone do contato: ");
        String telefone = br.readLine();
        Contato c = new Contato(nome, email, telefone);

        try {
            agenda.salvar(c);
            System.out.println("Salvo Com Sucesso");
        } catch (Exception ex) {
            System.err.println(ex + "Erro em Adicionar");
        }

    }

    private void menuRemoverContato() throws Exception {
        System.out.println("Deseja excluir contato Por:\n "
                + "         1 :NOME \n"
                + "         2 :EMAIL\n"
                + "         3 :TELEFONE");

        int escolha2 = Integer.parseInt(br.readLine());
        switch (escolha2) {
            case 1:
                System.out.println("INFORME UM NOME PRA BUSCA E EXCLUSAO");
                String nome1 = br.readLine();
                agenda.remover(agenda.buscarPorNome(nome1));
                break;
            case 2:
                System.out.println("INFORME UM EMAIL PRA BUSCA E EXCLUSAO");
                String email1 = br.readLine();
                agenda.remover(agenda.buscarPorEmail(email1));
                break;
            case 3:
                System.out.println("INFORME UM TELEFONE PRA BUSCA E EXCLUSAO");
                String telefone1 = br.readLine();
                agenda.remover(agenda.buscarPorNome(telefone1));
                break;
        }
    }

    private void menuListar() {
        int i = 0;
        for (Contato c : agenda.listar()) {
            i++;
            System.out.println("Numero: " + i + "\nNome: "
                    + c.nome + "\nEmail: " + c.email + "\nTelefone :" + c.telefone+"\n");

        }
    }
}
