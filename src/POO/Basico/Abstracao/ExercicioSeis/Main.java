package POO.Basico.Abstracao.ExercicioSeis;

public class Main {
    public static void main(String[] args) {

        Produto livro = new Livro("Dom Casmurro", 49.90, "Machado de Assis");

        livro.exibirDetalhes();
    }
}