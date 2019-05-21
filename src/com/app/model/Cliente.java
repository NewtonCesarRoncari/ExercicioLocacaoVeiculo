package com.app.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataFinal;
    private String telefone;
    private String endereco;

    public String getNome ( ) {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getCpf ( ) {
        return cpf;
    }

    public void setCpf ( String cpf ) {
        this.cpf = cpf;
    }

    public String getDataFinal ( ) {
        return dataFinal;
    }

    public void setDataFinal ( String dataFinal ) {
        this.dataFinal = dataFinal;
    }

    public String getTelefone ( ) {
        return telefone;
    }

    public void setTelefone ( String telefone ) {
        this.telefone = telefone;
    }

    public String getEndereco ( ) {
        return endereco;
    }

    public void setEndereco ( String endereco ) {
        this.endereco = endereco;
    }

    public Cliente ( String nome, String cpf, String dataFinal, String telefone, String endereco ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataFinal = dataFinal;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
