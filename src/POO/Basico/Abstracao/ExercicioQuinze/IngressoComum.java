package POO.Basico.Abstracao.ExercicioQuinze;

public class IngressoComum extends Ingresso {

    private static final double DESCONTO = 0.10;

    public IngressoComum(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return getValor() - (getValor() * DESCONTO);
    }
}