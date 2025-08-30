package ex02;

import java.util.ArrayList;

public class BasePorto {
    String nome;
    ArrayList<Barco> barcosAtracados = new ArrayList();

    void atracarBarco(Barco barco){
        barcosAtracados.add(barco);
    }

    void desatracarBarco(Barco barco){
        barcosAtracados.remove(barco);
    }
}
