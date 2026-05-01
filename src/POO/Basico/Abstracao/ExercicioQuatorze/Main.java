package POO.Basico.Abstracao.ExercicioQuatorze;

public class Main {
    public static void main(String[] args) {

        Transporte onibus = new Onibus(45);

        int distancia = 180;
        int tempo = onibus.calcularTempoViagem(distancia);

        System.out.println("Capacidade do ônibus: " + onibus.getCapacidade() + " passageiros");
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Tempo estimado de viagem: " + tempo + " horas");
    }
}