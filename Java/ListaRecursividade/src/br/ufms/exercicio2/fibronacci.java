/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio2;

/**
 *
 * @author rafael
 */
public class fibronacci {

    public static int fibronacci(int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Erro nao pode ser 0");
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        return fibronacci(n - 1) + fibronacci(n - 2);
    }
}
