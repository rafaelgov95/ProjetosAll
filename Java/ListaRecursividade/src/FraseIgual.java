/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio14;

/**
 *
 * @author rafael
 */
public class FraseIgual {

    public static boolean Frase(String palabra) {
        if (palabra.length() == 1 || palabra.length() == 0) {
            return true;
        } else {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1)) {
                return Frase(palabra.substring(1, palabra.length() - 1));
            }
            return false;
        }
    }
}
