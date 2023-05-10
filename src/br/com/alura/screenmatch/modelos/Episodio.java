package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualisacoes;

    public int getTotalVizualisacoes() {
        return totalVizualisacoes;
    }

    public void setTotalVizualisacoes(int totalVizualisacoes) {
        this.totalVizualisacoes = totalVizualisacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVizualisacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
