import java.util.ArrayList;

import br.com.alura.screenmatch.calculo.CaluladoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A rede social", 2012);
        //meuFilme.setNome("O poderoso chefão");
       // meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(7);

        System.out.println(meuFilme.getTotalDeAvaliacao());

        Serie serie =  new Serie("Lost", 2000);
        //serie.setNome("Lost");
        //serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(40);

        System.out.println("A série tem uma duração de "+ serie.getDuracaoEmMinutos() + " Minutos");

        Filme outroFilme = new Filme("O poderoso chefão", 1970);
        //outroFilme.setNome("O poderoso chefão");
        //outroFilme.setAnoDeLancamento(1970);
        outroFilme.setDuracaoEmMinutos(180);

        CaluladoraDeTempo calculadora = new CaluladoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVizualisacoes(300);
        filtro.filtra(episodio);

        Filme filmeNovo = new Filme("Dogville", 2003);
        filmeNovo.setDuracaoEmMinutos(200);
        //filmeNovo.setNome("Dogville");
        //filmeNovo.setAnoDeLancamento(2003);
        filmeNovo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeNovo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        

    }
}
