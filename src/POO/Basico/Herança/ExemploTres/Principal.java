package POO.Basico.Herança.ExemploTres;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Bonequinho de brinquedo");
        produto.setPreco(100d);

        produto.exibirInformacoes();

        System.out.println("============");

        Livro livro = new Livro();
        livro.setNome("E não sobrou nenhum");
        livro.setPreco(59.90d);
        livro.setAutor("Agatha Christie");

        livro.exibirInformacoes(); // chamando na instância
    }
}