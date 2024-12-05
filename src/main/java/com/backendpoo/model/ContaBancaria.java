package com.backendpoo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public abstract class ContaBancaria {


    protected String  agencia;
    protected String  conta;
    protected Integer digito;
    protected Double  saldo;
    protected Date    dataAbertura;
    protected ArrayList <Movimentacao> movimentacoes;
    protected  Double VALOR_MINIMO_DEPOSITO = 10.0;


    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        //tem que instanciar o array
        this.movimentacoes = new ArrayList<Movimentacao>();

        //criei minha primeira movimentacao
        Movimentacao movimentacao = new Movimentacao("Abertura de Conta", saldoInicial);
        movimentacoes.add(movimentacao);


    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if(valor<VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor minimo do deposito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo += valor;
        Movimentacao movimentacao = new Movimentacao("Deposito",valor);
        this.movimentacoes.add(movimentacao);

    }

    public void sacar(double valor) {
        this.saldo -= valor;
        Movimentacao movimentacao = new Movimentacao("Retirada de Valor",valor);
        this.movimentacoes.add(movimentacao);

    }

    public void transferir(double valor, ContaBancaria destino) {
        this.saldo -= valor;
        destino.depositar(valor);
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    //Metodo abstrato obriga as classes filhos , que estao herdando da classe mae (c.bancaria) ,a implementar este metodo!
    public abstract void imprimirExtrato();

}

