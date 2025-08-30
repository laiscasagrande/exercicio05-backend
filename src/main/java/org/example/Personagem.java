package org.example;

public class Personagem {
    //atributos
   private String nome;
   private int vida;
   private int ataque;

    //métodos
    public void receberDano(int ataque){
        this.vida -= ataque;
        if (this.vida <= 0){
            this.vida = 0;
            System.out.println("Personagem derrotado");
        }
    }

    public void atacar(Personagem alvo){
        if (alvo.vida > 0) {
            alvo.receberDano(this.ataque);
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

    void setAtaque(int ataque ) {
        this.ataque = ataque;
    }

    int getVida(){
        return this.vida;
    }
}
