package br.ufms.casamentoPerfeito.controller;

import br.ufms.casamentoPerfeito.model.Homem;
import br.ufms.casamentoPerfeito.model.Mulher;
import br.ufms.casamentoPerfeito.model.Pessoa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class CupidoAntHomo {

    Padre padre = new Padre();
    BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
    int n;

    public void AddCasais() throws IOException {

        for (int i = 0; i < (n * 2); i++) {
            String[] info = leia.readLine().split(" ");
            Pessoa pessoa;
            if (i < n) {
                pessoa = new Homem(info[1], Integer.parseInt(info[0]));
            } else {
                pessoa = new Mulher(info[1], Integer.parseInt(info[0]));
            }
            padre.add(pessoa);
        }

        for (Homem h : padre.listHome) {
            List<Mulher> mulherpref = new ArrayList();
            String[] info = leia.readLine().split(" ");
            for (String info1 : info) {
                mulherpref.add(padre.getMulher(Integer.parseInt(info1)));
            }
            h.pref = mulherpref;
            h.Copiapref = mulherpref;
        }
        for (Mulher m : padre.listMulher) {
            List<Homem> homempref = new ArrayList();
            String[] info = leia.readLine().split(" ");
            for (String info1 : info) {
                homempref.add(padre.getHomem(Integer.parseInt(info1)));
            }
            m.pref = homempref;
        }
        padre.noivar();

    }

    public int Pontos() {
        return padre.Pontos();
    }

    public void numerodeCasais() throws IOException {
        n = Integer.parseInt(leia.readLine());
    }

    public void imprimirCasais() {
        int i = 0;
        for (Homem homem : padre.listHome) {
            System.out.println("Casal Numero º" + (++i) + "  : " + homem.nome.substring(0, 1).toUpperCase().concat(homem.nome.substring(1)) + " Casou-se com : " + homem.mulhercasada.nome.substring(0, 1).toUpperCase().concat(homem.mulhercasada.nome.substring(1)));
        }
    }
}
