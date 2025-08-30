package org.example;
import java.util.Random;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> inimigos = new ArrayList<Personagem>();

        Personagem inimigo01 = new Personagem(); //estou chamando os métodos e passando os atributos
        inimigo01.setNome("Cersei Lannister");
        inimigo01.setVida(10);
        inimigo01.setAtaque(3);

        Personagem inimigo02 = new Personagem();
        inimigo02.setNome("Petyr Baelish");
        inimigo02.setVida(10);
        inimigo02.setAtaque(3);

        Personagem inimigo03 = new Personagem();
        inimigo03.setNome("Joffrey Baratheon");
        inimigo03.setVida(10);
        inimigo03.setAtaque(3);

        inimigos.add(inimigo01);
        inimigos.add(inimigo02);
        inimigos.add(inimigo03);

        Personagem jogador = new Personagem();
        jogador.setNome("Arya Stark");
        jogador.setVida(10);
        jogador.setAtaque(3);

        Random random = new Random();
        int indiceAleatorio = random.nextInt(inimigos.size());

        Personagem alvo = inimigos.get(indiceAleatorio); //pegar um alvo aleatório da lista de inimigos

        if (alvo.getVida() > 0){ //verificar se o alvo tem vida antes de atacar
            jogador.atacar(alvo);
            System.out.println("Jogador atacando");
        }else{
            System.out.println("Inimigo já foi derrotado");
        }

        for (Personagem inimigo : inimigos){
            System.out.println("Inimigos atacam");
            inimigo.atacar(jogador);
        }

    }
}