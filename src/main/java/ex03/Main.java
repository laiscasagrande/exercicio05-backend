package ex03;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        MusicCloud musicaCloud = new MusicCloud();
        int parar = 0;

        //Músicas que existem no cloud(nuvem):
        Musica musica01 = new Musica(); //cada objeto que representa uma música precisa ser criado, não podemos aproveitar o mesmo objeto para músicas diferentes
        musica01.titulo = "333";
        musica01.artista = "Matuê";

        Musica musica02 = new Musica();
        musica02.titulo = "Crazy Love";
        musica02.artista = "Kant";

        musicaCloud.musicasDisponiveis.add(musica01);
        musicaCloud.musicasDisponiveis.add(musica02);

        System.out.print("Digite o nome da playlist: ");
        playlist.nome = scanner.nextLine();

        while (parar == 0) {
            System.out.print("Digite o nome da música: ");
            String titulo = scanner.nextLine();

            Musica musicaEncontrada = musicaCloud.pesquisarMusica(titulo); //vamos passar o título da música digitada para o metodo pesquisarMusica para verificar se existe uma música com este título

            if  (musicaEncontrada != null) {
                playlist.musicas.add(musicaEncontrada);
                System.out.println("Você adicionou a música " + musicaEncontrada.titulo + " na playlist.");
            }else{
                System.out.println("A música " + titulo + " não está disponível");
            }

            System.out.print("Deseja parar? Caso decida finalizar o processo, digite 1, e caso deseje continuar, digite 0: ");
            parar = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Playlist: " +  playlist.nome);
        for (Musica musica : playlist.musicas){
            System.out.println("- " + musica.titulo + " (" + musica.artista + ")");
        }
    }
 }
