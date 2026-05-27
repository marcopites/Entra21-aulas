package POO.Basico.Abstracao.ExercicioNove;

public abstract class Documento {

    private String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract String gerarResumo();
}