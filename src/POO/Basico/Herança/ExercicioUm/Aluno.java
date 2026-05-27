package POO.Basico.Heranca.ExercicioUm;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade); // inicializa os atributos da superclasse
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // aproveita o método da superclasse
        System.out.println("Matrícula: " + this.matricula);
    }
}