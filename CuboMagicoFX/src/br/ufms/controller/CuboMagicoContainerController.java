/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.controller;

import br.ufms.app.CuboMagicoFXApp;
import br.ufms.view.CuboPane;
import br.ufms.view.FaceCuboPane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Rafael Viana
 */
public class CuboMagicoContainerController implements Initializable {

    @FXML
    private ToggleButton btnBranco;
    @FXML
    private ToggleButton btnAmarelo;
    @FXML
    private ToggleButton btnVerde;
    @FXML
    private ToggleButton btnAzul;
    @FXML
    private ToggleButton btnLaranja;
    @FXML
    private ToggleButton btnVermelho;

    @FXML
    private ToggleGroup colorToggleGroup;
    @FXML
    private ToggleGroup rowColumnToggleGroup;

    @FXML
    private StackPane faceCuboBackground;
    @FXML
    private StackPane container;
    private CuboPane cuboPane;
    private FaceCuboPane faceAmostra;

    @FXML
    private Button btnAntiHorario;
    @FXML
    private Button btnHorario;
    @FXML
    private Button btnEsquerdaBaixo;
    @FXML
    private Button btnDireitaCima;

    @FXML
    private RadioButton radioBtn1;
    @FXML
    private RadioButton radioBtn2;
    @FXML
    private RadioButton radioBtn3;
    @FXML
    private RadioButton radioBtn4;
    @FXML
    private RadioButton radioBtn5;
    @FXML
    private RadioButton radioBtn6;
    @FXML
    public Button zerar;

    private FaceCuboPane faceSelecionada;
    private int lado;
    FaceCuboPane cuboPaneOrigem = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cuboPane = new CuboPane();
        faceAmostra = new FaceCuboPane(Color.WHITE);

        faceCuboBackground.getChildren().add(faceAmostra);
        container.getChildren().add(cuboPane);

        colorToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if (newValue != null) {

                    if (newValue == btnBranco & oldValue != null) {
                        if (oldValue == btnAmarelo) {
                            cuboPane.rotorEvidenciaAmareloVermelho();
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.WHITE);
                        } else if (oldValue == btnAzul) {
                            cuboPane.rotorEvidenciaSaidaAzulParaOBranco();
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.WHITE);
                        } else if (oldValue == btnVerde) {
                            cuboPane.rotorEvidenciaEntradoAzulSaindoDoBranco();
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.WHITE);

                        } else if (oldValue == btnLaranja) {
                            cuboPane.rotorEvidenciaBrancoLaranja();
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.WHITE);
                        } else if (oldValue == btnVermelho) {
                            cuboPane.rotorEvidenciaBrancoVermelho();
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.WHITE);
                        } else {
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.WHITE);

                        }

                    } else if (newValue == btnAmarelo & oldValue != null) {
                        if (oldValue == btnBranco) {
                            cuboPane.rotorEvidenciaAmareloVermelho();
                            cuboPane.amareloEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.YELLOW);
                        } else if (oldValue == btnAzul) {
                            cuboPane.rotorEvidenciaEntradaNoAmareloSaindoDoAzul();
                            cuboPane.amareloEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.YELLOW);
                        } else if (oldValue == btnVerde) {
                            cuboPane.rotorEvidenciaAmareloVerde();
                            cuboPane.amareloEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.YELLOW);
                        } else if (oldValue == btnLaranja) {
                            cuboPane.rotorEvidenciaAmareloLaranha();
                            cuboPane.amareloEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.YELLOW);
                        } else if (oldValue == btnVermelho) {
                            cuboPane.rotorEvidenciaVermelhoAmarelo();
                            cuboPane.amareloEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.YELLOW);
                        } else {
                            faceSelecionada = cuboPane.getFaceCubo(Color.YELLOW);
                            cuboPane.brancoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.YELLOW);
                        }
                    } else if (newValue == btnAzul & oldValue != null) {
                        if (oldValue == btnBranco) {
                            cuboPane.rotorEvidenciaEntradoAzulSaindoDoBranco();
                            cuboPane.azulEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.BLUE);
                        } else if (oldValue == btnAmarelo) {
                            cuboPane.rotorEvidenciaEntradaNoAzulSaindoDoAmarelo();
                            cuboPane.azulEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.BLUE);
                        } else if (oldValue == btnVerde) {
                            cuboPane.rotorEvidenciaEntrandoVerdeSaidoAzul();
                            cuboPane.azulEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.BLUE);
                        } else if (oldValue == btnLaranja) {
                            cuboPane.rotorEvidenciaAzulLaranja();
                            cuboPane.azulEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.BLUE);
                        } else if (oldValue == btnVermelho) {
                            cuboPane.rotorEvidenciaVermelhoAzul();
                            cuboPane.azulEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.BLUE);
                        } else {
                            cuboPane.azulEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.BLUE);
                        }

                    } else if (newValue == btnVerde & oldValue != null) {
                        if (oldValue == btnBranco) {
                            cuboPane.rotorEvidenciaSaidaAzulParaOBranco();
                            cuboPane.verdeEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.GREEN);
                        } else if (oldValue == btnAmarelo) {
                            cuboPane.rotorEvidenciaEntradoAzulSaindoDoBranco();
                            cuboPane.verdeEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.GREEN);
                        } else if (oldValue == btnAzul) {
                            cuboPane.rotorEvidenciaEntrandoVerdeSaidoAzul();
                            cuboPane.verdeEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.GREEN);
                        } else if (oldValue == btnLaranja) {
                            cuboPane.rotorEvidenciaVerdeLaranja();
                            cuboPane.verdeEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.GREEN);
                        } else if (oldValue == btnVermelho) {
                            cuboPane.rotorEvidenciaVermelhoVerde();
                            cuboPane.verdeEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.GREEN);
                        } else {
                            cuboPane.verdeEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.GREEN);
                        }
                    } else if (newValue == btnLaranja & oldValue != null) {
                        if (oldValue == btnBranco) {
                            cuboPane.rotorEvidenciaLaranjaBranco();
                            cuboPane.laranjaEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.ORANGE);
                        } else if (oldValue == btnAzul) {
                            cuboPane.rotorEvidenciaLaranjaAzul();
                            cuboPane.laranjaEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.ORANGE);
                        } else if (oldValue == btnAmarelo) {
                            cuboPane.rotorEvidenciaLaranjaAmarelo();
                            cuboPane.laranjaEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.ORANGE);
                        } else if (oldValue == btnVerde) {
                            cuboPane.rotorEvidenciaLaranjaVerde();
                            cuboPane.laranjaEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.ORANGE);
                        } else if (oldValue == btnVermelho) {
                            cuboPane.rotorEvidenciaVermelhLaranja();
                            cuboPane.laranjaEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.ORANGE);
                        } else {
                            cuboPane.laranjaEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.ORANGE);
                        }

                    } else if (newValue == btnVermelho & oldValue != null) {
                        if (oldValue == btnBranco) {
                            cuboPane.rotorEvidenciaVermelhoBranco();
                            cuboPane.vermelhoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.RED);
                        } else if (oldValue == btnAzul) {
                            cuboPane.rotorEvidenciaAzulVermelho();
                            cuboPane.vermelhoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.RED);
                        } else if (oldValue == btnAmarelo) {
                            cuboPane.rotorEvidenciaAmareloVermelh();
                            cuboPane.vermelhoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.RED);
                        } else if (oldValue == btnVerde) {
                            cuboPane.rotorEvidenciaVerdeVermelho();
                            cuboPane.vermelhoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.RED);
                        } else if (oldValue == btnLaranja) {
                            cuboPane.rotorEvidenciaLaranjaVermelh();
                            cuboPane.vermelhoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.RED);
                        } else {
                            cuboPane.vermelhoEvidencia();
                            cuboPaneOrigem = cuboPane.getFaceCubo(Color.RED);
                        }

                    }
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            faceAmostra.setCor((Color) cuboPaneOrigem.getMatriz()[i][j].getFill(), i, j);
                        }
                    }
                }
            }

        }
        );

        Image icone1 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/antihorario.png"));

        btnAntiHorario.setGraphic(
                new ImageView(icone1));
        Image icone2 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/horario.png"));

        btnHorario.setGraphic(
                new ImageView(icone2));
        icone1 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/setaesquerda.png"));
        icone2 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/setadireita.png"));

        btnEsquerdaBaixo.setGraphic(
                new ImageView(icone1));
        btnDireitaCima.setGraphic(
                new ImageView(icone2));
        rowColumnToggleGroup.selectedToggleProperty()
                .addListener(new ChangeListener<Toggle>() {
                    @Override
                    public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue
                    ) {
                        Image icone1, icone2;

                        if (newValue == radioBtn1 || newValue == radioBtn2 || newValue == radioBtn5) {

                            icone1 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/setaesquerda.png"));
                            icone2 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/setadireita.png"));
                            if (newValue == radioBtn1) {
                                lado = 0;
                            } else if ((newValue == radioBtn2)) {
                                lado = 1;
                            } else if ((newValue == radioBtn5)) {
                                lado = 2;
                            }
                        } else {
                            lado = 1;
                            icone1 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/setacima.png"));
                            icone2 = new Image(getClass().getResourceAsStream("/br/ufms/view/image/setabaixo.png"));

                            if (newValue == radioBtn3) {
                                lado = 3;
                            } else if ((newValue == radioBtn4)) {
                                lado = 4;
                            } else if ((newValue == radioBtn6)) {
                                lado = 5;
                            }
                        }

                        btnEsquerdaBaixo.setGraphic(new ImageView(icone1));
                        btnDireitaCima.setGraphic(new ImageView(icone2));

                        btnEsquerdaBaixo.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {

                                if (lado < 3) {
                                    cuboPane.geralEsquerdaDirita(lado, 0);

                                } else if (lado > 2) {
                                    cuboPane.geralCimaBaixo(lado, 1);

                                }
                                cuboPaneOrigem = cuboPane.atualiza();
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        faceAmostra.setCor((Color) cuboPaneOrigem.getMatriz()[i][j].getFill(), i, j);
                                    }
                                }

                            }
                        });
                        btnDireitaCima.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                if (lado < 3) {
                                    cuboPane.geralEsquerdaDirita(lado, 1);

                                } else if (lado > 2) {

                                    cuboPane.geralCimaBaixo(lado, 0);

                                }
                                cuboPaneOrigem = cuboPane.atualiza();
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        faceAmostra.setCor((Color) cuboPaneOrigem.getMatriz()[i][j].getFill(), i, j);
                                    }
                                }
                            }
                        });
                        btnDireitaCima.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent event) {
                                if (lado < 3) {
                                    cuboPane.geralEsquerdaDirita(lado, 1);

                                } else if (lado > 2) {

                                    cuboPane.geralCimaBaixo(lado, 0);

                                }
                                cuboPaneOrigem = cuboPane.atualiza();
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        faceAmostra.setCor((Color) cuboPaneOrigem.getMatriz()[i][j].getFill(), i, j);
                                    }
                                }
                            }
                        });
                    }
                }
                );

        btnAntiHorario.setOnAction(
                new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event
            ) {
                cuboPane.rotacionar(1);
                cuboPaneOrigem = cuboPane.atualiza();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        faceAmostra.setCor((Color) cuboPaneOrigem.getMatriz()[i][j].getFill(), i, j);
                    }
                }
            }
        }
        );

        btnHorario.setOnAction(
                new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event
            ) {
                cuboPane.rotacionar(0);
                cuboPaneOrigem = cuboPane.atualiza();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        faceAmostra.setCor((Color) cuboPaneOrigem.getMatriz()[i][j].getFill(), i, j);
                    }
                }
            }
        }
        );

        zerar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            
               
            }
        });
    }
}
