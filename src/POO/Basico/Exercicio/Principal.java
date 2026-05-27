package POO.Basico.Exercicio;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Marco", 29);
        Aluno aluno2 = new Aluno("Evelin", 19);

        aluno1.apresentar();
        System.out.println("-----------");
        aluno2.apresentar();
        System.out.println("-----------");
        aluno1.estudar();
        aluno2.estudar();
    }
}
