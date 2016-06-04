/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FaceCuboPane extends GridPane {

    private final Color cor;
    public final Rectangle[][] retangulos;

    public FaceCuboPane(Color color) {
        this.cor = color;
        this.retangulos = new Rectangle[3][3];

        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // cria o retângulo na cor desta face
                Rectangle r = new Rectangle(30, 30, cor);
                retangulos[i][j] = r;
                // pinta a borda de preto
                r.setStroke(Color.BLACK);

                // adiciona o retangulo
                getChildren().add(r);
                // marca este retângulo para ficar na posição i, j do grid
                GridPane.setConstraints(r, i, j);
            }
        }
    }

    public void zerar() {
        inicializar();
    }

    public Color getColor() {
        return cor;
    }

    public Rectangle[][] getMatriz() {
        return retangulos;
    }

    public void setCor(Color cor, int i, int j) {
        if ((i < 0 || i >= 3) || (j < 0 || j >= 3)) {
            throw new IllegalArgumentException("Posição não existente na matriz");
        }
        retangulos[i][j].setFill(cor);

    }
}
