package POO.Basico.Abstracao.ExercicioDois;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Fusca");
        Veiculo bicicleta = new Bicicleta("Gios");

        carro.mover();
        bicicleta.mover();
    }
}