package POO.Medio.Abstracao.ExercicioVinte;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new FuncionarioCLT("Carlos", 4000.0),
                new Estagiario("Ana", 1200.0),
                new Freelancer("Bruno", 1000.0, 30)
        };

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salário base: R$ " + f.getSalarioBase());
            System.out.println("Pagamento mensal: R$ " + f.calcularPagamentoMensal());
            System.out.println("---");
        }
    }
}