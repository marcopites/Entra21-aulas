package POO.Basico.Abstracao.ExercicioQuinze;

public abstract class Ingresso {

    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public abstract double calcularValorFinal();
}