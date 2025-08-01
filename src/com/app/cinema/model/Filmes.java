package com.app.cinema.model;

public class Filmes {

    protected int id;
    protected String duracao;
    protected String nome;


    public Filmes() {

        this.id=0;
        this.duracao="";
        this.nome="";
    }
    public Filmes(int id,String duracao, String nome) {

        this.id=id;
        this.duracao=duracao;
        this.nome=nome;
    }
    public String getDuracao() {
        return duracao;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString () {

        return "ID: " + id +"\nNome: " + nome + "\nDuração: " + duracao;
    }

}
