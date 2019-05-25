package com.app;

import com.app.model.*;

public class Main {

    public static void main(String[] args) {
        var quatroPorQuatro = new QuatroPorQuatro();
	System.out.println(quatroPorQuatro.RetornaTipo());

        var ultraLeve = new UltraLeve();
        System.out.println(ultraLeve.RetornaTipo());

        var jetsKi = new JetsKi();
        System.out.println(jetsKi.RetornaTipo());

        var cliente1 = new Cliente(
                "Jose", "10/10/2019", "15/05/2019", "123", "rua dos bobos");

        var funcionario1 = new Funcionario(
                "Ronaldo", "123", "10/15/2019", "321","rua dos bobos");

        var locacao1 = new Locacao(
                 funcionario1, cliente1, ultraLeve, 12, 10,"10/10/2019", "10/01/2019", "10/05/2019");

        locacao1.toString();

        var jetski = new JetsKi();
        System.out.println(jetsKi.RetornaTipo());
       }

}