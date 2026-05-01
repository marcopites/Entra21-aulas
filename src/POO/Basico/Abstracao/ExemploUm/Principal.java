package POO.Basico.Abstracao.ExemploUm;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        Retangulo retangulo = new Retangulo(3, 4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("A área do circulo é " + areaCirculo);
        System.out.println("A área do retângulo é " + areaRetangulo);
    }
}
