/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.agenda2_0.app;

import br.ufms.agenda2_0.controller.Agenda2_0;
import br.ufms.agenda2_0.model.Contato;
import br.ufms.agenda2_0.view.Menu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafaelgov
 */
public class Agenda2_0App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        new Menu(new Agenda2_0(10)).iniciar();
        

    }
}
