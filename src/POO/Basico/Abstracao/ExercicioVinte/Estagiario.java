package POO.Medio.Abstracao.ExercicioVinte;

public class Estagiario extends Funcionario {

    private static final double BONUS_TRANSPORTE = 150.0;

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamentoMensal() {
        return getSalarioBase() + BONUS_TRANSPORTE;
    }
}