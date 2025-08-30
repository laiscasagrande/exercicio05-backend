package ex02;

public class PortoGrande extends BasePorto{
    @Override
    void atracarBarco(Barco barco){
        if (barco.tamanho >= 10){
            barcosAtracados.add(barco);
            System.out.println("Barco " + barco.nome + " atracado no porto grande");
        }
    }
}
