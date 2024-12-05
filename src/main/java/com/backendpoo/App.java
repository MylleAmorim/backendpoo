package com.backendpoo;

import com.backendpoo.model.ContaBancaria;
import com.backendpoo.model.ContaCorrente;
import com.backendpoo.model.ContaPoupanca;
import com.backendpoo.model.Movimentacao;
import com.backendpoo.utils.DataUtil;

import static com.backendpoo.utils.DataUtil.*;

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

        System.out.println(conta2.getDataAbertura());

        var f1 = converterDateParaDataEHora(conta2.getDataAbertura());
        var f2 = converterDateParaData(conta2.getDataAbertura());
        var f3 = converterDateParaHora(conta2.getDataAbertura());
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        conta.imprimirExtrato();
        conta2.imprimirExtrato();

        Movimentacao movimentacao = new Movimentacao("Saque",100.0);
        System.out.println(movimentacao);

























    }

}