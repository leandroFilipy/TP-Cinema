package com.app.cinema.service;
import com.app.cinema.view.*;
import com.app.cinema.model.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {


    private List<Filmes> listaFilmes;

    public Estoque() {

        listaFilmes = new ArrayList<>();
    }


    public void GerenciamentoDeFilmes(Atendente atendente, int escolhido1) {


        switch(escolhido1) {

            case 1:

                int escolhaOqueCadastrar1 = atendente.escolhaOqueCadastrar();

                if(escolhaOqueCadastrar1 == 1) {

                    int id1 = atendente.escolhaId();
                    String nome1 = atendente.escolhaNome();
                    String duracao1 = atendente.escolhaDuracao();

                    Filmes filme = new Filmes(id1,nome1,duracao1);

                }else if(escolhaOqueCadastrar1 == 2) {

                    int id1 = atendente.escolhaId();
                    String nome1 =atendente.escolhaNome();
                    String duracao1 = atendente.escolhaDuracao();
                    int classificacaoIndicativa1 = atendente.escolhaClassificacaoIndicativa();

                    CurtaMetragem filme = new CurtaMetragem (id1,classificacaoIndicativa1, nome1,duracao1);
                }


                break;
        }


    }



}
