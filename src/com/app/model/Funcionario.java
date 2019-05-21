package com.app.model;

public class Funcionario extends Cliente {

    private String dataInicioLocacao;
    private float salario;

    public Funcionario ( String nome, String cpf, String dataFinal, String telefone, String endereco ) {
        super(nome, cpf, dataFinal, telefone, endereco);
    }

    public String getDataInicioLocacao ( ) {
        return dataInicioLocacao;
    }

    public void setDataInicioLocacao ( String dataInicioLocacao ) {
        this.dataInicioLocacao = dataInicioLocacao;
    }

    public float getSalario ( ) {
        return salario;
    }

    public void setSalario ( float salario ) {
        this.salario = salario;
    }
}
