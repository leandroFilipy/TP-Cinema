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
        System.out.print("|| Insira sua escolha: ");
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
        System.out.print("|| Insira sua escolha: ");
        int escolhaOqueCadastrar = read.nextInt();

        return escolhaOqueCadastrar;
    }

    public String escolhaNome() {

        System.out.println("||-------------------------------------||");
        System.out.print("|| Insira o Nome: ");
        String nome = read.nextLine();

        return nome;
    }
    public String escolhaDuracao() {

        System.out.println("||-------------------------------------||");
        System.out.print("|| Insira a Duração: ");
        String duracao = read.nextLine();

        return duracao;
    }
    public int escolhaClassificacaoIndicativa() {

        System.out.println("||-------------------------------------||");
        System.out.print("|| Insira a classificação indicativa: ");
        int classificacaoIndicativa = read.nextInt();

        return classificacaoIndicativa;
    }
    public String escolhaGenero() {

        System.out.println("||-------------------------------------||");
        System.out.print("|| Insira o Gênero: ");
        String genero = read.nextLine();

        return genero;
    }

    public int escolhaId() {

        System.out.println("||-------------------------------------||");
        System.out.print("|| Insira o ID: ");
        int id1 = read.nextInt();

        return id1;
    }
    public int oQueVer() {

        System.out.println("||--------------------------------------||");
        System.out.println("||        O que deseja Visualizar?      ||");
        System.out.println("||--------------------------------------||");
        System.out.println("|| 1 - Visualizar Filme                 ||");
        System.out.println("|| 2 - Visualizar Curta Metragem        ||");
        System.out.println("|| 3 - Visualizar Longa Metragem        ||");
        System.out.println("||=====================================||");
        System.out.print("|| Insira sua escolha: ");
        int oQueVer = read.nextInt();

        return oQueVer;
    }

    public int oQueDeletar() {

        System.out.println("||-------------------------------------||");
        System.out.println("||        O que deseja Deletar?        ||");
        System.out.println("||-------------------------------------||");
        System.out.println("|| 1 - Deletar Filme                   ||");
        System.out.println("|| 2 - Deletar Curta Metragem          ||");
        System.out.println("|| 3 - Deletar Longa Metragem          ||");
        System.out.println("||=====================================||");
        System.out.print("  || Insira sua escolha: ");
        int oQueDeletar = read.nextInt();

        return oQueDeletar;
    }

    public int escolhaIdFilmeDeletar() {

        System.out.println("||-------------------------------------||");
        System.out.print("||Insira o ID do Filme para deletar:   ||");
        int escolhaIdDeletar = read.nextInt();

        return escolhaIdDeletar;
    }
    public int escolhaIdCurtaMetrageDeletar() {

        System.out.println("||-------------------------------------||");
        System.out.print("||Insira o ID do Curta Metragem para deletar:   ||");
        int escolhaIdCurtaMetragemDeletar = read.nextInt();

        return escolhaIdCurtaMetragemDeletar;
    }

    public int escolhaIdLongaDeletar() {

        System.out.println("||-------------------------------------||");
        System.out.print("||Insira o ID do Longa Metragem para deletar:   ||");
        int escolhaIdLongaMetragemDeletar = read.nextInt();

        return escolhaIdLongaMetragemDeletar;
    }

    public void mensagemErro(){
        System.out.println("Este comando é invalido tente outro");
    }

    public void naoHaFilmes(){
        System.err.println("Não há filmes no estoque");
    }
    public void naoHaCurtaMetragens(){
        System.err.println("Não há CurtaMetragens no estoque");
    }
    public void naoHaLongaMetragem(){
        System.err.println("Não há LongaMetragem no estoque");
    }

    public void saindo() {

        System.err.println("Saindo do Sistema!!!");
        System.exit(0);
    }

    public void estoqueVazio() {

        System.err.println("O estoque esta vazio");
    }

}
