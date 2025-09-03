package ex05;

public class Ingresso {
    Cliente cliente;
    Filme filme;
    String assento;

    //construtor
    Ingresso(Cliente cliente, Filme filme, char fileira, int numero) throws Exception {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = fileira+String.valueOf(numero);

        if (!(fileira >= 'A' && fileira <= 'F' && numero >= 1 && numero <= 5)) {
            throw new Exception("Assento indisponível!");
        }

        if (cliente.idade < filme.idadeMinima){
            throw new Exception("Este cliente não tem a idade mínima para assistir o filme!");
        }
    }
}
