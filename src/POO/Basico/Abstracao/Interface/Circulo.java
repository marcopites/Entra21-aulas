package POO.Basico.Abstracao.Interface;

public class Circulo implements IFormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }
}