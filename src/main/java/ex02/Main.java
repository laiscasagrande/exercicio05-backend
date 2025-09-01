package ex02;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
       ArrayList<Barco> barcos = new ArrayList<>();

       Barco barco01 = new Barco();
       barco01.nome = "Barco 1";
       barco01.tamanho = 10;

       Barco barco02 = new Barco();
       barco02.nome = "Barco 2";
       barco02.tamanho = 20;

       Barco barco03 = new Barco();
       barco03.nome = "Barco 3";
       barco03.tamanho = 5;

       Barco barco04 = new Barco();
       barco04.nome = "Barco 4";
       barco04.tamanho = 9;

       Barco barco05 = new Barco();
       barco05.nome = "Barco 5";
       barco05.tamanho = 11;

       barcos.add(barco01);
       barcos.add(barco02);
       barcos.add(barco03);
       barcos.add(barco04);
       barcos.add(barco05);

       PortoPqueno portoPqueno = new PortoPqueno();
       PortoGrande portoGrande = new PortoGrande();

       for (int i = 0; i < barcos.size(); i++) {
           portoPqueno.atracarBarco(barcos.get(i));
           portoGrande.atracarBarco(barcos.get(i));
       }
 }
}