package POO.Basico.Abstracao.ExercicioSete;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Professor: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Disciplina: " + disciplina);
    }
}