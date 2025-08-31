package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        Musica musica = new Musica();
        MusicCloud musicaCloud = new MusicCloud();

        System.out.print("Digite o nome da playlist: ");
        playlist.nome = scanner.nextLine();

        System.out.print("Digite o nome da música: ");
        musica.titulo = scanner.nextLine();
        musicaCloud.musicasDisponiveis.add(musica);
        musicaCloud.pesquisarMusica(musica.titulo);

        if (musica.titulo == musicaCloud) {
            playlist.musicas.add(musica.titulo);
        }else{
            System.out.println("Esta música não encontra-se nas músicas disponíveis!");
        }
    }
 }
