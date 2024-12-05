package com.backendpoo.model;

import com.backendpoo.utils.DataUtil;

import java.util.Date;

public class Movimentacao extends Object {
    private String descricao;
    private Date data;
    private Double valor;

    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }


    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.descricao + "\n" + DataUtil.converterDateParaDataEHora(this.data) + " - " + this.valor;
    }
}
