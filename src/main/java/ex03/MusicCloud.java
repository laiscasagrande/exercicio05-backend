package ex03;

import java.util.ArrayList;

public class MusicCloud {
    ArrayList<Musica> musicasDisponiveis = new ArrayList<>(); //array apenas para verificar se a música existe

    Musica pesquisarMusica(String titulo){
        for (Musica musica : musicasDisponiveis){
            if (musica.titulo.equals(titulo)){ //se o título da musica que esta dentro da lista musicasDisponiveis for igual ao titulo da musica que vou receber como parametro dessa função
                return musica;
            }
        }
        return null;
    }
}
