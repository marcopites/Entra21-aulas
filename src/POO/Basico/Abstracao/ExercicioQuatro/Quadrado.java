package POO.Basico.Abstracao.ExercicioQuatro;

public class Quadrado extends Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}