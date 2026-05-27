package POO.Basico.Abstracao.ExercicioDois;

public class Carro extends Veiculo {

    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void mover() {
        System.out.println("O carro " + getModelo() + " está se movendo pela estrada!");
    }
}