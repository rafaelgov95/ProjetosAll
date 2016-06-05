package br.ufms.casamentoPerfeito.app;

import br.ufms.casamentoPerfeito.controller.CupidoAntHomo;
import br.ufms.casamentoPerfeito.model.Homem;
import java.io.IOException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael
 */
public class CupidoView {

    CupidoAntHomo Cupido = new CupidoAntHomo();

    public void IniciaCupidoView() throws IOException {
        System.out.println("Oi !!Meu nome é Sofi, sou uma Cupida\n"
                + "Você gostaria de casar um grupo de casal certo!?\n"
                + "Agora me fale o numero de casais!");
        Cupido.numerodeCasais();
        System.out.println("Adicione uma lista de nomes começando pelos Homens Logico!\n"
                + "Exemplo:1 rafael\n"
                + "        2 higor\n"
                + "        1 ana\n"
                + "        2 luara\n"
                + "        1 2\n"
                + "        2 1\n"
                + "        1 2\n"
                + "        2 1");
        Cupido.AddCasais();
        Cupido.imprimirCasais();
        System.out.println(Cupido.Pontos() + " Ponto Maximo de Satisfação dos Casais.");

    }
}
