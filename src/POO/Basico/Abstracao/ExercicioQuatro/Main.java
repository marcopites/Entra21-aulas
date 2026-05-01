package POO.Basico.Abstracao.ExercicioQuatro;

public class Main {
    public static void main(String[] args) {

        Forma quadrado = new Quadrado(4);
        Forma retangulo = new Retangulo(3, 6);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}