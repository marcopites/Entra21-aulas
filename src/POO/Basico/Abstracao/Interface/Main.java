package POO.Basico.Abstracao.Interface;

public class Main {
    public static void main(String[] args) {

        IFormaGeometrica circulo = new Circulo(3);
        IFormaGeometrica retangulo = new Retangulo(3, 4);

        System.out.println("A área do círculo é " + circulo.calcularArea());
        System.out.println("A área do retângulo é " + retangulo.calcularArea());

        IFormaGeometrica interfaceFormaGeometria = new Circulo(2);
        System.out.println("Área via interface: " + interfaceFormaGeometria.calcularArea());
    }
}