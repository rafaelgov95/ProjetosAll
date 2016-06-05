/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio12;

import br.ufms.exercicio11.*;

/**
 *
 * @author rafael
 */
public class Crecente {


    public void crescente(int a) {
        if (a >= 0) {
            if (a % 2 == 0) {
                System.out.print(a+" ");
            }
          
            crescente(a-1);
        }

    }

}
