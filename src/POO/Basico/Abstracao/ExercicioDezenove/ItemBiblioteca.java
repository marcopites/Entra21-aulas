package POO.Medio.Abstracao.ExercicioDezenove;

public abstract class ItemBiblioteca {

    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public abstract int calcularPrazoEmprestimo();
}