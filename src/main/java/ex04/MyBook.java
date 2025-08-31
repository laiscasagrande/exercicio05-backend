package ex04;

public class MyBook implements PlataformaSocial{
    @Override
    public void compartilharPostagem(Postagem postagem){
        System.out.println("Postagem compartilhada no MyBook");
    }

    @Override
    public void compartilharImagem(Postagem postagem){
        System.out.println("Imagem compartilhada no MyBook");
    }

    @Override
    public void compartilharVideo(Postagem postagem){
        System.out.println("Vídeo compartilhado no MyBook");
    }
}
