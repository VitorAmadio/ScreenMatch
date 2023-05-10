package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoAnoException extends RuntimeException{
    private final String mensagem;
    public ErroDeConversaoAnoException(String mensagem){
        this.mensagem = mensagem;
    }
    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
