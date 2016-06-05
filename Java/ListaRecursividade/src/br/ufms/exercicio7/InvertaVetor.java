/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio7;

/**
 *
 * @author rafael
 */
public class InvertaVetor {
   int pos=0;
    public double[] inv(double []vet,int num) {
 

	if(num <= pos){
		return vet;
	}else{
		double aux = vet[num];
		vet[num] = vet[pos];
		vet[pos] = aux;
		pos++;
		
		return  inv(vet,(--num));		
	}	  
}
}
