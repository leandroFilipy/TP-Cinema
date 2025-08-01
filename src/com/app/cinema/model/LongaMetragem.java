package com.app.cinema.model;

public class LongaMetragem extends Filmes {


    private String genero;


    public LongaMetragem() {

        super();
        this.genero="";
    }

    public LongaMetragem(int id,String nome,String duracao,String genero) {

        super(id,nome,duracao);
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {

        return "Gênero: " + genero;
    }

}
