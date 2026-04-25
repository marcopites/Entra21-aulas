package ExerciciosFixacaoPOO.ExercicioDois;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("dom Casmurro", "Machado de Assis", 256, 1899);
        Livro l2 = new Livro("O problema dos Três Corpos", "Liu Cixin", 400, 2008);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1.getTitulo() + " é livro antigo? " + l1.ehLivroAntigo());
        System.out.println(l2.getTitulo() + " é livro antigo? " + l2.ehLivroAntigo());

    }
}
