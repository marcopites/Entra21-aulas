package POO.Medio.Abstracao.ExercicioDezenove;

public class Livro extends ItemBiblioteca {

    public Livro(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 14;
    }
}