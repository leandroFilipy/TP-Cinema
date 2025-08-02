package com.app.cinema.view;
import java.util.Scanner;


public class Atendente {

    Scanner read = new Scanner(System.in);



    public int Menu () {

        System.out.println("||=====================================||");
        System.out.println("||                                     ||");
        System.out.println("||               Bem-Vindo             ||");
        System.out.println("||                                     ||");
        System.out.println("||-------------------------------------||");
        System.out.println("||          O que deseja fazer?        ||");
        System.out.println("||-------------------------------------||");
        System.out.println("|| 1 - Cadastrar Filme                 ||");
        System.out.println("|| 2 - Pesquisar Filme                 ||");
        System.out.println("|| 3 - Remover Filme                   ||");
        System.out.println("|| 0 - Sair do Sistema                 ||");
        System.out.println("||=====================================||");
        System.out.print("  || Insira sua escolha:                 ||");
        int escolha = read.nextInt();

        return escolha;
    }

    public int escolhaOqueCadastrar() {

        System.out.println("||-------------------------------------||");
        System.out.println("||        O que deseja Cadastrar?      ||");
        System.out.println("||-------------------------------------||");
        System.out.println("|| 1 - Cadastrar Filme                 ||");
        System.out.println("|| 2 - Cadastrar Curta Metragem        ||");
        System.out.println("|| 3 - Cadastrar Longa Metragem        ||");
        System.out.println("||=====================================||");
        System.out.print("  || Insira sua escolha:                 ||");
        int escolhaOqueCadastrar = read.nextInt();

        return escolhaOqueCadastrar;
    }

    public String escolhaNome() {

        System.out.print("||-------------------------------------||");
        System.out.print("||Insira o Nome do Filme:              ||");
        String nome = read.nextLine();

        return nome;
    }
    public String escolhaDuracao() {

        System.out.print("||-------------------------------------||");
        System.out.print("||Insira a Duração do Filme:           ||");
        String duracao = read.nextLine();

        return duracao;
    }
    public int escolhaClassificacaoIndicativa() {

        System.out.print("||-------------------------------------||");
        System.out.print("||Classificação Indicativa do Filme:   ||");
        int classificacaoIndicativa = read.nextInt();

        return classificacaoIndicativa;
    }
    public String escolhaGenero() {

        System.out.print("||-------------------------------------||");
        System.out.print("||Insira o Genêro do Filme:            ||");
        String genero = read.nextLine();

        return genero;
    }

    public int escolhaId() {

        System.out.print("||-------------------------------------||");
        System.out.print("||Insira o ID do Filme:            ||");
        int id1 = read.nextInt();

        return id1;
    }


}
