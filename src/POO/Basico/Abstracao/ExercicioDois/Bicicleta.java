package POO.Basico.Abstracao.ExercicioDois;

public class Bicicleta extends Veiculo {

    public Bicicleta(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta " + getModelo() + " está pedalando pela ciclovia!");
    }
}