package POO.Basico.Heranca.ExercicioDois;

public class Principal {
    public static void main(String[] args) {
        Professor professor = new Professor(
                "Fernando Maciel",
                "Fernando.Maciel@professor.senac.sc.br",
                "Java"
        );

        professor.exibirInformacoes();
    }
}