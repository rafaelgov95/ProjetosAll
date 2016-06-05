/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.exercicio7;

import br.ufms.exercicio6.*;
import br.ufms.exercicio5.SomaApartirDeN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        InvertaVetor inverter= new InvertaVetor();
        int a = Integer.parseInt(leia.readLine());
        double array[] =new double[a]; 
       
        for(int i=0;i<a;i++){
          array[i] =Double.parseDouble(leia.readLine());
        }
        int b=array.length-1;
                inverter.inv(array, b);
                
  for(int i=0;i<a;i++){
        System.out.println(array[i]);
        }
    }

}
