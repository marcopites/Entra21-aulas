package POO.Basico.Abstracao.ExercicioSete;

public class Aluno extends Pessoa {

    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Curso: " + curso);
    }
}