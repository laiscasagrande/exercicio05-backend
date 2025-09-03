package ex05;

import java.util.ArrayList;

public class Cinema {
    ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();

    void adicionarFilme(Filme filme){
        filmesDisponiveis.add(filme);
    }

    Filme buscarFilme(String nome){
        for (Filme filme : filmesDisponiveis){
            if (filme.nome.equals(nome)){
                return filme;
            }
        }
        return null;
    }

    void venderIngresso(Cliente cliente, Filme filme, char fileira, int numero) throws Exception {
        String assento = fileira + String.valueOf(numero);

        for (Ingresso ingresso : ingressosVendidos){
            if (ingresso.assento.equals(assento)){
                throw new Exception("Assento já está ocupado!");
            }
        }

        Ingresso ingresso = new Ingresso(cliente, filme, fileira, numero); //assim que eu chamar esse metodo de vender ingresso, ele já vai passar as informações necessárias para classe Ingresso

        ingressosVendidos.add(ingresso);

        System.out.println("Ingresso vendido com sucesso!");
    }
}
