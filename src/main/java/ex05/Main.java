package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cinema cinema = new Cinema();

        Filme filme01 = new Filme();
        filme01.nome = "Velozes e Furiosos";
        filme01.preco = 30.00;
        filme01.idadeMinima = 16;

        Filme filme02 = new Filme();
        filme02.nome = "Barbie";
        filme02.preco = 40.00;
        filme02.idadeMinima = 14;

        Filme filme03 = new Filme();
        filme03.nome = "Interestellar";
        filme03.preco = 50.00;
        filme03.idadeMinima = 16;

        cinema.filmesDisponiveis.add(filme01);
        cinema.filmesDisponiveis.add(filme02);
        cinema.filmesDisponiveis.add(filme03);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Insira a idade do cliente: ");
        int idadeCliente = scanner.nextInt();
        scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, idadeCliente);

        System.out.print("Insira o nome do filme: ");
        String nomeFilme = scanner.nextLine();

        System.out.print("Insira o assento desejado: ");
        String assento = scanner.nextLine();
        char fileira = assento.charAt(0);
        int numero = Integer.parseInt(assento.substring(1));

        Ingresso ingresso = new Ingresso(cliente, filme01, fileira, numero);
        cinema.ingressosVendidos[0] = ingresso;
    }
 }
