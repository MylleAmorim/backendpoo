package com.backendpoo.model;

import com.backendpoo.utils.DataUtil;

import java.util.Date;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente ( String agencia, String conta , Integer digito,Double saldoInicial) {
        super(agencia,conta,digito,saldoInicial);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("********************************");
        System.out.println("****** Extrato Bancario *******");
        System.out.println("********************************");
        System.out.println();

        System.out.println("Gerado em : " + DataUtil.converterDateParaDataEHora(new Date()));

        for (Movimentacao movimentacao:this.movimentacoes){
            System.out.println(movimentacao);
            System.out.println();

        }
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println();

    }


}
