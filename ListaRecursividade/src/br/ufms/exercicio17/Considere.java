/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio17;

/**
 *
 * @author rafael
 */
public class Considere {

    public int X(int a) {
        if (a <= 0) {
            return 0;
        } else {
            return a + X(a - 1);
        }
    }

    public int X2(int a) {
        int result = 0;
        for (int i = 0; i <=a; i++) {
            result += i;
        }
        return result;
    }
}
