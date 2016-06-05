    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projetox.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class Linha {

    private final List<String> Documento = new ArrayList<>();

    public void setLinha(String linha) {
        Documento.add(linha);
    }

    public String getListaComPosi(int i) {
        String linha = Documento.get(i);
        return linha;
    }

    public int getTamanhoDocumento() {
      return Documento.size();
    }
}
