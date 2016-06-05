/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import java.util.Random;

class Conta {

//classe e composta por atributos 
    String usuario;
    int senha;
    String dono;
    int numero;
    Double saldo;
    Double limite;

// construtor     
    Conta(String usuario, String dono, int senha) {
        Random gerador = new Random();
        numero = (1000 + gerador.nextInt(9000));
        this.usuario = usuario;
        this.dono = dono;
        this.senha = senha;
        saldo = Double.parseDouble("0");
        limite = Double.parseDouble("0");

    }
//metodos

    void depositar(double valor) {

        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor negativo informado");
        }
        if (valor <= (saldo + limite)) {

            saldo -= valor;

        } else {
            throw new SaldoInsuficienteException();
        }

    }

    public boolean transferir(Conta conta, double valor) {
        try {
            sacar(valor);
            conta.depositar(valor);

        } catch (RuntimeException ex) {

        }
        return true;

    }

    void alteraLimite(double novoLimite) {
        limite = novoLimite;

    }

}
