package org.example;
import java.util.Random;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> inimigos = new ArrayList<Personagem>();
        inimigos.add(new Personagem()); //para cada personagem tem que criar uma instância
        inimigos.add(new Personagem());
        inimigos.add(new Personagem());

        inimigos.get(0).setNome("Cersei Lannister");
        inimigos.get(1).setNome("Petyr Baelish");
        inimigos.get(2).setNome("Joffrey Baratheon");

        Personagem jogador = new Personagem();

        Random random = new Random();
        int indiceAleatorio = random.nextInt(inimigos.size());
        Personagem personagemAleatorio01 = inimigos.get(indiceAleatorio);
        Personagem personagemAleatorio02 = inimigos.get(indiceAleatorio);
        Personagem personagemAleatorio03 = inimigos.get(indiceAleatorio);

        personagemAleatorio01.setVida(4);
        personagemAleatorio02.setVida(5);
        personagemAleatorio03.setVida(7);

        jogador.atacar(personagemAleatorio01);
        jogador.atacar(personagemAleatorio02);
        jogador.atacar(personagemAleatorio02);

        for (Personagem inimigo : inimigos){
            inimigo.atacar(jogador);
        }

    }
}