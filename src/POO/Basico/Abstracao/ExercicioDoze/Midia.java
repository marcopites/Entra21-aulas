package POO.Basico.Abstracao.ExercicioDoze;

public abstract class Midia {

    private String titulo;

    public Midia(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void reproduzir();
}