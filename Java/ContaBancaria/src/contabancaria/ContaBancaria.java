/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author rafaelgov
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta outraconta = new Conta();
        conta.depositar(100);
        try {
            conta.sacar(-1000);
        } catch (SaldoInsuficienteException | IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }

}
