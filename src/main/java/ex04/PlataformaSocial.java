package ex04;

public interface PlataformaSocial {
    default void compartilharPostagem(Postagem postagem){
        System.out.println("Você compartilhou essa postagem no MyBook.");
    }

    default void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }

    default void compartilharVideo(Postagem postagem){
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }
}
