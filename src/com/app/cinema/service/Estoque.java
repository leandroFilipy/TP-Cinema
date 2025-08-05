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


    public void GerenciamentoDeFilmes(Atendente atendente, int escolha1) {


        switch (escolha1) {

            case 1:

                int escolhaOqueCadastrar1 = atendente.escolhaOqueCadastrar();

                if (escolhaOqueCadastrar1 == 1) {

                    int id1 = atendente.escolhaId();
                    String nome1 = atendente.escolhaNome();
                    String duracao1 = atendente.escolhaDuracao();

                    Filmes filme = new Filmes(id1, nome1, duracao1);

                } else if (escolhaOqueCadastrar1 == 2) {

                    int id1 = atendente.escolhaId();
                    String nome1 = atendente.escolhaNome();
                    String duracao1 = atendente.escolhaDuracao();
                    int classificacaoIndicativa1 = atendente.escolhaClassificacaoIndicativa();

                    CurtaMetragem filme = new CurtaMetragem(id1, classificacaoIndicativa1, nome1, duracao1);
                } else if (escolhaOqueCadastrar1 == 3) {

                    int id1 = atendente.escolhaId();
                    String nome1 = atendente.escolhaNome();
                    String duracao1 = atendente.escolhaDuracao();
                    String genero1 = atendente.escolhaGenero();

                    LongaMetragem filme = new LongaMetragem(id1, nome1, duracao1, genero1);
                } else if (escolhaOqueCadastrar1 > 3) {
                    System.err.println("Digito inválido");
                }


                break;

            case 2:

                int oQueVer2 = atendente.oQueVer();

                if (listaFilmes.isEmpty()) {

                    atendente.estoqueVazio();
                }

                if (oQueVer2 == 1) {

                    for (Filmes verFilmes : listaFilmes) {

                        if (verFilmes instanceof Filmes filmes) {
                            System.out.println(filmes);

                        }


                    }
                    if (oQueVer2 == 2) {

                        for (Filmes verFilmes : listaFilmes) {

                            if (verFilmes instanceof Filmes filmes) {
                                System.out.println(filmes);
                            } else if (listaFilmes.isEmpty()) {

                            }
                        }
                    } else if (oQueVer2 == 3) {

                        for (Filmes verFilmes : listaFilmes) {

                            if (verFilmes instanceof Filmes filmes) {
                                System.out.println(filmes);
                            }
                            if (listaFilmes.isEmpty()) {

                            }
                        }

                    } else if (oQueVer2 > 3) {
                        atendente.mensagemErro();
                    }

                }
                break;
                case 3:

                    int oQueDeletar1 = atendente.oQueDeletar();

                    if (listaFilmes.isEmpty()) {
                        atendente.naoHaFilmes();
                    }

                    if (oQueDeletar1 == 1){

                        int escolhido = atendente.escolhaIdFilmeDeletar();

                        for(int i = 0; i < listaFilmes.size();i++) {

                            if(listaFilmes.get(i).getId()== escolhido) {

                                listaFilmes.remove(i);
                            }

                        }

                    } else if (oQueDeletar1 == 2) {

                        int escolhido = atendente.escolhaIdCurtaMetrageDeletar();

                        for(int i = 0; i < listaFilmes.size();i++) {
                            if(listaFilmes.get(i).getId() == escolhido){

                                listaFilmes.remove(i);
                            }
                        }

                    }else if (oQueDeletar1 == 3) {

                        int escolhido = atendente.escolhaIdLongaDeletar();

                        for (int i =0; i < listaFilmes.size();i++){
                            if (listaFilmes.get(i).getId() == escolhido){

                            listaFilmes.remove(i);
                            }
                        }
                    }

                    break;

            case 0:

                atendente.saindo();

            break;
        }
    }


}

