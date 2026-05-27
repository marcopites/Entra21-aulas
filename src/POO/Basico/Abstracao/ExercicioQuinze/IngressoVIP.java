package POO.Basico.Abstracao.ExercicioQuinze;

public class IngressoVIP extends Ingresso {

    private static final double TAXA = 0.50;

    public IngressoVIP(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return getValor() + (getValor() * TAXA);
    }
}