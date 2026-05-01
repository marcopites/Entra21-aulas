package POO.Basico.Abstracao.ExercicioDoze;

public class Musica extends Midia {

    private String artista;

    public Musica(String titulo, String artista) {
        super(titulo);
        this.artista = artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("♪ Reproduzindo música: " + getTitulo());
        System.out.println("  Artista: " + artista);
    }
}