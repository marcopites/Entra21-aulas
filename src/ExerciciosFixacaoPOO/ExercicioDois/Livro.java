package ExerciciosFixacaoPOO.ExercicioDois;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int numeroPaginas, int getAnoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public boolean ehLivroAntigo() {
        int anoAtual = java.time.Year.now().getValue();
        return (anoAtual - anoPublicacao) > 20;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNumeroPaginas() { return numeroPaginas; }
    public int getAnoPublicacao() { return anoPublicacao; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setautor(String autor) { this.autor = autor; }
    public void setNumeroPaginas(int n) {
        if (n > 0) this.numeroPaginas = n;
    }
    public void setAnoPublicacao(int ano) {
        if (ano > 0) this.anoPublicacao = ano;
    }
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + "'" +
                ", autor='" + autor + "'" +
                ", paginas=" + numeroPaginas +
                ", ano=" + anoPublicacao + "}";
    }
}
