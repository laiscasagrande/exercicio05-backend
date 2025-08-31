package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Postagem postagem = new Postagem();
        MyBook book = new MyBook();
        Fotogram fotogram = new Fotogram();
        AnyTube anyTube = new AnyTube();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título da postagem: ");
        postagem.titulo = scanner.nextLine();

        System.out.print("Digite a descrição da postagem: ");
        postagem.descricao = scanner.nextLine();

        System.out.print("Digite o tipo da postagem: ");
        postagem.tipo = scanner.nextLine();

        book.compartilharPostagem(postagem);
        fotogram.compartilharImagem(postagem);
        anyTube.compartilharVideo(postagem);
        anyTube.compartilharImagem(postagem);
    }
 }
