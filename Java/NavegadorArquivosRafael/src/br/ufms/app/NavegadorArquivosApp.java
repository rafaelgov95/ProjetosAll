/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.app;

import br.ufms.controller.NavegadorArquivos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.List;
import jdk.nashorn.internal.objects.NativeString;

/**
 *
 * @author Rafael
 */
public class NavegadorArquivosApp {

    String[] cmd = null;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private NavegadorArquivos navegador;

    public NavegadorArquivosApp() {
        navegador = new NavegadorArquivos();

    }

    public void iniciar() throws IOException {

        do {

            try {
                System.out.println(navegador.dataagora() + "  Help? " + "\nA Bagaça se encontra aqui: " + navegador.mostraCaminho());
                String linha = reader.readLine();
                cmd = linha.split(" ");

                if (cmd[0].equalsIgnoreCase("cd")) {
                    entrarNoDiretorio(cmd[1]);

                } else if (cmd[0].equalsIgnoreCase("cd..")) {
                    voltarDiretorio();
                } else if (cmd[0].equalsIgnoreCase("ls")) {
                    listarDiretorio();
                    if (cmd.length > 1) {
                        abrirDiretorio(cmd[1]);
                    }

                } else if (cmd[0].equalsIgnoreCase("help")) {

                    help();

                } else if (cmd[0].equalsIgnoreCase("ping")) {
                    try {
                        ping(cmd[1]);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro digite o host "+e);
                    }
                } else if (cmd[0].equalsIgnoreCase("create")) {

                    if ((cmd[1].equalsIgnoreCase("txt"))) {

                        if (cmd[2] != null) {
                            String texto = reader.readLine();
                            createtxt(cmd[2], texto);
                        } else {
                            throw new IllegalArgumentException("arquivo em branco");
                        }
                    } else if (cmd[1].equalsIgnoreCase("bat")) {
                        if (cmd[2] != null) {
                            String texto = reader.readLine();
                            createtxt(cmd[2], texto);

                        } else {
                            throw new IllegalArgumentException("arquivo em branco");
                        }
                    }

                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        } while (!cmd[0].equalsIgnoreCase("exit"));
    }

    private void help() {
        System.out.println("*            Bem Vindo ao TerminalTruck      *\n*\n*"
                + "* 1.0 )Comando para entrar no diretorio          *\n"
                + "*       Exemplo(cd /NomeDoDiretorio)             *\n\n*"
                + "* 2.0 )Comando para Voltar diretorio             *\n"
                + "*       Exemplo(cd..)                              *\n*\n*"
                + "* 3.0 )Comando para entrar e listar diretorio    *\n"
                + "*       Exemplo(ls)                           *\n*\n*"
                + "* 4.0 )Comando para entrar e listar diretorio    *\n"
                + "*       Exemplo(ls /NomeDoDiretorio)            * \n*\n*"
                + "* 5.0 )Comando para entrar e listar diretorio    *\n"
                + "*       Exemplo(create tipoarquivo (\\enter )(digita texto))* \n*\n*"
                + "* 6.0 )Comando para entrar e listar diretorio    *\n"
                + "*       Exemplo(ping /Host)            * \n*\n*"
                + "* 7.0 )Comando sair do TerminalTruck    *\n"
                + "*        Exemplo(exit)            * \n*\n*");
    }

    private void ping(String pinga) {
        navegador.ping(pinga);
    }

    private void voltarDiretorio() {
        navegador.voltaCaminho();
    }

    private void createtxt(String nomedoarquivo, String texto) {
        try {
            navegador.criarArquivoTxt(nomedoarquivo, texto);
            System.out.println("Criado com sucesso");
        } catch (Exception e) {
            System.out.println(e + "Erro ao criar");
        }

    }

    private void createbat(String nomedoarquivo, String texto) {
        try {
            navegador.criarArquivoBat(nomedoarquivo, texto);
            System.out.println("Criado com sucesso");
        } catch (Exception e) {
            System.out.println(e + "Erro ao criar");
        }

    }

    private void abrirDiretorio(String caminho) throws IOException {
        try {
            List<Path> arquivos = navegador.listarArquivos(caminho);
            for (Path p : arquivos) {
                System.out.println(p.getFileName());
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

    private void entrarNoDiretorio(String caminho) throws IOException {

        navegador.atualzaCaminho(caminho);

    }

    private void listarDiretorio() {
        try {
            List<Path> arquivos = navegador.listarArquivos();
            for (Path p : arquivos) {
                System.out.println(p.toFile());

            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        new NavegadorArquivosApp().iniciar();
    }
}
