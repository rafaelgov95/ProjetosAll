/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscabinaria;

/**
 *
 * @author rafael
 */


public class BuscaBinaria {

  
    public static int buscaBinariaRecursiva(String[] array, int menor, int maior, int chave) {
        int media = (maior + menor) / 2;
        int valorMeio = Integer.parseInt(array[media]);
        if (menor == maior) {
            if (array[menor].equals(String.valueOf(chave))) {
                return menor;
            } else {
            throw  new IllegalArgumentException("Ilegal Argumente");
            }
        }
        if (valorMeio == chave) {
            return media;
        } else if (valorMeio < chave) {
            return buscaBinariaRecursiva(array, media + 1, maior, chave);
        } else {
            return buscaBinariaRecursiva(array, menor, media - 1, chave);
        }
    }
}
