package org.example;

public class Personagem {
    //atributos
    String nome;
    int vida;
    int ataque;

    //métodos
    public void receberDano(int ataque){
        if(this.vida > 0){
            this.vida = this.vida - ataque;
        }else{
            System.out.println("Personagem derrotado!");
        }
    }

    public void atacar(Personagem alvo){
        if (alvo.vida > 0) {
            this.receberDano(this.ataque);
        }else{
            System.out.println("Ataque falhou!");
        }

    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setVida(int vida){
        this.vida = vida;
    }
}
