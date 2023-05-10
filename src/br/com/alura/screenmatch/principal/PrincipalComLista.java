package br.com.alura.screenmatch.principal;

import java.util.*;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import static java.util.Collection.*;


public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        Filme novoFilme = new Filme("Creed 3", 2023);
        novoFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(novoFilme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);
        //lista.forEach(System.out::println);
        for (Titulo item : lista) {
            System.out.println(item);
            if(item instanceof Filme filme && filme.getClassificacao() > 2){//Verifica se ele é do tipo filme
                System.out.println("Classificação " + filme.getClassificacao());
            }


        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Chris Rock");
        buscaPorArtista.add("Vitor");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);//Ordena em ordem alfabetica

        System.out.println("Depois da ordenação ");

        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);



    }
}
