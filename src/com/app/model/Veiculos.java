package com.app.model;

public abstract class Veiculos {
    private String cor;
    private float capacidade;
    private float potencia;
    private float custo;
    private String tipo;

    public String getCor ( ) {
        return cor;
    }

    public void setCor ( String cor ) {
        this.cor = cor;
    }

    public float getCapacidade ( ) {
        return capacidade;
    }

    public void setCapacidade ( float capacidade ) {
        this.capacidade = capacidade;
    }

    public float getPotencia ( ) {
        return potencia;
    }

    public void setPotencia ( float potencia ) {
        this.potencia = potencia;
    }

    public float getCusto ( ) {
        return custo;
    }

    public void setCusto ( float custo ) {
        this.custo = custo;
    }

    public String getTipo ( ) {
        return tipo;
    }

    public void setTipo ( String tipo ) {
        this.tipo = tipo;
    }

    public abstract String RetornaTipo();

}
