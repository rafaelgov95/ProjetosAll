/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio18;

/**
 *
 * @author rafael
 */
public class Birnario {

    String bin = "";
    int retorno = 0;

//    public String BinarioRec(int num) {
//
//    }
    public int Decimanl(int num) {
        String numm = String.valueOf(num);
        char[] array = numm.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            int n = Integer.parseInt(String.valueOf(array[i]));
            if (n == 1) {
                retorno += Math.pow(2, (array.length - i))/2;
            }

        }
        return retorno;
    }

    public String Binario(int num) {

        while (num > 0) {
            //if de uma linha perguntando se num mod 2 e igual a 0 ou igual 1;
            bin = ((num % 2 == 0) ? "0" : "1") + bin;
            num /= 2;
        }
        return bin;
    }
}
