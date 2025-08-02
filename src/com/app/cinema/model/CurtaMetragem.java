package com.app.cinema.model;

public class CurtaMetragem extends Filmes{

    private int classificacaoIndicativa;


    public CurtaMetragem() {

        super();
        this.classificacaoIndicativa=0;
    }

    public CurtaMetragem(int id,int classificacaoIndicativa, String nome, String duracao) {

        super(id,duracao, nome);
        this.classificacaoIndicativa=classificacaoIndicativa;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }


    @Override
    public String toString () {

        return "ID: " + id + "\nClassificação Indicativa: " + classificacaoIndicativa;
    }


}
