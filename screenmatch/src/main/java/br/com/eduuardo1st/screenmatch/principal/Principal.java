package br.com.eduuardo1st.screenmatch.principal;

import br.com.eduuardo1st.screenmatch.model.DadosSerie;
import br.com.eduuardo1st.screenmatch.service.ConsumoApi;
import br.com.eduuardo1st.screenmatch.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    private final String ENDERECO = "http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6d407db5";
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.println("Digite o nome da Série para a busca: ");

        var nomeSerie = leitura.nextLine();

        var json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

        System.out.println(dados);

    }
}
