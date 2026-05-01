package POO.Basico.Abstracao.ExercicioSete;

public class Main {
    public static void main(String[] args) {

        Pessoa aluno = new Aluno("Marco", 29, "Engenharia de Dados");
        Pessoa professor = new Professor("Gabriela", 27, "Medicina Veterinária");

        aluno.apresentar();
        System.out.println("---");
        professor.apresentar();
    }
}