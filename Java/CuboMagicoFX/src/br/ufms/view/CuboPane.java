package br.ufms.view;

import br.ufms.controller.CuboMagicoContainerController;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class CuboPane extends GridPane {

    public final FaceCuboPane[] faces;
    public final CuboLayout layout;
    private Color aux, aux2, aux3, aux4;
    private FaceCuboPane faceAux;
    private String evidencia;

    ;
    public CuboPane() {
        this.faces = new FaceCuboPane[6];
        faces[0] = new FaceCuboPane(Color.WHITE);
        faces[1] = new FaceCuboPane(Color.YELLOW);
        faces[2] = new FaceCuboPane(Color.BLUE);
        faces[3] = new FaceCuboPane(Color.GREEN);
        faces[4] = new FaceCuboPane(Color.ORANGE);
        faces[5] = new FaceCuboPane(Color.RED);
        this.layout = new CuboLayout();
        inicializar();

    }

    

    private void inicializar() {

        for (int i = 0; i < 6; i++) {
            getChildren().add(faces[i]);
        }

        brancoEvidencia();

    }

    public FaceCuboPane atualiza() {
        return layout.getFrente();
    }

    public void azulEvidencia() {

        layout.setFrente(faces[2]);
        layout.setAtras(faces[3]);
        layout.setDireita(faces[1]);
        layout.setEsquerda(faces[0]);
        layout.setCima(faces[4]);
        layout.setBaixo(faces[5]);
    }

    public void vermelhoEvidencia() {

        layout.setFrente(faces[5]);
        layout.setAtras(faces[4]);
        layout.setDireita(faces[2]);
        layout.setEsquerda(faces[3]);
        layout.setCima(faces[0]);
        layout.setBaixo(faces[1]);
    }

    public void amareloEvidencia() {

        layout.setFrente(faces[1]);
        layout.setAtras(faces[0]);
        layout.setDireita(faces[3]);
        layout.setEsquerda(faces[2]);
        layout.setCima(faces[4]);
        layout.setBaixo(faces[5]);
    }

    public void verdeEvidencia() {

        layout.setFrente(faces[3]);
        layout.setAtras(faces[2]);
        layout.setDireita(faces[0]);
        layout.setEsquerda(faces[1]);
        layout.setCima(faces[4]);
        layout.setBaixo(faces[5]);
    }

    public void brancoEvidencia() {

        layout.setFrente(faces[0]);
        layout.setAtras(faces[1]);
        layout.setDireita(faces[2]);
        layout.setEsquerda(faces[3]);
        layout.setCima(faces[4]);
        layout.setBaixo(faces[5]);

    }

    public void laranjaEvidencia() {

        layout.setFrente(faces[4]);
        layout.setAtras(faces[5]);
        layout.setDireita(faces[2]);
        layout.setEsquerda(faces[3]);
        layout.setCima(faces[1]);
        layout.setBaixo(faces[0]);
    }

    public void rotorEvidenciaAmareloVermelho() {

        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[5]);
    }

    public void rotorEvidenciaAmareloVerde() {

        girarAntFaceHorario(faces[4]);
        girarFaceHorario(faces[5]);

    }

    public void rotorEvidenciaEntradoAzulSaindoDoBranco() {

        girarFaceHorario(faces[4]);
        girarAntFaceHorario(faces[5]);
    }

    public void rotorEvidenciaEntrandoVerdeSaidoAzul() {
        girarFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);
        girarFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);

    }

    public void rotorEvidenciaBrancoSaindoDoVerde() {
        girarFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);

    }

    public void rotorEvidenciaSaidaAzulParaOBranco() {
        girarFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);

    }

    public void rotorEvidenciaVermelhoBranco() {
        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);
    }

    public void rotorEvidenciaLaranjaVermelh() {
        girarFaceHorario(faces[2]);
        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[3]);
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[4]);

    }

    public void rotorEvidenciaVermelhLaranja() {
        girarAntFaceHorario(faces[2]);
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[3]);
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);
        girarAntFaceHorario(faces[4]);
    }

    public void rotorEvidenciaAmareloVermelh() {

        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);

    }

    public void rotorEvidenciaVerdeVermelho() {
        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[3]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
    }

    public void rotorEvidenciaVermelhoVerde() {
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[3]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);
    }

    public void rotorEvidenciaVermelhoAmarelo() {
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
    }

    public void rotorEvidenciaBrancoVermelho() {
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[4]);
        girarAntFaceHorario(faces[4]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
    }

    public void rotorEvidenciaLaranjaBranco() {
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);

    }

    public void rotorEvidenciaAzulVermelho() {
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[2]);
        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);
    }

    public void rotorEvidenciaVermelhoAzul() {
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[2]);
        girarAntFaceHorario(faces[4]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
    }

    public void rotorEvidenciaLaranjaVerde() {
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[4]);

        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);
    }

    public void rotorEvidenciaLaranjaAmarelo() {
        girarAntFaceHorario(faces[2]);
        girarFaceHorario(faces[3]);
        girarFaceHorario(faces[4]);

        girarFaceHorario(faces[4]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);

    }

    public void rotorEvidenciaAmareloLaranha() {
        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[3]);
        girarAntFaceHorario(faces[4]);

        girarAntFaceHorario(faces[4]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);

    }

    public void rotorEvidenciaVerdeLaranja() {
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[4]);

        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
    }

    public void rotorEvidenciaAzulLaranja() {
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[1]);
        girarFaceHorario(faces[2]);
        girarFaceHorario(faces[5]);
        girarFaceHorario(faces[4]);
    }

    public void rotorEvidenciaLaranjaAzul() {
        girarFaceHorario(faces[3]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[2]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);
    }

    public void rotorEvidenciaBrancoLaranja() {
        girarAntFaceHorario(faces[3]);
        girarFaceHorario(faces[2]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[5]);
        girarAntFaceHorario(faces[1]);
        girarAntFaceHorario(faces[1]);
    }

    public void rotorEvidenciaEntradaNoAzulSaindoDoAmarelo() {
        girarFaceHorario(faces[5]);
        girarAntFaceHorario(faces[4]);

    }

    public void rotorEvidenciaEntradaNoAmareloSaindoDoAzul() {
        girarAntFaceHorario(faces[5]);
        girarFaceHorario(faces[4]);

    }

    public void rotacionar(FaceCuboPane face, Rotacao rotacao) {

    }

    public void rotacionar(int op) {
        if (op == 1) {
            girarAntFaceHorario(layout.getFrente());
            rotacionarCantoFaceAntHora();
        } else if (op == 0) {
            girarFaceHorario(layout.getFrente());
            rotacionarCantoFaceHora();

        }
    }

    public void geralEsquerdaDirita(int lado, int esdi) {

        if (lado == 1 & esdi == 0) {

            girarAntFaceHorario(layout.getCima());

            girarFaceHorario(layout.getBaixo());
            geralDireita(0);
            geralDireita(2);

        } else if (lado == 1 & esdi == 1) {

            girarFaceHorario(layout.getCima());

            girarAntFaceHorario(layout.getBaixo());
            geralEsquerda(0);
            geralEsquerda(2);
        } else if ((lado == 0 & esdi == 0 || lado == 0 & esdi == 1) || (lado == 2 & esdi == 0 || lado == 2 & esdi == 1)) {
            if (lado == 0 && esdi == 0) {
                girarFaceHorario(layout.getCima());
                geralEsquerda(lado);

            } else if (lado == 0 && esdi == 1) {
                girarAntFaceHorario(layout.getCima());
                geralDireita(lado);

            } else if (lado == 2 && esdi == 0) {
                girarAntFaceHorario(layout.getBaixo());
                geralEsquerda(lado);

            } else if (lado == 2 && esdi == 1) {
                girarFaceHorario(layout.getBaixo());
                geralDireita(lado);

            }
        }

    }

    public void geralCimaBaixo(int lado, int esdi) {

        if (lado == 4 & esdi == 0) {
            girarAntFaceHorario(layout.getEsquerda());
            girarFaceHorario(layout.getDireita());
            geralCima(3);
            geralCima(5);

        } else if (lado == 4 & esdi == 1) {
            girarFaceHorario(layout.getEsquerda());
            girarAntFaceHorario(layout.getDireita());
            geralBaixo(3);
            geralBaixo(5);

        } else if ((lado == 3 & esdi == 0) || (lado == 3 & esdi == 1) || (lado == 5 & esdi == 0) || (lado == 5 & esdi == 1)) {
            if (lado == 3 && esdi == 0) {
                girarFaceHorario(layout.getEsquerda());
                geralBaixo((lado));

            } else if (lado == 3 && esdi == 1) {
                girarAntFaceHorario(layout.getEsquerda());
                geralCima(lado);

            } else if (lado == 5 && esdi == 0) {
                girarAntFaceHorario(layout.getDireita());
                geralBaixo(lado);

            } else if (lado == 5 && esdi == 1) {

                girarFaceHorario(layout.getDireita());
                geralCima(lado);

            }
        }

    }

    public void rotacionarCantoFaceAntHora() {

        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getBaixo().retangulos[troca(i)][0].getFill();
            aux2 = (Color) layout.getDireita().retangulos[0][i].getFill();
            aux3 = (Color) layout.getCima().retangulos[i][2].getFill();
            aux4 = (Color) layout.getEsquerda().retangulos[2][troca(i)].getFill();
            layout.getDireita().setCor((Color) aux, 0, i);
            layout.getCima().setCor((Color) aux2, i, 2);
            layout.getEsquerda().setCor((Color) aux3, 2, troca(i));
            layout.getBaixo().setCor((Color) aux4, troca(i), 0);

        }
    }

    public void rotacionarCantoFaceHora() {
        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getBaixo().retangulos[troca(i)][0].getFill();
            aux2 = (Color) layout.getDireita().retangulos[0][i].getFill();
            aux3 = (Color) layout.getCima().retangulos[i][2].getFill();
            aux4 = (Color) layout.getEsquerda().retangulos[2][troca(i)].getFill();
            layout.getDireita().setCor((Color) aux3, 0, i);
            layout.getCima().setCor((Color) aux4, i, 2);
            layout.getEsquerda().setCor((Color) aux, 2, troca(i));
            layout.getBaixo().setCor((Color) aux2, troca(i), 0);

        }
    }

    public int troca(int linha) {
        int lado = 0;
        if (linha == 0) {
            lado = 2;
        } else if (linha == 1) {
            lado = 1;
        } else if (linha == 2) {
            lado = 0;
        }
        return lado;
    }

    public void geralBaixo(int linha) {
        linha = linha - 3;
        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getFrente().retangulos[linha][troca(i)].getFill();
            aux2 = (Color) layout.getBaixo().retangulos[linha][troca(i)].getFill();
            aux3 = (Color) layout.getAtras().retangulos[troca(linha)][i].getFill();
            aux4 = (Color) layout.getCima().retangulos[linha][troca(i)].getFill();
            layout.getFrente().setCor((Color) aux4, linha, troca(i));
            layout.getBaixo().setCor((Color) aux, linha, troca(i));
            layout.getAtras().setCor((Color) aux2, troca(linha), i);
            layout.getCima().setCor((Color) aux3, linha, troca(i));

        }
    }

    public void geralCima(int linha) {
        linha = linha - 3;
        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getFrente().retangulos[linha][troca(i)].getFill();
            aux2 = (Color) layout.getCima().retangulos[linha][troca(i)].getFill();
            aux3 = (Color) layout.getAtras().retangulos[troca(linha)][i].getFill();
            aux4 = (Color) layout.getBaixo().retangulos[linha][troca(i)].getFill();
            layout.getFrente().setCor((Color) aux4, linha, troca(i));
            layout.getCima().setCor((Color) aux, linha, troca(i));
            layout.getAtras().setCor((Color) aux2, troca(linha), i);
            layout.getBaixo().setCor((Color) aux3, linha, troca(i));
        }

    }

    public void geralDireita(int lado) {
        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getFrente().retangulos[i][lado].getFill();
            aux2 = (Color) layout.getDireita().retangulos[i][lado].getFill();
            aux3 = (Color) layout.getAtras().retangulos[i][lado].getFill();
            layout.getFrente().setCor((Color) layout.getEsquerda().retangulos[i][lado].getFill(), i, lado);
            layout.getDireita().setCor((Color) aux, i, lado);
            layout.getAtras().setCor((Color) aux2, i, lado);
            layout.getEsquerda().setCor((Color) aux3, i, lado);
        }

    }

    public void geralEsquerda(int lado) {

        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getFrente().retangulos[i][lado].getFill();
            aux2 = (Color) layout.getEsquerda().retangulos[i][lado].getFill();
            aux3 = (Color) layout.getAtras().retangulos[i][lado].getFill();
            layout.getFrente().setCor((Color) layout.getDireita().retangulos[i][lado].getFill(), i, lado);
            layout.getEsquerda().setCor((Color) aux, i, lado);
            layout.getAtras().setCor((Color) aux2, i, lado);
            layout.getDireita().setCor((Color) aux3, i, lado);

        }

    }

    public void girarCantoFrenteHorario() {
        for (int i = 0; i < 3; i++) {
            aux = (Color) layout.getBaixo().retangulos[i][0].getFill();
            aux2 = (Color) layout.getDireita().retangulos[i][0].getFill();
            aux3 = (Color) layout.getAtras().retangulos[i][0].getFill();
            layout.getFrente().setCor((Color) layout.getEsquerda().retangulos[i][0].getFill(), i, 0);
            layout.getEsquerda().setCor((Color) aux3, i, 0);
            layout.getAtras().setCor((Color) aux2, i, 0);
            layout.getDireita().setCor((Color) aux, i, 0);

        }
    }

    public void girarAntFaceHorario(FaceCuboPane face) {
        aux = (Color) face.retangulos[0][0].getFill();
        aux2 = (Color) face.retangulos[2][0].getFill();
        aux3 = (Color) face.retangulos[0][2].getFill();
        aux4 = (Color) face.retangulos[2][2].getFill();

        face.setCor(aux, 0, 2);
        face.setCor(aux2, 0, 0);
        face.setCor(aux3, 2, 2);
        face.setCor(aux4, 2, 0);

        aux = (Color) face.retangulos[0][1].getFill();
        aux2 = (Color) face.retangulos[1][0].getFill();
        aux3 = (Color) face.retangulos[1][2].getFill();
        aux4 = (Color) face.retangulos[2][1].getFill();

        face.setCor(aux, 1, 2);
        face.setCor(aux2, 0, 1);
        face.setCor(aux3, 2, 1);
        face.setCor(aux4, 1, 0);

    }

    public void girarFaceHorario(FaceCuboPane face) {
        aux = (Color) face.retangulos[0][0].getFill();
        aux2 = (Color) face.retangulos[2][0].getFill();
        aux3 = (Color) face.retangulos[0][2].getFill();
        aux4 = (Color) face.retangulos[2][2].getFill();

        face.setCor(aux3, 0, 0);
        face.setCor(aux4, 0, 2);
        face.setCor(aux2, 2, 2);
        face.setCor(aux, 2, 0);

        aux = (Color) face.retangulos[0][1].getFill();
        aux2 = (Color) face.retangulos[1][0].getFill();
        aux3 = (Color) face.retangulos[1][2].getFill();
        aux4 = (Color) face.retangulos[2][1].getFill();

        face.setCor(aux4, 1, 2);
        face.setCor(aux2, 2, 1);
        face.setCor(aux3, 0, 1);
        face.setCor(aux, 1, 0);

    }

    public FaceCuboPane getFaceCubo(Color cor) {
        if (cor == Color.WHITE) {
            return faces[0];
        } else if (cor == Color.YELLOW) {
            return faces[1];
        } else if (cor == Color.BLUE) {
            return faces[2];
        } else if (cor == Color.GREEN) {
            return faces[3];
        } else if (cor == Color.ORANGE) {
            return faces[4];
        } else if (cor == Color.RED) {
            return faces[5];
        } else {
            return null;
        }
    }
}
