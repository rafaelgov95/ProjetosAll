/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.java2;

import java.util.Scanner;

/**
 *
 * @author rafaelgov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua2=true, continua = true;
        int contn,cont;
        float media, teste1,temporal;
        do {
             cont = 0;
             temporal = 0;
 
            do {
                 teste1 = Float.parseFloat(sc.nextLine());
                if (teste1 >= 0 && teste1 <= 10.0) {
                    temporal += teste1;
                    cont++;
                } else {
                    System.out.println("nota invalida");
                }
 
            } while (cont <= 1);
             media =temporal/2
                     ;
 
            System.out.printf("media  = %.2f"
                    + media);
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                contn= Integer.parseInt(sc.nextLine());
                if(contn==1){
                continua2= false;
                }else if(contn==2){
                continua=false;
                continua2=false;
                }
            }while(continua2);
        } while (continua);
    }
}
