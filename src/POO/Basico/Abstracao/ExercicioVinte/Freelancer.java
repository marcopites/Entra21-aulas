package POO.Medio.Abstracao.ExercicioVinte;

public class Freelancer extends Funcionario {

    private int horasTrabalhadas;
    private static final double VALOR_HORA = 50.0;

    public Freelancer(String nome, double salarioBase, int horasTrabalhadas) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamentoMensal() {
        return getSalarioBase() + (horasTrabalhadas * VALOR_HORA);
    }
}