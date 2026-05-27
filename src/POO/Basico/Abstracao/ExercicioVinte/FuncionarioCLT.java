package POO.Medio.Abstracao.ExercicioVinte;

public class FuncionarioCLT extends Funcionario {

    private static final double DESCONTO_INSS = 0.11;
    private static final double DESCONTO_IRRF = 0.15;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamentoMensal() {
        double descontos = getSalarioBase() * (DESCONTO_INSS + DESCONTO_IRRF);
        return getSalarioBase() - descontos;
    }
}