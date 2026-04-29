package POO.Basico.Heranca.ExercicioDois;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Disciplina: " + this.disciplina);
    }
}