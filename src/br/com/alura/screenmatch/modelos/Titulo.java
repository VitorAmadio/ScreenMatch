package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import br.com.alura.screenmatch.excecao.ErroDeConversaoAnoException;
public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();

        if(tituloOmdb.year().length() > 4){
            throw new ErroDeConversaoAnoException("Não consegui converter o ano, pois há mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(tituloOmdb.year());//Assim ele transforma um dado que é String para int
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0,2));//Usa o substring para cortar uma parte da string


    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }



    public void exibeFichaTecnica(){ //O void é quando o metodo n retorna nada
        System.out.println("Nome do filme " + nome);
        System.out.println("Ano de lançamento " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "( nome='" + nome +
                ", anoDeLancamento= " + anoDeLancamento +
                ",Tempo de duração " + duracaoEmMinutos + " )";
    }
}
