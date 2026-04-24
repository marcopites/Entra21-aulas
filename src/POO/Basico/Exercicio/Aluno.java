package POO.Basico.Exercicio;

public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
    void estudar() {
        System.out.println("Estou estudando!");
    }
}