/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.java;


import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author rafaelgov
 */
public class exercicio1113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continua2 = true, continua = true;

        String [] media;
        int contn;
        do {
            int cont = 0;
            float temporal = 0;

            do {
                float teste1 = Float.parseFloat(sc.nextLine());
                if (teste1 >= 0 && teste1 <= 10.0) {
                    temporal += teste1;
                    cont++;
                } else {
                    System.out.println("nota invalida");
                }

            } while (cont <= 1);
          
            media=NumberFormat.getCurrencyInstance(Locale.ROOT).format(temporal/2).split("¤ "); 
         
            System.out.println("media = "+media[1]);
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                contn = Integer.parseInt(sc.nextLine());
                if (contn == 1) {
                    continua2 = false;
                } else if (contn == 2) {
                    continua = false;
                    continua2 = false;
                }
            } while (continua2);
        } while (continua);
    }
}
