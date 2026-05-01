package POO.Basico.Abstracao.ExercicioQuatorze;

public class Onibus extends Transporte {

    private static final int VELOCIDADE_MEDIA = 60;

    public Onibus(int capacidade) {
        super(capacidade);
    }

    @Override
    public int calcularTempoViagem(int distanciaKm) {
        return distanciaKm / VELOCIDADE_MEDIA;
    }
}