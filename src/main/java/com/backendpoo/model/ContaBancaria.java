package com.backendpoo.model;

public abstract class ContaBancaria {


    private String  agencia;
    private String  conta;
    private Integer digito;
    private Double  saldo;

    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
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
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;

    }

    public void transferir(double valor, ContaBancaria destino) {
        this.saldo -= valor;
        destino.depositar(valor);
    }
}
