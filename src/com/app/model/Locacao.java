package com.app.model;

public class Locacao {
    private Funcionario funcionario;
    private Cliente cliente;
    private Veiculos veiculos;
    private float precoLocacao;
    private int diaria;
    private String dataInicio;
    private String dataFinal;
    private String dataEntregue;

    public Funcionario getFuncionario ( ) {
        return funcionario;
    }

    public void setFuncionario ( Funcionario funcionario ) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente ( ) {
        return cliente;
    }

    public void setCliente ( Cliente cliente ) {
        this.cliente = cliente;
    }

    public Veiculos getVeiculos ( ) {
        return veiculos;
    }

    public void setVeiculos ( Veiculos veiculos ) {
        this.veiculos = veiculos;
    }

    public float getPrecoLocacao ( ) {
        return precoLocacao;
    }

    public void setPrecoLocacao ( float precoLocacao ) {
        this.precoLocacao = precoLocacao;
    }

    public int getDiaria ( ) {
        return diaria;
    }

    public void setDiaria ( int diaria ) {
        this.diaria = diaria;
    }

    public String getDataInicio ( ) {
        return dataInicio;
    }

    public void setDataInicio ( String dataInicio ) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal ( ) {
        return dataFinal;
    }

    public void setDataFinal ( String dataFinal ) {
        this.dataFinal = dataFinal;
    }

    public String getDataEntregue ( ) {
        return dataEntregue;
    }

    public void setDataEntregue ( String dataEntregue ) {
        this.dataEntregue = dataEntregue;
    }

    public Locacao ( Funcionario funcionario, Cliente cliente, Veiculos veiculos, float precoLocacao, int diaria, String dataInicio, String dataFinal, String dataEntregue ) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.veiculos = veiculos;
        this.precoLocacao = precoLocacao;
        this.diaria = diaria;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.dataEntregue = dataEntregue;
    }

    @Override
    public String toString ( ) {
        return "Locacao{" +
                "funcionario=" + funcionario +
                ", cliente=" + cliente +
                ", veiculos=" + veiculos +
                ", precoLocacao=" + precoLocacao +
                ", diaria=" + diaria +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                ", dataEntregue='" + dataEntregue + '\'' +
                '}';
    }
}
