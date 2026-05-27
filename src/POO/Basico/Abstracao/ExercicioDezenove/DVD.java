package POO.Medio.Abstracao.ExercicioDezenove;

public class DVD extends ItemBiblioteca {

    public DVD(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 3;
    }
}