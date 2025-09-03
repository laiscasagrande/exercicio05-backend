package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cinema cinema = new Cinema();

        cinema.adicionarFilme(new Filme("Velozes e Furiosos", 30.00, 16));
        cinema.adicionarFilme(new Filme("Barbie", 40.00, 14));
        cinema.adicionarFilme(new Filme("Interestellar", 50.00, 16));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Insira o nome do cliente: ");
                String nomeCliente = scanner.nextLine();

                System.out.print("Insira a idade do cliente: ");
                int idadeCliente = scanner.nextInt();
                scanner.nextLine();

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                System.out.print("Insira o nome do filme: ");
                String nomeFilme = scanner.nextLine();

                Filme filmeEscolhido = cinema.buscarFilme(nomeFilme);
                if (filmeEscolhido == null) {
                    System.out.println("Filme não disponível");
                    continue;
                }

                System.out.print("Insira o assento desejado: ");
                String assento = scanner.nextLine().toUpperCase();
                char fileira = assento.charAt(0);
                int numero = Integer.parseInt(assento.substring(1));

                cinema.venderIngresso(cliente, filmeEscolhido, fileira, numero);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("\nDeseja comprar outro ingresso? (s/n): ");
            String opcao = scanner.nextLine();
            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }
        }
    }
 }
