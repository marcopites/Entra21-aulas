package POO.Basico.Abstracao.ExercicioQuatorze;

public abstract class Transporte {

    private int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public abstract int calcularTempoViagem(int distanciaKm);
}