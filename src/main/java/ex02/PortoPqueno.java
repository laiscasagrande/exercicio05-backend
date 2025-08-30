package ex02;

public class PortoPqueno extends BasePorto{
    @Override
    void atracarBarco(Barco barco) {
        if (barco.tamanho <= 10){
            barcosAtracados.add(barco);
            System.out.println("Barco " + barco.nome + " atracado no porto pqueno");
        }
    }
}
