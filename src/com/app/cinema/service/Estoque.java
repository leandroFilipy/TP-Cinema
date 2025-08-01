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
                }


                break;
        }


    }



}
