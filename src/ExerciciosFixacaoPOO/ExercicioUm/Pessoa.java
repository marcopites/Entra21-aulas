package ExerciciosFixacaoPOO.ExercicioUm;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade >= 0) this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }
}

