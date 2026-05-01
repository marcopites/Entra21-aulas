package POO.Basico.Abstracao.ExercicioSeis;

public class Livro extends Produto {

    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getNome());
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + getPreco());
    }
}