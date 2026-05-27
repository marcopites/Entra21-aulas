package POO.Medio.Abstracao.ExercicioDezenove;

public class Revista extends ItemBiblioteca {

    public Revista(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 7;
    }
}