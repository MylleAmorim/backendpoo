package com.backendpoo;

import com.backendpoo.model.ContaBancaria;
import com.backendpoo.model.ContaCorrente;
import com.backendpoo.model.ContaPoupanca;

public class App {

    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();



        ContaBancaria conta = new ContaCorrente("0001", "1904" , 5 , 100.0 );
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001", "1905" , 6 , 200.0);

        conta2.transferir(100.0,conta);
        System.out.println("Saldo da conta destino de R$" + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();


















    }

}