package POO.Medio.Abstracao.ExercicioDezenove;

public class Main {
    public static void main(String[] args) {

        ItemBiblioteca livro = new Livro("Dom Casmurro", 1899);
        ItemBiblioteca revista = new Revista("National Geographic", 2024);
        ItemBiblioteca dvd = new DVD("O Poderoso Chefão", 1972);

        ItemBiblioteca[] itens = {livro, revista, dvd};

        for (ItemBiblioteca item : itens) {
            System.out.println("Título: " + item.getTitulo());
            System.out.println("Ano de publicação: " + item.getAnoPublicacao());
            System.out.println("Prazo de empréstimo: " + item.calcularPrazoEmprestimo() + " dias");
            System.out.println("---");
        }
    }
}