package POO.Basico.Abstracao.ExercicioDoze;

public class Video extends Midia {

    private int duracao;

    public Video(String titulo, int duracao) {
        super(titulo);
        this.duracao = duracao;
    }

    @Override
    public void reproduzir() {
        System.out.println("▶ Reproduzindo vídeo: " + getTitulo());
        System.out.println("  Duração: " + duracao + " minutos");
    }
}