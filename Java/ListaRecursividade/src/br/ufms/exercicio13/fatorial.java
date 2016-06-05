/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio13;

import br.ufms.exercicio1.*;

/**
 *
 * @author rafael
 */
public class fatorial {

    public static int fatorial(int n) {

        if (n < 0) {

        } else if (n == 1) {
            return 1;

        } else if (n - 1 % 2 == 1) {

        }
        return n * fatorial(n- 2);
    }
}
