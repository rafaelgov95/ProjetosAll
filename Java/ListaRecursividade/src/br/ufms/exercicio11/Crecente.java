/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio11;

/**
 *
 * @author rafael
 */
public class Crecente {

    int cont = 2;

    public void crescente(int a) {
        if (cont < a) {
            if (cont % 2 == 0) {
                System.out.print(cont+" ");
            }
            cont++;
            crescente(a);
        }

    }

}
